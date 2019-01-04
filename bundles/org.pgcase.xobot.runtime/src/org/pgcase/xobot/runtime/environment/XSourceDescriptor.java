package org.pgcase.xobot.runtime.environment;

public interface XSourceDescriptor {
	
	String getIdentifier();

	String getName();

	String getUri();
	
	XSourceSetDescriptor getSourceSet();

}
