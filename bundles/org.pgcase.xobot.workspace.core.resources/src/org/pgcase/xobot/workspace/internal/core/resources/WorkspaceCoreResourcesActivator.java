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
package org.pgcase.xobot.workspace.internal.core.resources;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class WorkspaceCoreResourcesActivator implements BundleActivator {
	
	private static WorkspaceCoreResourcesActivator activator;
	
	private XWorkspaceElementService workspaceElementService;

	private ServiceReference<XWorkspaceElementService> workspaceElementServiceReference;
	
	public static WorkspaceCoreResourcesActivator getActivator() {
		return activator;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		WorkspaceCoreResourcesActivator.activator = this;
		workspaceElementServiceReference = context.getServiceReference(XWorkspaceElementService.class);
		if (workspaceElementServiceReference != null) {
			workspaceElementService = context.getService(workspaceElementServiceReference);
		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		workspaceElementService = null;
		if (workspaceElementServiceReference != null) {
			context.ungetService(workspaceElementServiceReference);
			workspaceElementServiceReference = null;
		}
		WorkspaceCoreResourcesActivator.activator = null;
	}
	
	public XWorkspaceElementService getWorkspaceElementService() {
		return workspaceElementService;
	}

}
