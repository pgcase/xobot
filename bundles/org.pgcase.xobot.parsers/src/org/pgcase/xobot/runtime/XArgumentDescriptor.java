package org.pgcase.xobot.runtime;

public interface XArgumentDescriptor extends XNamedDescriptor {

	String getDefaultValue();

	String getArgumentType();

	String getArgumentClass();

}
