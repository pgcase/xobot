/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.workspace.team.ui.navigator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.team.core.diff.FastDiffFilter;
import org.eclipse.team.core.diff.IDiff;
import org.eclipse.team.core.diff.IDiffChangeEvent;
import org.eclipse.team.core.diff.IDiffTree;
import org.eclipse.team.core.mapping.ISynchronizationContext;
import org.eclipse.team.core.mapping.ISynchronizationScope;
import org.eclipse.team.core.mapping.provider.ResourceDiffTree;
import org.eclipse.team.internal.ui.Utils;
import org.eclipse.team.internal.ui.mapping.SynchronizationResourceMappingContext;
import org.eclipse.team.ui.mapping.SynchronizationContentProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.IPipelinedTreeContentProvider;
import org.eclipse.ui.navigator.PipelinedShapeModification;
import org.eclipse.ui.navigator.PipelinedViewerUpdate;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.core.resources.mappings.XobotModelProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class XobotSyncContentProvider extends SynchronizationContentProvider implements IPipelinedTreeContentProvider {

	private XobotNavigatorContentProvider delegate;
	
	public XobotSyncContentProvider() {
		super();
	}

	public void init(ICommonContentExtensionSite site) {
		super.init(site);
		delegate = new XobotNavigatorContentProvider(getContext() != null);
		delegate.init(site);
	}
	
	public void dispose() {
		super.dispose();
		if (delegate != null)
			delegate.dispose();
	}
	
	protected ITreeContentProvider getDelegateContentProvider() {
		return delegate;
	}

	protected String getModelProviderId() {
		return XobotModelProvider.XOBOT_MODEL_PROVIDER_ID;
	}

	protected Object getModelRoot() {
		return WorkspaceCoreResources.geWorkspaceElementService().getProjectRegistry();
	}

	protected ResourceTraversal[] getTraversals(
			ISynchronizationContext context, Object object) {
		if (object instanceof XWorkspaceElementDescriptor) {
			XWorkspaceElementDescriptor model = (XWorkspaceElementDescriptor) object;
			ResourceMapping mapping = Adapters.adapt(model, ResourceMapping.class);
			ResourceMappingContext rmc = new SynchronizationResourceMappingContext(context);
			try {
				//FIXME: rework
				return mapping.getTraversals(rmc, new NullProgressMonitor());
			} catch (CoreException e) {
				//FIXME:
				e.printStackTrace();
			}
		}
		return new ResourceTraversal[0];
	}
	
	protected Object[] getChildrenInContext(ISynchronizationContext context, Object parent, Object[] children) {
		Set<Object> allChildren = new HashSet<>();
		allChildren.addAll(Arrays.asList(super.getChildrenInContext(context, parent, children)));

		if (parent instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) parent;
			IResource container = Adapters.adapt(folder, IResource.class);
			IDiff[] diffs = context.getDiffTree().getDiffs(container, IResource.DEPTH_ONE);
			for (int i = 0; i < diffs.length; i++) {
				IDiff diff = diffs[i];
				IResource resource = ResourceDiffTree.getResourceFor(diff);
				if (!resource.exists() && WorkspaceCoreResources.isIndexFile(resource)) {
					XFunctionDefinitionIndex file = (XFunctionDefinitionIndex) Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
					if (file != null) {
						allChildren.add(file);
					}
				}
			}
		}
		if (parent instanceof XFunctionDefinitionIndex) {
			ResourceTraversal[] traversals = getTraversals(context, parent);
			IDiff[] diffs = context.getDiffTree().getDiffs(traversals);
			for (int i = 0; i < diffs.length; i++) {
				IDiff diff = diffs[i];
				IResource resource = ResourceDiffTree.getResourceFor(diff);
				if (!resource.exists() && WorkspaceCoreResources.isBodyFile(resource)) {
					XFunctionDefinitionIndex index = (XFunctionDefinitionIndex)parent;
					XFunctionDefinitionBody o = new XFunctionDefinitionBody(index, (IFile)resource);
					allChildren.add(o);
				}
			}
		}
		return allChildren.toArray(new Object[allChildren.size()]);
	}

	public void getPipelinedChildren(Object aParent, Set theCurrentChildren) {
		// Nothing to do
	}

	public void getPipelinedElements(Object anInput, Set theCurrentElements) {
		if (anInput instanceof ISynchronizationContext) {
			List<XProjectDescriptor> newProjects = new ArrayList<>();
			for (Iterator iter = theCurrentElements.iterator(); iter.hasNext();) {
				Object element = iter.next();
				if (element instanceof IProject) {
					IProject project = (IProject) element;
					XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
					if (adapted != null) {
						iter.remove();
						newProjects.add(adapted);
					}
				}
			}
			theCurrentElements.addAll(newProjects);
		} else if (anInput instanceof ISynchronizationScope) {
			theCurrentElements.add(getModelProvider());
		}
	}

	public Object getPipelinedParent(Object anObject, Object aSuggestedParent) {
		// leave parent as is
		return aSuggestedParent;
	}

	public PipelinedShapeModification interceptAdd(PipelinedShapeModification anAddModification) {
		if (anAddModification.getParent() instanceof ISynchronizationContext) {
			for (Iterator iter = anAddModification.getChildren().iterator(); iter.hasNext();) {
				Object element = iter.next();
				if (element instanceof IProject) {
					IProject project = (IProject) element;
					if (WorkspaceCoreResources.isXobotProject(project)) {
						iter.remove();
					}
				}
			}
		}
		return null;
	}

	public boolean interceptRefresh(PipelinedViewerUpdate aRefreshSynchronization) {
		// No need to intercept the refresh
		return false;
	}

	public PipelinedShapeModification interceptRemove(PipelinedShapeModification aRemoveModification) {
		// No need to intercept the remove
		return aRemoveModification;
	}

	public boolean interceptUpdate(PipelinedViewerUpdate anUpdateSynchronization) {
		// No need to intercept the update
		return false;
	}
	
	public void diffsChanged(final IDiffChangeEvent event, IProgressMonitor monitor) {
		// Override in order to perform custom viewer updates when the diff tree changes
		Utils.syncExec((Runnable) () -> handleChange(event), (StructuredViewer)getViewer());
	}

	void handleChange(IDiffChangeEvent event) {
		Set<XProjectDescriptor> existingProjects = getVisibleProjectDescriptors();
		Set<IProject> changedProjects = getChangedModelProjects(event);
		List<XProjectDescriptor> refreshes = new ArrayList<>(changedProjects.size());
		List<XProjectDescriptor> additions = new ArrayList<>(changedProjects.size());
		List<XProjectDescriptor> removals = new ArrayList<>(changedProjects.size());
		for (IProject project : changedProjects) {
			XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
			if (adapted == null) {
				continue;
			}
			if (hasVisibleChanges(event.getTree(), project)) {
				if (existingProjects.contains(adapted)) {
					refreshes.add(adapted);
				} else {
					additions.add(adapted);
				}
			} else if (existingProjects.contains(adapted)) {
				removals.add(adapted);
			}
		}
		if (!removals.isEmpty() || !additions.isEmpty() || !refreshes.isEmpty()) {
			TreeViewer viewer = (TreeViewer)getViewer();
			Tree tree = viewer.getTree();
			try {
				tree.setRedraw(false);
				if (!additions.isEmpty())
					viewer.add(viewer.getInput(), additions.toArray());
				if (!removals.isEmpty())
					viewer.remove(viewer.getInput(), removals.toArray());
				if (!refreshes.isEmpty()) {
					for (Iterator iter = refreshes.iterator(); iter.hasNext();) {
						Object element = iter.next();
						viewer.refresh(element);
					}
				}
			} finally {
				tree.setRedraw(true);
			}
		}
	}

	private boolean hasVisibleChanges(IDiffTree tree, IProject project) {
		return tree.hasMatchingDiffs(project.getFullPath(), new FastDiffFilter() {
			public boolean select(IDiff diff) {
				return isVisible(diff);
			}
		});
	}

	private Set<IProject> getChangedModelProjects(IDiffChangeEvent event) {
		Set<IProject> result = new HashSet<>();
		IDiff[] changes = event.getChanges();
		for (int i = 0; i < changes.length; i++) {
			IDiff diff = changes[i];
			IResource resource = ResourceDiffTree.getResourceFor(diff);
			if (resource != null && WorkspaceCoreResources.isXobotProject(resource.getProject())) {
				result.add(resource.getProject());
			}
		}
		IDiff[] additions = event.getAdditions();
		for (int i = 0; i < additions.length; i++) {
			IDiff diff = additions[i];
			IResource resource = ResourceDiffTree.getResourceFor(diff);
			if (resource != null && WorkspaceCoreResources.isXobotProject(resource.getProject())) {
				result.add(resource.getProject());
			}
		}
		IPath[] removals = event.getRemovals();
		for (int i = 0; i < removals.length; i++) {
			IPath path = removals[i];
			if (path.segmentCount() > 0) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(path.segment(0));
				if (WorkspaceCoreResources.isXobotProject(project))
					result.add(project);
			}
		}
		return result;
	}

	private Set<XProjectDescriptor> getVisibleProjectDescriptors() {
		TreeViewer viewer = (TreeViewer)getViewer();
		Tree tree = viewer.getTree();
		TreeItem[] children = tree.getItems();
		Set<XProjectDescriptor> result = new HashSet<>();
		for (int i = 0; i < children.length; i++) {
			TreeItem control = children[i];
			Object data = control.getData();
			XProjectDescriptor adapt = Adapters.adapt(data, XProjectDescriptor.class);
			if (adapt != null) {
				result.add(adapt);
			}
		}
		return result;
	}
	
	public void propertyChanged(IDiffTree tree, int property, IPath[] paths) {
		// We're overriding this message so that label updates occur for any elements
		// whose labels may have changed
		if (getContext() == null)
			return;
		final Set<XWorkspaceElementDescriptor> updates = new HashSet<>();
		boolean refresh = false;
		for (int i = 0; i < paths.length; i++) {
			IPath path = paths[i];
			IDiff diff = tree.getDiff(path);
			if (diff != null) {
				IResource resource = ResourceDiffTree.getResourceFor(diff);
				XWorkspaceElementDescriptor adapted = Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
				if (adapted != null) {
					updates.add(adapted);
				} else {
					//FIXME:
					// If the resource is a body file, we need to update both the body and the index file
					// Unfortunately, there's no good way to find the parent file so we'll just refresh everything
					refresh = true;
				}
			}
		}
		if (!updates.isEmpty() || refresh) {
			final boolean refreshAll = refresh;
			final StructuredViewer viewer = (StructuredViewer)getViewer();
			Utils.syncExec((Runnable) () -> {
				if (refreshAll)
					viewer.refresh(true);
				else
					viewer.update(updates.toArray(new Object[updates.size()]), null);
			}, viewer);
		}
	}

}
