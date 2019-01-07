package org.pgcase.xobot.parsers.postgres.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.parsers.postgres.function.PGFunctionParseHeader;
import org.pgcase.xobot.parsers.postgres.function.RawFunction;

class simple_empty_function_in_out_def {
	
	private static final String SIMPLE_IN_OUT_DEF_FUNC = "sql/simple_empty_function_with_IN_OUT_DEF_arguments.sql";

	@Test
	void testCount() {
		try {
			FileInputStream in = new FileInputStream(SIMPLE_IN_OUT_DEF_FUNC);
			List<String> errors = new ArrayList<>();
			RawFunction pg_function_header = PGFunctionParseHeader.parse(in, errors);
			if (pg_function_header.getArgs().size() != 4) fail("Incorrect number of argument");
			System.out.println(pg_function_header);
		} catch (IOException e) {
			fail(e);
		}
		
	}
	
}
