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
package org.pgcase.xobot.workspace.team.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.team.core.diff.IDiff;
import org.eclipse.team.core.diff.IThreeWayDiff;
import org.eclipse.team.core.mapping.ISynchronizationScopeManager;
import org.eclipse.team.core.mapping.provider.MergeStatus;
import org.eclipse.team.core.mapping.provider.ResourceDiffTree;
import org.eclipse.team.core.subscribers.SubscriberMergeContext;

public class XobotMergeContext extends SubscriberMergeContext {

	public XobotMergeContext(ISynchronizationScopeManager manager) {
		super(XobotSystemSubscriber.getInstance(), manager);
		initialize();
	}

	protected void makeInSync(IDiff diff, IProgressMonitor monitor) throws CoreException {
		IResource resource = ResourceDiffTree.getResourceFor(diff);
		XobotSystemSubscriber.getInstance().makeInSync(resource);
	}

	public void markAsMerged(IDiff diff, boolean inSyncHint, IProgressMonitor monitor) throws CoreException {
		// TODO if inSyncHint is true, we should test to see if the contents match
		IResource resource = ResourceDiffTree.getResourceFor(diff);
		XobotSystemSubscriber.getInstance().markAsMerged(resource, monitor);
	}

	public void reject(IDiff diff, IProgressMonitor monitor) throws CoreException {
		markAsMerged(diff, false, monitor);
	}

	public ISchedulingRule getMergeRule(IDiff node) {
		return ResourceDiffTree.getResourceFor(node).getProject();
	}
	public IStatus merge(IDiff diff, boolean ignoreLocalChanges, IProgressMonitor monitor) throws CoreException {
		// Only attempt the merge for non-conflicts. The reason we do this
		// is because the file system provider doesn't really have the proper base
		// so merging conflicts doesn't work properly
		if (!ignoreLocalChanges) {
			IResource resource = ResourceDiffTree.getResourceFor(diff);
			if (diff instanceof IThreeWayDiff && resource instanceof IFile) {
				IThreeWayDiff twd = (IThreeWayDiff) diff;
				if (twd.getDirection() == IThreeWayDiff.CONFLICTING) {
					return new MergeStatus(TeamCore.ID, WorkspaceTeamCoreMessages.XobotMergeContext_message_cannot_merge,
							new IFile[] { (IFile) resource });
				}
			}
		}
		return super.merge(diff, ignoreLocalChanges, monitor);
	}

}
