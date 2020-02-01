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
package org.pgcase.xobot.dbproc.runtime.triggers;

class TriggerDescriptorImpl implements XTriggerDescriptor {

	private final String object;
	private final String name;
	private final String action;
	private final String events;

	TriggerDescriptorImpl(String object, String name, String action, String events) {
		super();
		this.object = object;
		this.name = name;
		this.action = action;
		this.events = events;
	}

	@Override
	public String getObject() {
		return object;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getAction() {
		return action;
	}

	public String getEvents() {
		return events;
	}

	@Override
	public String toString() {
		return "TriggerDescriptorImpl [object=" + object + ", name=" + name + ", action=" + action + ", events=" + events //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				+ "]"; //$NON-NLS-1$
	}

}
