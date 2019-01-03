package org.pgcase.xobot.ide.model;

public interface XIDEProcedure extends XIDEItem{

	String getHeader();
	
	String getBody();
	
	boolean hasReturnValue();
	
	XIDEType getReturnType();
	
}
