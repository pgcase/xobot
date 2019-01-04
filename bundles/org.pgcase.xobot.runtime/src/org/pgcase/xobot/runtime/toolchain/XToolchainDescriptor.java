package org.pgcase.xobot.runtime.toolchain;

public interface XToolchainDescriptor {

	String getIdentifier();

	String getName();
	
	Iterable<XToolchainLink> getToolchainLinks();

}
