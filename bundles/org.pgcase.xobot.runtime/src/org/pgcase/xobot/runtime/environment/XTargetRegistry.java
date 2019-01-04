package org.pgcase.xobot.runtime.environment;

public interface XTargetRegistry {
	
	Iterable<XTargetSetDescriptor> getTargetSets();

	Iterable<XTargetDescriptor> getTargets();

	void registerTargetSet(XTargetSetDescriptor targetSet);

	void unregisterTargetSet(XTargetSetDescriptor targetSet);

}
