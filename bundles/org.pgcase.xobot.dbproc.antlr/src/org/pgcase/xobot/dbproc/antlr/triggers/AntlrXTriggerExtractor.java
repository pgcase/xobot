package org.pgcase.xobot.dbproc.antlr.triggers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerExtractor;

public class AntlrXTriggerExtractor implements XTriggerExtractor {

	@Override
	public Iterable<XTriggerDescriptor> extractTriggers(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof InputStream) {
			InputStream inputStream = (InputStream) input;
			try {
				XTriggerDescriptor parsed = PgTriggerParseHeader.parse(inputStream, reporter);
				return Collections.singletonList(parsed);
			} catch (IOException e) {
				String message = String.format("Failed to process input with context %s", context);
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}

}
