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
package org.pgcase.xobot.workspace.team.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.variants.IResourceVariant;
import org.eclipse.team.core.variants.ThreeWayRemoteTree;

public class XobotRemoteTree extends ThreeWayRemoteTree {
	
	public XobotRemoteTree(XobotSystemSubscriber subscriber) {
		super(subscriber);
	}
	
	protected IResourceVariant[] fetchMembers(IResourceVariant variant, IProgressMonitor progress) {
		return ((XobotResourceVariant)variant).members();
	}
	
	protected IResourceVariant fetchVariant(IResource resource, int depth, IProgressMonitor monitor) {
		RepositoryProvider provider = RepositoryProvider.getProvider(resource.getProject(), XobotRepositoryProvider.REPOSITORY_PROVIDER_XOBOT);
		if (provider instanceof XobotRepositoryProvider) {
			XobotRepositoryProvider xobot = (XobotRepositoryProvider) provider;
			return xobot.getResourceVariant(resource);
		}
		return null;
	}
}
