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
package org.pgcase.xobot.workspace.e3.ui.ide;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.pgcase.xobot.workspace.filesystem.XobotFiles;
import org.pgcase.xobot.workspace.resources.XobotProjectNature;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;

public class NewXobotProjectWizard extends BasicNewResourceWizard implements INewWizard {

	private NewXobotProjectWizardPage mainPage;

	public class NewXobotProjectWizardPage extends WizardPage {
		private String projectName;
		private Text txtName;

		public NewXobotProjectWizardPage(String pageName) {
			super(pageName);
			setTitle("New Xobot Project");
			setDescription("Xobot Project");
			setMessage("Project name must be specified");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 3;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			Label nameFieldILabel = new Label(composite, SWT.LEFT);
			{
				nameFieldILabel.setText("Project name:");
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = false;
				data.horizontalSpan = 1;
				nameFieldILabel.setLayoutData(data);
			}
			
			txtName = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.horizontalSpan = 2;
				txtName.setLayoutData(data);
			}
			txtName.addModifyListener(e -> {
				projectName = txtName.getText();
				setPageComplete(validatePage());
			});
			txtName.setText("new_xobot_project");

			setPageComplete(validatePage());
			setControl(composite);
		}

		private boolean validatePage() {
			// TODO Auto-generated method stub
			if (projectName.isEmpty()) {
				return false;
			}
			return true;
		}
		
		public String getProjectName() {
			return projectName;
		}
	}

	public NewXobotProjectWizard() {
	}
	
	@Override
	public void addPages() {
		mainPage = new NewXobotProjectWizardPage("main");
		addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		String projectName = mainPage.getProjectName();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace.newProjectDescription(projectName);
		URI locatiionUri = XobotFiles.composeInstallLocationRoot(projectName);
		description.setLocationURI(locatiionUri);
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				IProject project = workspace.getRoot().getProject(projectName);
				description.setNatureIds(new String[] {XobotProjectNature.XOBOT_NATURE_ID});
				project.create(description, monitor);
				project.open(monitor);
				project.getFolder("functions").create(true, true, monitor);
				project.getFolder("triggers").create(true, true, monitor);
				RepositoryProvider.map(project, XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
			}
		};
		try {
			getContainer().run(true, false, operation);
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

}
