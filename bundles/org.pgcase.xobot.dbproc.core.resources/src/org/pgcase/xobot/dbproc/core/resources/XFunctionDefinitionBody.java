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

import org.eclipse.core.resources.IFile;
import org.pgcase.xobot.workspace.core.resources.XWorkspaceResource;

//FIXME: Temporary, just to not loose the functionality of logic model
public class XFunctionDefinitionBody extends XWorkspaceResource {

	private final XFunctionDefinitionIndex functionDefintionIndex;

	public XFunctionDefinitionBody(XFunctionDefinitionIndex parent, IFile file) {
		super(file);
		this.functionDefintionIndex = parent;
	}

	public XFunctionDefinitionIndex getFunctionDefinitionIndex() {
		return functionDefintionIndex;
	}
	
}
