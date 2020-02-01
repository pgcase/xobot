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
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.pgcase.xobot.basis.emf.edit.ui.ComposedLabelProvider;

public class RegistryLabelProvider extends ComposedLabelProvider implements ICommonLabelProvider {

	@Override
	public void restoreState(IMemento aMemento) {
	}

	@Override
	public void saveState(IMemento aMemento) {
	}

	@Override
	public String getDescription(Object anElement) {
		//FIXME: need adapter for this
		return getText(anElement);
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		BundleContext bundleContext = bundle.getBundleContext();
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(bundleContext);
		init(serviceContext);
	}

	protected void init(IEclipseContext serviceContext) {
		// TODO Auto-generated method stub
		
	}

}
