package org.pgcase.xobot.dbproc.team.core;

import org.eclipse.osgi.util.NLS;

public class DBProcTeamCoreMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.dbproc.team.core.DBProcTeamCoreMessages"; //$NON-NLS-1$
	public static String DbprocModelMerger_error_objects_merge;
	public static String DbprocModelMerger_task_merging_xobot_elements_text;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, DBProcTeamCoreMessages.class);
	}

	private DBProcTeamCoreMessages() {
	}
}
