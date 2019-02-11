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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;
import org.pgcase.xobot.workspace.internal.core.resources.WorkspaceCoreResourcesActivator;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class WorkspaceCoreResources {

	public static final String ID = "org.pgcase.xobot.workspace.core.resources"; //$NON-NLS-1$

	public static final String BUILDER_ID = ID + '.' + "builder"; //$NON-NLS-1$
	public static final String MARKER_PROBLEM_ID = ID + '.' + "problem"; //$NON-NLS-1$
	public static final String MODEL_PROVIDER_ID = ID + '.' + "model"; //$NON-NLS-1$
	public static final String NATURE_ID = ID + '.' + "nature"; //$NON-NLS-1$

	public static final String FUNCTION_FOLDER_NAME = "functions"; //$NON-NLS-1$
	public static final String TRIGGER_FOLDER_NAME = "triggers"; //$NON-NLS-1$

	public static void removeMarkersFor(IResource resource) throws CoreException {
		if (resource != null && resource.exists()) {
			resource.deleteMarkers(MARKER_PROBLEM_ID, false, IResource.DEPTH_INFINITE);
		}
	}

	public static XWorkspaceElementService getWorkspaceElementService() {
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
			// FIXME: investigate
			return false;
		}
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

	public static void configureProjectDescription(final IProjectDescription description) {
		description.setNatureIds(new String[] { NATURE_ID });
		addBuilder(description);
	}

	public static void configureXobotProject(IProject project, XProjectDescriptor xobot, IProgressMonitor monitor)
			throws CoreException {
		project.getFolder(FUNCTION_FOLDER_NAME).create(true, true, monitor);
		project.getFolder(TRIGGER_FOLDER_NAME).create(true, true, monitor);
		IFile specification = getXobotProjectSpecification(project);
		URI uri = URI.createPlatformResourceURI(specification.getFullPath().toString(), true);
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(uri);
		resource.getContents().add((EObject) xobot);
		try {
			resource.save(null);
			XProjectRegistry projectRegistry = getWorkspaceElementService().getProjectRegistry();
			projectRegistry.registerResource(uri.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static IFile getXobotProjectSpecification(IProject project) {
		if (project == null || !project.isAccessible()) {
			return null;
		}
		return project.getFile(".xobot");
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

	public static Map<String, XSourceDescriptor> resolveSources(XSourceRegistry sourceRegistry, Iterable<? extends XProjectSourceDescriptor> projectSources) {
		Map<String, XSourceDescriptor> map = new HashMap<>();
		for (XProjectSourceDescriptor descriptor : projectSources) {
			XSourceDescriptor source = sourceRegistry.getSource(descriptor.getSourceIdentifier());
			if (source != null) {
				map.put(source.getMaturity(), source);
			}
		}
		return map;
	}

	public static Map<String, XTargetDescriptor> resolveTargets(XTargetRegistry targetRegistry, Iterable<? extends XProjectTargetDescriptor> projectTargets) {
		Map<String, XTargetDescriptor> map = new HashMap<>();
		for (XProjectTargetDescriptor descriptor : projectTargets) {
			XTargetDescriptor target = targetRegistry.getTarget(descriptor.getTargetIdentifier());
			if (target != null) {
				map.put(target.getMaturity(), target);
			}
		}
		return map;
	}
	
}
