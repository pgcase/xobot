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
package org.pgcase.xobot.basis.emf.edit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;

public abstract class DomainContentAdapter<C, R extends EditingDomainRegistry<C>> extends EContentAdapter {
	
	protected final R registry;
	
	protected DomainContentAdapter(R registry) {
		this.registry = registry;
	}
	
	@Override
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof ResourceSet) {
			ResourceSet resourceSet = (ResourceSet) notifier;
			switch (notification.getFeatureID(ResourceSet.class)) {
			case ResourceSet.RESOURCE_SET__RESOURCES:
				processResourceSetResources(resourceSet, notification);
				break;
			default:
				break;
			}
		} else if (notifier instanceof Resource) {
			Resource resource = (Resource) notifier;
			int featureID = notification.getFeatureID(Resource.class);
			switch (featureID) {
			case Resource.RESOURCE__CONTENTS:
				processResourceContents(resource, notification);
			case Resource.RESOURCE__IS_LOADED:
				processResourceIsLoaded(resource, notification);
				break;
			default:
				break;
			}
		}
		super.notifyChanged(notification);
	}

	protected void processResourceSetResources(ResourceSet resourceSet, Notification notification) {
		//nothing by default
	}
	
	protected void processResourceContents(Resource resource, Notification notification) {
		Object oldValue = notification.getOldValue();
		Object newValue = notification.getNewValue();
		switch (notification.getEventType()) {
		case Notification.ADD:
			processResourceContentsAdded(resource, newValue);
			break;
		case Notification.REMOVE:
			processResourceContentsRemoved(resource, oldValue);
			break;
	
		default:
			break;
		}
	}

	protected void processResourceContentsAdded(Resource resource, Object newValue) {
		Class<C> contentClass = registry.getContentClass();
		if (contentClass.isInstance(newValue)) {
			C content = contentClass.cast(newValue);
			registry.registerContent(content);
		}
	}

	protected void processResourceContentsRemoved(Resource resource, Object oldValue) {
		Class<C> contentClass = registry.getContentClass();
		if (contentClass.isInstance(oldValue)) {
			C content = contentClass.cast(oldValue);
			String identifier = registry.resolveIdentifier(content);
			registry.unregisterContent(identifier);
		}
	}

	protected void processResourceIsLoaded(Resource resource, Notification notification) {
		//nothing by default
	}
	
}
