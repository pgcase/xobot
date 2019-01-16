package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.FunctionBuilder;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

public class JdbcFunctionParser {

	public static XFunctionDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter) 
			throws SQLException 
	{
		FunctionBuilder builder = new FunctionBuilder();
		builder
			.declareName(resultSet.getString("pro_name"))
			.declareReturning(resultSet.getString("pro_return"));

		return builder.toFunction();
	}

}
