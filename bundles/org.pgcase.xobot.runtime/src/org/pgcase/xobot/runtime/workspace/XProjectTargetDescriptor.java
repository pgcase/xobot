package org.pgcase.xobot.runtime.workspace;

import org.pgcase.xobot.runtime.environment.XTargetDescriptor;

//project-specific target configuration
public interface XProjectTargetDescriptor {
	
	XProjectConfigurationDescriptor getProjectConfiguration();
	
	XTargetDescriptor getTarget();

	String getOptions();

}
