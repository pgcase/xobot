package org.pgcase.xobot.dbproc.jdbc.triggers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.TriggerBuilder;

public class JdbcTriggerParser {
	public static XTriggerDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter) 
			throws SQLException 
	{
		TriggerBuilder builder = new TriggerBuilder();
		builder
			.declareObject(resultSet.getString("tg_table_name"))
			.declareName(resultSet.getString("tg_name"))
			.declareEvent(resultSet.getString("tgf_name"))
			.declareActionTime(resultSet.getString("tgtype"));

		return builder.toTrigger();
	}

}
