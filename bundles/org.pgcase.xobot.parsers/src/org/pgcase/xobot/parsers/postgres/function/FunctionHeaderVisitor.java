package org.pgcase.xobot.parsers.postgres.function;

import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateFunctionStmtContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Createfunc_opt_itemContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_arg_with_defaultContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Func_returnContext;

public class FunctionHeaderVisitor extends SqlBaseVisitor<CreateFunctionStmtContext> {
	
	private final RawFunction resultFunction = new RawFunction();
	
	public RawFunction getResultFunction() {
		return resultFunction;
	}

	@Override
	public CreateFunctionStmtContext visitCreateFunctionStmt(CreateFunctionStmtContext ctx) {	
		resultFunction.setName(ctx.func_name().getText());
		return super.visitCreateFunctionStmt(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitFunc_return(Func_returnContext ctx) {	
		resultFunction.setReturning(ctx.func_type().getText());
		return super.visitFunc_return(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitFunc_arg_with_default(Func_arg_with_defaultContext ctx) {		
		resultFunction.getArgs().add(new RawArgument(ctx.func_arg().arg_class().getText(), 
				ctx.func_arg().param_name().getText(), ctx.func_arg().func_type().getText(), ctx.a_expr() == null ? null : ctx.a_expr().getText()));
		return super.visitFunc_arg_with_default(ctx);
	}

	@Override
	public CreateFunctionStmtContext visitCreatefunc_opt_item(Createfunc_opt_itemContext ctx) {
		if (ctx.func_as() == null)
			resultFunction.getOptions().add(ctx.getPayload().getText());
		return super.visitCreatefunc_opt_item(ctx);
	}

}

