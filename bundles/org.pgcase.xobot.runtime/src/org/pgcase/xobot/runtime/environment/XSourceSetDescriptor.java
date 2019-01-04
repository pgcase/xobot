package org.pgcase.xobot.runtime.environment;

public interface XSourceSetDescriptor {
	
	String getIdentifier();

	String getName();
	
	Iterable<XSourceDescriptor> getSources();

}
