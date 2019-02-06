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
package org.pgcase.xobot.workspace.ui.navigator;

import java.util.stream.StreamSupport;

import org.eclipse.core.runtime.Adapters;
import org.pgcase.xobot.landscape.ui.navigator.TargetsContentProvider;
import org.pgcase.xobot.workspace.runtime.XProjectDescriptor;
import org.pgcase.xobot.workspace.runtime.XProjectTargetDescriptor;

public class ProjectTargetsContentProvider extends TargetsContentProvider {
	
	@Override
	public Object[] getChildren(Object parentElement) {
		XProjectDescriptor adapt = Adapters.adapt(parentElement, XProjectDescriptor.class);
		if (adapt != null) {
			XProjectDescriptor project = (XProjectDescriptor) parentElement;
			Iterable<? extends XProjectTargetDescriptor> targets = project.getProjectTargets();
			return StreamSupport.stream(targets.spliterator(), false).toArray();
		}
		// TODO Auto-generated method stub
		return super.getChildren(parentElement);
	}
	
}
