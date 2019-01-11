package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.Map;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;

public interface XFunctionExtractor {
	
	Iterable<XFunctionDescriptor> extractFunctions(Object input, Map<String, Object> context, XIssueReporter reporter);

}
