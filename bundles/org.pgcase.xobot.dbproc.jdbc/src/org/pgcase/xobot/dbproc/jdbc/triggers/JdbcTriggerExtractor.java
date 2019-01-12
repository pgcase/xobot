package org.pgcase.xobot.dbproc.jdbc.triggers;

import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerExtractor;

public class JdbcTriggerExtractor implements XTriggerExtractor {

	@Override
	public Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, XIssueReporter reporter) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}
	
}
