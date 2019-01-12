package org.pgcase.xobot.dbproc.jdbc.functions;

import java.util.List;

import org.pgcase.xobot.dbproc.runtime.XArgumentDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.ArgumentDescriptorImpl;
import org.pgcase.xobot.dbproc.runtime.functions.XJdbcFunctionDescriptor;

public class JdbcFunctionDescription implements XJdbcFunctionDescriptor {

	private final String name;
	private final String schema;
	private final Integer oid;
	private final String returning;
	private final String owner;
	private final String language;
	private final List<ArgumentDescriptorImpl> args;
	private final List<String> options;

	public JdbcFunctionDescription(
			Integer oid,
			String schema,
			String name, 
			String returning,
			String owner,
			String language,
			List<ArgumentDescriptorImpl> args, 
			List<String> options
			) {
		this.oid = oid;
		this.schema = schema;
		this.name = name;
		this.returning = returning;
		this.owner = owner;
		this.language = language;
		this.args = args;
		this.options = options;
	}
	
	@Override
	public String getName() {
		return schema;
	}

	@Override
	public String getSchema() {
		return name;
	}

	@Override
	public int getArgumentsCount() {
		// TODO Auto-generated method stub
		return args.size();
	}

	@Override
	public XArgumentDescriptor getArgument(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOptionsSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOption(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReturns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getOid() {
		return oid;
	}

	@Override
	public String getOwner() {
		return owner;
	}

	@Override
	public String getLang() {
		return language;
	}

	@Override
	public String toString() {
		return "JdbcFunctionDescription [oid=" + oid + 
					", name=" + schema + "." + name + 
					", returning=" + returning + 
					", owner=" + owner +
					", language=" + language +
					", args=" + args + 
					", options=" + options + "]";
	}
	
}
