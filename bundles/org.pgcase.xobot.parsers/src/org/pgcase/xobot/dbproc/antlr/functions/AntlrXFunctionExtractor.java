package org.pgcase.xobot.dbproc.antlr.functions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionExtractor;

public class AntlrXFunctionExtractor implements XFunctionExtractor {

	@Override
	public Iterable<XFunctionDescriptor> extractFunctions(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof InputStream) {
			InputStream inputStream = (InputStream) input;
			try {
				XFunctionDescriptor parsed = PgFunctionParseHeader.parse(inputStream, reporter);
				return Collections.singletonList(parsed);
			} catch (IOException e) {
				String message = String.format("Failed to process input with context %s", context);
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}

}
