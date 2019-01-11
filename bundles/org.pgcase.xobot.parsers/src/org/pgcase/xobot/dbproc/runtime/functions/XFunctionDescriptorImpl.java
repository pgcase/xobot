package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.List;

import org.pgcase.xobot.dbproc.runtime.XArgumentDescriptor;

public class XFunctionDescriptorImpl implements XFunctionDescriptor {

	private final List<XArgumentDescriptorImpl> args;

	private final List<String> options;

	private final String name;

	private final String returning;

	public XFunctionDescriptorImpl(List<XArgumentDescriptorImpl> args, List<String> options, String name, String returning) {
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
