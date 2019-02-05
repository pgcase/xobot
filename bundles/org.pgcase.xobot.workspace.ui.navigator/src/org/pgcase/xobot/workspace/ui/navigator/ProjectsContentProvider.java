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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IProject;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.pgcase.xobot.basis.runtime.BasisEvents;
import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceEvents;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class ProjectsContentProvider extends RegistryContentProvider<XProjectRegistry> {

	private XWorkspaceElementService workspaceService;

	private Map<XProjectDescriptor, ProjectSourcesNode> sourcesIndex = new HashMap<>();
	private Map<XProjectDescriptor, ProjectTargetsNode> targetsIndex = new HashMap<>();

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ProjectSourcesNode) {
			ProjectSourcesNode sources = (ProjectSourcesNode) parentElement;
			XProjectDescriptor project = sources.getProject();
			return StreamSupport.stream(project.getProjectSources().spliterator(), false).toArray();
		}
		if (parentElement instanceof ProjectTargetsNode) {
			ProjectTargetsNode targets = (ProjectTargetsNode) parentElement;
			XProjectDescriptor project = targets.getProject();
			return StreamSupport.stream(project.getProjectTargets().spliterator(), false).toArray();
		}
		if (parentElement instanceof XProjectDescriptor) {
			XProjectDescriptor project = (XProjectDescriptor) parentElement;
			List<Object> list = new ArrayList<>();
			ProjectSourcesNode sources = new ProjectSourcesNode(project);
			sourcesIndex.put(project, sources);
			list.add(sources);
			ProjectTargetsNode targets = new ProjectTargetsNode(project);
			targetsIndex.put(project, targets);
			list.add(targets);
			project.getProjectFolders().forEach(list::add);
			return list.toArray();
		}
		if (parentElement instanceof XProjectRegistry) {
			return StreamSupport.stream(workspaceService.getProjects().spliterator(), false).toArray();
		}
		if (parentElement instanceof IProject) {
			IProject registry = (IProject) parentElement;
			return getChildren(workspaceService.getProject(registry.getName()));
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XProjectSourceDescriptor) {
			XProjectSourceDescriptor source = (XProjectSourceDescriptor) element;
			XProjectDescriptor project = source.getProject();
			return sourcesIndex.get(project);
		}
		if (element instanceof XProjectTargetDescriptor) {
			XProjectTargetDescriptor target = (XProjectTargetDescriptor) element;
			XProjectDescriptor project = target.getProject();
			return targetsIndex.get(project);
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

	@Override
	protected void init(IEclipseContext context) {
		super.init(context);
		workspaceService = context.get(XWorkspaceElementService.class);
	}

}
