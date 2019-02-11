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
package org.pgcase.xobot.dbproc.team.ui.navigator;

import org.eclipse.team.ui.mapping.SynchronizationActionProvider;
import org.eclipse.team.ui.synchronize.ISynchronizePageConfiguration;

public class XobotSyncActionProvider extends SynchronizationActionProvider {
	
	public XobotSyncActionProvider() {
		super();
	}

	protected void initialize() {
		super.initialize();
		final ISynchronizePageConfiguration configuration= getSynchronizePageConfiguration();
		registerHandler(MERGE_ACTION_ID, new XobotMergeActionHandler(configuration, false));
		registerHandler(OVERWRITE_ACTION_ID, new XobotMergeActionHandler(configuration, true));
	}
}
