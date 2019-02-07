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
package org.pgcase.xobot.landscape.runtime;

import org.pgcase.xobot.basis.runtime.BasisEvents;

public class XLandscapeEvents extends BasisEvents {

	/**
	 * Base name of all Workspace events
	 */
	public static final String LANDSCAPE_TOPIC_BASE = "org/pgcase/xobot/landscape/runtime"; //$NON-NLS-1$
	
	/**
	 * Base name of all <link>XSourceSetDescriptor</link> events
	 */
	public static final String SOURCE_SET_TOPIC_BASE = LANDSCAPE_TOPIC_BASE + TOPIC_SEP + "XSourceSetDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XSourceSetDescriptor</link> <code>create</code> event
	 */
	public static final String SOURCE_SET_CREATE = SOURCE_SET_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XSourceSetDescriptor</link> <code>read</code> event
	 */
	public static final String SOURCE_SET_READ = SOURCE_SET_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XSourceSetDescriptor</link> <code>update</code> event
	 */
	public static final String SOURCE_SET_UPDATE = SOURCE_SET_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XSourceSetDescriptor</link> <code>delete</code> event
	 */
	public static final String SOURCE_SET_DELETE = SOURCE_SET_TOPIC_BASE + TOPIC_SEP + DELETE;
	
	/**
	 * Base name of all <link>XSourceDescriptor</link> events
	 */
	public static final String SOURCE_TOPIC_BASE = LANDSCAPE_TOPIC_BASE + TOPIC_SEP + "XSourceDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XSourceDescriptor</link> <code>create</code> event
	 */
	public static final String SOURCE_CREATE = SOURCE_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XSourceDescriptor</link> <code>read</code> event
	 */
	public static final String SOURCE_READ = SOURCE_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XSourceDescriptor</link> <code>update</code> event
	 */
	public static final String SOURCE_UPDATE = SOURCE_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XSourceDescriptor</link> <code>delete</code> event
	 */
	public static final String SOURCE_DELETE = SOURCE_TOPIC_BASE + TOPIC_SEP + DELETE;

	/**
	 * Base name of all <link>XTargetSetDescriptor</link> events
	 */
	public static final String TARGET_SET_TOPIC_BASE = LANDSCAPE_TOPIC_BASE + TOPIC_SEP + "XTargetSetDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XTargetSetDescriptor</link> <code>create</code> event
	 */
	public static final String TARGET_SET_CREATE = TARGET_SET_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XTargetSetDescriptor</link> <code>read</code> event
	 */
	public static final String TARGET_SET_READ = TARGET_SET_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XTargetSetDescriptor</link> <code>update</code> event
	 */
	public static final String TARGET_SET_UPDATE = TARGET_SET_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XTargetSetDescriptor</link> <code>delete</code> event
	 */
	public static final String TARGET_SET_DELETE = TARGET_SET_TOPIC_BASE + TOPIC_SEP + DELETE;
	
	/**
	 * Base name of all <link>XTargetDescriptor</link> events
	 */
	public static final String TARGET_TOPIC_BASE = LANDSCAPE_TOPIC_BASE + TOPIC_SEP + "XTargetDescriptor"; //$NON-NLS-1$

	/**
	 * <link>XTargetDescriptor</link> <code>create</code> event
	 */
	public static final String TARGET_CREATE = TARGET_TOPIC_BASE + TOPIC_SEP + CREATE;
	
	/**
	 * <link>XTargetDescriptor</link> <code>read</code> event
	 */
	public static final String TARGET_READ = TARGET_TOPIC_BASE + TOPIC_SEP + READ;
	
	/**
	 * <link>XTargetDescriptor</link> <code>update</code> event
	 */
	public static final String TARGET_UPDATE = TARGET_TOPIC_BASE + TOPIC_SEP + UPDATE;
	
	/**
	 * <link>XTargetDescriptor</link> <code>delete</code> event
	 */
	public static final String TARGET_DELETE = SOURCE_TOPIC_BASE + TOPIC_SEP + DELETE;

}
