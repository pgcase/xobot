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
package org.pgcase.xobot.workspace.core.resources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.pgcase.xobot.workspace.internal.core.resources.WorkspaceCoreResourcesActivator;
import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.api.XProjectFolder;
import org.pgcase.xobot.workspace.model.meta.XWorkspaceFactory;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class WorkspaceCoreResources {

	public static final String ID = "org.pgcase.xobot.workspace.core.resources"; //$NON-NLS-1$

	public static final String BUILDER_ID = ID + '.' + "builder"; //$NON-NLS-1$
	public static final String MARKER_PROBLEM_ID = ID + '.' + "problem"; //$NON-NLS-1$
	public static final String MODEL_PROVIDER_ID = ID + '.' + "model"; //$NON-NLS-1$
	public static final String NATURE_ID = ID + '.' + "nature"; //$NON-NLS-1$

	public static final String FUNCTION_FOLDER_NAME = "functions"; //$NON-NLS-1$
	public static final String TRIGGER_FOLDER_NAME = "triggers"; //$NON-NLS-1$

	// FIXME: Temporary, just to not loose the functionality of logic model
	public static final String FUNCTION_DEFINITION_BODY_EXTENSION = "fdp"; //$NON-NLS-1$
	public static final String FUNCTION_DEFINITION_INDEX_EXTENSION = "fdi"; //$NON-NLS-1$

	public static void removeMarkersFor(IResource resource) throws CoreException {
		if (resource != null && resource.exists()) {
			resource.deleteMarkers(MARKER_PROBLEM_ID, false, IResource.DEPTH_INFINITE);
		}
	}

	public static XWorkspaceElementService geWorkspaceElementService() {
		return WorkspaceCoreResourcesActivator.getActivator().getWorkspaceElementService();
	}

	public static boolean isXobotProject(IProject project) {
		if (!project.isAccessible()) {
			return false;
		}
		try {
			IProjectDescription description = project.getDescription();
			return description.hasNature(WorkspaceCoreResources.NATURE_ID);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static void addXobotNature(IProject project, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natureIds = description.getNatureIds();
		List<String> result = new ArrayList<>();
		for (int i = 0; i < natureIds.length; i++) {
			result.add(natureIds[i]);
		}
		result.add(WorkspaceCoreResources.NATURE_ID);
		description.setNatureIds((String[]) result.toArray(new String[result.size()]));
		project.setDescription(description, monitor);
	}

	public static boolean isBodyFile(IResource resource) {
		return resource instanceof IFile
				&& WorkspaceCoreResources.FUNCTION_DEFINITION_BODY_EXTENSION.equals(resource.getFileExtension());
	}

	public static boolean isIndexFile(IResource resource) {
		if (resource instanceof IFile) {
			String fileExtension = resource.getFileExtension();
			if (fileExtension != null) {
				return fileExtension.equals(FUNCTION_DEFINITION_INDEX_EXTENSION);
			}
		}
		return false;
	}

	public static XProjectDescriptor restoreProject(IProject project) {
		// FIXME: throws CoreException
		String name = project.getName();
		XProject created = XWorkspaceFactory.eINSTANCE.createProject();
		created.setIdentifier(name);
		created.setName(name);
		restoreProjectFolder(project, created, FUNCTION_FOLDER_NAME);
		restoreProjectFolder(project, created, TRIGGER_FOLDER_NAME);
		return created;
	}

	protected static void restoreProjectFolder(IProject project, XProject created, String folderName) {
		IFolder folder = project.getFolder(folderName);
		if (folder.exists()) {
			XProjectFolder projectFolder = XWorkspaceFactory.eINSTANCE.createProjectFolder();
			projectFolder.setIdentifier(folderName);
			projectFolder.setName(folderName);
			projectFolder.setPath(folder.getProjectRelativePath().toString());
			created.getProjectFolders().add(projectFolder);
		}
	}

	public static void createXobotProject(IProject project, final IProjectDescription description,
			IProgressMonitor monitor) throws CoreException {
		description.setNatureIds(new String[] { NATURE_ID });
		addBuilder(description);
		project.create(description, monitor);
		project.open(monitor);
		project.getFolder(FUNCTION_FOLDER_NAME).create(true, true, monitor);
		project.getFolder(TRIGGER_FOLDER_NAME).create(true, true, monitor);
	}

	public static void addBuilder(IProjectDescription description) {
		ICommand[] buildSpec = description.getBuildSpec();
		for (int i = 0; i < buildSpec.length; i++) {
			ICommand command = buildSpec[i];
			String builderName = command.getBuilderName();
			if (BUILDER_ID.equals(builderName)) {
				return;
			}
		}
		ICommand newCommand = description.newCommand();
		newCommand.setBuilderName(BUILDER_ID);
		ICommand[] newCommands = new ICommand[buildSpec.length + 1];
		System.arraycopy(buildSpec, 0, newCommands, 1, buildSpec.length);
		newCommands[0] = newCommand;
		description.setBuildSpec(newCommands);
	}

}
