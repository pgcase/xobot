/*******************************************************************************
 * Copyright (c) 2019-2020 ArSysOp
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
package org.pgcase.xobot.workspace.team.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.internal.ui.actions.TeamAction;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;

public abstract class XobotTeamAction extends TeamAction {

	public boolean isEnabled() {
		return getSelectedMappings().length > 0;
	}

	protected Map<RepositoryProvider, List<IResource>> getRepositoryProviderMapping() {
		Map<RepositoryProvider, List<IResource>> result = new HashMap<>();
		IResource[] resources = getSelectedResources();
		for (int i = 0; i < resources.length; i++) {
			RepositoryProvider provider = RepositoryProvider.getProvider(resources[i].getProject());
			List<IResource> list = result.get(provider);
			if (list == null) {
				list = new ArrayList<>();
				result.put(provider, list);
			}
			list.add(resources[i]);
		}
		return result;
	}
	
	protected ResourceMapping[] getSelectedMappings() {
		return getSelectedResourceMappings(XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
	}
	
}
