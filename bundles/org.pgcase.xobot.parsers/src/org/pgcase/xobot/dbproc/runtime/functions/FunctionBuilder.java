package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.ArrayList;
import java.util.List;

public class FunctionBuilder {

	private final List<ArgumentDescriptorImpl> args = new ArrayList<>();

	private final List<String> options = new ArrayList<>(2);

	private String name;

	private String returning;

	public FunctionBuilder declareName(String name) {

		this.name = name;

		return this;

	}

	public FunctionBuilder declareReturning(String returning) {

		this.returning = returning;

		return this;

	}

	public FunctionBuilder addArg(String argClass, String argName, String argType, String argDefault) {

		this.args.add(new ArgumentDescriptorImpl(argClass, argName, argType, argDefault));

		return this;

	}

	public FunctionBuilder addOption(String option) {

		this.options.add(option);

		return this;

	}

	public XFunctionDescriptor toFunction() {
		return new FunctionDescriptorImpl(args, options, name, returning);
	}

}
