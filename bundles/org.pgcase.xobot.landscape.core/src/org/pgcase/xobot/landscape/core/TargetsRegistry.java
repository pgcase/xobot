package org.pgcase.xobot.landscape.core;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.basis.runtime.DescribedDescriptor;
import org.pgcase.xobot.landscape.model.api.XTargetSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapeFactory;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

@Component
public class TargetsRegistry implements XTargetRegistry {
	
	private final Map<String, XTargetSetDescriptor> targetSets = new HashMap<>();
	private final Map<String, XTargetDescriptor> targets = new HashMap<>();

	@Activate
	public void activate() {
		XTargetSet set1 = XLandscapeFactory.eINSTANCE.createTargetSet();
		set1.setIdentifier("id1");
		set1.setName("Target Set 1");
		registerTargetSet(set1);
	}

	@Override
	public Iterable<? extends DescribedDescriptor> getDescribedRoots() {
		return getTargetSets();
	}

	@Override
	public Iterable<XTargetSetDescriptor> getTargetSets() {
		return targetSets.values();
	}

	@Override
	public Iterable<XTargetDescriptor> getTargets() {
		return targets.values();
	}

	@Override
	public void registerTargetSet(XTargetSetDescriptor targetSet) {
		String identifier = targetSet.getIdentifier();
		targetSets.put(identifier, targetSet);
	}

	@Override
	public void unregisterTargetSet(XTargetSetDescriptor targetSet) {
		// TODO Auto-generated method stub

	}

}
