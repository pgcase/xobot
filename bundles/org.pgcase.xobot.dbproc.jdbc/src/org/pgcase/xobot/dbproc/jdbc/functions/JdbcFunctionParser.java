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
package org.pgcase.xobot.dbproc.jdbc.functions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.FunctionBuilder;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

public class JdbcFunctionParser {

	private JdbcFunctionParser() {
		// block
	}

	public static XFunctionDescriptor parse(Connection jdbcConnection, ResultSet resultSet, XIssueReporter reporter)
			throws SQLException {
		FunctionBuilder builder = new FunctionBuilder();
		builder //
				.declareName(resultSet.getString("pro_name")) //$NON-NLS-1$
				.declareReturning(resultSet.getString("pro_return")); //$NON-NLS-1$

		return builder.toFunction();
	}

}
