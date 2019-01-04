package org.pgcase.xobot.runtime;

import java.util.LinkedList;

public interface XIDEToolchain {

	String getName();
	
	LinkedList<XIDETarget> getItems();
	
}
