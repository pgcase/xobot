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
package org.pgcase.xobot.landscape.ui.wizards;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.pgcase.xobot.basis.jface.WizardPages;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.ui.LandscapeUi;
import org.pgcase.xobot.landscape.ui.navigator.LandscapeUiNavigator;

public class LandscapeConfigurationPage extends WizardPage {

	private static final String STORE_LOCATION = "LandscapeConfigurationPage.STORE_LOCATION";//$NON-NLS-1$

	private static final int COMBO_HISTORY_LENGTH = 5;

	XSourceDescriptor sourceIntegrationLocation;
	Combo sourceIntegrationCombo;

	XTargetDescriptor targetSandboxLocation;
	Combo targetSandboxCombo;

	XTargetDescriptor targetIntegrationLocation;
	Combo targetIntegrationCombo;

	XTargetDescriptor targetStableLocation;
	Combo targetStableCombo;

	XTargetDescriptor targetOfficialLocation;
	Combo targetOfficialCombo;

	public LandscapeConfigurationPage(String pageName) {
		super(pageName);
	}

	protected Button createCheckBox(Composite group, String label) {
		Button button = new Button(group, SWT.CHECK | SWT.LEFT);
		button.setText(label);
		GridData data = new GridData();
		data.horizontalSpan = 2;
		button.setLayoutData(data);
		return button;
	}

	protected Combo createCombo(Composite parent) {
		Combo combo = new Combo(parent, SWT.READ_ONLY);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = IDialogConstants.ENTRY_FIELD_WIDTH;
		combo.setLayoutData(data);
		return combo;
	}

	protected Composite createComposite(Composite parent, int numColumns) {
		Composite composite = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout();
		layout.numColumns = numColumns;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);
		return composite;
	}

	protected Label createLabel(Composite parent, String text) {
		Label label = new Label(parent, SWT.LEFT);
		label.setText(text);
		GridData data = new GridData();
		data.horizontalSpan = 1;
		data.horizontalAlignment = GridData.FILL;
		label.setLayoutData(data);
		return label;
	}

	protected Text createTextField(Composite parent) {
		Text text = new Text(parent, SWT.SINGLE | SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.verticalAlignment = GridData.CENTER;
		data.grabExcessVerticalSpace = false;
		data.widthHint = IDialogConstants.ENTRY_FIELD_WIDTH;
		text.setLayoutData(data);
		return text;
	}

	protected String[] addToHistory(String[] history, String newEntry) {
		List<String> l = new ArrayList<>(Arrays.asList(history));
		addToHistory(l, newEntry);
		String[] r = new String[l.size()];
		l.toArray(r);
		return r;
	}

	protected void addToHistory(List<String> history, String newEntry) {
		history.remove(newEntry);
		history.add(0, newEntry);

		if (history.size() > COMBO_HISTORY_LENGTH) {
			history.remove(COMBO_HISTORY_LENGTH);
		}
	}

	public void createControl(Composite parent) {
		Composite composite = createPageControl(parent);
		loadWidgetValues();
		setControl(composite);
		validatePage();
	}

	protected Composite createPageControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		composite.setLayout(layout);
		createHeaderControls(composite);
		createLandscapeControls(composite);
		createFooterControls(composite);
		return composite;
	}

	protected void createHeaderControls(Composite composite) {
		// hook for subclasses
	}

	protected void createLandscapeControls(Composite composite) {
		sourceIntegrationCombo = LandscapeUi.createSourceGroup(composite, "Исходный код", "Путь к Git репозиторию", e -> {
			sourceIntegrationLocation = (XSourceDescriptor) e.widget.getData();
			LandscapeConfigurationPage.this.validatePage();
		}, FocusDescriptors.MATURITY_INTEGRATION);

		targetSandboxCombo = LandscapeUi.createTargetGroup(composite, "Экспериментальный стэнд", "Конфигурация экспериментального стэнда",
				e -> {
					targetSandboxLocation = (XTargetDescriptor) e.widget.getData();
					LandscapeConfigurationPage.this.validatePage();
				}, FocusDescriptors.MATURITY_SANDBOX);

		targetIntegrationCombo = LandscapeUi.createTargetGroup(composite, "Интеграционный стэнд", "Конфигурация интеграционного стэнда",
				e -> {
					targetIntegrationLocation = (XTargetDescriptor) e.widget.getData();
					LandscapeConfigurationPage.this.validatePage();
				}, FocusDescriptors.MATURITY_INTEGRATION);

		targetStableCombo = LandscapeUi.createTargetGroup(composite, "Стабильный стэнд", "Конфигурация стабильного стэнда", e -> {
			targetStableLocation = (XTargetDescriptor) e.widget.getData();
			LandscapeConfigurationPage.this.validatePage();
		}, FocusDescriptors.MATURITY_STABLE);

		targetOfficialCombo = LandscapeUi.createTargetGroup(composite, "Ахтунг! Прод!", "И не валите всё потом на Хобот", e -> {
			targetOfficialLocation = (XTargetDescriptor) e.widget.getData();
			LandscapeConfigurationPage.this.validatePage();
		}, FocusDescriptors.MATURITY_OFFICIAL);

		sourceIntegrationCombo.setFocus();
	}

	protected void createFooterControls(Composite composite) {
		// hook for subclasses
	}

	public XSourceDescriptor getSourceIntegrationLocation() {
		return sourceIntegrationLocation;
	}
	
	public XTargetDescriptor getTargetSandboxLocation() {
		return targetSandboxLocation;
	}
	
	public XTargetDescriptor getTargetIntegrationLocation() {
		return targetIntegrationLocation;
	}
	
	public XTargetDescriptor getTargetStableLocation() {
		return targetStableLocation;
	}
	
	public XTargetDescriptor getTargetOfficialLocation() {
		return targetOfficialLocation;
	}

	protected void loadWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] locations = settings.getArray(STORE_LOCATION);
			if (locations != null) {
				for (int i = 0; i < locations.length; i++) {
					sourceIntegrationCombo.add(locations[i]);
				}
				sourceIntegrationCombo.select(0);
			}
		}
	}

	protected void storeWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] locations = settings.getArray(STORE_LOCATION);
			if (locations == null)
				locations = new String[0];
			locations = addToHistory(locations, sourceIntegrationCombo.getText());
			settings.put(STORE_LOCATION, locations);
		}
	}

	protected void validatePage() {
		IStatus result = validateFields();
		WizardPages.updatePage(this, result);
	}
	
	protected IStatus validateFields() {
		if (sourceIntegrationLocation == null) {
			String message = "Необходимо указать, где находится исходный код";
			return createError(message);
		}
		if (targetSandboxLocation == null) {
			String message = "Необходимо указать экспериментальный стэнд";
			return createError(message);
		}
		if (targetIntegrationLocation == null) {
			String message = "Необходимо указать интеграционный стэнд";
			return createError(message);
		}
		if (targetStableLocation == null) {
			String message = "Рекомендуется указать стабильный стэнд";
			return createWarning(message);
		}
		if (targetOfficialLocation == null) {
			String message = "Рекомендуется указать официальный стэнд";
			return createWarning(message);
		}
		return Status.OK_STATUS;
	}

	protected static IStatus createError(String message) {
		return new Status(IStatus.ERROR, LandscapeUiNavigator.ID, message);
	}

	protected static IStatus createWarning(String message) {
		return new Status(IStatus.WARNING, LandscapeUiNavigator.ID, message);
	}

	@Override
	public void dispose() {
		storeWidgetValues();
		super.dispose();
	}
}
