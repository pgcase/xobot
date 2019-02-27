package org.pgcase.xobot.landscape.ui;

import org.eclipse.osgi.util.NLS;

public class LandscapeUiMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.landscape.ui.LandscapeUiMessages"; //$NON-NLS-1$
	public static String LandscapeUi_button_select_text;
	public static String LandscapeUi_dialog_select_source_title;
	public static String LandscapeUi_dialog_select_target_title;
	public static String LandscapeUi_source_selection_message_default;
	public static String LandscapeUi_source_selection_message_experimental;
	public static String LandscapeUi_source_selection_message_integration;
	public static String LandscapeUi_source_selection_message_official;
	public static String LandscapeUi_source_selection_message_stable;
	public static String LandscapeUi_target_selection_message_default;
	public static String LandscapeUi_target_selection_message_experimental;
	public static String LandscapeUi_target_selection_message_integration;
	public static String LandscapeUi_target_selection_message_official;
	public static String LandscapeUi_target_selection_message_stable;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, LandscapeUiMessages.class);
	}

	private LandscapeUiMessages() {
	}
}
