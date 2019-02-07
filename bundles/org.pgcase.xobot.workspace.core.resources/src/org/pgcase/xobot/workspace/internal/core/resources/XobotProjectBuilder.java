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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.pgcase.xobot.landscape.runtime.FocusDescriptors;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class XobotProjectBuilder extends IncrementalProjectBuilder {

	private XWorkspaceElementService workspaceService;
	private XSourceRegistry sourceRegistry;
	private XTargetRegistry targetRegistry;

	public XobotProjectBuilder() {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		workspaceService = serviceContext.get(XWorkspaceElementService.class);
		sourceRegistry = serviceContext.get(XSourceRegistry.class);
		targetRegistry = serviceContext.get(XTargetRegistry.class);
	}

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		WorkspaceCoreResources.removeMarkersFor(getProject());
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		//FIXME: need more precise implementation
		clean(monitor);

		IProject project = getProject();
		XProjectDescriptor xobot = workspaceService.getProject(project.getName());
		if (xobot == null) {
			//FIXME: configuration error
			return null;
		}
		Map<String, XSourceDescriptor> resolvedSources = WorkspaceCoreResources.resolveSources(sourceRegistry, xobot.getProjectSources());
		if (resolvedSources.get(FocusDescriptors.MATURITY_INTEGRATION) == null) {
			createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_source_integration, IMarker.SEVERITY_ERROR);
		}
		
		Map<String, XTargetDescriptor> resolvedTargets = WorkspaceCoreResources.resolveTargets(targetRegistry, xobot.getProjectTargets());
		if (resolvedTargets.get(FocusDescriptors.MATURITY_SANDBOX) == null) {
			createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_target_sandbox, IMarker.SEVERITY_ERROR);
		}
		if (resolvedTargets.get(FocusDescriptors.MATURITY_INTEGRATION) == null) {
			createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_target_integration, IMarker.SEVERITY_ERROR);
		}
		if (resolvedTargets.get(FocusDescriptors.MATURITY_STABLE) == null) {
			createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_target_stable, IMarker.SEVERITY_WARNING);
		}
		if (resolvedTargets.get(FocusDescriptors.MATURITY_OFFICIAL) == null) {
			createProblem(project, WorkspaceCoreResourcesMessages.XobotProjectBuilder_message_no_target_official, IMarker.SEVERITY_WARNING);
		}
		return null;
	}

	public void createProblem(IResource resource, String message, int severity) throws CoreException {
		IMarker marker = resource.createMarker(WorkspaceCoreResources.MARKER_PROBLEM_ID);
		marker.setAttribute(IMarker.MESSAGE, message);
		marker.setAttribute(IMarker.SEVERITY, severity);
		marker.setAttribute(IMarker.LOCATION, WorkspaceCoreResourcesMessages.XobotProjectBuilder_location_sources_targets);
	}
	
}
