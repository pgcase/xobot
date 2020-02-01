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
package org.pgcase.xobot.dbproc.core.resources.mappings;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.RemoteResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.core.resources.mappings.XWorkspaceElementResourceMapping;

public class XFunctionIndexResourceMapping extends XWorkspaceElementResourceMapping {

	public XFunctionIndexResourceMapping(XFunctionDefinitionIndex file) {
		super(file);
	}

	public ResourceTraversal[] getTraversals(ResourceMappingContext context,
			IProgressMonitor monitor) throws CoreException {
		Set<IResource> resources = getLocalResources();
		if (context instanceof RemoteResourceMappingContext) {
			monitor.beginTask(null, IProgressMonitor.UNKNOWN);
			RemoteResourceMappingContext remoteContext = (RemoteResourceMappingContext) context;
			if (remoteContext.hasRemoteChange(getResource(), SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN))) {
				IResource[] remoteResources = XFunctionDefinitionIndex.getReferencedResources(
						getResource().getProject().getName(), 
						remoteContext.fetchRemoteContents((IFile)getResource(), 
								SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN)));
				for (int i = 0; i < remoteResources.length; i++) {
					IResource resource = remoteResources[i];
					resources.add(resource);
				}
			}
			if (remoteContext.isThreeWay() 
					&& remoteContext.hasLocalChange(getResource(), SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN))) {
				IResource[] remoteResources = XFunctionDefinitionIndex.getReferencedResources(
						getResource().getProject().getName(),
						remoteContext.fetchBaseContents((IFile)getResource(), 
								SubMonitor.convert(monitor, IProgressMonitor.UNKNOWN)));
				for (int i = 0; i < remoteResources.length; i++) {
					IResource resource = remoteResources[i];
					resources.add(resource);
				}
			}
			monitor.done();
		}
		return new ResourceTraversal[] { 
				new ResourceTraversal((IResource[]) resources.toArray(new IResource[resources.size()]), 
						IResource.DEPTH_ZERO, IResource.NONE)
			};
	}

	private Set<IResource> getLocalResources() throws CoreException {
		XFunctionDefinitionIndex index = (XFunctionDefinitionIndex)getModelObject();
		Set<IResource> resources = new HashSet<>();
		resources.add(index.getResource());
		XFunctionDefinitionBody[] files = index.getFunctionBodyFiles();
		for (int i = 0; i < files.length; i++) {
			XFunctionDefinitionBody file = files[i];
			resources.add(file.getResource());
		}
		return resources;
	}
	
	public boolean contains(ResourceMapping mapping) {
		Object modelObject = mapping.getModelObject();
		IResource resource = Adapters.adapt(modelObject, IResource.class);
		if (resource != null) {
			try {
				return getLocalResources().contains(resource);
			} catch (CoreException e) {
				//FIXME:
				e.printStackTrace();
			}
		}
		return false;
	}

}
