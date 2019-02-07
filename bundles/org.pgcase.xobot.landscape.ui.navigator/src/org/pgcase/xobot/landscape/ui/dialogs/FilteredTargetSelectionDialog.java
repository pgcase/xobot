package org.pgcase.xobot.landscape.ui.dialogs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Shell;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

public class FilteredTargetSelectionDialog extends FilteredFocusSelectionDialog {

	private final XTargetRegistry registry;

	public FilteredTargetSelectionDialog(Shell shell, boolean multi, String maturity, XTargetRegistry registry) {
		super(shell, multi, maturity);
		this.registry = registry;
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
			IProgressMonitor progressMonitor) throws CoreException {
		registry.getTargets().forEach(item -> contentProvider.add(item, itemsFilter));
	}

}
