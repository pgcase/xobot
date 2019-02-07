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
package org.pgcase.xobot.workspace.internal.core.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

@Component
public class WorkspaceElementService implements XWorkspaceElementService {
	
	private IWorkspace workspace = ResourcesPlugin.getWorkspace();
	private XProjectRegistry projectRegistry;

	@Reference
	public void bindProjectRegistry(XProjectRegistry registry) {
		this.projectRegistry = registry;
	}
	
	public void unbindProjectRegistry(XProjectRegistry registry) {
		this.projectRegistry = null;
	}
	
	@Override
	public XProjectRegistry getProjectRegistry() {
		return projectRegistry;
	}

	@Override
	public Iterable<?> getFolderItems(XProjectFolderDescriptor folder) {
		// TODO delegate
		return Collections.emptyList();
	}

	@Override
	public void delete(XWorkspaceElementDescriptor element, IProgressMonitor monitor) throws CoreException {
		if (element instanceof XFunctionDefinitionBody) {
			XFunctionDefinitionBody body = (XFunctionDefinitionBody) element;
			body.getFunctionDefinitionIndex().remove(body);
			body.getResource().delete(false, monitor);
		} else if (element instanceof XFunctionDefinitionIndex) {
			XFunctionDefinitionIndex index = (XFunctionDefinitionIndex) element;
			index.getResource().delete(false, monitor);
			XFunctionDefinitionBody[] files = index.getFunctionBodyFiles();
			for (int i = 0; i < files.length; i++) {
				XFunctionDefinitionBody file = files[i];
				file.getResource().delete(false, null);
			}
		}
	}

	@Override
	public XProjectDescriptor getProject(String name) {
		XProjectDescriptor existing = projectRegistry.getProject(name);
		if (existing != null) {
			return existing;
		}
		IProject project = workspace.getRoot().getProject(name);
		return restoreProject(project);
	}
	
	private XProjectDescriptor restoreProject(IProject project) {
		if (WorkspaceCoreResources.isXobotProject(project)) {
			IFile specification = WorkspaceCoreResources.getXobotProjectSpecification(project);
			if (specification.exists()) {
				IPath fullPath = specification.getFullPath();
				URI uri = URI.createPlatformResourceURI(fullPath.toString(), true);
				projectRegistry.registerResource(uri.toString());
				return projectRegistry.getProject(project.getName());
			}
		}
		return null;
	}

	@Override
	public XWorkspaceElementDescriptor getWorkspaceElement(IPath path) {
		IResource found = workspace.getRoot().findMember(path);
		if (found == null) {
			return null;
		}
		IProject project = found.getProject();
		IPath relativePath = found.getProjectRelativePath();
		int type = found.getType();
		switch (type) {
		case IResource.FILE:
			//FIXME:
			break;
		case IResource.FOLDER:
			return getProjectFolder(project.getName(), relativePath.toString());
		case IResource.PROJECT:
			return getProject(project.getName());
		case IResource.ROOT:
			return WorkspaceRoot.INSTANCE;
		default:
			break;
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XProjectFolderDescriptor getProjectFolder(String name, String path) {
		if (path == null) {
			return null;
		}
		XProjectDescriptor project = getProject(name);
		if (project == null) {
			return null;
		}
		//FIXME: optimize
		Iterable<? extends XProjectFolderDescriptor> projectFolders = project.getProjectFolders();
		for (XProjectFolderDescriptor folderDescriptor : projectFolders) {
			if (path.equals(folderDescriptor.getPath())) {
				return folderDescriptor;
			}
		}
		return null;
	}

	@Override
	public Iterable<? extends XProjectDescriptor> getProjects() {
		List<XProjectDescriptor> xobots = new ArrayList<>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			XProjectDescriptor xobot = getProject(project.getName());
			if (xobot != null) {
				xobots.add(xobot);
			}
		}
		return xobots;
	}
	
}
