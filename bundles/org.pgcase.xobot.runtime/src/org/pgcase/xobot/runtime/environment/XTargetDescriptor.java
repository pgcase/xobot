package org.pgcase.xobot.runtime.environment;

public interface XTargetDescriptor {
	
	String getIdentifier();

	String getName();

	String getUri();
	
	XTargetSetDescriptor getTargetSet();

}
