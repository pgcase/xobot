package org.pgcase.xobot.runtime;

import java.util.Map;

public interface XTriggerExtractor {
	
	Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, Object reporter);

}
