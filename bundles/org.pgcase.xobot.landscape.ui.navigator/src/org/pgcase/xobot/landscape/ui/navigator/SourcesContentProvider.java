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
package org.pgcase.xobot.landscape.ui.navigator;

import java.util.stream.StreamSupport;

import org.pgcase.xobot.basis.runtime.BasisEvents;
import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;
import org.pgcase.xobot.landscape.runtime.XSourceSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XSourceRegistry;

public class SourcesContentProvider extends RegistryContentProvider<XSourceRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XSourceSetDescriptor) {
			XSourceSetDescriptor set = (XSourceSetDescriptor) parentElement;
			Iterable<? extends XSourceDescriptor> sources = set.getSources();
			return StreamSupport.stream(sources.spliterator(), false).toArray();
		}
		if (parentElement instanceof XSourceRegistry) {
			XSourceRegistry registry = (XSourceRegistry) parentElement;
			Iterable<? extends XSourceSetDescriptor> sets = registry.getRegistryContent();
			return StreamSupport.stream(sets.spliterator(), false).toArray();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XSourceDescriptor) {
			XSourceDescriptor source = (XSourceDescriptor) element;
			return source.getSourceSet();
		}
		if (element instanceof XSourceSetDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XSourceRegistry> getRegistryClass() {
		return XSourceRegistry.class;
	}

	@Override
	protected String getTopic() {
		// TODO Auto-generated method stub
		return BasisEvents.ALL_SUB_TOPICS;
	}
	
}
