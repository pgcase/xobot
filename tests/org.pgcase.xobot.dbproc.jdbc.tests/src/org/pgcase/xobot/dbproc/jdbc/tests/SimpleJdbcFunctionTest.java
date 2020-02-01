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
import org.pgcase.xobot.dbproc.jdbc.functions.JdbcFunctionExtractor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

class SimpleJdbcFunctionTest {
	
	private static final String CREATE_TEST_FUNC = "sql/create_test_function1.sql"; //$NON-NLS-1$

	@Test
	void testFunction() throws IOException, SQLException {
		try (SystemJdbcConnection conn = new SystemJdbcConnection()) {
			Map<String, Object> context = new HashMap<String, Object>();
			context.put(DbprocJdbc.CONTEXT_SCHEMA_KEY, (Object)conn.getSchema());
			try (Statement statement = conn.getConnection().createStatement()) {
				statement.execute(DbprocJdbc.getSqlFmt1(CREATE_TEST_FUNC,conn.getSchema()));
				if (!conn.getConnection().getAutoCommit()) {
					conn.getConnection().commit();
				}
			}
			
			JdbcFunctionExtractor extractor = new JdbcFunctionExtractor();
			Iterable<XFunctionDescriptor> pg_functions 
				= extractor.extractFunctions(conn.getConnection(), context, new SystemJdbcTestIssueReporter());

			assertEquals(1, ((Collection<?>)pg_functions).size(), "Incorrect count of function name parsed from JDBC");
			pg_functions.forEach(function -> assertEquals("xb_pr_test1", function.getName(), "Incorrect parsed function name"));
		}
		
	}
}
