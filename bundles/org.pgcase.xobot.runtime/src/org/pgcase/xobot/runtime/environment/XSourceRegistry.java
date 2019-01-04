package org.pgcase.xobot.runtime.environment;

public interface XSourceRegistry {
	
	Iterable<XSourceSetDescriptor> getSourceSets();

	Iterable<XSourceDescriptor> getSources();

	void registerSourceSet(XSourceSetDescriptor sourceSet);

	void unregisterSourceSet(XSourceSetDescriptor sourceSet);

}
