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
package org.pgcase.xobot.basis.jface;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.osgi.service.component.annotations.Activate;

public abstract class BasicImageService {
	
	private ImageRegistry imageRegistry;
	
	@Activate
	public void activate() {
		imageRegistry = new ImageRegistry();
		registerImages();
	}

	protected abstract void registerImages();

	protected void register(String key, String url) {
		try {
			ImageDescriptor created = ImageDescriptor.createFromURL(new URL(url));
			imageRegistry.put(key, created);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected Image getImage(String identifier) {
		return imageRegistry.get(identifier);
	}

	protected ImageDescriptor getImageDescriptor(String identifier) {
		return imageRegistry.getDescriptor(identifier);
	}

	protected void deactivate() {
		imageRegistry.dispose();
		imageRegistry = null;
	}

}
