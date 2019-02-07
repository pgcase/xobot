/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.workspace.runtime;

import org.pgcase.xobot.basis.runtime.BasisEvents;

public class XWorkspaceEvents extends BasisEvents {

	/**
	 * Base name of all Workspace events
	 */
	public static final String WORKSPACE_TOPIC_BASE = "org/pgcase/xobot/workspace/runtime"; //$NON-NLS-1$
	
	/**
	 * Base name of all <link>XProjectDescriptor</link> events
	 */
	public static final String PROJECT_TOPIC_BASE = WORKSPACE_TOPIC_BASE + TOPIC_SEP + "XProjectDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XProjectDescriptor</link> <code>create</code> event
	 */
	public static final String PROJECT_CREATE = PROJECT_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XProjectDescriptor</link> <code>read</code> event
	 */
	public static final String PROJECT_READ = PROJECT_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XProjectDescriptor</link> <code>update</code> event
	 */
	public static final String PROJECT_UPDATE = PROJECT_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XProjectDescriptor</link> <code>delete</code> event
	 */
	public static final String PROJECT_DELETE = PROJECT_TOPIC_BASE + TOPIC_SEP + DELETE;
	
	/**
	 * Base name of all <link>XProjectSourceDescriptor</link> events
	 */
	public static final String PROJECT_SOURCE_TOPIC_BASE = WORKSPACE_TOPIC_BASE + TOPIC_SEP + "XProjectSourceDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XProjectSourceDescriptor</link> <code>create</code> event
	 */
	public static final String PROJECT_SOURCE_CREATE = PROJECT_SOURCE_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XProjectSourceDescriptor</link> <code>read</code> event
	 */
	public static final String PROJECT_SOURCE_READ = PROJECT_SOURCE_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XProjectSourceDescriptor</link> <code>update</code> event
	 */
	public static final String PROJECT_SOURCE_UPDATE = PROJECT_SOURCE_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XProjectSourceDescriptor</link> <code>delete</code> event
	 */
	public static final String PROJECT_SOURCE_DELETE = PROJECT_SOURCE_TOPIC_BASE + TOPIC_SEP + DELETE;

	/**
	 * Base name of all <link>XProjectTargetDescriptor</link> events
	 */
	public static final String PROJECT_TARGET_TOPIC_BASE = WORKSPACE_TOPIC_BASE + TOPIC_SEP + "XProjectTargetDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XProjectTargetDescriptor</link> <code>create</code> event
	 */
	public static final String PROJECT_TARGET_CREATE = PROJECT_TARGET_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XProjectTargetDescriptor</link> <code>read</code> event
	 */
	public static final String PROJECT_TARGET_READ = PROJECT_TARGET_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XProjectTargetDescriptor</link> <code>update</code> event
	 */
	public static final String PROJECT_TARGET_UPDATE = PROJECT_TARGET_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XProjectTargetDescriptor</link> <code>delete</code> event
	 */
	public static final String PROJECT_TARGET_DELETE = PROJECT_SOURCE_TOPIC_BASE + TOPIC_SEP + DELETE;

	/**
	 * Base name of all <link>XProjectFolderDescriptor</link> events
	 */
	public static final String PROJECT_FOLDER_TOPIC_BASE = WORKSPACE_TOPIC_BASE + TOPIC_SEP + "XProjectFolderDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XProjectFolderDescriptor</link> <code>create</code> event
	 */
	public static final String PROJECT_FOLDER_CREATE = PROJECT_FOLDER_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XProjectFolderDescriptor</link> <code>read</code> event
	 */
	public static final String PROJECT_FOLDER_READ = PROJECT_FOLDER_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XProjectFolderDescriptor</link> <code>update</code> event
	 */
	public static final String PROJECT_FOLDER_UPDATE = PROJECT_FOLDER_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XProjectFolderDescriptor</link> <code>delete</code> event
	 */
	public static final String PROJECT_FOLDER_DELETE = PROJECT_FOLDER_TOPIC_BASE + TOPIC_SEP + DELETE;
	
}
