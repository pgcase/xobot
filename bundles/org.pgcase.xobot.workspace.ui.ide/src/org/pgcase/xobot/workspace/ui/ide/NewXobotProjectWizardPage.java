package org.pgcase.xobot.workspace.ui.ide;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.pgcase.xobot.landscape.ui.wizards.LandscapeConfigurationPage;

public class NewXobotProjectWizardPage extends LandscapeConfigurationPage {

	private String projectName;
	private Text txtName;

	public NewXobotProjectWizardPage() {
		super(NewXobotProjectWizardPage.class.getName());
		setTitle("Xobot Project");
		setDescription("Xobot Project");
		setMessage("Project name must be specified");
	}

	@Override
	protected void createHeaderControls(Composite parent) {
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
			validatePage();
		});
		txtName.setFocus();
	}
	
	@Override
	protected void loadWidgetValues() {
		String prefix ="xobot_project_";
		int postfix =1;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		while (root.getProject(prefix + postfix).exists()) {
			postfix++;
		}
		txtName.setText(prefix + postfix);
		super.loadWidgetValues();
	}
	
	@Override
	protected IStatus validateFields() {
		if (projectName.isEmpty()) {
			return createError("Необходимо задать имя проекта");
		}
		// TODO Auto-generated method stub
		return super.validateFields();
	}

	public String getProjectName() {
		return projectName;
	}
}