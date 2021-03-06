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
package org.pgcase.xobot.landscape.runtime.registry;

import org.pgcase.xobot.basis.runtime.registry.BasisRegistry;
import org.pgcase.xobot.landscape.runtime.XTargetDescriptor;
import org.pgcase.xobot.landscape.runtime.XTargetSetDescriptor;

public interface XTargetRegistry extends BasisRegistry<XTargetSetDescriptor> {
	
	Iterable<? extends XTargetSetDescriptor> getTargetSets();

	Iterable<? extends XTargetDescriptor> getTargets();

	XTargetDescriptor getTarget(String targetIdentifier);

	void registerTargetSet(XTargetSetDescriptor targetSet);

	void unregisterTargetSet(String targetSetIdentifier);

	void registerTarget(XTargetDescriptor target);

	void unregisterTarget(String targetIdentifier);


}
