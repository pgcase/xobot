/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
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
package org.pgcase.xobot.dbproc.team.ui.navigator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.ui.mapping.ITeamStateChangeEvent;
import org.eclipse.team.ui.mapping.ITeamStateChangeListener;
import org.eclipse.team.ui.mapping.SynchronizationStateTester;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.ui.navigator.IPipelinedTreeContentProvider;
import org.eclipse.ui.navigator.PipelinedShapeModification;
import org.eclipse.ui.navigator.PipelinedViewerUpdate;
import org.eclipse.ui.navigator.SaveablesProvider;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;

public class DbprocNavigatorContentProvider extends BaseWorkbenchContentProvider
		implements ICommonContentProvider, IResourceChangeListener, IPipelinedTreeContentProvider, ITeamStateChangeListener, IAdaptable {

	private ICommonContentExtensionSite extensionSite;
	private boolean isWorkspaceRoot;
	private Viewer viewer;
	private final boolean updateViewer;
	private SynchronizationStateTester syncStateTester;
	private Object saveablesProvider = new DbprocSaveablesProvider();

	public DbprocNavigatorContentProvider() {
		this(true);
	}
	
	public DbprocNavigatorContentProvider(boolean updateViewer) {
		this.updateViewer = updateViewer;
	}

	public void init(ICommonContentExtensionSite aConfig) {
		extensionSite = aConfig;
		if (updateViewer) {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
			syncStateTester = new SynchronizationStateTester();
			syncStateTester.getTeamStateProvider().addDecoratedStateChangeListener(this);
		}
	}

	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		if (syncStateTester != null) {
			syncStateTester.getTeamStateProvider().removeDecoratedStateChangeListener(this);
		}
		super.dispose();
	}
	
	public void restoreState(IMemento aMemento) {
		// Nothing to do
	}

	public void saveState(IMemento aMemento) {
		// Nothing to do
	}

	public ICommonContentExtensionSite getExtensionSite() {
		return extensionSite;
	}
	
	public Object[] getElements(Object element) {
		if (element instanceof IWorkspaceRoot) {
			isWorkspaceRoot = true;
			XProjectRegistry root = WorkspaceCoreResources.getWorkspaceElementService().getProjectRegistry();
			return super.getElements(root);
			
		}
		return super.getElements(element);
	}
	
	public Object getParent(Object element) {
		Object parent = super.getParent(element);
		if (isWorkspaceRoot && parent instanceof XProjectRegistry) {
			return ResourcesPlugin.getWorkspace().getRoot();
		}
		return parent;
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
		super.inputChanged(viewer, oldInput, newInput);
	}
	
	public void teamStateChanged(ITeamStateChangeEvent event) {
		//FIXME: need more efficient way to update
		Set<XProjectDescriptor> refreshProjects = new HashSet<>();
		IResource[] addedRoots = event.getAddedRoots();
		for (int i = 0; i < addedRoots.length; i++) {
			IResource resource = addedRoots[i];
			IProject project = resource.getProject();
			XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
			if (adapted != null) {
				refreshProjects.add(adapted);
			}
		}
		IResource[] removedRoots = event.getRemovedRoots();
		for (int i = 0; i < removedRoots.length; i++) {
			IResource resource = removedRoots[i];
			IProject project = resource.getProject();
			XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
			if (adapted != null) {
				refreshProjects.add(adapted);
			}
		}
		IResource[] changed = event.getChangedResources();
		for (int i = 0; i < changed.length; i++) {
			IResource resource = changed[i];
			IProject project = resource.getProject();
			XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
			if (adapted != null) {
				refreshProjects.add(adapted);
			}
		}
		
		refreshProjects((XProjectDescriptor[]) refreshProjects.toArray(new XProjectDescriptor[refreshProjects.size()]));
	}
	
	public void resourceChanged(IResourceChangeEvent event) {
		if (viewer == null) return;
		IResourceDelta delta = event.getDelta();
		IResourceDelta[] children = delta.getAffectedChildren();
		boolean refreshAll = false;
		Set<XProjectDescriptor> refreshProjects = new HashSet<>();
		for (int i = 0; i < children.length; i++) {
			IResourceDelta childDelta = children[i];
			IProject project = childDelta.getResource().getProject();
			XProjectDescriptor adapted = Adapters.adapt(project, XProjectDescriptor.class);
			if (adapted != null) {
				if (isProjectChange(childDelta)) {
					refreshAll = true;
					break;
				}
				refreshProjects.add(adapted);
			}
		}
		if (refreshAll || !refreshProjects.isEmpty()) {
			if (refreshAll)
				refreshViewer();
			else 
				refreshProjects((XProjectDescriptor[]) refreshProjects.toArray(new XProjectDescriptor[refreshProjects.size()]));
		}
	}

	private void refreshProjects(final XProjectDescriptor[] projects) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!getViewer().getControl().isDisposed()) {
					for (int i = 0; i < projects.length; i++) {
						XProjectDescriptor project = projects[i];
						((AbstractTreeViewer)getViewer()).refresh(project, true);
					}
				}
			}
		
		});
	}

	private void refreshViewer() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!getViewer().getControl().isDisposed()) {
					getViewer().refresh();
				}
			}
		
		});
	}

	private boolean isProjectChange(IResourceDelta childDelta) {
		if ((childDelta.getFlags() & (IResourceDelta.DESCRIPTION | IResourceDelta.OPEN)) > 0) {
			return true;
		}
		return false;
	}

	Viewer getViewer() {
		return viewer;
	}

	public void getPipelinedChildren(Object aParent, Set theCurrentChildren) {
		// Nothing to do
	}

	public void getPipelinedElements(Object anInput, Set theCurrentElements) {
		if (anInput instanceof IWorkspaceRoot) {
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
		}
	}

	public Object getPipelinedParent(Object anObject, Object aSuggestedParent) {
		// not changing parents for now
		return aSuggestedParent;
	}

	public PipelinedShapeModification interceptAdd(PipelinedShapeModification anAddModification) {
		if (anAddModification.getParent() instanceof IWorkspaceRoot) {
			for (Iterator<?> iter = anAddModification.getChildren().iterator(); iter.hasNext();) {
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

	public <T> T getAdapter(Class<T> adapter) {
		if (adapter == SaveablesProvider.class) {
			return adapter.cast(saveablesProvider);
		}
		return Platform.getAdapterManager().getAdapter(this, adapter);
	}

}
