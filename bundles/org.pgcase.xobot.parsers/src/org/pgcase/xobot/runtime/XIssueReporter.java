package org.pgcase.xobot.runtime;

public interface XIssueReporter {
	
	void reportIssue(Object source, Object data, String message, Throwable error);

}
