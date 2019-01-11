package org.pgcase.xobot.dbproc.runtime;

public interface XArgumentDescriptor extends XNamedDescriptor {

	String getDefaultValue();

	String getArgumentType();

	String getArgumentClass();

}
