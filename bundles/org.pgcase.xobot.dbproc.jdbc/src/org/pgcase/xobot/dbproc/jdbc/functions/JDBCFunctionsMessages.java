package org.pgcase.xobot.dbproc.jdbc.functions;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class JDBCFunctionsMessages {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.dbproc.jdbc.functions.JDBCFunctionsMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private JDBCFunctionsMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
