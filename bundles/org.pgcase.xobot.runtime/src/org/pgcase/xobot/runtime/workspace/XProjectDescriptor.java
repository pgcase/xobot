package org.pgcase.xobot.runtime.workspace;

public interface XProjectDescriptor {
	
	String getIdentifier();

	String getName();

	Iterable<XProjectConfigurationDescriptor> getProjectConfigurations();

}
