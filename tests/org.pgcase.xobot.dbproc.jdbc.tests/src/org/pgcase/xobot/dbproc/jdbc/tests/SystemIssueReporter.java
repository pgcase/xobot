package org.pgcase.xobot.dbproc.jdbc.tests;

import org.pgcase.xobot.dbproc.runtime.XIssueReporter;

public class SystemIssueReporter implements XIssueReporter {

	@Override
	public void reportIssue(Object source, Object data, String message, Throwable error) {
		System.err.println(message);
	}

}
