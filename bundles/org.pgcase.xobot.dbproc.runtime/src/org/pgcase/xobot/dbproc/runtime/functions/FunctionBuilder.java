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
package org.pgcase.xobot.dbproc.runtime.functions;

import java.util.ArrayList;
import java.util.List;

public class FunctionBuilder {

	private final List<ArgumentDescriptorImpl> args = new ArrayList<>();

	private final List<String> options = new ArrayList<>(2);

	private String name;

	private String returning;

	public FunctionBuilder declareName(String name) {

		this.name = name;

		return this;

	}

	public FunctionBuilder declareReturning(String returning) {

		this.returning = returning;

		return this;

	}

	public FunctionBuilder addArg(String argClass, String argName, String argType, String argDefault) {

		this.args.add(new ArgumentDescriptorImpl(argClass, argName, argType, argDefault));

		return this;

	}

	public FunctionBuilder addOption(String option) {

		this.options.add(option);

		return this;

	}

	public XFunctionDescriptor toFunction() {
		return new FunctionDescriptorImpl(args, options, name, returning);
	}

}
