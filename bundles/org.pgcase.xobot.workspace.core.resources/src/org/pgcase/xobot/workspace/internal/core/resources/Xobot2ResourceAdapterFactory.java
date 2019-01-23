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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.pgcase.xobot.workspace.core.resources.XWorkspaceResource;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;

public class Xobot2ResourceAdapterFactory implements IAdapterFactory {

	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (IResource.class.equals(adapterType)) {
			if (adaptableObject instanceof XProjectDescriptor) {
				XProjectDescriptor element = (XProjectDescriptor) adaptableObject;
				IProject project = extractProject(element);
				return adapterType.cast(project);
			}
			if (adaptableObject instanceof XProjectFolderDescriptor) {
				XProjectFolderDescriptor element = (XProjectFolderDescriptor) adaptableObject;
				IProject project = extractProject(element.getProject());
				IPath path = new Path(element.getPath());
				IFolder folder = project.getFolder(path);
				return adapterType.cast(folder);
			}
			if (adaptableObject instanceof XWorkspaceResource) {
				XWorkspaceResource element = (XWorkspaceResource) adaptableObject;
				return adapterType.cast(element.getResource());
			}
		}
		return null;
	}

	protected IProject extractProject(XProjectDescriptor element) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(element.getIdentifier());
		return project;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { IResource.class };
	}

}
