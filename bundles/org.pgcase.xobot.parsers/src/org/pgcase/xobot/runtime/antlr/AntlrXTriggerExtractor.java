package org.pgcase.xobot.runtime.antlr;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.runtime.XIssueReporter;
import org.pgcase.xobot.runtime.XTriggerDescriptor;
import org.pgcase.xobot.runtime.XTriggerExtractor;

public class AntlrXTriggerExtractor implements XTriggerExtractor {

	@Override
	public Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof InputStream) {
			InputStream inputStream = (InputStream) input;
			
		}
		return Collections.emptyList();
	}

}
