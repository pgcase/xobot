package org.pgcase.xobot.parsers.postgres.trigger;

import org.pgcase.xobot.parsers.postgres.PlPgSqlParser.CreateTrigStmtContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Cursor_nameContext;
import org.pgcase.xobot.parsers.postgres.SqlParser.Cursor_optionsContext;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;

public class TriggerHeaderVisitor extends SqlBaseVisitor<CreateTrigStmtContext> {
	
	private final RawTriggerBuilder builder = new RawTriggerBuilder();
	
	public RawTriggerBase getResultFunction() {
		return  builder.toTriggerBase();
	}

	@Override
	public CreateTrigStmtContext visitCreateTrigStmt(
			org.pgcase.xobot.parsers.postgres.SqlParser.CreateTrigStmtContext ctx) {
		builder.declareObject(ctx.qualified_name().getText());
		builder.declareName(ctx.func_name().getText());
		builder.declareActionTime(ctx.triggerActionTime().getText());
		builder.declareEvent(ctx.triggerEvents().getText());
		return super.visitCreateTrigStmt(ctx);
	}


	
	
}
