package org.pgcase.xobot.ide.model;

import java.util.LinkedList;

public interface XIDEToolchain {

	String getName();
	
	LinkedList<XIDETarget> getItems();
	
}
