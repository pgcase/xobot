package org.pgcase.xobot.dbproc.runtime;

public interface XOptionedDescriptor extends XNamedDescriptor {

	int getOptionsSize();

	String getOption(int i);

}
