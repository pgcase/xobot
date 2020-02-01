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
package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.CommonViewer;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.pgcase.xobot.basis.runtime.BasisEvents;
import org.pgcase.xobot.basis.runtime.registry.BasisRegistry;

public abstract class RegistryContentProvider<R extends BasisRegistry> implements ICommonContentProvider, EventHandler {

	protected static final Object[] NO_CHILDREN = new Object[0];

	private IEventBroker broker;
	private R registry;

	private CommonViewer commonViewer;

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public boolean hasChildren(Object element) {
		Object[] children = getChildren(element);
		return children.length > 0;
	}

	@Override
	public void restoreState(IMemento aMemento) {
	}

	@Override
	public void saveState(IMemento aMemento) {
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (viewer instanceof CommonViewer) {
			commonViewer = (CommonViewer) viewer;
		} else {
			commonViewer = null;
		}
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		broker = serviceContext.get(IEventBroker.class);
		if (broker != null) {
			broker.subscribe(getTopic(), this);
		}
		registry = serviceContext.get(getRegistryClass());
		init(serviceContext);
	}
	
	protected void init(IEclipseContext context) {
		//nothing else by default
	}

	@Override
	public void dispose() {
		if (broker != null) {
			broker.unsubscribe(this);
			broker = null;
		}
		registry = null;
		ICommonContentProvider.super.dispose();
	}

	protected abstract Class<R> getRegistryClass();
	
	protected R getRegistry() {
		return registry;
	}
	
	protected abstract String getTopic();
	
	@Override
	public void handleEvent(Event event) {
		Display.getDefault().asyncExec(()-> {
			String topic = event.getTopic();
			Object data = event.getProperty(IEventBroker.DATA);
			if (topic.endsWith(BasisEvents.CREATE)) {
				handleEventCreate(event, data);
			} else if (topic.endsWith(BasisEvents.DELETE)) {
				handleEventDelete(event, data);
			} else if (topic.endsWith(BasisEvents.UPDATE)) {
				handleEventUpdate(event, data);
			} else if (topic.endsWith(BasisEvents.READ)) {
				handleEventRead(event, data);
			} else {
				handleEventDefault(event, data);
			}
		});
	}
	
	protected void handleEventCreate(Event event, Object data) {
		if (commonViewer == null) {
			return;
		}
		Object parent = getParent(data);
		if (parent == null) {
			return;
		}
		commonViewer.add(parent, data);
	}

	protected void handleEventDelete(Event event, Object data) {
		if (commonViewer == null) {
			return;
		}
		commonViewer.remove(data);
	}

	protected void handleEventUpdate(Event event, Object data) {
		if (commonViewer == null) {
			return;
		}
		String[] propertyNames = event.getPropertyNames();
		commonViewer.update(data, propertyNames);
	}

	protected void handleEventRead(Event event, Object data) {
		// nothing by default
	}

	protected void handleEventDefault(Event event, Object data) {
		// nothing by default
	}

}
