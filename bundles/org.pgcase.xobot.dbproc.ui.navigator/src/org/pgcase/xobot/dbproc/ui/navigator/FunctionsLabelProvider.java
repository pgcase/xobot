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
package org.pgcase.xobot.dbproc.ui.navigator;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.pgcase.xobot.basis.ui.navigator.RegistryLabelProvider;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;

public class FunctionsLabelProvider extends RegistryLabelProvider {
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof XProjectFolderDescriptor) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			return images.getImage(ISharedImages.IMG_OBJ_FOLDER);
		}
		if (element instanceof XFunctionDescriptor) {
			ISharedImages images = PlatformUI.getWorkbench().getSharedImages();
			return images.getImage(ISharedImages.IMG_OBJ_FILE);
		}
		return super.getImage(element);
	}
	
	@Override
	public String getText(Object element) {
		if (element instanceof XProjectDescriptor) {
			IResource adapt = Adapters.adapt(element, IResource.class);
			if (adapt != null) {
				return adapt.getName() + ' ' + '('+ adapt.getLocationURI() + ')';
			}
			return super.getText(element);
		}
		if (element instanceof XProjectFolderDescriptor) {
			XProjectFolderDescriptor folder = (XProjectFolderDescriptor) element;
			return folder.getName();
		}
		return super.getText(element);
	}
	
}
