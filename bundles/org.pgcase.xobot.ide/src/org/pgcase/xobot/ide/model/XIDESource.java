package org.pgcase.xobot.ide.model;

import java.math.BigInteger;

public interface XIDESource {
	
	String getName();
	
	Iterable<XIDEItem> items(boolean loadBody);
	
	BigInteger update(XIDEItem item);
	
}
