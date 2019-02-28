package org.pgcase.xobot.workspace.team.core;

import org.eclipse.osgi.util.NLS;

public class WorkspaceTeamCoreMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.workspace.team.core.WorkspaceTeamCoreMessages"; //$NON-NLS-1$
	public static String XobotMergeContext_message_cannot_merge;
	public static String XobotRepositoryProvider_message_location_must_be_a_folder;
	public static String XobotResourceVariant_message_failed_to_fetch_contents;
	public static String XobotResourceVariant_message_failed_to_obtain_canonical_path;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, WorkspaceTeamCoreMessages.class);
	}

	private WorkspaceTeamCoreMessages() {
	}
}
