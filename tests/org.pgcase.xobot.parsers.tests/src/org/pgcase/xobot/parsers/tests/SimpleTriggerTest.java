package org.pgcase.xobot.parsers.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.runtime.XTriggerDescriptor;
import org.pgcase.xobot.runtime.antlr.PGTriggerParseHeader;

class SimpleTriggerTest {

	private static final String SIMPLE_TRIGGER = "sql/simple_trigger.sql"; //$NON-NLS-1$

	
	@Test
	void testTrigger() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_TRIGGER);
		List<String> errors = new ArrayList<>();
		XTriggerDescriptor pg_trigger_header = PGTriggerParseHeader.parse(in, errors);
		assertEquals("perform_d",pg_trigger_header.getName(),"Incorrect trigger name");
		assertEquals("tbl2",pg_trigger_header.getObject(),"Incorrect trigger table");
		assertEquals("after",pg_trigger_header.getAction(),"Incorrect trigger action");
        //System.out.println(pg_trigger_header);
	}

}
