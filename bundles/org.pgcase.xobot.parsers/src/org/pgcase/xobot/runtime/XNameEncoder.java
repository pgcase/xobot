package org.pgcase.xobot.runtime;

import org.pgcase.xobot.runtime.triggers.XTriggerDescriptor;

public interface XNameEncoder {
	
	String encodeFunctionName(XFunctionDescriptor function);

	String encodeTriggerName(XTriggerDescriptor trigger);

}
