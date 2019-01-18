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
package org.pgcase.xobot.landscape.internal.core.registry;

import org.eclipse.emf.common.notify.Notification;
import org.pgcase.xobot.basis.emf.edit.DomainContentAdapter;
import org.pgcase.xobot.landscape.model.api.XTarget;
import org.pgcase.xobot.landscape.model.api.XTargetSet;
import org.pgcase.xobot.landscape.model.meta.XLandscapePackage;

public class TargetDomainRegistryTracker extends DomainContentAdapter<TargetDomainRegistry> {

	public TargetDomainRegistryTracker(TargetDomainRegistry registry) {
		super(registry);
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof XTargetSet) {
			XTargetSet targetSet = (XTargetSet) notifier;
			switch (notification.getFeatureID(XTargetSet.class)) {
			case XLandscapePackage.TARGET_SET__IDENTIFIER:
				processTargetSetIdentifier(targetSet, notification);
				break;
			case XLandscapePackage.TARGET_SET__TARGETS:
				processTargetSetTargets(targetSet, notification);
				break;
			default:
				break;
			}
		} else if (notifier instanceof XTarget) {
			XTarget target = (XTarget) notifier;
			switch (notification.getFeatureID(XTarget.class)) {
			case XLandscapePackage.TARGET__IDENTIFIER:
				processTargetIdentifier(target, notification);
			default:
				break;
			}
		}
		super.notifyChanged(notification);
	}

	protected void processTargetSetIdentifier(XTargetSet targetSet, Notification notification) {
		String oldValue = notification.getOldStringValue();
		String newValue = notification.getNewStringValue();
		switch (notification.getEventType()) {
		case Notification.SET:
			if (oldValue != null) {
				registry.unregisterTargetSet(oldValue);
			}
			if (newValue != null) {
				registry.registerTargetSet(targetSet);
			}
		default:
			break;
		}
	}

	protected void processTargetSetTargets(XTargetSet targetSet, Notification notification) {
		Object oldValue = notification.getOldValue();
		Object newValue = notification.getNewValue();
		switch (notification.getEventType()) {
		case Notification.ADD:
			if (newValue instanceof XTarget) {
				XTarget target = (XTarget) newValue;
				String identifier = target.getIdentifier();
				if (identifier != null) {
					registry.registerTarget(target);
				}
			}
			break;
		case Notification.REMOVE:
			if (oldValue instanceof XTarget) {
				XTarget target = (XTarget) oldValue;
				String identifier = target.getIdentifier();
				if (identifier != null) {
					registry.unregisterTarget(identifier);
				}
			}
			break;

		default:
			break;
		}
	}

	protected void processTargetIdentifier(XTarget target, Notification notification) {
		String oldValue = notification.getOldStringValue();
		String newValue = notification.getNewStringValue();
		switch (notification.getEventType()) {
		case Notification.SET:
			if (oldValue != null) {
				registry.unregisterTarget(oldValue);
			}
			if (newValue != null) {
				registry.registerTarget(target);
			}
		default:
			break;
		}
	}

}
