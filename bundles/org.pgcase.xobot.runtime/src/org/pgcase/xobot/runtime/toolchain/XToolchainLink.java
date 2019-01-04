package org.pgcase.xobot.runtime.toolchain;

public interface XToolchainLink {
	
	XToolDescriptor getTool();

	//let it be just a String for now
	String getOptions();

}
