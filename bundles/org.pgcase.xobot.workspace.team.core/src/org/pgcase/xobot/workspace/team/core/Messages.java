package org.pgcase.xobot.workspace.team.core;

import org.eclipse.osgi.util.NLS;
 

public class Messages extends NLS{

	public static final String BUNDLE_NAME = "org.pgcase.xobot.workspace.team.core.messages";

	public static String XobotSystemSubscriber_Name;
	public static String XobotResourceVariant_GetFilePath_Error;
	public static String XobotRepositoryProvider_TargetLocation_Error;
	public static String XobotModelMerger_Merge_Text;
	public static String XobotModelMerger_MergeModelElements_Error;
	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
