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
package org.pgcase.xobot.dbproc.runtime.triggers;

public class TriggerBuilder {

	private String object;
	private String name;
	private String actionTime;
	private String event;

	public TriggerBuilder declareName(String name) {
		this.name = name;
		return this;
	}

	public TriggerBuilder declareObject(String object) {
		this.object = object;
		return this;
	}

	public TriggerBuilder declareActionTime(String actionTime) {
		this.actionTime = actionTime;
		return this;
	}

	public TriggerBuilder declareEvent(String event) {
		this.event = event;
		return this;
	}

	public XTriggerDescriptor toTrigger() {
		return new TriggerDescriptorImpl(object, name, actionTime, event);
	}
}
