package org.pgcase.xobot.landscape.ui.dialog;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Shell;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

public class FilteredSourceSelectionDialog extends FilteredFocusSelectionDialog {

	private final XSourceRegistry registry;

	public FilteredSourceSelectionDialog(Shell shell, boolean multi, String maturity, XSourceRegistry registry) {
		super(shell, multi, maturity);
		this.registry = registry;
	}

	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider, ItemsFilter itemsFilter,
			IProgressMonitor progressMonitor) throws CoreException {
		registry.getSources().forEach(item -> contentProvider.add(item, itemsFilter));
	}

}
