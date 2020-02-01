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
package org.pgcase.xobot.landscape.internal.core.registry;

import org.eclipse.emf.common.notify.Notification;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.landscape.model.api.XSource;
import org.pgcase.xobot.landscape.model.api.XSourceSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;

public class SourceDomainRegistryTracker extends DomainContentAdapter<XSourceSetDescriptor, SourceDomainRegistry> {

	public SourceDomainRegistryTracker(SourceDomainRegistry registry) {
		super(registry);
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof XSourceSet) {
			XSourceSet sourceSet = (XSourceSet) notifier;
			switch (notification.getFeatureID(XSourceSet.class)) {
			case XLandscapePackage.SOURCE_SET__IDENTIFIER:
				processSourceSetIdentifier(sourceSet, notification);
				break;
			case XLandscapePackage.SOURCE_SET__SOURCES:
				processSourceSetSources(sourceSet, notification);
				break;
			default:
				break;
			}
		} else if (notifier instanceof XSource) {
			XSource source = (XSource) notifier;
			switch (notification.getFeatureID(XSource.class)) {
			case XLandscapePackage.SOURCE__IDENTIFIER:
				processSourceIdentifier(source, notification);
			default:
				break;
			}
		}
		super.notifyChanged(notification);
	}

	protected void processSourceSetIdentifier(XSourceSet sourceSet, Notification notification) {
		String oldValue = notification.getOldStringValue();
		String newValue = notification.getNewStringValue();
		switch (notification.getEventType()) {
		case Notification.SET:
			if (oldValue != null) {
				registry.unregisterSourceSet(oldValue);
			}
			if (newValue != null) {
				registry.registerSourceSet(sourceSet);
			}
		default:
			break;
		}
	}

	protected void processSourceSetSources(XSourceSet sourceSet, Notification notification) {
		Object oldValue = notification.getOldValue();
		Object newValue = notification.getNewValue();
		switch (notification.getEventType()) {
		case Notification.ADD:
			if (newValue instanceof XSource) {
				XSource source = (XSource) newValue;
				String identifier = source.getIdentifier();
				if (identifier != null) {
					registry.registerSource(source);
				}
			}
			break;
		case Notification.REMOVE:
			if (oldValue instanceof XSource) {
				XSource source = (XSource) oldValue;
				String identifier = source.getIdentifier();
				if (identifier != null) {
					registry.unregisterSource(identifier);
				}
			}
			break;

		default:
			break;
		}
	}

	protected void processSourceIdentifier(XSource source, Notification notification) {
		String oldValue = notification.getOldStringValue();
		String newValue = notification.getNewStringValue();
		switch (notification.getEventType()) {
		case Notification.SET:
			if (oldValue != null) {
				registry.unregisterSource(oldValue);
			}
			if (newValue != null) {
				registry.registerSource(source);
			}
		default:
			break;
		}
	}

}
