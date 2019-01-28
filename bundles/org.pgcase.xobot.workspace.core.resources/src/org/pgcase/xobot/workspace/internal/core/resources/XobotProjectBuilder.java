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

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;

public class XobotProjectBuilder extends IncrementalProjectBuilder {

	public XobotProjectBuilder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		WorkspaceCoreResources.removeMarkersFor(getProject());
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		IProject project = getProject();
//		IFile file = project.getFile(".xobot");
		createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_sandbox, IMarker.SEVERITY_ERROR);
		createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_integration, IMarker.SEVERITY_ERROR);
		createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_stable, IMarker.SEVERITY_WARNING);
		createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_official, IMarker.SEVERITY_WARNING);
		return null;
	}

	public void createProblem(IResource resource, String message, int severity) throws CoreException {
		IMarker marker = resource.createMarker(WorkspaceCoreResources.MARKER_PROBLEM_ID);
		marker.setAttribute(IMarker.MESSAGE, message);
		marker.setAttribute(IMarker.SEVERITY, severity);
		marker.setAttribute(IMarker.LOCATION, WorkspaceCoreResourcesMessages.XobotProjectBuilder_location_sources_targets);
	}
	
}
