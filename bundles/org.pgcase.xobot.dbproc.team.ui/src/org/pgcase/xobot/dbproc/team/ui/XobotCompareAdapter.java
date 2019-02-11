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
package org.pgcase.xobot.dbproc.team.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.compare.structuremergeviewer.ICompareInput;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.Path;
import org.eclipse.team.core.mapping.ISynchronizationContext;
import org.eclipse.team.ui.mapping.SynchronizationCompareAdapter;
import org.eclipse.ui.IMemento;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.mappings.XobotModelProvider;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class XobotCompareAdapter extends SynchronizationCompareAdapter {

	private static final String MEMENTO_INDEX_PATH = "index"; //$NON-NLS-1$
	private static final String MEMENTO_RESOURCE_PATH = "resource"; //$NON-NLS-1$

	private static final String CTX_MODEL_MAPPINGS = WorkspaceCoreResources.MODEL_PROVIDER_ID;
	
	private final XobotModelProvider provider;

	public XobotCompareAdapter(XobotModelProvider provider) {
		this.provider = provider;
	}
	
	public String getName(ResourceMapping mapping) {
		Object o = mapping.getModelObject();
		if (o instanceof XWorkspaceElementDescriptor) {
			XWorkspaceElementDescriptor descriptor = (XWorkspaceElementDescriptor) o;
			return descriptor.getName();
		}
		return super.getName(mapping);
	}
	
	public String getPathString(ResourceMapping mapping) {
		Object o = mapping.getModelObject();
		if (o instanceof XWorkspaceElementDescriptor) {
			XWorkspaceElementDescriptor descriptor = (XWorkspaceElementDescriptor) o;
			return descriptor.getPath();
		}
		return super.getPathString(mapping);
	}

	public ICompareInput asCompareInput(ISynchronizationContext context, Object o) {
		if (o instanceof XFunctionDefinitionBody) {
			XFunctionDefinitionBody moeFile = (XFunctionDefinitionBody) o;
			// Use a file compare input for the model element file
			return super.asCompareInput(context, moeFile.getResource());
		}
		return super.asCompareInput(context, o);
	}
	
	public ResourceMapping[] restore(IMemento memento) {
		List<ResourceMapping> result = new ArrayList<>();
		IMemento[] children = memento.getChildren(CTX_MODEL_MAPPINGS);
		for (int i = 0; i < children.length; i++) {
			IMemento child = children[i];
			ResourceMapping mapping = restoreMapping(child);
			if (mapping != null)
				result.add(mapping);
		}
		return (ResourceMapping[]) result.toArray(new ResourceMapping[result.size()]);
	}

	public void save(ResourceMapping[] mappings, IMemento memento) {
		for (int i = 0; i < mappings.length; i++) {
			ResourceMapping mapping = mappings[i];
			Object o = mapping.getModelObject();
			if (o instanceof XWorkspaceElementDescriptor) {
				XWorkspaceElementDescriptor mo = (XWorkspaceElementDescriptor) o;
				save(mo, memento.createChild(CTX_MODEL_MAPPINGS));
			}
		}
		
	}

	private ResourceMapping restoreMapping(IMemento child) {
		String parent = child.getString(MEMENTO_INDEX_PATH);
		String path = child.getString(MEMENTO_RESOURCE_PATH);
		if (parent != null) {
			IResource resource = getResource(parent);
			XFunctionDefinitionIndex indexFile = (XFunctionDefinitionIndex) Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
			if (indexFile != null) {
				XFunctionDefinitionBody object = new XFunctionDefinitionBody(indexFile, (IFile)getResource(path));
				return Adapters.adapt(object, ResourceMapping.class);
			}
		} else {
			IResource resource = getResource(path);
			XWorkspaceElementDescriptor object = Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
			if (object != null) {
				return Adapters.adapt(object, ResourceMapping.class);
			}
		}
		return null;
	}
	
	private IResource getResource(String path) {
		Path resourcePath = new Path(path);
		if (path.endsWith(WorkspaceCoreResources.FUNCTION_DEFINITION_INDEX_EXTENSION) 
				|| path.endsWith(WorkspaceCoreResources.FUNCTION_DEFINITION_BODY_EXTENSION))
			return ResourcesPlugin.getWorkspace().getRoot().getFile(resourcePath);
		if (resourcePath.segmentCount() == 1)
			return ResourcesPlugin.getWorkspace().getRoot().getProject(resourcePath.lastSegment());
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(resourcePath);
	}

	private void save(XWorkspaceElementDescriptor descriptor, IMemento memento) {
		IResource resource = Adapters.adapt(descriptor, IResource.class);
		if (resource != null) {
			memento.putString(MEMENTO_RESOURCE_PATH, resource.getFullPath().toString());
			if (descriptor instanceof XFunctionDefinitionBody) {
				XFunctionDefinitionBody body = (XFunctionDefinitionBody) descriptor;
				XFunctionDefinitionIndex index = body.getFunctionDefinitionIndex();
				memento.putString(MEMENTO_INDEX_PATH, index.getResource().getFullPath().toString());
			}
		}
	}

	public XobotModelProvider getProvider() {
		return provider;
	}

}
