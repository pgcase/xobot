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
package org.pgcase.xobot.dbproc.antlr.functions;

import org.pgcase.xobot.dbproc.runtime.functions.FunctionBuilder;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateFunctionStmtContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Createfunc_opt_itemContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_arg_with_defaultContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_returnContext;

public class FunctionHeaderVisitor extends SqlBaseVisitor<FunctionBuilder> {

	private final FunctionBuilder builder = new FunctionBuilder();

	@Override
	public FunctionBuilder visitCreateFunctionStmt(CreateFunctionStmtContext ctx) {
		builder.declareName(ctx.func_name().getText());
		return super.visitCreateFunctionStmt(ctx);
	}

	@Override
	public FunctionBuilder visitFunc_return(Func_returnContext ctx) {
		builder.declareReturning(ctx.func_type().getText());
		return super.visitFunc_return(ctx);
	}

	@Override
	public FunctionBuilder visitFunc_arg_with_default(Func_arg_with_defaultContext ctx) {
		builder.addArg(ctx.func_arg().arg_class().getText(), ctx.func_arg().param_name().getText(),
				ctx.func_arg().func_type().getText(), ctx.a_expr() == null ? null : ctx.a_expr().getText());
		return super.visitFunc_arg_with_default(ctx);
	}

	@Override
	public FunctionBuilder visitCreatefunc_opt_item(Createfunc_opt_itemContext ctx) {
		if (ctx.func_as() == null) {
			builder.addOption(ctx.getPayload().getText());
		}
		return super.visitCreatefunc_opt_item(ctx);
	}
	
	@Override
	protected FunctionBuilder defaultResult() {
		return builder;
	}

}
