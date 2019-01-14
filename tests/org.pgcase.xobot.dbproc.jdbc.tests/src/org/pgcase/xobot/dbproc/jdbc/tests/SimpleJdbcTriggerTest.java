package org.pgcase.xobot.dbproc.jdbc.tests;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class SimpleJdbcTriggerTest {

	private static final String CREATE_TEST_TRIGGER = "sql/create_test_trigger1.sql"; //$NON-NLS-1$
	
	@Test
	void testTrigger() throws IOException {
		/*
		FileInputStream in = new FileInputStream(SIMPLE_TRIGGER);
		XTriggerDescriptor pg_trigger_header = PgTriggerParseHeader.parse(in, new SystemIssueReporter());
		assertEquals("perform_d",pg_trigger_header.getName(),"Incorrect trigger name");
		assertEquals("tbl2",pg_trigger_header.getObject(),"Incorrect trigger table");
		assertEquals("after",pg_trigger_header.getAction(),"Incorrect trigger action");
        //System.out.println(pg_trigger_header);
         */
		return;
	}

}
