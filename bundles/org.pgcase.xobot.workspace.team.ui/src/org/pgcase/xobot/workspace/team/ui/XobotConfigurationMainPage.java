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

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class XobotConfigurationMainPage extends WizardPage {
	
	private static final String STORE_LOCATION = "XobotConfigurationMainPage.STORE_LOCATION";//$NON-NLS-1$

	private static final int COMBO_HISTORY_LENGTH = 5;
	
	String sourceLocation;
	Combo sourceCombo;
	
	String testLocation;
	Combo testCombo;

	String developLocation;
	Combo developCombo;

	String prodLocation;
	Combo prodCombo;

	public XobotConfigurationMainPage(String pageName, String title, String description, ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
		setDescription(description);
		setTitle(title);
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
		history.add(0,newEntry);
	
		if (history.size() > COMBO_HISTORY_LENGTH) {
			history.remove(COMBO_HISTORY_LENGTH);
		}
	}
	
	protected Combo createEditableCombo(Composite parent) {
		Combo combo = new Combo(parent, SWT.NULL);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = IDialogConstants.ENTRY_FIELD_WIDTH;
		combo.setLayoutData(data);
		return combo;
	}
	
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		composite.setLayout(layout);
		setControl(composite);
		
		sourceCombo = createGroup(composite, "Исходный код", "Путь к Git репозиторию");
		sourceCombo.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event e) {
				sourceLocation = ((Combo)e.widget).getText();
				XobotConfigurationMainPage.this.validateFields();		
			}
		});
		testCombo = createGroup(composite, "Тестовый стэнд", "Конфигурация тестового стэнда");
		testCombo.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event e) {
				testLocation = ((Combo)e.widget).getText();
				XobotConfigurationMainPage.this.validateFields();		
			}
		});
		developCombo = createGroup(composite, "Интеграционный стэнд", "Конфигурация интеграционного стэнда");
		developCombo.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event e) {
				developLocation = ((Combo)e.widget).getText();
				XobotConfigurationMainPage.this.validateFields();		
			}
		});
		prodCombo = createGroup(composite, "Ахтунг! Прод!", "И не валите всё потом на Хобот");
		prodCombo.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event e) {
				prodLocation = ((Combo)e.widget).getText();
				XobotConfigurationMainPage.this.validateFields();		
			}
		});

		sourceCombo.setFocus();
		initializeValues();
		validateFields();
	}
	
	private Combo createGroup(Composite composite, String groupText, String labelText) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(groupText);
		group.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);

		Label label = new Label(group, SWT.NULL);
		label.setText(labelText);
		label.setLayoutData(new GridData());
		
		Combo combo = createEditableCombo(group);
		combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(group, SWT.NULL);
		Button browse = new Button(group, SWT.NULL);
		browse.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browse.setText("Выбрать...");
		browse.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				DirectoryDialog d = new DirectoryDialog(getShell());
				String directory = d.open();
				if(directory!=null) {
					combo.setText(directory);
				}			
			}
		});
		return combo;
	}

	public String getSourceLocation() {
		return sourceLocation;
	}

	public boolean finish(IProgressMonitor monitor) {
		saveWidgetValues();
		return true;
	}
	/**
	 * Initializes states of the controls.
	 */
	private void initializeValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] locations = settings.getArray(STORE_LOCATION);
			if (locations != null) {
				for (int i = 0; i < locations.length; i++) {
					sourceCombo.add(locations[i]);
				}
				sourceCombo.select(0);
			}
		}
	}

	//FIXME: store all combos
	private void saveWidgetValues() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			String[] locations = settings.getArray(STORE_LOCATION);
			if (locations == null) locations = new String[0];
			locations = addToHistory(locations, sourceCombo.getText());
			settings.put(STORE_LOCATION, locations);	
		}
	}
	
	void validateFields() {
		String location = sourceCombo.getText();
		if (location.length() == 0) {
			setErrorMessage(null);
			setPageComplete(false);
			return;
		}
		File file = new File(location);
		if(!file.exists() || !file.isDirectory()) {
			setErrorMessage("Похоже, что такой папки нет. Но это пока допустимо. Пока.");
			setPageComplete(true);
			return;				
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
