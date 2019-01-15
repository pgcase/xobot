package org.pgcase.xobot.landscape.ui.navigator;

import java.util.stream.StreamSupport;

import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

public class TargetsContentProvider extends RegistryContentProvider<XTargetRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XTargetRegistry) {
			XTargetRegistry registry = (XTargetRegistry) parentElement;
			Iterable<XTargetSetDescriptor> sets = registry.getTargetSets();
			return StreamSupport.stream(sets.spliterator(), false).toArray();
		}
		if (parentElement instanceof XTargetSetDescriptor) {
			XTargetSetDescriptor set = (XTargetSetDescriptor) parentElement;
			Iterable<? extends XTargetDescriptor> targets = set.getTargets();
			return StreamSupport.stream(targets.spliterator(), false).toArray();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XTargetDescriptor) {
			XTargetDescriptor target = (XTargetDescriptor) element;
			return target.getTargetSet();
		}
		if (element instanceof XTargetSetDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XTargetRegistry> getRegistryClass() {
		return XTargetRegistry.class;
	}

}
