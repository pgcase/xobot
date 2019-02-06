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
package org.pgcase.xobot.workspace.ui.ide;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.pgcase.xobot.landscape.runtime.XPileDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.workspace.core.filesystem.XobotFiles;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class NewXobotProjectWizard extends BasicNewResourceWizard implements INewWizard {

	private NewXobotProjectWizardPage mainPage;

	public NewXobotProjectWizard() {
		setNeedsProgressMonitor(true);
		setWindowTitle("New Xobot Project");
	}

	@Override
	public void addPages() {
		mainPage = new NewXobotProjectWizardPage();
		addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		String projectName = mainPage.getProjectName();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace.newProjectDescription(projectName);
		URI locatiionUri = XobotFiles.composeInstallLocationRoot(projectName);
		description.setLocationURI(locatiionUri);
		WorkspaceCoreResources.configureProjectDescription(description);
		IProject project = workspace.getRoot().getProject(projectName);
		List<XSourceDescriptor> sources = collectProjectSources();
		List<XTargetDescriptor> targets = collectProjectTarget();
		List<XPileDescriptor> folders = collectProjectFolders();
		
		WorkspaceModifyOperation configure = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				XWorkspaceElementService service = WorkspaceCoreResources.getWorkspaceElementService();
				XProjectRegistry projectRegistry = service.getProjectRegistry();
				XProjectDescriptor xobot = projectRegistry.createProject(project.getName(), sources, targets, folders);
				WorkspaceCoreResources.configureXobotProject(project, xobot, monitor);
			}
		};
		// create the new project operation
		IRunnableWithProgress op = monitor -> {
			CreateProjectOperation create = new CreateProjectOperation(description, "New Xobot Project");
			try {
				// see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=219901
				// directly execute the operation so that the undo state is
				// not preserved. Making this undoable resulted in too many
				// accidental file deletions.
				create.execute(monitor, WorkspaceUndoUtil.getUIInfoAdapter(getShell()));
			} catch (ExecutionException e) {
				throw new InvocationTargetException(e);
			}
		};
		try {
			IWizardContainer container = getContainer();
			container.run(true, true, op);
			container.run(true, false, configure);
			selectAndReveal(project);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
	}

	private List<XSourceDescriptor> collectProjectSources() {
		List<XSourceDescriptor> sources = new ArrayList<>();
		sources.add(mainPage.getSourceIntegrationLocation());
		return sources;
	}

	private List<XTargetDescriptor> collectProjectTarget() {
		List<XTargetDescriptor> targets = new ArrayList<>();
		XTargetDescriptor sandbox = mainPage.getTargetSandboxLocation();
		if (sandbox != null) {
			targets.add(sandbox);
		}
		XTargetDescriptor integration = mainPage.getTargetIntegrationLocation();
		if (integration != null) {
			targets.add(integration);
		}
		XTargetDescriptor stable = mainPage.getTargetStableLocation();
		if (stable != null) {
			targets.add(stable);
		}
		XTargetDescriptor official = mainPage.getTargetOfficialLocation();
		if (official != null) {
			targets.add(official);
		}
		return targets;
	}

	private List<XPileDescriptor> collectProjectFolders() {
		List<XPileDescriptor> folders = new ArrayList<>();
		folders.add(new XPileDescriptor() {
			
			@Override
			public String getPath() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.FUNCTION_FOLDER_NAME;
			}
			
			@Override
			public String getOrigin() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.FUNCTION_FOLDER_NAME;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Функции";
			}
			
			@Override
			public String getIdentifier() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.FUNCTION_FOLDER_NAME;
			}
		});
		folders.add(new XPileDescriptor() {
			
			@Override
			public String getPath() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.TRIGGER_FOLDER_NAME;
			}
			
			@Override
			public String getOrigin() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.TRIGGER_FOLDER_NAME;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Триггеры";
			}
			
			@Override
			public String getIdentifier() {
				// TODO Auto-generated method stub
				return WorkspaceCoreResources.TRIGGER_FOLDER_NAME;
			}
		});
		return folders;
	}
}
