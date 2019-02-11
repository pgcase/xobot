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
package org.pgcase.xobot.dbproc.core.resources.mappings;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.IProgressMonitor;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.workspace.core.resources.mappings.XWorkspaceElementResourceMapping;

public class XFunctionBodyResourceMapping extends XWorkspaceElementResourceMapping {

	public XFunctionBodyResourceMapping(XFunctionDefinitionBody file) {
		super(file);
	}

	public ResourceTraversal[] getTraversals(ResourceMappingContext context,
			IProgressMonitor monitor) {
		return new ResourceTraversal[] { 
				new ResourceTraversal(new IResource[] { 
						getResource()
				}, IResource.DEPTH_ZERO, IResource.NONE)
			};
	}

	public boolean contains(ResourceMapping mapping) {
		if (mapping.equals(this)) {
			return true;
		}
		return false;
	}

}
