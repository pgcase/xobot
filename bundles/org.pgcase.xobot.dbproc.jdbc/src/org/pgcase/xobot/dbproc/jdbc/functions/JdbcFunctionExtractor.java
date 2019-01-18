package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.pgcase.xobot.dbproc.jdbc.DbprocJdbc;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionExtractor;

public class JdbcFunctionExtractor implements XFunctionExtractor {
	private static final String SCAN_DBPROC_FUNC_SQL_FILE = "/sql/dbproc_jdbc_functions.sql"; //$NON-NLS-1$
	private static String sqlSentence = null;	

	@Override
	public Iterable<XFunctionDescriptor> extractFunctions(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof Connection) {
			try  {		
				Connection jdbcConnection = (Connection) input;
				List<XFunctionDescriptor> functions = new ArrayList<XFunctionDescriptor>();
				String schema = DbprocJdbc.extractSchema(context);						
				if (sqlSentence ==null) {
					sqlSentence = DbprocJdbc.getBundleSql(SCAN_DBPROC_FUNC_SQL_FILE);	
				}
				PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sqlSentence);
				preparedStatement.setString(1, schema);
				ResultSet resultSet = preparedStatement.executeQuery();			
				while (resultSet.next()) {
					XFunctionDescriptor parsed = JdbcFunctionParser.parse(jdbcConnection,resultSet,reporter);
					functions.add(parsed);
				}
				return functions;
			} catch (Exception e) {
				String message = String.format("Failed to process input with context %s", context);
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}
	
}
