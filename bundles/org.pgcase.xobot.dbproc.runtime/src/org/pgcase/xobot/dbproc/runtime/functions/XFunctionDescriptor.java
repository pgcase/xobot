package org.pgcase.xobot.dbproc.runtime.functions;

import org.pgcase.xobot.dbproc.runtime.XArgumentedDescriptor;
import org.pgcase.xobot.dbproc.runtime.XNamedDescriptor;
import org.pgcase.xobot.dbproc.runtime.XOptionedDescriptor;
import org.pgcase.xobot.dbproc.runtime.XReturningDescriptor;

public interface XFunctionDescriptor
		extends XNamedDescriptor, XArgumentedDescriptor, XOptionedDescriptor, XReturningDescriptor {

}
