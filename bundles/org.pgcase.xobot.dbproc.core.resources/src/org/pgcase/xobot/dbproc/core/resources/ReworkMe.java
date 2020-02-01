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
package org.pgcase.xobot.dbproc.core.resources;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;

public class ReworkMe {

	public static void writeLines(IFile file, String[] strings) throws CoreException {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			buffer.append(string);
			buffer.append("\n"); //$NON-NLS-1$
		}
		file.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), false, true, null);
	}

	public static String[] readLines(IStorage file) throws CoreException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(file.getContents()));
		String line = null;
		List<String> result = new ArrayList<>();
		try {
			while ((line = reader.readLine()) != null) {
				result.add(line.trim());
			}
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceCoreResources.ID, 0,
					NLS.bind(DBProcCoreResourcesMessages.ReworkMe_message_error_reading_from_file, file.getFullPath()), e));
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// Ignore
			}
		}
		return (String[]) result.toArray(new String[result.size()]);
	}

	public static IFile getFile(String projectName, String path) {
		if (path.length() == 0)
			return null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus status = workspace.validatePath("/" + projectName + "/" + path, IResource.FILE);  //$NON-NLS-1$//$NON-NLS-2$
		if (status.isOK()) {
			IProject project = workspace.getRoot().getProject(projectName);
			return project.getFile(new Path(path));
		}
	
		// FIXME: rework
		Platform.getLog(Platform.getBundle(WorkspaceCoreResources.ID)).log(status);
		return null;
	}

	public static void setElements(IFile file, IResource[] resources) throws CoreException {
		List<String> paths = new ArrayList<>();
		for (int i = 0; i < resources.length; i++) {
			IResource resource = resources[i];
			paths.add(resource.getProjectRelativePath().toString());
		}
		writeLines(file, (String[]) paths.toArray(new String[paths.size()]));
	}

}
