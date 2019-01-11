package org.pgcase.xobot.runtime.triggers;

import org.pgcase.xobot.runtime.XNamedDescriptor;

public interface XTriggerDescriptor extends XNamedDescriptor {

	String getObject();

	String getAction();

	String getEvents();

}
