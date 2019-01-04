package org.pgcase.xobot.runtime;

import java.math.BigInteger;

public interface XIDESource {
	
	String getName();
	
	Iterable<XIDEItem> items(boolean loadBody);
	
	BigInteger update(XIDEItem item);
	
}
