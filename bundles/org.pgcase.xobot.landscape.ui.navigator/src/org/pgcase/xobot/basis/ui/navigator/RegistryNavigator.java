package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.pgcase.xobot.basis.runtime.registry.BasisRegistry;

public abstract class RegistryNavigator<R extends BasisRegistry> extends CommonNavigator {
	
	private ServiceReference<R> registryReference;
	private R registry;

	@Override
	public void init(IViewSite aSite, IMemento aMemento) throws PartInitException {
		super.init(aSite, aMemento);
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
		super.dispose();
	}

	@Override
	protected Object getInitialInput() {
		return getRegistry();
	}
	
	protected abstract Class<R> getRegistryClass();
	
	protected R getRegistry() {
		return registry;
	}
	
}
