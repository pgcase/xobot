package org.pgcase.xobot.runtime.workspace;

import org.pgcase.xobot.runtime.toolchain.XToolchainDescriptor;

//project-specific toolchain configuration
public interface XProjectConfigurationToolchainDescriptor {
	
	XProjectConfigurationDescriptor getProjectConfiguration();
	
	XToolchainDescriptor getToolchain();
	
	String getOptions();

}
