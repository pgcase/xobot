package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.ArrayList;
import java.util.List;

public class XFunctionBuilder {

	private final List<XArgumentDescriptorImpl> args = new ArrayList<>();

	private final List<String> options = new ArrayList<>(2);

	private String name;

	private String returning;

	public XFunctionBuilder declareName(String name) {

		this.name = name;

		return this;

	}

	public XFunctionBuilder declareReturning(String returning) {

		this.returning = returning;

		return this;

	}

	public XFunctionBuilder addArg(String argClass, String argName, String argType, String argDefault) {

		this.args.add(new XArgumentDescriptorImpl(argClass, argName, argType, argDefault));

		return this;

	}

	public XFunctionBuilder addOption(String option) {

		this.options.add(option);

		return this;

	}

	public XFunctionDescriptor toFunctionBase() {
		return new XFunctionDescriptorImpl(args, options, name, returning);
	}

}
