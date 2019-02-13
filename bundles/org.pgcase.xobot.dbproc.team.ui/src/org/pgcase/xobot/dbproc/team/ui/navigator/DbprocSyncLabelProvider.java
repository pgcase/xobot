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
package org.pgcase.xobot.dbproc.team.ui.navigator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.team.core.diff.IDiff;
import org.eclipse.team.core.diff.IDiffTree;
import org.eclipse.team.ui.mapping.SynchronizationLabelProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.core.resources.XWorkspaceResource;
import org.pgcase.xobot.workspace.team.ui.navigator.XobotNavigatorLabelProvider;

public class DbprocSyncLabelProvider extends SynchronizationLabelProvider {
	
	private XobotNavigatorLabelProvider delegate;

	public DbprocSyncLabelProvider() {
		super();
	}

	public void init(ICommonContentExtensionSite site) {
		super.init(site);
		delegate = new XobotNavigatorLabelProvider();
		delegate.init(site);
	}
	
	public void dispose() {
		if (delegate != null) {
			delegate.dispose();
		}
		super.dispose();
	}
	
	protected ILabelProvider getDelegateLabelProvider() {
		return delegate;
	}
	
	protected IDiff getDiff(Object element) {
		if (element instanceof XWorkspaceResource) {
			XWorkspaceResource mr = (XWorkspaceResource) element;
			return getContext().getDiffTree().getDiff(mr.getResource());
		}
		return super.getDiff(element);
	}
	
	protected boolean isIncludeOverlays() {
		return true;
	}
	
	protected boolean isBusy(Object element) {
		if (element instanceof XWorkspaceResource) {
			XWorkspaceResource mr = (XWorkspaceResource) element;
			boolean busy = getContext().getDiffTree().getProperty(mr.getResource().getFullPath(), IDiffTree.P_BUSY_HINT);
			if (!busy && mr instanceof XFunctionDefinitionIndex) {
				XFunctionDefinitionIndex modFile = (XFunctionDefinitionIndex) mr;
				try {
					XFunctionDefinitionBody[] children = modFile.getFunctionBodyFiles();
					for (int i = 0; i < children.length; i++) {
						XFunctionDefinitionBody file = children[i];
						busy = getContext().getDiffTree().getProperty(file.getResource().getFullPath(), IDiffTree.P_BUSY_HINT);
						if (busy)
							break;
					}
				} catch (CoreException e) {
					//FIXME: 
					e.printStackTrace();
				}
			}
			return busy;
		}
		return super.isBusy(element);
	}
	
	protected boolean hasDecendantConflicts(Object element) {
		if (element instanceof XWorkspaceResource) {
			XWorkspaceResource mr = (XWorkspaceResource) element;
			boolean conflict = getContext().getDiffTree().getProperty(mr.getResource().getFullPath(), IDiffTree.P_HAS_DESCENDANT_CONFLICTS);
			if (!conflict && mr instanceof XFunctionDefinitionIndex) {
				XFunctionDefinitionIndex modFile = (XFunctionDefinitionIndex) mr;
				try {
					XFunctionDefinitionBody[] children = modFile.getFunctionBodyFiles();
					for (int i = 0; i < children.length; i++) {
						XFunctionDefinitionBody file = children[i];
						conflict = getContext().getDiffTree().getProperty(file.getResource().getFullPath(), IDiffTree.P_HAS_DESCENDANT_CONFLICTS);
						if (conflict)
							break;
					}
				} catch (CoreException e) {
					//FIXME: 
					e.printStackTrace();
				}
			}
			return conflict;
		}
		return super.hasDecendantConflicts(element);
	}

}
