package org.pgcase.xobot.landscape.ui.wizards;

import org.eclipse.osgi.util.NLS;

public class LandscapeConfigurationPageMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.landscape.ui.wizards.LandscapeConfigurationPageMessages"; //$NON-NLS-1$
	public static String LandscapeConfigurationPage_error_no_experimental_target;
	public static String LandscapeConfigurationPage_error_no_integration_target;
	public static String LandscapeConfigurationPage_error_no_source_code;
	public static String LandscapeConfigurationPage_label_experimental_target_config;
	public static String LandscapeConfigurationPage_label_git_repo_path;
	public static String LandscapeConfigurationPage_label_integration_target_config;
	public static String LandscapeConfigurationPage_label_official_target_config;
	public static String LandscapeConfigurationPage_label_stable_target_config;
	public static String LandscapeConfigurationPage_group_experimental_target;
	public static String LandscapeConfigurationPage_group_integration_target;
	public static String LandscapeConfigurationPage_group_official_target;
	public static String LandscapeConfigurationPage_group_source_code;
	public static String LandscapeConfigurationPage_group_stable_target;
	public static String LandscapeConfigurationPage_warning_no_official_target;
	public static String LandscapeConfigurationPage_warning_no_stable_target;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, LandscapeConfigurationPageMessages.class);
	}

	private LandscapeConfigurationPageMessages() {
	}
}
