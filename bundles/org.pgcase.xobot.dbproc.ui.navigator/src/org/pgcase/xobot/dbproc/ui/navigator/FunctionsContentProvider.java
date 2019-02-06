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
package org.pgcase.xobot.dbproc.ui.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.pgcase.xobot.basis.runtime.BasisEvents;
import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.dbproc.antlr.functions.AntlrFunctionExtractor;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceEvents;
import org.pgcase.xobot.workspace.runtime.registry.XProjectRegistry;

public class FunctionsContentProvider extends RegistryContentProvider<XProjectRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor projectFolder = (XProjectFolderDescriptor) parentElement;
			String path = projectFolder.getPath();
			XProjectDescriptor project = projectFolder.getProject();
			IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).getFolder(path);
			AntlrFunctionExtractor antlrFunctionExtractor = new AntlrFunctionExtractor();
			List<XFunctionDescriptor> functions = new ArrayList<>();
			try {
				IResource[] members = folder.members();
				for (IResource resource : members) {
					if (resource instanceof IFile) {
						IFile file = (IFile) resource;
						antlrFunctionExtractor.extractFunctions(file.getContents(), null, new XIssueReporter() {
							
							@Override
							public void reportIssue(Object source, Object data, String message, Throwable error) {
								
								// TODO Auto-generated method stub
								
							}
						}).forEach(functions::add);
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return functions.toArray();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) element;
			return folder.getProject();
		}
		if (element instanceof XProjectDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XProjectRegistry> getRegistryClass() {
		return XProjectRegistry.class;
	}

	@Override
	protected String getTopic() {
		return XWorkspaceEvents.WORKSPACE_TOPIC_BASE + BasisEvents.TOPIC_SEP + BasisEvents.ALL_SUB_TOPICS;
	}

	@Override
	protected void init(IEclipseContext context) {
		super.init(context);
	}

}
