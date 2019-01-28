package org.pgcase.xobot.workspace.internal.core.resources;

import org.eclipse.osgi.util.NLS;

public class WorkspaceCoreResourcesMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.workspace.internal.core.resources.WorkspaceCoreResourcesMessages"; //$NON-NLS-1$
	public static String XobotProjectBuilder_location_sources_targets;
	public static String XobotProjectBuilder_message_no_integration;
	public static String XobotProjectBuilder_message_no_official;
	public static String XobotProjectBuilder_message_no_sandbox;
	public static String XobotProjectBuilder_message_no_stable;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, WorkspaceCoreResourcesMessages.class);
	}

	private WorkspaceCoreResourcesMessages() {
	}
}
