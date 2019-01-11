package org.pgcase.xobot.dbproc.antlr.functions;

import org.pgcase.xobot.dbproc.runtime.functions.XFunctionBuilder;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateFunctionStmtContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Createfunc_opt_itemContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_arg_with_defaultContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_returnContext;

public class FunctionHeaderVisitor extends SqlBaseVisitor<CreateFunctionStmtContext> {

	private final XFunctionBuilder builder = new XFunctionBuilder();

	public XFunctionDescriptor getResultFunction() {
		return builder.toFunctionBase();
	}

	@Override
	public CreateFunctionStmtContext visitCreateFunctionStmt(CreateFunctionStmtContext ctx) {
		builder.declareName(ctx.func_name().getText());
		return super.visitCreateFunctionStmt(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitFunc_return(Func_returnContext ctx) {
		builder.declareReturning(ctx.func_type().getText());
		return super.visitFunc_return(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitFunc_arg_with_default(Func_arg_with_defaultContext ctx) {
		builder.addArg(ctx.func_arg().arg_class().getText(), ctx.func_arg().param_name().getText(),
				ctx.func_arg().func_type().getText(), ctx.a_expr() == null ? null : ctx.a_expr().getText());
		return super.visitFunc_arg_with_default(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitCreatefunc_opt_item(Createfunc_opt_itemContext ctx) {
		if (ctx.func_as() == null) {
			builder.addOption(ctx.getPayload().getText());
		}
		return super.visitCreatefunc_opt_item(ctx);
	}

}
