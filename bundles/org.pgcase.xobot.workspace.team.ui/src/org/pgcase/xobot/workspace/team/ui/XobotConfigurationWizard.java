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

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.ui.IConfigurationWizard;
import org.eclipse.team.ui.IConfigurationWizardExtension;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;

public class XobotConfigurationWizard extends Wizard implements IConfigurationWizard, IConfigurationWizardExtension {
	
	IProject[] projects;
	
	XobotConfigurationWizardPage mainPage;
	
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
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		XSourceRegistry sourceRegistry = serviceContext.get(XSourceRegistry.class);
		XTargetRegistry targetRegistry = serviceContext.get(XTargetRegistry.class);
		XWorkspaceElementService workspaceService = serviceContext.get(XWorkspaceElementService.class);
		XProjectDescriptor projectDescriptor = workspaceService.getProject(projects[0].getName());

		Iterable<? extends XProjectSourceDescriptor> projectSources = projectDescriptor.getProjectSources();
		Iterable<? extends XProjectTargetDescriptor> projectTargets = projectDescriptor.getProjectTargets();
		Map<String, XSourceDescriptor> resolvedSources = WorkspaceCoreResources.resolveSources(sourceRegistry, projectSources);
		Map<String, XTargetDescriptor> resolvedTargets = WorkspaceCoreResources.resolveTargets(targetRegistry, projectTargets);

		mainPage = new XobotConfigurationWizardPage(resolvedSources, resolvedTargets);
		String title = WorkspaceTeamUIMessages.XobotConfigurationWizard_main_page_title;
		String description = WorkspaceTeamUIMessages.XobotConfigurationWizard_main_page_description;
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
				provider.setIntegrationSource(mainPage.getSourceIntegrationLocation());
				if (i > 0) {
					//FIXME: only one project is allowed for now
					break;
				}
			}
		} catch (TeamException e) {
			ErrorDialog.openError(
				getShell(),
				WorkspaceTeamUIMessages.XobotConfigurationWizard_error_title,
				WorkspaceTeamUIMessages.XobotConfigurationWizard_error_description,
				e.getStatus());
			return false;
		}
		return true;
	}

}
