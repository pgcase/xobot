package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.pgcase.xobot.basis.ui.navigator.RegistryLabelProvider;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;

public class ProjectSourcesLabelProvider extends RegistryLabelProvider {
	
	XSourceRegistry sourceRegistry;
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor reference = (XProjectSourceDescriptor) element;
			return getImage(resolveSource(reference));
		}
		return super.getImage(element);
	}

	protected XSourceDescriptor resolveSource(XProjectSourceDescriptor reference) {
		String identifier = reference.getSourceIdentifier();
		XSourceDescriptor source = sourceRegistry.getSource(identifier);
		return source;
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor reference = (XProjectSourceDescriptor) element;
			return getText(resolveSource(reference));
		}
		return super.getText(element);
	}
	
	@Override
	public Color getBackground(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor reference = (XProjectSourceDescriptor) element;
			return getBackground(resolveSource(reference));
		}
		return super.getBackground(element);
	}
	
	@Override
	public Color getForeground(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor reference = (XProjectSourceDescriptor) element;
			return getForeground(resolveSource(reference));
		}
		return super.getForeground(element);
	}
	
	@Override
	public Font getFont(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor reference = (XProjectSourceDescriptor) element;
			return getFont(resolveSource(reference));
		}
		return super.getFont(element);
	}
	
	@Override
	protected void init(IEclipseContext serviceContext) {
		super.init(serviceContext);
		sourceRegistry = serviceContext.get(XSourceRegistry.class);
	}

}
