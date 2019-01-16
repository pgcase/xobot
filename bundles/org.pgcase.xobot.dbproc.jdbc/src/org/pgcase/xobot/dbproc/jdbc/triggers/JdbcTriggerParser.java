package org.pgcase.xobot.dbproc.jdbc.triggers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.TriggerDescriptorImpl;

public class JdbcTriggerParser {
	public static XTriggerDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter) 
			throws SQLException 
	{
		XTriggerDescriptor desc = new TriggerDescriptorImpl(
				resultSet.getString("tg_table_name"), 
				resultSet.getString("tg_name"), 
				resultSet.getString("tgf_name"), 
				resultSet.getString("tgtype"));
		return desc;
	}

}
