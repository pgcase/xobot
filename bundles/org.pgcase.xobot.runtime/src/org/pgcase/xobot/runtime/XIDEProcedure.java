package org.pgcase.xobot.runtime;

public interface XIDEProcedure extends XIDEItem{

	String getHeader();
	
	String getBody();
	
	boolean hasReturnValue();
	
	XIDEType getReturnType();
	
}
