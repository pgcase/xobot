package org.pgcase.xobot.dbproc.runtime;

import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;

public interface XNameEncoder {
	
	String encodeFunctionName(XFunctionDescriptor function);

	String encodeTriggerName(XTriggerDescriptor trigger);

}
