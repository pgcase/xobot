package org.pgcase.xobot.parsers.postgres.function;

import java.util.List;

import org.pgcase.xobot.runtime.XArgumentDescriptor;
import org.pgcase.xobot.runtime.XFunctionDescriptor;

public class RawFunctionBaseImpl implements XFunctionDescriptor {

	private final List<RawArgument> args;

	private final List<String> options;

	private final String name;

	private final String returning;

	public RawFunctionBaseImpl(List<RawArgument> args, List<String> options, String name, String returning) {
		this.args = args;
		this.options = options;
		this.name = name;
		this.returning = returning;
	}

	public int getArgumentsCount() {
		return args.size();
	}

	public XArgumentDescriptor getArgument(int i) {
		return args.get(i);
	}

	public int getOptionsSize() {
		return options.size();
	}

	public String getOption(int i) {
		return options.get(i);
	}

	public String getName() {
		return name;
	}

	public String getReturns() {
		return returning;
	}

	@Override
	public String toString() {
		return "XFunctionDescriptor [name=" + name + ", returning=" + returning + ", args=" + args + ", options=" + options
				+ "]";
	}

}
