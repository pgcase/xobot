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
package org.pgcase.xobot.workspace.team.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceTraversal;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.mapping.ISynchronizationScope;
import org.eclipse.team.core.subscribers.SubscriberScopeManager;
import org.eclipse.team.internal.core.mapping.CompoundResourceTraversal;
import org.eclipse.team.ui.synchronize.ModelOperation;
import org.eclipse.ui.IWorkbenchPart;
import org.pgcase.xobot.workspace.team.core.XobotRepositoryProvider;
import org.pgcase.xobot.workspace.team.core.XobotSystemSubscriber;

@SuppressWarnings("restriction")
public abstract class XobotModelOperation extends ModelOperation {

	public static SubscriberScopeManager createScopeManager(String name, ResourceMapping[] inputMappings) {
		return new SubscriberScopeManager(name, inputMappings, XobotSystemSubscriber.getInstance(), true);
	}

	protected XobotModelOperation(IWorkbenchPart part, SubscriberScopeManager manager) {
		super(part, manager);
	}

	protected void execute(IProgressMonitor monitor) throws InvocationTargetException {
		try {
			Map<XobotRepositoryProvider, CompoundResourceTraversal> providerToTraversals = getProviderToTraversalsMap();
			monitor.beginTask(getTaskName(), providerToTraversals.size() * 100);
			monitor.setTaskName(getTaskName());
			for (Iterator<XobotRepositoryProvider> iter = providerToTraversals.keySet().iterator(); iter.hasNext();) {
				XobotRepositoryProvider provider = iter.next();
				CompoundResourceTraversal traversal = (CompoundResourceTraversal) providerToTraversals.get(provider);
				ResourceTraversal[] traversals = traversal.asTraversals();
				execute(provider, traversals, SubMonitor.convert(monitor, 100));
			}
		} catch (CoreException e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}
	}

	private Map<XobotRepositoryProvider, CompoundResourceTraversal> getProviderToTraversalsMap() {
		Map<XobotRepositoryProvider, CompoundResourceTraversal> result = new HashMap<>();
		ISynchronizationScope scope = getScope();
		ResourceMapping[] mappings = scope.getMappings();
		for (int i = 0; i < mappings.length; i++) {
			ResourceMapping mapping = mappings[i];
			ResourceTraversal[] traversals = scope.getTraversals(mapping);
			for (int j = 0; j < traversals.length; j++) {
				ResourceTraversal traversal = traversals[j];
				IResource[] resources = traversal.getResources();
				for (int k = 0; k < resources.length; k++) {
					IResource resource = resources[k];
					recordResourceAndDepth(result, resource, traversal.getDepth());
				}
			}
		}
		return result;
	}

	protected XobotRepositoryProvider getProviderFor(IProject project) {
		return (XobotRepositoryProvider) RepositoryProvider.getProvider(project,
				XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
	}

	private void recordResourceAndDepth(Map<XobotRepositoryProvider, CompoundResourceTraversal> providerToTraversals,
			IResource resource, int depth) {
		XobotRepositoryProvider provider = getProviderFor(resource.getProject());
		if (provider != null) {
			CompoundResourceTraversal traversal = providerToTraversals.get(provider);
			if (traversal == null) {
				traversal = new CompoundResourceTraversal();
				providerToTraversals.put(provider, traversal);
			}
			traversal.addResource(resource, depth);
		}
	}

	protected abstract void execute(XobotRepositoryProvider provider, ResourceTraversal[] traversals,
			IProgressMonitor monitor) throws CoreException;

	protected abstract String getTaskName();

	protected boolean canRunAsJob() {
		return true;
	}

}
