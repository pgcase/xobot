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
	private static SystemJdbcConnection conn; 
	
	@Test
	void testFunction() throws IOException, SQLException {
		conn = new SystemJdbcConnection();
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("schema", (Object)conn.getSchema());
		Statement statement = conn.getConnection().createStatement();
		statement.execute(DbprocJdbc.getSqlFmt1(CREATE_TEST_FUNC,conn.getSchema()));
		if (!conn.getConnection().getAutoCommit()) {
			conn.getConnection().commit();
		}
		
		JdbcFunctionExtractor extractor = new JdbcFunctionExtractor();
		Iterable<XFunctionDescriptor> pg_functions 
			= extractor.extractFunctions(conn.getConnection(), context, new SystemJdbcTestIssueReporter());

		conn.close();

		assertEquals(1, ((Collection<?>)pg_functions).size(), "Incorrect count of function name parsed from JDBC");
		
		pg_functions.forEach(function -> assertEquals("xb_pr_test1", function.getName(), "Incorrect parsed function name"));
		
	}
}
