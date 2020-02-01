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
package org.pgcase.xobot.dbproc.internal.core.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.service.component.annotations.Component;
import org.pgcase.xobot.dbproc.core.XFunctionService;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

@Component
public class XFunctionResourcesService implements XFunctionService {

	@Override
	public void delete(XWorkspaceElementDescriptor element, IProgressMonitor monitor) throws CoreException {
		if (element instanceof XFunctionDefinitionBody) {
			XFunctionDefinitionBody body = (XFunctionDefinitionBody) element;
			body.getFunctionDefinitionIndex().remove(body);
			body.getResource().delete(false, monitor);
		} else if (element instanceof XFunctionDefinitionIndex) {
			XFunctionDefinitionIndex index = (XFunctionDefinitionIndex) element;
			index.getResource().delete(false, monitor);
			XFunctionDefinitionBody[] files = index.getFunctionBodyFiles();
			for (int i = 0; i < files.length; i++) {
				XFunctionDefinitionBody file = files[i];
				file.getResource().delete(false, null);
			}
		}
	}

}
