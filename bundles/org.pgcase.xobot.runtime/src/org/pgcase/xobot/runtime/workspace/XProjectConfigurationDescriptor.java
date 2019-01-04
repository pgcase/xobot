package org.pgcase.xobot.runtime.workspace;

//source-toolchain-target transformation configuration goes here
public interface XProjectConfigurationDescriptor {
	
	XProjectSourceDescriptor getSource();
	
	XProjectConfigurationToolchainDescriptor getToolcain();

	XProjectTargetDescriptor getTarget();

}
