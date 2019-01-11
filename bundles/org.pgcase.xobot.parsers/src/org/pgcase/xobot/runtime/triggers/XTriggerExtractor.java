package org.pgcase.xobot.runtime.triggers;

import java.util.Map;

import org.pgcase.xobot.runtime.XIssueReporter;

public interface XTriggerExtractor {
	
	Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, XIssueReporter reporter);

}
