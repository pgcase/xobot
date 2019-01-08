package org.pgcase.xobot.parsers.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.parsers.postgres.function.PGFunctionParseHeader;
import org.pgcase.xobot.parsers.postgres.function.RawFunction;

class SimpleFunctionTest {
	
	private static final String SIMPLE_IN_OUT_DEF_FUNC = "sql/simple_empty_function_with_IN_OUT_DEF_arguments.sql"; //$NON-NLS-1$

	@Test
	void testCount() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
		List<String> errors = new ArrayList<>();
		RawFunction pg_function_header = PGFunctionParseHeader.parse(in, errors);
		assertEquals(4, pg_function_header.getArgs().size(), "Incorrect number of argument");
		System.out.println(pg_function_header);
	}
	
}
