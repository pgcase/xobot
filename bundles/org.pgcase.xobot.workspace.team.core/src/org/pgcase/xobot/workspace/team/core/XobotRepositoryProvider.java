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
package org.pgcase.xobot.workspace.team.core;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.team.ResourceRuleFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.osgi.util.NLS;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.variants.IResourceVariant;

//FIXME: rework
public class XobotRepositoryProvider extends RepositoryProvider {

	public static final String REPOSITORY_PROVIDER_XOBOT = "org.pgcase.xobot.workspace.team.core.xobot"; //$NON-NLS-1$

	private static final ResourceRuleFactory RESOURCE_RULE_FACTORY = new ResourceRuleFactory() {
	};

	private IPath root;

	private static QualifiedName FILESYSTEM_REPO_LOC = new QualifiedName(TeamCore.ID, "disk_location"); //$NON-NLS-1$

	public XobotRepositoryProvider() {
		super();
	}

	public void configureProject() {
		XobotSystemSubscriber.getInstance().handleRootChanged(getProject(), true /* added */);
	}

	public void deconfigure() throws CoreException {
		getProject().setPersistentProperty(FILESYSTEM_REPO_LOC, null);
		XobotSystemSubscriber.getInstance().handleRootChanged(getProject(), false /* removed */);
	}

	public String getID() {
		return REPOSITORY_PROVIDER_XOBOT;
	}

	public void setTargetLocation(String location) throws TeamException {

		root = new Path(location);

		File file = new File(location);
		if (file.exists() && !file.isDirectory()) {
			String message = NLS.bind(Messages.XobotRepositoryProvider_TargetLocation_Error, location);
			throw new TeamException(message);
		}

		try {
			getProject().setPersistentProperty(FILESYSTEM_REPO_LOC, location);
		} catch (CoreException e) {
			throw TeamCore.wrapException(e);
		}
	}

	public IPath getRoot() {
		if (root == null) {
			try {
				String location = getProject().getPersistentProperty(FILESYSTEM_REPO_LOC);
				if (location == null) {
					return null;
				}
				root = new Path(location);
			} catch (CoreException e) {
				ResourcesPlugin.getPlugin().getLog().log(e.getStatus());
				return null;
			}
		}
		return root;
	}

	public IResourceVariant getResourceVariant(IResource resource, byte[] bytes) {
		if (bytes == null)
			return null;
		File file = getFile(resource);
		if (file == null)
			return null;
		return new XobotResourceVariant(file, bytes);
	}

	public IResourceVariant getResourceVariant(IResource resource) {
		File file = getFile(resource);
		if (file == null || !file.exists())
			return null;
		return new XobotResourceVariant(file);
	}

	public java.io.File getFile(IResource resource) {
		if (resource.getProject().equals(getProject())) {
			IPath rootdir = getRoot();
			return new File(rootdir.append(resource.getProjectRelativePath()).toOSString());
		}
		return null;
	}

	public IResourceRuleFactory getRuleFactory() {
		return RESOURCE_RULE_FACTORY;
	}

}
