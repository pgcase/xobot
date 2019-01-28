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
package org.pgcase.xobot.workspace.core.resources.mappings;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.Adapters;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public abstract class XWorkspaceElementResourceMapping extends ResourceMapping {

	private final XWorkspaceElementDescriptor object;

	public static ResourceMapping create(XWorkspaceElementDescriptor object) {
		if (object instanceof XProjectDescriptor) {
			XProjectDescriptor folder = (XProjectDescriptor) object;
			return new XProjectResourceMapping(folder);
		}
		if (object instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) object;
			return new XProjectFolderResourceMapping(folder);
		}
		if (object instanceof XFunctionDefinitionIndex) {
			return new XFunctionIndexResourceMapping((XFunctionDefinitionIndex) object);
		}
		if (object instanceof XFunctionDefinitionBody) {
			return new XFunctionBodyResourceMapping((XFunctionDefinitionBody) object);
		}
		return null;
	}

	protected XWorkspaceElementResourceMapping(XWorkspaceElementDescriptor object) {
		this.object = object;
	}

	public Object getModelObject() {
		return object;
	}

	protected IResource getResource() {
		Object modelObject = getModelObject();
		return Adapters.adapt(modelObject, IResource.class);
	}
	
	public String getModelProviderId() {
		return WorkspaceCoreResources.MODEL_PROVIDER_ID;
	}

	public IProject[] getProjects() {
		IResource resource = getResource();
		return new IProject[] { resource.getProject() };
	}

}
