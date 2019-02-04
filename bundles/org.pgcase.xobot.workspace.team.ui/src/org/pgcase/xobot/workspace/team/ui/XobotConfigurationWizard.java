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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.ui.IConfigurationWizard;
import org.eclipse.team.ui.IConfigurationWizardExtension;
import org.eclipse.ui.IWorkbench;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.ui.wizards.LandscapeConfigurationPage;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;

public class XobotConfigurationWizard extends Wizard implements IConfigurationWizard, IConfigurationWizardExtension {
	
	IProject[] projects;
	
	LandscapeConfigurationPage mainPage;
	
	public XobotConfigurationWizard() {
		// retrieve the remembered dialog settings
//		IDialogSettings workbenchSettings = TeamUi.getDialogSettings();
//		IDialogSettings section = workbenchSettings.getSection("XobotConfigurationWizard"); //$NON-NLS-1$
//		if (section == null) {
//			section = workbenchSettings.addNewSection("XobotConfigurationWizard"); //$NON-NLS-1$
//		}
//		setDialogSettings(section);
	}

	public void init(IWorkbench workbench, IProject project) {
		init(workbench, new IProject[] { project } );
	}
	
	@Override
	public void init(IWorkbench workbench, IProject[] projects) {
		this.projects = projects;
	}

	public void addPages() {
		String title = "Протянуть Хобот";
		String description = "Хобот поможет организовать работу с процедурными расширениями";
		mainPage = new LandscapeConfigurationPage(LandscapeConfigurationPage.class.getName());
		mainPage.setTitle(title);
		mainPage.setDescription(description);
		addPage(mainPage);
		
	}
	
	public boolean performFinish() {
		try {
			for (int i = 0; i < projects.length; i++) {
				IProject project = projects[i];
				RepositoryProvider.map(project, XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
				XobotRepositoryProvider provider = (XobotRepositoryProvider) RepositoryProvider.getProvider(project);
				XSourceDescriptor sourceIntegrationLocation = mainPage.getSourceIntegrationLocation();
				String path = new Path(sourceIntegrationLocation.getUri()).append(project.getName()).toOSString();
				provider.setTargetLocation(path);
			}
		} catch (TeamException e) {
			ErrorDialog.openError(
				getShell(),
				"Хобот Устал",
				"Не получается протянуть Хобот",
				e.getStatus());
			return false;
		}
		return true;
	}

}
