package org.pgcase.xobot.dbproc.jdbc.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.dbproc.jdbc.functions.JdbcFunctionExtractor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

class SimpleJdbcFunctionTest {
	
	private static final String CREATE_TEST_FUNC = "sql/create_test_function1.sql"; //$NON-NLS-1$
	private static SimpleTestJdbcConnection conn; 
	
	@Test
	void testFunction() throws IOException, SQLException {
		conn = new SimpleTestJdbcConnection();
		Statement statement = conn.getConnection().createStatement();
		statement.execute(conn.getSql(CREATE_TEST_FUNC));
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("schema", (Object)conn.getSchema());
		
		JdbcFunctionExtractor extractor = new JdbcFunctionExtractor();
		Iterable<XFunctionDescriptor> pg_functions 
			= extractor.extractFunctions(conn.getConnection(), context, new SystemIssueReporter());
		
		pg_functions.forEach(function -> assertEquals("xb_pr_test1", function.getName(), "Incorrect parsed function name"));
	}
	
}
