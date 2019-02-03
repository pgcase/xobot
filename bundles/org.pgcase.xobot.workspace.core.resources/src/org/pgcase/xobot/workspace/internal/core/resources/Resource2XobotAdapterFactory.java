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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;
import org.pgcase.xobot.workspace.runtime.registry.XWorkspaceElementService;

public class Resource2XobotAdapterFactory implements IAdapterFactory {

	private final XWorkspaceElementService service = WorkspaceCoreResources.getWorkspaceElementService();
	
	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (adapterType.isInstance(adaptableObject)) {
			return adapterType.cast(adaptableObject);
		}
		if (XWorkspaceElementDescriptor.class.equals(adapterType)) {
			if (adaptableObject instanceof IResource) {
				IResource resource = (IResource) adaptableObject;
				int type = resource.getType();
				switch (type) {
				case IResource.FILE:
					return adapterType.cast(service.getWorkspaceElement(resource.getFullPath()));
				case IResource.FOLDER:
					return adapterType.cast(service.getProjectFolder(resource.getProject().getName(), resource.getProjectRelativePath().toString()));
				case IResource.PROJECT:
					return adapterType.cast(service.getProject(resource.getProject().getName()));
				case IResource.ROOT:
					return adapterType.cast(WorkspaceRoot.INSTANCE);
				default:
					break;
				}
			}
		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {XWorkspaceElementDescriptor.class};
	}

}
