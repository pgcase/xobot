package org.pgcase.xobot.parsers.postgres.function;

import java.util.ArrayList;
import java.util.List;

public class RawFunctionBuilder {

	private final List<RawArgument> args = new ArrayList<>();

	private final List<String> options = new ArrayList<>(2);

	private String name;

	private String returning;

	public RawFunctionBuilder declareName(String name) {

		this.name = name;

		return this;

	}

	public RawFunctionBuilder declareReturning(String returning) {

		this.returning = returning;

		return this;

	}

	public RawFunctionBuilder addArg(String argClass, String argName, String argType, String argDefault) {

		this.args.add(new RawArgument(argClass, argName, argType, argDefault));

		return this;

	}

	public RawFunctionBuilder addOption(String option) {

		this.options.add(option);

		return this;

	}

	public RawFunctionBase toFunctionBase() {
		return new RawFunctionBaseImpl(args, options, name, returning);
	}

}
