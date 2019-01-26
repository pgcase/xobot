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
package org.pgcase.xobot.basis.ui.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.pgcase.xobot.basis.runtime.DescribedDescriptor;

public class RegistryLabelProvider implements ICommonLabelProvider {

	private AdapterFactoryLabelProvider emfDelegate;
	private ILabelProvider workbenchDelegate;

	@Override
	public Image getImage(Object element) {
		if (element instanceof EObject) {
			return emfDelegate.getImage(element);
		}
		return workbenchDelegate.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof EObject) {
			return emfDelegate.getText(element);
		}
		return workbenchDelegate.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		emfDelegate.addListener(listener);
		workbenchDelegate.addListener(listener);
	}

	@Override
	public void dispose() {
		workbenchDelegate = null;
		emfDelegate.dispose();
		emfDelegate = null;
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		if (element instanceof EObject) {
			return emfDelegate.isLabelProperty(element, property);
		}
		return workbenchDelegate.isLabelProperty(element, property);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		emfDelegate.removeListener(listener);
		workbenchDelegate.removeListener(listener);
	}

	@Override
	public void restoreState(IMemento aMemento) {
	}

	@Override
	public void saveState(IMemento aMemento) {
	}

	@Override
	public String getDescription(Object anElement) {
		if (anElement instanceof DescribedDescriptor) {
			DescribedDescriptor descriptor = (DescribedDescriptor) anElement;
			return descriptor.getName();
		}
		return null;
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		ComposeableAdapterFactory adapterFactory = new ComposedAdapterFactory(registry);
		emfDelegate = new AdapterFactoryLabelProvider(adapterFactory);
		workbenchDelegate = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
	}

}
