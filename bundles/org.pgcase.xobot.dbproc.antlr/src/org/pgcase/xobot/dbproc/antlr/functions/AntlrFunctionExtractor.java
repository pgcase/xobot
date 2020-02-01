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
package org.pgcase.xobot.dbproc.antlr.functions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.pgcase.xobot.dbproc.antlr.DbprocAntlrMessages;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionExtractor;

public class AntlrFunctionExtractor implements XFunctionExtractor {

	@Override
	public Iterable<XFunctionDescriptor> extractFunctions(Object input, Map<String, Object> context, XIssueReporter reporter) {
		if (input instanceof InputStream) {
			InputStream inputStream = (InputStream) input;
			try {
				XFunctionDescriptor parsed = PgFunctionParseHeader.parse(inputStream, reporter);
				return Collections.singletonList(parsed);
			} catch (IOException e) {
				String message = String.format(DbprocAntlrMessages.getString("AntlrFunctionExtractor.error.input.processing.failure"), context); //$NON-NLS-1$
				reporter.reportIssue(this, input, message, e);
			}
		}
		return Collections.emptyList();
	}

}
