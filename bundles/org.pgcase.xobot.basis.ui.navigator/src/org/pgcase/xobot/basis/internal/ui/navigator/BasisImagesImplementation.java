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
package org.pgcase.xobot.basis.internal.ui.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.pgcase.xobot.basis.jface.BasicImageService;
import org.pgcase.xobot.basis.jface.BasisImages;

@Component
public class BasisImagesImplementation extends BasicImageService implements BasisImages {

	@Activate
	@Override
	public void activate() {
		super.activate();
	}
	
	@Deactivate
	@Override
	public void deactivate() {
		super.deactivate();
	}

	@Override
	public Image getDefaultImage() {
		return getImage(IMG_DEFAULT);
	}

	@Override
	public ImageDescriptor getDefaultImageDescriptor() {
		return getImageDescriptor(IMG_DEFAULT);
	}

	@Override
	protected void registerImages() {
		register(IMG_DEFAULT, "platform:/plugin/org.pgcase.xobot.e3/images/xobot16.png"); //$NON-NLS-1$
	}

}
