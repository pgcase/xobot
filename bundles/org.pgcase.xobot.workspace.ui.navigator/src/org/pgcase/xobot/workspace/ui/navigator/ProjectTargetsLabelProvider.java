package org.pgcase.xobot.workspace.ui.navigator;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.pgcase.xobot.basis.ui.navigator.RegistryLabelProvider;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

public class ProjectTargetsLabelProvider extends RegistryLabelProvider {
	
	private XTargetRegistry targetRegistry;
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor reference = (XProjectTargetDescriptor) element;
			XTargetDescriptor target = resolveTarget(reference);
			return getImage(target);
		}
		return super.getImage(element);
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor reference = (XProjectTargetDescriptor) element;
			XTargetDescriptor target = resolveTarget(reference);
			return getText(target);
		}
		return super.getText(element);
	}

	protected XTargetDescriptor resolveTarget(XProjectTargetDescriptor reference) {
		String identifier = reference.getTargetIdentifier();
		XTargetDescriptor target = targetRegistry.getTarget(identifier);
		return target;
	}
	
	@Override
	public Color getBackground(Object element) {
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor reference = (XProjectTargetDescriptor) element;
			return getBackground(resolveTarget(reference));
		}
		return super.getBackground(element);
	}
	
	@Override
	public Color getForeground(Object element) {
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor reference = (XProjectTargetDescriptor) element;
			return getForeground(resolveTarget(reference));
		}
		return super.getForeground(element);
	}
	
	@Override
	public Font getFont(Object element) {
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor reference = (XProjectTargetDescriptor) element;
			return getFont(resolveTarget(reference));
		}
		return super.getFont(element);
	}
	
	@Override
	protected void init(IEclipseContext serviceContext) {
		super.init(serviceContext);
		targetRegistry = serviceContext.get(XTargetRegistry.class);
	}

}
