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

import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectSourceDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

//stub implementation to associate IResource with XElement, should be obtained via registry service
public class XobotResourceElement implements XProjectDescriptor {
	
	private final IResource resource;

	public XobotResourceElement(IResource resource) {
		this.resource = resource;
	}
	
	public IResource getResource() {
		return resource;
	}
	
	@Override
	public String getIdentifier() {
		return resource.getFullPath().toString();
	}
	
	@Override
	public String getName() {
		return resource.getName();
	}
	
	@Override
	public Iterable<? extends XProjectSourceDescriptor> getProjectSources() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends XProjectTargetDescriptor> getProjectTargets() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends XProjectFolderDescriptor> getProjectFolders() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public String getPath() {
		return resource.getFullPath().toString();
	}

}
