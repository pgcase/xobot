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
package org.pgcase.xobot.workspace.team.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.mapping.ISynchronizationScopeManager;
import org.eclipse.team.core.mapping.provider.MergeContext;
import org.eclipse.team.core.mapping.provider.SynchronizationContext;
import org.eclipse.team.core.synchronize.SyncInfo;
import org.eclipse.team.core.variants.IResourceVariant;
import org.eclipse.team.ui.TeamUI;
import org.eclipse.team.ui.mapping.SynchronizationActionProvider;
import org.eclipse.team.ui.synchronize.ISynchronizeModelElement;
import org.eclipse.team.ui.synchronize.ISynchronizePageConfiguration;
import org.eclipse.team.ui.synchronize.ModelSynchronizeParticipant;
import org.eclipse.team.ui.synchronize.ModelSynchronizeParticipantActionGroup;
import org.pgcase.xobot.workspace.team.core.XobotMergeContext;
import org.pgcase.xobot.workspace.team.core.XobotSystemSubscriber;


public class XobotSynchronizeParticipant extends ModelSynchronizeParticipant {
	
	public static final String ID = "org.pgcase.xobot.workspace.team.ui.xobot"; //$NON-NLS-1$
	
	public static final String VIEWER_ID = "org.pgcase.xobot.workspace.team.ui.syncViewer"; //$NON-NLS-1$
	
	public static final String CONTEXT_MENU_PUT_GROUP_1 = "put"; //$NON-NLS-1$
	public static final String CONTEXT_MENU_OVERWRITE_GROUP_1 = "overwrite"; //$NON-NLS-1$
	
	public class XobotParticipantLabelDecorator extends LabelProvider implements ILabelDecorator {

		public Image decorateImage(Image image, Object element) {
			return image;
		}

		public String decorateText(String text, Object element) {
			try {
				if (element instanceof ISynchronizeModelElement) {
					IResource resource = ((ISynchronizeModelElement) element).getResource();
					if (resource != null && resource.getType() == IResource.FILE) {
						SyncInfo info = XobotSystemSubscriber.getInstance().getSyncInfo(resource);
						IResourceVariant variant = info.getRemote();
						if (variant != null) {
							return text + " (" + variant.getContentIdentifier() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
						}
					}
				}
			} catch (TeamException e) {
				//FIXME:
				e.fillInStackTrace();
			}
			return null;
		}
	}
	
	public class XobotMergeActionGroup extends ModelSynchronizeParticipantActionGroup {

		public void initialize(ISynchronizePageConfiguration configuration) {
			super.initialize(configuration);
			//FIXME: not supported yet
//			appendToGroup(
//					ISynchronizePageConfiguration.P_CONTEXT_MENU, 
//					CONTEXT_MENU_PUT_GROUP_1,
//					new ModelPutAction("Put", configuration));
		}
		
		protected void configureMergeAction(String mergeActionId, Action action) {
			if (mergeActionId == SynchronizationActionProvider.MERGE_ACTION_ID) {
				action.setText(WorkspaceTeamUIMessages.XobotSynchronizeParticipant_action_get_text);
			} else if (mergeActionId == SynchronizationActionProvider.MARK_AS_MERGE_ACTION_ID) {
				action.setText(WorkspaceTeamUIMessages.XobotSynchronizeParticipant_action_ignore_remote_text);
			} else {
				super.configureMergeAction(mergeActionId, action);
			}
		}
		
		protected void addToContextMenu(String mergeActionId, Action action, IMenuManager manager) {
			IContributionItem group = null;
			if (mergeActionId == SynchronizationActionProvider.MERGE_ACTION_ID) {
				//looks optional
				group = manager.find(MERGE_ACTION_GROUP);
			} else if (mergeActionId == SynchronizationActionProvider.OVERWRITE_ACTION_ID) {
				//looks required
				group = manager.find(CONTEXT_MENU_OVERWRITE_GROUP_1);
			} else if (mergeActionId == SynchronizationActionProvider.MARK_AS_MERGE_ACTION_ID) {
				//looks optional
				group = manager.find(OTHER_ACTION_GROUP);
			} else {
				super.addToContextMenu(mergeActionId, action, manager);
				return;
			}
			if (group != null) {
				manager.appendToGroup(group.getId(), action);
			} else {
				manager.add(action);
			}
		}

	}
	
	public XobotSynchronizeParticipant() {
		super();
	}
	
	public XobotSynchronizeParticipant(SynchronizationContext context) {
		super(context);
		try {
			setInitializationData(TeamUI.getSynchronizeManager().getParticipantDescriptor(ID));
		} catch (CoreException e) {
			//FIXME:
			e.printStackTrace();
		}
		setSecondaryId(Long.toString(System.currentTimeMillis()));
	}
	
	protected void initializeConfiguration(ISynchronizePageConfiguration configuration) {
		super.initializeConfiguration(configuration);
		configuration.setProperty(ISynchronizePageConfiguration.P_VIEWER_ID, VIEWER_ID);
		configuration.addLabelDecorator(new XobotParticipantLabelDecorator());
	}
	
	protected ModelSynchronizeParticipantActionGroup createMergeActionGroup() {
		return new XobotMergeActionGroup();
	}
	
	protected MergeContext restoreContext(ISynchronizationScopeManager manager) {
		return new XobotMergeContext(manager);
	}
	
	protected ISynchronizationScopeManager createScopeManager(ResourceMapping[] mappings) {
		return XobotModelOperation.createScopeManager(getName(), mappings);
	}
}
