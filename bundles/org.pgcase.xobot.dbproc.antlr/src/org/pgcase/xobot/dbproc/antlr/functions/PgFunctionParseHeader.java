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
package org.pgcase.xobot.dbproc.antlr.functions;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.pgcase.xobot.dbproc.antlr.SyntaxErrorListener;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.functions.FunctionBuilder;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.parsers.postgres.SqlLexer;
import org.pgcase.xobot.parsers.postgres.SqlParser;

public class PgFunctionParseHeader {

	public static XFunctionDescriptor parse(InputStream in, XIssueReporter reporter) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(in);

		SqlLexer lexer = new SqlLexer(input);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		final SqlParser parser = new SqlParser(tokens);

		final SyntaxErrorListener syntaxError = new SyntaxErrorListener(reporter);

		parser.addErrorListener(syntaxError);
		parser.addErrorListener(new DiagnosticErrorListener());

		final ParseTree tree = parser.stmt();

		FunctionHeaderVisitor visitor = new FunctionHeaderVisitor();

		FunctionBuilder builder = visitor.visit(tree);
		return builder.toFunction();
	}

}
