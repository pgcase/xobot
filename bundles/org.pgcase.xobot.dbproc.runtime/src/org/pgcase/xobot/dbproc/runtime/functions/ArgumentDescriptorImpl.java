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
package org.pgcase.xobot.dbproc.runtime.functions;

import org.pgcase.xobot.dbproc.runtime.XArgumentDescriptor;

public class ArgumentDescriptorImpl implements XArgumentDescriptor {

	private final String argClass;
	private final String argType;
	private final String argName;
	private final String argDefault;

	public ArgumentDescriptorImpl(String argClass, String argName, String argType, String argDefault) {
		super();
		this.argClass = argClass;
		this.argName = argName;
		this.argType = argType;
		this.argDefault = argDefault;
	}

	@Override
	public String getArgumentClass() {
		return argClass;
	}

	@Override
	public String getArgumentType() {
		return argType;
	}

	@Override
	public String getName() {
		return argName;
	}

	@Override
	public String getDefaultValue() {
		return argDefault;
	}

	@Override
	public String toString() {
		return "Function Argument [argClass=" + argClass + ", argType=" + argType + ", argName=" + argName //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ ", argDefault=" + argDefault + "]";  //$NON-NLS-1$//$NON-NLS-2$
	}

}
