package org.pgcase.xobot.ide.internal;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class XobotIdeInternalMessages {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.ide.internal.XobotIdeInternalMessages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private XobotIdeInternalMessages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
