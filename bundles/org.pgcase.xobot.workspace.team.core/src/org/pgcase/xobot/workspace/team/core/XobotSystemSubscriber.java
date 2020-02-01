/*******************************************************************************
 * Copyright (c) 2019-2020 ArSysOp
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
package org.pgcase.xobot.workspace.team.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.synchronize.SyncInfo;
import org.eclipse.team.core.variants.IResourceVariant;
import org.eclipse.team.core.variants.ThreeWayRemoteTree;
import org.eclipse.team.core.variants.ThreeWaySubscriber;
import org.eclipse.team.core.variants.ThreeWaySynchronizer;

//FIXME: rework to service
public class XobotSystemSubscriber extends ThreeWaySubscriber {

	private static XobotSystemSubscriber instance;
	
	public static synchronized XobotSystemSubscriber getInstance() {
		if (instance == null) {
			instance = new XobotSystemSubscriber();
		}
		return instance;
	}
	
	private XobotSystemSubscriber() {
		super(new ThreeWaySynchronizer(new QualifiedName(TeamCore.ID, "workspace-sync"))); //$NON-NLS-1$
	}

	public IResourceVariant getResourceVariant(IResource resource, byte[] bytes) {
		RepositoryProvider provider = RepositoryProvider.getProvider(resource.getProject(), XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
		if (provider != null) {
			return ((XobotRepositoryProvider)provider).getResourceVariant(resource, bytes);
		}
		return null;
	}

	protected ThreeWayRemoteTree createRemoteTree() {
		return new XobotRemoteTree(this);
	}

	public String getName() {
		return WorkspaceTeamCoreMessages.XobotSystemSubscriber_subscriber_name;
	}

	public IResource[] roots() {
		List<IProject> result = new ArrayList<>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			if(project.isAccessible()) {
				RepositoryProvider provider = RepositoryProvider.getProvider(project, XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
				if(provider != null) {
					result.add(project);
				}
			}
		}
		return (IProject[]) result.toArray(new IProject[result.size()]);
	}

	public void handleRootChanged(IResource resource, boolean added) {
		//FIXME: notify root add\remove
		super.handleRootChanged(resource, added);
	}
	
	protected SyncInfo getSyncInfo(IResource local, IResourceVariant base, IResourceVariant remote) throws TeamException {
		XobotSyncInfo info = new XobotSyncInfo(local, base, remote, this.getResourceComparator());
		info.init();
		return info;
	}

	public void makeInSync(IResource resource) throws TeamException {
		ThreeWaySynchronizer synchronizer = getSynchronizer();
		byte[] remoteBytes = synchronizer.getRemoteBytes(resource);
		if (remoteBytes == null) {
			if (!resource.exists()) {
				synchronizer.flush(resource, IResource.DEPTH_ZERO);
			}
		} else {
			synchronizer.setBaseBytes(resource, remoteBytes);
		}
	}

	public void markAsMerged(IResource resource, IProgressMonitor monitor) throws TeamException {
		makeInSync(resource);
		try {
			resource.touch(monitor);
		} catch (CoreException e) {
			throw TeamException.asTeamException(e);
		}
	}

}
