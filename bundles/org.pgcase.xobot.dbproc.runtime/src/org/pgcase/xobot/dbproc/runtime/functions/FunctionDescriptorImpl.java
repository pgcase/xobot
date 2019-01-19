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
package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.List;

import org.pgcase.xobot.dbproc.runtime.XArgumentDescriptor;

public class FunctionDescriptorImpl implements XFunctionDescriptor {

	private final List<ArgumentDescriptorImpl> args;

	private final List<String> options;

	private final String name;

	private final String returning;

	public FunctionDescriptorImpl(List<ArgumentDescriptorImpl> args, List<String> options, String name, String returning) {
		this.args = args;
		this.options = options;
		this.name = name;
		this.returning = returning;
	}

	public int getArgumentsCount() {
		return args.size();
	}

	public XArgumentDescriptor getArgument(int i) {
		return args.get(i);
	}

	public int getOptionsSize() {
		return options.size();
	}

	public String getOption(int i) {
		return options.get(i);
	}

	public String getName() {
		return name;
	}

	public String getReturns() {
		return returning;
	}

	@Override
	public String toString() {
		return "XFunctionDescriptor [name=" + name + ", returning=" + returning + ", args=" + args + ", options=" + options
				+ "]";
	}

}
