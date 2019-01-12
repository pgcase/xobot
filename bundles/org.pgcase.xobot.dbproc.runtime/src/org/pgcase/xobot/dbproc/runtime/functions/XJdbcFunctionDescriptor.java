package org.pgcase.xobot.dbproc.runtime.functions;

public interface XJdbcFunctionDescriptor extends XFunctionDescriptor {
	
	Integer getOid();
	String getSchema();
	String getOwner();
	String getLang();

}
