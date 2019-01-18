/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
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
package org.pgcase.xobot.workspace.internal.core.registry;

import org.eclipse.emf.common.notify.Notification;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.workspace.model.api.XProject;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

public class ProjectDomainRegistryTracker extends DomainContentAdapter<ProjectDomainRegistry> {

	public ProjectDomainRegistryTracker(ProjectDomainRegistry registry) {
		super(registry);
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof XProject) {
			XProject source = (XProject) notifier;
			switch (notification.getFeatureID(XProject.class)) {
			case XWorkspacePackage.PROJECT__IDENTIFIER:
				processProjectIdentifier(source, notification);
			default:
				break;
			}
		}
		super.notifyChanged(notification);
	}

	protected void processProjectIdentifier(XProject source, Notification notification) {
		String oldValue = notification.getOldStringValue();
		String newValue = notification.getNewStringValue();
		switch (notification.getEventType()) {
		case Notification.SET:
			if (oldValue != null) {
				registry.unregisterProject(oldValue);
			}
			if (newValue != null) {
				registry.registerProject(source);
			}
		default:
			break;
		}
	}

}
