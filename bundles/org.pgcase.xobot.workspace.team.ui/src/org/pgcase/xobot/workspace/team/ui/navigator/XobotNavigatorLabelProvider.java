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
package org.pgcase.xobot.workspace.team.ui.navigator;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class XobotNavigatorLabelProvider extends WorkbenchLabelProvider implements
		ICommonLabelProvider {

	private ICommonContentExtensionSite extensionSite;

	public void init(ICommonContentExtensionSite aConfig) {
		extensionSite = aConfig;
	}

	public void restoreState(IMemento aMemento) {
		// Nothing to do
	}

	public void saveState(IMemento aMemento) {
		// Nothing to do
	}

	public String getDescription(Object anElement) {
		if (anElement instanceof XWorkspaceElementDescriptor) {
			return ((XWorkspaceElementDescriptor) anElement).getPath();
		}
		return null;
	}

	public ICommonContentExtensionSite getExtensionSite() {
		return extensionSite;
	}

}
