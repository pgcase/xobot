package org.pgcase.xobot.dbproc.jdbc.triggers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.dbproc.jdbc.DbprocJdbc;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerExtractor;

public class JdbcTriggerExtractor implements XTriggerExtractor {
	private static final String SCAN_DBPROC_TRIG_SQL_FILE = "/sql/dbproc_jdbc_triggers.sql"; //$NON-NLS-1$
	private static String sqlSentence = null;	

	@Override
	public Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof Connection) {
			try (Connection jdbcConnection = (Connection) input) {		
				ArrayList<XTriggerDescriptor> triggers = new ArrayList<XTriggerDescriptor>();
				String schema = context.getOrDefault("schema", (Object)"public").toString();
				if (sqlSentence ==null) {
					sqlSentence = DbprocJdbc.getBundleSql(SCAN_DBPROC_TRIG_SQL_FILE);	
				}
				PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sqlSentence);
				preparedStatement.setString(1, schema);
				ResultSet resultSet = preparedStatement.executeQuery();			
				while (resultSet.next()) {
					XTriggerDescriptor parsed = JdbcTriggerParser.parse(jdbcConnection,resultSet,reporter);
					triggers.add(parsed);
				}
				return triggers;
			} catch (Exception e) {
				String message = String.format("Failed to process input with context %s", context);
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}
	
}
