package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.pgcase.xobot.basis.runtime.registry.BasisRegistry;

public abstract class RegistryContentProvider<R extends BasisRegistry> implements ICommonContentProvider {

	protected static final Object[] NO_CHILDREN = new Object[0];

	private ServiceReference<R> registryReference;
	private R registry;

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public boolean hasChildren(Object element) {
		Object[] children = getChildren(element);
		return children.length > 0;
	}

	@Override
	public void restoreState(IMemento aMemento) {
	}

	@Override
	public void saveState(IMemento aMemento) {
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		registryReference = bundleContext.getServiceReference(getRegistryClass());
		if (registryReference != null) {
			registry = bundleContext.getService(registryReference);
		}
	}
	
	@Override
	public void dispose() {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		if (registryReference != null) {
			bundleContext.ungetService(registryReference);
			registryReference = null;
		}
		registry = null;
		ICommonContentProvider.super.dispose();
	}

	protected abstract Class<R> getRegistryClass();
	
	protected R getRegistry() {
		return registry;
	}
	
}
