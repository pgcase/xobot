package org.pgcase.xobot.landscape.core;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.runtime.DescribedDescriptor;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

@Component
public class SourcesRegistry implements XSourceRegistry {
	
	private final Map<String, XSourceSetDescriptor> sourceSets = new HashMap<>();
	private final Map<String, XSourceDescriptor> sources = new HashMap<>();
	
	@Activate
	public void activate() {
		XSourceSet set1 = XLandscapeFactory.eINSTANCE.createSourceSet();
		set1.setIdentifier("id1");
		set1.setName("Source Set 1");
		registerSourceSet(set1);
	}

	@Override
	public Iterable<? extends DescribedDescriptor> getDescribedRoots() {
		return getSourceSets();
	}

	@Override
	public Iterable<XSourceSetDescriptor> getSourceSets() {
		return sourceSets.values();
	}

	@Override
	public Iterable<XSourceDescriptor> getSources() {
		return sources.values();
	}

	@Override
	public void registerSourceSet(XSourceSetDescriptor sourceSet) {
		String identifier = sourceSet.getIdentifier();
		sourceSets.put(identifier, sourceSet);
	}

	@Override
	public void unregisterSourceSet(XSourceSetDescriptor sourceSet) {
		// TODO Auto-generated method stub

	}

}
