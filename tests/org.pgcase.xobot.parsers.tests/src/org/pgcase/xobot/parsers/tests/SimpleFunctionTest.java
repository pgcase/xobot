package org.pgcase.xobot.parsers.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.dbproc.antlr.functions.PgFunctionParseHeader;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

class SimpleFunctionTest {
	
	private static final String SIMPLE_IN_OUT_DEF_FUNC = "sql/simple_empty_function_with_IN_OUT_DEF_arguments.sql"; //$NON-NLS-1$

	@Test
	void testCount() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
		XFunctionDescriptor pg_function_header = PgFunctionParseHeader.parse(in, new SystemIssueReporter());
		assertEquals(4, pg_function_header.getArgumentsCount(), "Incorrect number of argument");
		//System.out.println(pg_function_header);
	}
	
	@Test
	void testClasses() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
		XFunctionDescriptor pg_function_header = PgFunctionParseHeader.parse(in, new SystemIssueReporter());
		assertEquals("IN",pg_function_header.getArgument(0).getArgumentClass(),"Incorrect class of argument 1");
		assertEquals("IN",pg_function_header.getArgument(1).getArgumentClass(),"Incorrect class of argument 2");
		assertEquals("IN",pg_function_header.getArgument(2).getArgumentClass(),"Incorrect class of argument 3");
		assertEquals("OUT",pg_function_header.getArgument(3).getArgumentClass(),"Incorrect class of argument 4");
		//System.out.println(pg_function_header);
	}

	@Test
	void testTypes() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
		XFunctionDescriptor pg_function_header = PgFunctionParseHeader.parse(in, new SystemIssueReporter());
		assertEquals("integer",pg_function_header.getArgument(0).getArgumentType().toLowerCase(),"Incorrect type of argument 1");
		assertEquals("integer",pg_function_header.getArgument(1).getArgumentType().toLowerCase(),"Incorrect type of argument 2");
		assertEquals("integer",pg_function_header.getArgument(2).getArgumentType().toLowerCase(),"Incorrect type of argument 3");
		assertEquals("integer",pg_function_header.getArgument(3).getArgumentType().toLowerCase(),"Incorrect type of argument 4");
		System.out.println(pg_function_header);
	}
	
	@Test
	void testDefaults() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
		XFunctionDescriptor pg_function_header = PgFunctionParseHeader.parse(in, new SystemIssueReporter());
		assertNull(pg_function_header.getArgument(0).getDefaultValue(),"Incorrect default value of argument 1");
		assertEquals("100500",pg_function_header.getArgument(1).getDefaultValue(),"Incorrect default value of argument 2");
		assertEquals("-1000",pg_function_header.getArgument(2).getDefaultValue(),"Incorrect default value of argument 3");
		assertNull(pg_function_header.getArgument(3).getDefaultValue(),"Incorrect default value of argument 4");
		//System.out.println(pg_function_header);
	}

}
