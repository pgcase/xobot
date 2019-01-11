package org.pgcase.xobot.dbproc.runtime;

public interface XIssueReporter {
	
	void reportIssue(Object source, Object data, String message, Throwable error);

}
