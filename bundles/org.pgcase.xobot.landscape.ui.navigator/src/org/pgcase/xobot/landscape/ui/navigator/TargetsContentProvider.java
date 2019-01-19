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
package org.pgcase.xobot.landscape.ui.navigator;

import java.util.stream.StreamSupport;

import org.pgcase.xobot.basis.ui.navigator.RegistryContentProvider;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;
import org.pgcase.xobot.landscape.runtime.registry.XTargetRegistry;

public class TargetsContentProvider extends RegistryContentProvider<XTargetRegistry> {

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof XTargetRegistry) {
			XTargetRegistry registry = (XTargetRegistry) parentElement;
			Iterable<XTargetSetDescriptor> sets = registry.getTargetSets();
			return StreamSupport.stream(sets.spliterator(), false).toArray();
		}
		if (parentElement instanceof XTargetSetDescriptor) {
			XTargetSetDescriptor set = (XTargetSetDescriptor) parentElement;
			Iterable<? extends XTargetDescriptor> targets = set.getTargets();
			return StreamSupport.stream(targets.spliterator(), false).toArray();
		}
		return NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof XTargetDescriptor) {
			XTargetDescriptor target = (XTargetDescriptor) element;
			return target.getTargetSet();
		}
		if (element instanceof XTargetSetDescriptor) {
			return getRegistry();
		}
		return null;
	}

	@Override
	protected Class<XTargetRegistry> getRegistryClass() {
		return XTargetRegistry.class;
	}

}
