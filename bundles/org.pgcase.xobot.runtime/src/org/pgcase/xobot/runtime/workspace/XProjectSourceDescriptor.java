package org.pgcase.xobot.runtime.workspace;

import org.pgcase.xobot.runtime.environment.XSourceDescriptor;

//project-specific source configuration
public interface XProjectSourceDescriptor {
	
	XProjectConfigurationDescriptor getProjectConfiguration();
	
	XSourceDescriptor getSource();

	String getOptions();

}
