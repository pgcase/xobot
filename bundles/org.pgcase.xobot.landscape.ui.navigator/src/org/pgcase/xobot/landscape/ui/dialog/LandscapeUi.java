package org.pgcase.xobot.landscape.ui.dialog;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

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
		dialog.open();
		Object firstResult = dialog.getFirstResult();
		if (firstResult instanceof XSourceDescriptor) {
			XSourceDescriptor source = (XSourceDescriptor) firstResult;
			return source;
		}
		return null;
	}

	public static XTargetDescriptor selectTarget(Shell shell, String maturity) {
		Bundle bundle = FrameworkUtil.getBundle(LandscapeUi.class);
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		XTargetRegistry registry = serviceContext.get(XTargetRegistry.class);
		FilteredTargetSelectionDialog dialog = new FilteredTargetSelectionDialog(shell, false, maturity, registry);
		dialog.setTitle("Select Target");
		String message = NLS.bind("Select configuration for \"{0}\" target", maturity);
		dialog.setMessage(message);
		dialog.open();
		Object firstResult = dialog.getFirstResult();
		if (firstResult instanceof XTargetDescriptor) {
			XTargetDescriptor source = (XTargetDescriptor) firstResult;
			return source;
		}
		return null;
	}

}
