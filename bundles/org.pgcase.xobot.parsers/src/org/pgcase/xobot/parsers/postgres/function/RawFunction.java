package org.pgcase.xobot.parsers.postgres.function;

import java.util.ArrayList;
import java.util.List;

public class RawFunction {
	
	private final List<RawArgument> args = new ArrayList<>();
	
	private final List<String> options = new ArrayList<>(2);

	private String name;
	
	private String returning;
	
	public RawFunction() {
		this.returning = "UNDEFINED";
		this.name = "UNDEFINED";
	}

    public void clear() {
    	this.returning = "UNDEFINED";
		this.name = "UNDEFINED";
		options.clear();
		args.clear();
    }
	
	public RawFunction(String name,String returning) {
		this.returning = returning;
		this.name = name;
	}

	public List<RawArgument> getArgs() {
		return args;
	}
	
	public List<String> getOptions() {
		return options;
	}

	public String getName() {
		return name;
	}

	public String getReturning() {
		return returning;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReturning(String returning) {
		this.returning = returning;
	}

	@Override
	public String toString() {
		return "RawFunction [name=" + name + ", returning=" + returning + ", args=" + args + ", options=" + options + "]";
	}
	
	
	
}
