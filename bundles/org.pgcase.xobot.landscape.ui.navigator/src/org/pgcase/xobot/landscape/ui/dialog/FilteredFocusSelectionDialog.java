package org.pgcase.xobot.landscape.ui.dialog;

import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.pgcase.xobot.basis.emf.edit.ui.ComposedLabelProvider;
import org.pgcase.xobot.landscape.runtime.XFocusDescriptor;

public abstract class FilteredFocusSelectionDialog extends FilteredItemsSelectionDialog {
	
	protected final class MaturityFilter extends ItemsFilter {
		
		private final String maturity;
		
		public MaturityFilter(String maturity) {
			this.maturity = maturity;
		}
		
		@Override
		public boolean matchItem(Object item) {
			if (item instanceof XFocusDescriptor) {
				XFocusDescriptor focus = (XFocusDescriptor) item;
				return Objects.equals(maturity, focus.getMaturity());
			}
			return false;
		}

		@Override
		public boolean isConsistentItem(Object item) {
			if (item instanceof XFocusDescriptor) {
				XFocusDescriptor focus = (XFocusDescriptor) item;
				return focus.getMaturity() != null;
			}
			return false;
		}
	}

	private final String maturity;

	public FilteredFocusSelectionDialog(Shell shell, boolean multi, String maturity) {
		super(shell, multi);
		this.maturity = maturity;
		ComposedLabelProvider provider = new ComposedLabelProvider();
		setDetailsLabelProvider(provider);
		setListLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return getElementName(element);
			}
			
			@Override
			public Image getImage(Object element) {
				return provider.getImage(element);
			}
		});
		setInitialPattern("\\*");
	}
	
	@Override
	public boolean close() {
		return super.close();
	}

	@Override
	protected Control createExtendedContentArea(Composite parent) {
		// nothing for now
		return null;
	}

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = new DialogSettings("Sources");
		return settings;
	}

	@Override
	protected IStatus validateItem(Object item) {
		return Status.OK_STATUS;
	}

	@Override
	protected ItemsFilter createFilter() {
		return new MaturityFilter(maturity);
	}

	@Override
	protected Comparator<?> getItemsComparator() {
		// TODO Auto-generated method stub
		return (o1, o2) -> {
			if (Objects.equals(o1, o2)) {
				return 0;
			}
			if (o1 == null) {
				return -1;
			}
			if (o2 == null) {
				return 1;
			}
			return Collator.getInstance().compare(o1.toString(), o2.toString());
		};
	}

	@Override
	public String getElementName(Object item) {
		if (item instanceof XFocusDescriptor) {
			XFocusDescriptor focus = (XFocusDescriptor) item;
			return focus.getName();
		}
		return String.valueOf(item);
	}

}
