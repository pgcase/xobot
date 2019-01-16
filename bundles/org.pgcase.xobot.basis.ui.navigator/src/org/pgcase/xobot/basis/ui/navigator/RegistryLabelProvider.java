package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.pgcase.xobot.basis.runtime.DescribedDescriptor;

public class RegistryLabelProvider implements ICommonLabelProvider {
	
	private ILabelProvider delegate;
	
	@Override
	public Image getImage(Object element) {
		return delegate.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return delegate.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		delegate.addListener(listener);
	}

	@Override
	public void dispose() {
		delegate = null;
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return delegate.isLabelProperty(element, property);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		delegate.removeListener(listener);
	}

	@Override
	public void restoreState(IMemento aMemento) {
	}

	@Override
	public void saveState(IMemento aMemento) {
	}

	@Override
	public String getDescription(Object anElement) {
		if (anElement instanceof DescribedDescriptor) {
			DescribedDescriptor descriptor = (DescribedDescriptor) anElement;
			return descriptor.getName();
		}
		return null;
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		delegate = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
	}

}
