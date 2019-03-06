/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.dbproc.jdbc.triggers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.pgcase.xobot.dbproc.jdbc.DbprocJdbc;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerExtractor;

public class JdbcTriggerExtractor implements XTriggerExtractor {

	private static final String SCAN_DBPROC_TRIG_SQL_FILE = "/sql/dbproc_jdbc_triggers.sql"; //$NON-NLS-1$

	private String sqlSentence = null;

	@Override
	public Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context,
			XIssueReporter reporter) {
		if (input instanceof Connection) {
			try {
				Connection jdbcConnection = (Connection) input;
				List<XTriggerDescriptor> triggers = new ArrayList<XTriggerDescriptor>();
				String schema = DbprocJdbc.extractSchema(context);
				if (sqlSentence == null) {
					sqlSentence = DbprocJdbc.getBundleSql(SCAN_DBPROC_TRIG_SQL_FILE);
				}
				try (PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sqlSentence)) {
					preparedStatement.setString(1, schema);
					try (ResultSet resultSet = preparedStatement.executeQuery()) {
						while (resultSet.next()) {
							XTriggerDescriptor parsed = JdbcTriggerParser.parse(jdbcConnection, resultSet, reporter);
							triggers.add(parsed);
						}
					}
				}
				return triggers;
			} catch (Exception e) {
				String message = String.format(JDBCTriggersMessages.getString("JdbcTriggerExtractor.message_processing_input_failure"), context); //$NON-NLS-1$
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}

}
