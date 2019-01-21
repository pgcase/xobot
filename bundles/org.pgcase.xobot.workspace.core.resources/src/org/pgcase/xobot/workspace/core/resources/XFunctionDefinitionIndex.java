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

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.pgcase.xobot.workspace.internal.core.resources.ReworkMe;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;

//FIXME: Temporary, just to not loose the functionality of logic model
public class XFunctionDefinitionIndex extends XWorkspaceResource {

	public static IResource[] getReferencedResources(String projectName, IStorage storage) throws CoreException {
		if (storage == null) {
			return new IResource[0];
		}
		List<IResource> result = new ArrayList<>();
		String[] filePaths = ReworkMe.readLines(storage);
		for (int i = 0; i < filePaths.length; i++) {
			String path = filePaths[i];
			IFile file = ReworkMe.getFile(projectName, path);
			if (file == null) {
				continue;
			}
			if (WorkspaceCoreResources.FUNCTION_DEFINITION_BODY_EXTENSION.equals(file.getFileExtension())) {
				result.add(file);
			}
		}
		return (IResource[]) result.toArray(new IResource[result.size()]);
	}

	private final XProjectFolderDescriptor projectFolder;

	public XFunctionDefinitionIndex(XProjectFolderDescriptor folder, IFile file) {
		super(file);
		this.projectFolder = folder;
	}

	public XProjectFolderDescriptor getProjectFolder() {
		return projectFolder;
	}

	public XFunctionDefinitionBody[] getFunctionBodyFiles() throws CoreException {
		List<XFunctionDefinitionBody> result = new ArrayList<>();
		String[] filePaths = ReworkMe.readLines((IFile) getResource());
		for (int i = 0; i < filePaths.length; i++) {
			String path = filePaths[i];
			IFile file = ReworkMe.getFile(getResource().getProject().getName(), path);
			if (file != null) {
				XFunctionDefinitionBody bodyFile = getBodyFile(file);
				if (bodyFile != null) {
					result.add(bodyFile);
				}
			}
		}
		return (XFunctionDefinitionBody[]) result.toArray(new XFunctionDefinitionBody[result.size()]);
	}

	private XFunctionDefinitionBody getBodyFile(IFile file) {
		if (WorkspaceCoreResources.isBodyFile(file)) {
			return new XFunctionDefinitionBody(this, file);
		}
		return null;
	}

	public void addBody(IFile body) throws CoreException {
		IFile index = (IFile) getResource();
		ByteArrayInputStream content = new ByteArrayInputStream(("\n" + body.getProjectRelativePath()).getBytes());
		index.appendContents(content, false, true, null);
	}

	public void remove(XFunctionDefinitionBody bodyFile) throws CoreException {
		XFunctionDefinitionBody[] files = getFunctionBodyFiles();
		List<String> paths = new ArrayList<>();
		for (int i = 0; i < files.length; i++) {
			XFunctionDefinitionBody child = files[i];
			if (!child.equals(bodyFile)) {
				paths.add(child.getResource().getProjectRelativePath().toString());
			}
		}
		IFile file = (IFile) getResource();
		ReworkMe.writeLines(file, (String[]) paths.toArray(new String[paths.size()]));
	}

	public static void setElements(IFile file, IResource[] resources) throws CoreException {
		List<String> paths = new ArrayList<>();
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			paths.add(resource.getProjectRelativePath().toString());
		}
		ReworkMe.writeLines(file, (String[]) paths.toArray(new String[paths.size()]));
	}

	public boolean hasBody(IFile file) throws CoreException {
		XFunctionDefinitionBody[] files = getFunctionBodyFiles();
		for (int i = 0; i < files.length; i++) {
			XFunctionDefinitionBody child = files[i];
			if (child.getResource().equals(file)) {
				return true;
			}
		}
		return false;
	}

}
