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

import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.jface.action.IAction;
import org.eclipse.team.core.subscribers.SubscriberScopeManager;
import org.eclipse.team.ui.TeamUI;
import org.eclipse.team.ui.synchronize.ISynchronizeParticipant;
import org.pgcase.xobot.workspace.team.core.XobotMergeContext;
import org.pgcase.xobot.workspace.team.core.XobotSystemSubscriber;

public class XobotSynchronizeAction extends XobotTeamAction {
	
	protected void execute(IAction action) {
		ResourceMapping[] mappings = getSelectedMappings();
		if (mappings.length == 0) {
			return;
		}
		SubscriberScopeManager manager = XobotModelOperation.createScopeManager(XobotSystemSubscriber.getInstance().getName(), mappings);
		XobotMergeContext context = new XobotMergeContext(manager);
		XobotSynchronizeParticipant participant = new XobotSynchronizeParticipant(context);
		TeamUI.getSynchronizeManager().addSynchronizeParticipants(new ISynchronizeParticipant[] {participant});
		participant.run(getTargetPart());
	}

}
