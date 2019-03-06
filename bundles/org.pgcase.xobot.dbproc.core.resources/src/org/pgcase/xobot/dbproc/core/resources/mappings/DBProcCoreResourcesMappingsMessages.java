package org.pgcase.xobot.dbproc.core.resources.mappings;

import org.eclipse.osgi.util.NLS;

public class DBProcCoreResourcesMappingsMessages extends NLS {
	private static final String BUNDLE_NAME = "org.pgcase.xobot.dbproc.core.resources.mappings.DBProcCoreResourcesMappingsMessages"; //$NON-NLS-1$
	public static String DbprocModelProvider_message_warning_body_copying;
	public static String DbprocModelProvider_message_warning_body_deleting;
	public static String DbprocModelProvider_message_warning_index_deleting;
	public static String DbprocModelProvider_message_warning_potential_side_effects;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, DBProcCoreResourcesMappingsMessages.class);
	}

	private DBProcCoreResourcesMappingsMessages() {
	}
}
