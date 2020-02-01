/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
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
package org.pgcase.xobot.dbproc.jdbc.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.dbproc.jdbc.DbprocJdbc;
import org.pgcase.xobot.dbproc.jdbc.triggers.JdbcTriggerExtractor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;

class SimpleJdbcTriggerTest {

	private static final String CREATE_TEST_TRIGGER = "sql/create_test_trigger1.sql"; //$NON-NLS-1$
	
	@Test
	void testTrigger() throws IOException, SQLException {
		try (SystemJdbcConnection conn = new SystemJdbcConnection()) {
			Map<String, Object> context = new HashMap<String, Object>();
			context.put(DbprocJdbc.CONTEXT_SCHEMA_KEY, (Object)conn.getSchema());
			try (Statement statement = conn.getConnection().createStatement()) {
				statement.execute(DbprocJdbc.getSqlFmt1(CREATE_TEST_TRIGGER,conn.getSchema()));
				if (!conn.getConnection().getAutoCommit()) {
					conn.getConnection().commit();
				}
			}
			
			JdbcTriggerExtractor extractor = new JdbcTriggerExtractor();
			Iterable<XTriggerDescriptor> pg_triggers 
				= extractor.extractTriggers(conn.getConnection(), context, new SystemJdbcTestIssueReporter());

			assertEquals(1, ((Collection<?>)pg_triggers).size(), "Incorrect count of function name parsed from JDBC");
			pg_triggers.forEach(trigger -> assertEquals("xobot_test_before_insert_trigger", trigger.getName(), "Incorrect parsed function name"));
		}
		return;
	}

}
