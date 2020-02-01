/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.IProgressMonitor;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;

public class XProjectResourceMapping extends XWorkspaceElementResourceMapping {

	public XProjectResourceMapping(XProjectDescriptor container) {
		super(container);
	}

	public ResourceTraversal[] getTraversals(ResourceMappingContext context,
			IProgressMonitor monitor) {
		return new ResourceTraversal[] { 
				new ResourceTraversal(new IResource[] { 
						getResource()
				}, IResource.DEPTH_INFINITE, IResource.NONE)
			};
	}

	public boolean contains(ResourceMapping mapping) {
		Object modelObject = mapping.getModelObject();
		IResource resource = Adapters.adapt(modelObject, IResource.class);
		if (resource != null) {
			return getResource().getFullPath().isPrefixOf(resource.getFullPath());
		}
		return false;
	}

}
