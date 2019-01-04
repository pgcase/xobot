package org.pgcase.xobot.runtime;

import java.math.BigInteger;

public interface XIDESource extends XIDESourceStream{
	
	String getName();
	
	BigInteger update(XIDEItem item);
	
}
