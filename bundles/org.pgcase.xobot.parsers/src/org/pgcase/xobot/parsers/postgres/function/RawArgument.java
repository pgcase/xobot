package org.pgcase.xobot.parsers.postgres.function;

import org.pgcase.xobot.runtime.XArgumentDescriptor;

public class RawArgument implements XArgumentDescriptor {

	private final String argClass;
	private final String argType;
	private final String argName;
	private final String argDefault;

	public RawArgument(String argClass, String argName, String argType, String argDefault) {
		super();
		this.argClass = argClass;
		this.argName = argName;
		this.argType = argType;
		this.argDefault = argDefault;
	}

	@Override
	public String getArgumentClass() {
		return argClass;
	}

	@Override
	public String getArgumentType() {
		return argType;
	}

	@Override
	public String getName() {
		return argName;
	}

	@Override
	public String getDefaultValue() {
		return argDefault;
	}

	@Override
	public String toString() {
		return "Function Argument [argClass=" + argClass + ", argType=" + argType + ", argName=" + argName
				+ ", argDefault=" + argDefault + "]";
	}

}
