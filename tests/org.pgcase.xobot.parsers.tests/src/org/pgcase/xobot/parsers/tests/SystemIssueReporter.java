package org.pgcase.xobot.parsers.tests;

import org.pgcase.xobot.runtime.XIssueReporter;

public class SystemIssueReporter implements XIssueReporter {

	@Override
	public void reportIssue(Object source, Object data, String message, Throwable error) {
		System.err.println(message);
	}

}
