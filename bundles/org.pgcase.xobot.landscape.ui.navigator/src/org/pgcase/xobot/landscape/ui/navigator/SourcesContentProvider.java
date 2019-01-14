package org.pgcase.xobot.landscape.ui.navigator;

import java.util.stream.StreamSupport;

import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

public class SourcesContentProvider extends RegistryContentProvider<XSourceRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XSourceRegistry) {
			XSourceRegistry registry = (XSourceRegistry) parentElement;
			Iterable<XSourceSetDescriptor> sets = registry.getSourceSets();
			return StreamSupport.stream(sets.spliterator(), false).toArray();
		}
		if (parentElement instanceof XSourceSetDescriptor) {
			XSourceSetDescriptor set = (XSourceSetDescriptor) parentElement;
			Iterable<? extends XSourceDescriptor> sources = set.getSources();
			return StreamSupport.stream(sources.spliterator(), false).toArray();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XSourceDescriptor) {
			XSourceDescriptor source = (XSourceDescriptor) element;
			return source.getSourceSet();
		}
		if (element instanceof XSourceSetDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XSourceRegistry> getRegistryClass() {
		return XSourceRegistry.class;
	}

}
