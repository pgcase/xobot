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
package org.pgcase.xobot.workspace.team.ui.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.mapping.ModelProvider;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.team.core.mapping.ISynchronizationContext;
import org.eclipse.team.ui.mapping.ISynchronizationCompareAdapter;
import org.eclipse.team.ui.mapping.ITeamContentProviderManager;
import org.eclipse.team.ui.synchronize.ISynchronizePageConfiguration;
import org.eclipse.ui.IContributorResourceAdapter;
import org.eclipse.ui.ide.IContributorResourceAdapter2;
import org.eclipse.ui.navigator.*;

public class XobotThirdPartyActionProvider extends CommonActionProvider {

	private Action exampleAction;

	protected final ISynchronizePageConfiguration getSynchronizePageConfiguration() {
		return (ISynchronizePageConfiguration)getExtensionStateModel().getProperty(ITeamContentProviderManager.P_SYNCHRONIZATION_PAGE_CONFIGURATION);
	}

	protected final IExtensionStateModel getExtensionStateModel() {
		return getActionSite().getExtensionStateModel();
	}
	
	protected final ISynchronizationContext getSynchronizationContext() {
		return (ISynchronizationContext)getExtensionStateModel().getProperty(ITeamContentProviderManager.P_SYNCHRONIZATION_CONTEXT);
	}
	
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		exampleAction = new Action("Сообщество") {
			public void run() {
				StringBuffer buffer = new StringBuffer();
				boolean addComma = false;
				IStructuredSelection selection = (IStructuredSelection)getContext().getSelection();
				ResourceMapping[] mappings = getResourceMappings(selection.toArray());
				for (int i = 0; i < mappings.length; i++) {
					ResourceMapping mapping = mappings[i];
					ISynchronizationCompareAdapter adapter = getCompareAdpater(mapping);
					if (adapter != null) {
						String name = adapter.getName(mapping);
						if (addComma) {
							buffer.append(", ");
						}
						buffer.append(name);
						addComma = true;
					}
				}
				MessageDialog.openInformation(getActionSite().getViewSite().getShell(), "Просто Пример", "Вы можете легко добавлять свои акции. Например, над этими объектами: " + buffer.toString());
			}
		};
	}
	
	protected ISynchronizationCompareAdapter getCompareAdpater(ResourceMapping mapping) {
		if (mapping != null) {
			ModelProvider provider = mapping.getModelProvider();
			if (provider != null) {
				Object o = provider.getAdapter(ISynchronizationCompareAdapter.class);
				if (o instanceof ISynchronizationCompareAdapter) {
					return (ISynchronizationCompareAdapter) o;
				}
			}
		}
		return null;
	}

	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		menu.add(exampleAction);
	}

	private ResourceMapping[] getResourceMappings(Object[] objects) {
		List<ResourceMapping> result = new ArrayList<>();
		for (int i = 0; i < objects.length; i++) {
			Object object = objects[i];
			ResourceMapping mapping = getResourceMapping(object);
			if (mapping != null)
				result.add(mapping);
		}
		return (ResourceMapping[]) result.toArray(new ResourceMapping[result.size()]);
	}
	
	private ResourceMapping getResourceMapping(Object o) {
		if (o instanceof ResourceMapping) {
			return (ResourceMapping) o;
		}
		if (o instanceof IAdaptable) {
			IAdaptable adaptable = (IAdaptable) o;
			Object adapted = adaptable.getAdapter(ResourceMapping.class);
			if (adapted instanceof ResourceMapping) {
				return(ResourceMapping) adapted;
			}
			adapted = adaptable.getAdapter(IContributorResourceAdapter.class);
			if (adapted instanceof IContributorResourceAdapter2) {
				IContributorResourceAdapter2 cra = (IContributorResourceAdapter2) adapted;
				return cra.getAdaptedResourceMapping(adaptable);
			}
		} else {
			Object adapted = Platform.getAdapterManager().getAdapter(o, ResourceMapping.class);
			if (adapted instanceof ResourceMapping) {
				return(ResourceMapping) adapted;
			}
		}
		return null;
	}
}
