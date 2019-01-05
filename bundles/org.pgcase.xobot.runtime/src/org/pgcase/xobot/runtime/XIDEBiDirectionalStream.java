package org.pgcase.xobot.runtime;

import java.math.BigInteger;

public interface XIDEBiDirectionalStream extends XIDESourceStream,XIDETargetStream{
	String getName();
	
	BigInteger update(XIDEItem item);
}
