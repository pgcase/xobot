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
package org.pgcase.xobot.dbproc.team.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ModelProvider;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.team.core.diff.FastDiffFilter;
import org.eclipse.team.core.diff.IDiff;
import org.eclipse.team.core.diff.IDiffVisitor;
import org.eclipse.team.core.diff.IThreeWayDiff;
import org.eclipse.team.core.history.IFileRevision;
import org.eclipse.team.core.mapping.IMergeContext;
import org.eclipse.team.core.mapping.IResourceDiff;
import org.eclipse.team.core.mapping.ResourceMappingMerger;
import org.eclipse.team.core.mapping.provider.MergeStatus;
import org.eclipse.team.core.mapping.provider.ResourceDiffTree;
import org.eclipse.team.core.mapping.provider.SynchronizationContext;
import org.pgcase.xobot.dbproc.core.resources.DbprocCoreResources;
import org.pgcase.xobot.dbproc.core.resources.ReworkMe;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.dbproc.core.resources.mappings.DbprocModelProvider;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;
import org.pgcase.xobot.workspace.team.core.TeamCore;

//FIXME: rework
public class DbprocModelMerger extends ResourceMappingMerger {

	private final DbprocModelProvider provider;

	public DbprocModelMerger(DbprocModelProvider provider) {
		this.provider = provider;
	}

	protected ModelProvider getModelProvider() {
		return provider;
	}
	
	public IStatus merge(IMergeContext mergeContext, IProgressMonitor monitor) throws CoreException {
		try {
			IStatus status;
			if (mergeContext.getType() == SynchronizationContext.THREE_WAY) {
				monitor.beginTask(DBProcTeamCoreMessages.DbprocModelMerger_task_merging_xobot_elements_text, 100);
				status = mergeModelElements(mergeContext, SubMonitor.convert(monitor, 50));
				if (!status.isOK())
					return status;
				try {
					Job.getJobManager().join(mergeContext, SubMonitor.convert(monitor, 50));
				} catch (InterruptedException e) {
					// Ignore
				}
				status = super.merge(mergeContext, monitor);
			} else {
				status = super.merge(mergeContext, monitor);
			}
			return status;
		} finally {
			monitor.done();
		}
	}

	private IStatus mergeModelElements(IMergeContext mergeContext, IProgressMonitor monitor) throws CoreException {
		try {
			IDiff[] modeDiffs = getIndexDiffs(mergeContext);
			List<IDiff> failures = new ArrayList<>();
			monitor.beginTask(null, 100 * modeDiffs.length);
			for (int i = 0; i < modeDiffs.length; i++) {
				IDiff diff = modeDiffs[i];
				if (!mergeModelElement(mergeContext, diff, SubMonitor.convert(monitor, 100))) {
					failures.add(diff);
				}
			}
			if (failures.size() > 0) {
				return new MergeStatus(TeamCore.ID, DBProcTeamCoreMessages.DbprocModelMerger_error_objects_merge, getMappings(failures));
			}
			return Status.OK_STATUS;
		} finally {
			monitor.done();
		}
	}

	private ResourceMapping[] getMappings(List<IDiff> failures) {
		List<ResourceMapping> mappings = new ArrayList<>();
		for (IDiff diff : failures) {
			IResource resource = ResourceDiffTree.getResourceFor(diff);
			XFunctionDefinitionIndex file = (XFunctionDefinitionIndex) Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
			ResourceMapping mapping = Adapters.adapt(file, ResourceMapping.class);
			mappings.add(mapping);
		}
		return (ResourceMapping[]) mappings.toArray(new ResourceMapping[mappings.size()]);
	}

	private IDiff[] getIndexDiffs(IMergeContext mergeContext) {
		final List<IDiff> result = new ArrayList<>();
		mergeContext.getDiffTree().accept(getModelProjectTraversals(mergeContext), new IDiffVisitor() {
			public boolean visit(IDiff diff) {
				IResource resource = ResourceDiffTree.getResourceFor(diff);
				if (DbprocCoreResources.isIndexFile(resource)) {
					result.add(diff);
				}
				return true;
			}
		
		});
		return (IDiff[]) result.toArray(new IDiff[result.size()]);
	}

	private ResourceTraversal[] getModelProjectTraversals(IMergeContext mergeContext) {
		IProject[] scopeProjects = mergeContext.getScope().getProjects();
		List<IProject> modelProjects = new ArrayList<>();
		for (int i = 0; i < scopeProjects.length; i++) {
			IProject project = scopeProjects[i];
			if (WorkspaceCoreResources.isXobotProject(project)) {
				modelProjects.add(project);
			}
		}
		if (modelProjects.isEmpty())
			return new ResourceTraversal[0];
		return new ResourceTraversal[] { 
			new ResourceTraversal((IResource[]) modelProjects.toArray(new IResource[modelProjects.size()]), 
					IResource.DEPTH_INFINITE, IResource.NONE)	
		};
	}

	private boolean mergeModelElement(IMergeContext mergeContext, IDiff diff, IProgressMonitor monitor) throws CoreException {
		if (diff instanceof IThreeWayDiff) {
			IThreeWayDiff twd = (IThreeWayDiff) diff;
			if (twd.getDirection() == IThreeWayDiff.INCOMING
					|| twd.getDirection() == IThreeWayDiff.CONFLICTING) {
				IResource resource = ResourceDiffTree.getResourceFor(diff);
				
				if (twd.getDirection() == IThreeWayDiff.CONFLICTING) {
					if (!resource.exists()) {
						return false;
					}
					if (((IResourceDiff)twd.getRemoteChange()).getAfterState() == null) {
						return false;
					}
				}
				
				IResourceDiff remoteChange = (IResourceDiff)twd.getRemoteChange();
				IResource[] localElements = getReferencedResources(resource);
				IResource[] baseElements = getReferencedResources(resource.getProject().getName(), remoteChange.getBeforeState(), monitor);
				IResource[] remoteElements = getReferencedResources(resource.getProject().getName(), remoteChange.getAfterState(), monitor);
				IResource[] addedElements = getAddedElements(baseElements, remoteElements);

				IResource[] removedElements = getAddedElements(remoteElements, baseElements);
				
				if (hasOutgoingChanges(mergeContext, removedElements)) {
					return false;
				}
				
				Set<IResource> elementFiles = new HashSet<>();
				elementFiles.addAll(Arrays.asList(baseElements));
				elementFiles.addAll(Arrays.asList(localElements));
				elementFiles.addAll(Arrays.asList(remoteElements));
				if (!mergeElementFiles(mergeContext, (IResource[]) elementFiles.toArray(new IResource[elementFiles.size()]), monitor)) {
					return false;
				}
				
				if (!resource.exists()) {
					IStatus status = mergeContext.merge(diff, false, monitor);
					if (!status.isOK())
						return false;
				} else {
					XFunctionDefinitionIndex indexFile = (XFunctionDefinitionIndex) Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
					elementFiles = new HashSet<>();
					elementFiles.addAll(Arrays.asList(localElements));
					elementFiles.addAll(Arrays.asList(addedElements));
					elementFiles.removeAll(Arrays.asList(removedElements));
					IFile file = (IFile) indexFile.getResource();
					ReworkMe.setElements(file, (IResource[]) elementFiles.toArray(new IResource[elementFiles.size()]));
					mergeContext.markAsMerged(diff, false, monitor);
				}
			}
		}
		return true;
	}

	private boolean mergeElementFiles(IMergeContext mergeContext, IResource[] resources, IProgressMonitor monitor) throws CoreException {
		IDiff[] diffs = getDiffs(mergeContext, resources);
		IStatus status = mergeContext.merge(diffs, false, monitor);
		return status.isOK();
	}

	private IDiff[] getDiffs(IMergeContext mergeContext, IResource[] resources) {
		Set<IDiff> diffSet = new HashSet<>();
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			IDiff[] diffs = mergeContext.getDiffTree().getDiffs(resource, IResource.DEPTH_ZERO);
			diffSet.addAll(Arrays.asList(diffs));
		}
		return (IDiff[]) diffSet.toArray(new IDiff[diffSet.size()]);
	}

	private boolean hasOutgoingChanges(IMergeContext mergeContext, IResource[] removedElements) {
		FastDiffFilter fastDiffFilter = new FastDiffFilter() {
			public boolean select(IDiff diff) {
				if (diff instanceof IThreeWayDiff) {
					IThreeWayDiff twd = (IThreeWayDiff) diff;
					return twd.getDirection() == IThreeWayDiff.OUTGOING || twd.getDirection() == IThreeWayDiff.CONFLICTING;
				}
				return false;
			}
		};
		for (int i = 0; i < removedElements.length; i++) {
			IResource resource = removedElements[i];
			if  (mergeContext.getDiffTree().hasMatchingDiffs(resource.getFullPath(), fastDiffFilter))
				return true;	
		}
		return false;
	}

	private IResource[] getAddedElements(IResource[] baseElements, IResource[] remoteElements) {
		List<IResource> result = new ArrayList<>();
		Set<IResource> base = new HashSet<>();
		for (int i = 0; i < baseElements.length; i++) {
			IResource resource = baseElements[i];
			base.add(resource);
		}
		for (int i = 0; i < remoteElements.length; i++) {
			IResource resource = remoteElements[i];
			if (!base.contains(resource))
				result.add(resource);
		}
		return (IResource[]) result.toArray(new IResource[result.size()]);
	}

	private IResource[] getReferencedResources(IResource resource) throws CoreException {
		if (resource instanceof IFile && resource.exists()) {
			return XFunctionDefinitionIndex.getReferencedResources(resource.getProject().getName(), (IFile) resource);
		}
		return new IResource[0];
	}
	
	private IResource[] getReferencedResources(String projectName, IFileRevision revision, IProgressMonitor monitor) throws CoreException {
		if (revision != null) {
			return XFunctionDefinitionIndex.getReferencedResources(projectName, revision.getStorage(monitor));
		} 
		return new IResource[0];
	}

}
