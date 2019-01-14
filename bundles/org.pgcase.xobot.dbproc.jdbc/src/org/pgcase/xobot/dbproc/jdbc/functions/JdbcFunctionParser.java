package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.ArgumentDescriptorImpl;
import org.pgcase.xobot.dbproc.runtime.functions.FunctionDescriptorImpl;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

public class JdbcFunctionParser {

	public static XFunctionDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter) 
			throws SQLException 
	{
		
		ArrayList<ArgumentDescriptorImpl> args = new ArrayList<ArgumentDescriptorImpl>();
		ArrayList<String> options = new ArrayList<String>();
		
		XFunctionDescriptor desc = new FunctionDescriptorImpl(
				args,options, 
				resultSet.getString("pro_name"), 
				resultSet.getString("pro_return"));
		return desc;
	}

}
