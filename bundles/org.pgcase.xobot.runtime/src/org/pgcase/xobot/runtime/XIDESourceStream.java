package org.pgcase.xobot.runtime;

public interface XIDESourceStream {
	
	Iterable<XIDEItem> read(boolean loadBody);
	
}
