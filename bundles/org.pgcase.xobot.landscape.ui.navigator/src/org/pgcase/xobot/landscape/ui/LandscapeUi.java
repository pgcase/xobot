package org.pgcase.xobot.landscape.ui;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;
import org.pgcase.xobot.landscape.ui.dialogs.FilteredSourceSelectionDialog;
import org.pgcase.xobot.landscape.ui.dialogs.FilteredTargetSelectionDialog;

public class LandscapeUi {

	private LandscapeUi() {
		//block
	}
	
	public static XSourceDescriptor selectSource(Shell shell, String maturity) {
		Bundle bundle = FrameworkUtil.getBundle(LandscapeUi.class);
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		XSourceRegistry registry = serviceContext.get(XSourceRegistry.class);
		FilteredSourceSelectionDialog dialog = new FilteredSourceSelectionDialog(shell, false, maturity, registry);
		dialog.setTitle(LandscapeUiMessages.LandscapeUi_dialog_select_source_title);
		String message = getSourceSelectionMessage(maturity);
		dialog.setMessage(message);
		dialog.open();
		Object firstResult = dialog.getFirstResult();
		if (firstResult instanceof XSourceDescriptor) {
			XSourceDescriptor source = (XSourceDescriptor) firstResult;
			return source;
		}
		return null;
	}

	private static String getSourceSelectionMessage(String maturity) {
		switch (maturity) {
		case FocusDescriptors.MATURITY_INTEGRATION:
			return LandscapeUiMessages.LandscapeUi_source_selection_message_integration;
		case FocusDescriptors.MATURITY_OFFICIAL:
			return LandscapeUiMessages.LandscapeUi_source_selection_message_official;
		case FocusDescriptors.MATURITY_SANDBOX:
			return LandscapeUiMessages.LandscapeUi_source_selection_message_experimental;
		case FocusDescriptors.MATURITY_STABLE:
			return LandscapeUiMessages.LandscapeUi_source_selection_message_stable;
		default:
			return LandscapeUiMessages.LandscapeUi_source_selection_message_default;
		}
	}

	public static XTargetDescriptor selectTarget(Shell shell, String maturity) {
		Bundle bundle = FrameworkUtil.getBundle(LandscapeUi.class);
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		XTargetRegistry registry = serviceContext.get(XTargetRegistry.class);
		FilteredTargetSelectionDialog dialog = new FilteredTargetSelectionDialog(shell, false, maturity, registry);
		dialog.setTitle(LandscapeUiMessages.LandscapeUi_dialog_select_target_title);
		String message = getTargetSelectionMessage(maturity);
		dialog.setMessage(message);
		dialog.open();
		Object firstResult = dialog.getFirstResult();
		if (firstResult instanceof XTargetDescriptor) {
			XTargetDescriptor source = (XTargetDescriptor) firstResult;
			return source;
		}
		return null;
	}

	private static String getTargetSelectionMessage(String maturity) {
		switch (maturity) {
		case FocusDescriptors.MATURITY_INTEGRATION:
			return LandscapeUiMessages.LandscapeUi_target_selection_message_integration;
		case FocusDescriptors.MATURITY_OFFICIAL:
			return LandscapeUiMessages.LandscapeUi_target_selection_message_official;
		case FocusDescriptors.MATURITY_SANDBOX:
			return LandscapeUiMessages.LandscapeUi_target_selection_message_experimental;
		case FocusDescriptors.MATURITY_STABLE:
			return LandscapeUiMessages.LandscapeUi_target_selection_message_stable;
		default:
			return LandscapeUiMessages.LandscapeUi_target_selection_message_default;
		}
	}

	public static Combo createSourceGroup(Composite composite, String groupText, String labelText, Listener comboListener, String maturity) {
		Group group = createGroup(composite, groupText, labelText);
		final Combo combo = createEditableCombo(group);
		new Label(group, SWT.NULL);
		Button browse = createButton(group);
		combo.addListener(SWT.Modify, comboListener);
		browse.addListener(SWT.Selection, e->{
			XSourceDescriptor selected = LandscapeUi.selectSource(combo.getShell(), maturity);
			if (selected != null) {
				combo.setData(selected);
				combo.setText(selected.getUri());
			}
		});
		return combo;
	}

	public static Combo createTargetGroup(Composite composite, String groupText, String labelText, Listener comboListener,
			String maturity) {
		Group group = createGroup(composite, groupText, labelText);
		final Combo combo = createEditableCombo(group);
		new Label(group, SWT.NULL);
		Button browse = createButton(group);
		combo.addListener(SWT.Modify, comboListener);
		browse.addListener(SWT.Selection, e-> {
			XTargetDescriptor selected = LandscapeUi.selectTarget(composite.getShell(), maturity);
			if (selected != null) {
				combo.setData(selected);
				combo.setText(selected.getName());
			}
		});
		return combo;
	}

	private static Group createGroup(Composite composite, String groupText, String labelText) {
		Group group = new Group(composite, SWT.NONE);
		group.setText(groupText);
		group.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		group.setLayout(layout);
	
		Label label = new Label(group, SWT.NULL);
		label.setText(labelText);
		label.setLayoutData(new GridData());
		return group;
	}

	private static Combo createEditableCombo(Composite parent) {
		Combo combo = new Combo(parent, SWT.NULL);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = IDialogConstants.ENTRY_FIELD_WIDTH;
		combo.setLayoutData(data);
		return combo;
	}

	private static Button createButton(Group group) {
		Button browse = new Button(group, SWT.NULL);
		browse.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browse.setText(LandscapeUiMessages.LandscapeUi_button_select_text);
		return browse;
	}

}
