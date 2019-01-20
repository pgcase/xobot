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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ModelProvider;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class XobotModelProvider extends ModelProvider {
	
	public static final String XOBOT_MODEL_PROVIDER_ID= "org.pgcase.xobot.workspace.core.resources.xobot"; //$NON-NLS-1$

	@Override
	public ResourceMapping[] getMappings(IResource resource, ResourceMappingContext context, IProgressMonitor monitor)
			throws CoreException {
		final Object adapted= resource.getAdapter(ResourceMapping.class);
		if (adapted instanceof ResourceMapping) {
			return new ResourceMapping[] { ((ResourceMapping) adapted)};
		}
		return new ResourceMapping[] { new XobotResourceMapping(resource)};
	}
}
