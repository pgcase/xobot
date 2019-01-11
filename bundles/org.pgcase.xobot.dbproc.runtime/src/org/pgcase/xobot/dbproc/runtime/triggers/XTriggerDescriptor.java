package org.pgcase.xobot.dbproc.runtime.triggers;

import org.pgcase.xobot.dbproc.runtime.XNamedDescriptor;

public interface XTriggerDescriptor extends XNamedDescriptor {

	String getObject();

	String getAction();

	String getEvents();

}
