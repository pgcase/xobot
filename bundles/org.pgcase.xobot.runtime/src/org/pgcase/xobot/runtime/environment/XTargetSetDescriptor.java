package org.pgcase.xobot.runtime.environment;

public interface XTargetSetDescriptor {
	
	String getIdentifier();

	String getName();
	
	Iterable<XTargetDescriptor> getTargets();

}
