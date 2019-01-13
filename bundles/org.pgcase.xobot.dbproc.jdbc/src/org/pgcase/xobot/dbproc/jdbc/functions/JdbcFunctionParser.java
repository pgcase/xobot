package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.ArgumentDescriptorImpl;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.XJdbcFunctionDescriptor;

public class JdbcFunctionParser {

	public static XJdbcFunctionDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter) 
			throws SQLException 
	{
		
		List<ArgumentDescriptorImpl> args = null;
		List<String> options = null;
		
		JdbcFunctionDescription desc = new JdbcFunctionDescription(
				resultSet.getInt("pro_oid"), 
				resultSet.getString("schema_name"), 
				resultSet.getString("pro_name"), 
				resultSet.getString("pro_return"), 
				resultSet.getString("proowner_name"), 
				resultSet.getString("prolang_name"), 
				args, 
				options);
		return desc;
	}


}
