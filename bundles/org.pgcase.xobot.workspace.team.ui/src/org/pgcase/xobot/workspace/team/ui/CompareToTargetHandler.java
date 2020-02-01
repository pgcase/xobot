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
package org.pgcase.xobot.workspace.team.ui;

import java.util.ArrayList;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.subscribers.SubscriberScopeManager;
import org.eclipse.team.internal.ui.Utils;
import org.eclipse.team.ui.synchronize.ISynchronizePageConfiguration;
import org.eclipse.team.ui.synchronize.ParticipantPageCompareEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;
import org.pgcase.xobot.workspace.team.core.XobotMergeContext;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;
import org.pgcase.xobot.workspace.team.core.XobotSystemSubscriber;

public class CompareToTargetHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String maturity = event.getParameter(WorkspaceTeamUi.COMMAND_PARAMETER_TARGET_MATURITY);
		IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
		ResourceMapping[] mappings = getSelectedMappings(selection);
		if (mappings.length == 0) {
			return null;
		}

		SubscriberScopeManager manager = XobotModelOperation
				.createScopeManager(XobotSystemSubscriber.getInstance().getName(), mappings);
		XobotMergeContext context = new XobotMergeContext(manager);
		XobotSynchronizeParticipant participant = new XobotSynchronizeParticipant(context);
		CompareConfiguration cc = new CompareConfiguration();
		ISynchronizePageConfiguration pageConfiguration = participant.createPageConfiguration();
		// Restrict preview page to only support incoming and conflict modes
		if (pageConfiguration.getComparisonType() == ISynchronizePageConfiguration.THREE_WAY) {
			pageConfiguration.setSupportedModes(
					ISynchronizePageConfiguration.INCOMING_MODE | ISynchronizePageConfiguration.CONFLICTING_MODE);
			pageConfiguration.setMode(ISynchronizePageConfiguration.INCOMING_MODE);
		}
		ParticipantPageCompareEditorInput input = new ParticipantPageCompareEditorInput(cc, pageConfiguration,
				participant);
		CompareUI.openCompareDialog(input);
		// TODO Auto-generated method stub
		return null;
	}

	private ResourceMapping[] getSelectedMappings(IStructuredSelection selection) {
		return getSelectedResourceMappings(selection, XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
	}

    protected ResourceMapping[] getSelectedResourceMappings(IStructuredSelection selection, String providerId) {
        Object[] elements = selection.toArray();
        ArrayList<ResourceMapping> providerMappings = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            Object object = elements[i];
            Object adapted = getResourceMapping(object);
            if (adapted instanceof ResourceMapping) {
                ResourceMapping mapping = (ResourceMapping) adapted;
                if (providerId == null || isMappedToProvider(mapping, providerId)) {
                    providerMappings.add(mapping);
                }
            }
        }
        return providerMappings.toArray(new ResourceMapping[providerMappings.size()]);
    }

    private Object getResourceMapping(Object object) {
        if (object instanceof ResourceMapping)
            return object;
        return Utils.getResourceMapping(object);
    }

    private boolean isMappedToProvider(ResourceMapping element, String providerId) {
        IProject[] projects = element.getProjects();
        for (int k = 0; k < projects.length; k++) {
            IProject project = projects[k];
            RepositoryProvider provider = RepositoryProvider.getProvider(project);
            if (provider != null && provider.getID().equals(providerId)) {
                return true;
            }
        }
        return false;
    }
}
