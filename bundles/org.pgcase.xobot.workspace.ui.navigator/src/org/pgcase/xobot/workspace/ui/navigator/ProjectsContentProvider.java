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
package org.pgcase.xobot.workspace.ui.navigator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IProject;
import org.pgcase.xobot.basis.runtime.BasisEvents;
import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceEvents;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class ProjectsContentProvider extends RegistryContentProvider<XProjectRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XProjectDescriptor) {
			XProjectDescriptor set = (XProjectDescriptor) parentElement;
			List<Object> list = new ArrayList<>();
			//FIXME: add special node "Sources"
			set.getProjectSources().forEach(list::add);
			//FIXME: add special node "Targets"
			set.getProjectTargets().forEach(list::add);
			set.getProjectFolders().forEach(list::add);
			return list.toArray();
		}
		if (parentElement instanceof XProjectRegistry) {
			XProjectRegistry registry = (XProjectRegistry) parentElement;
			return StreamSupport.stream(registry.getProjects().spliterator(), false).toArray();
		}
		if (parentElement instanceof IProject) {
			IProject registry = (IProject) parentElement;
			XWorkspaceElementService workspaceElementService = WorkspaceCoreResources.getWorkspaceElementService();
			return getChildren(workspaceElementService.getProject(registry.getName()));
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor source = (XProjectSourceDescriptor) element;
			return source.getProject();
		}
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor target = (XProjectTargetDescriptor) element;
			return target.getProject();
		}
		if (element instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) element;
			return folder.getProject();
		}
		if (element instanceof XProjectDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XProjectRegistry> getRegistryClass() {
		return XProjectRegistry.class;
	}

	@Override
	protected String getTopic() {
		return XWorkspaceEvents.WORKSPACE_TOPIC_BASE + BasisEvents.TOPIC_SEP + BasisEvents.ALL_SUB_TOPICS;
	}
	
}
