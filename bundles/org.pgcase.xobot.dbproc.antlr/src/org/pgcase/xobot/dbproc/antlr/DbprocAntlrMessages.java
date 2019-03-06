package org.pgcase.xobot.dbproc.antlr;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DbprocAntlrMessages {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.dbproc.antlr.DbprocAntlrMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private DbprocAntlrMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
