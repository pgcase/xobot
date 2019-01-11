package org.pgcase.xobot.parsers.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.dbproc.antlr.triggers.PgTriggerParseHeader;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;

class SimpleTriggerTest {

	private static final String SIMPLE_TRIGGER = "sql/simple_trigger.sql"; //$NON-NLS-1$

	
	@Test
	void testTrigger() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_TRIGGER);
		XTriggerDescriptor pg_trigger_header = PgTriggerParseHeader.parse(in, new SystemIssueReporter());
		assertEquals("perform_d",pg_trigger_header.getName(),"Incorrect trigger name");
		assertEquals("tbl2",pg_trigger_header.getObject(),"Incorrect trigger table");
		assertEquals("after",pg_trigger_header.getAction(),"Incorrect trigger action");
        //System.out.println(pg_trigger_header);
	}

}
