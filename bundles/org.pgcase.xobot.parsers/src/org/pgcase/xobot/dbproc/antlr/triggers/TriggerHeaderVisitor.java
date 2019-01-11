package org.pgcase.xobot.dbproc.antlr.triggers;

import org.pgcase.xobot.dbproc.runtime.triggers.TriggerBuilder;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateTrigStmtContext;

public class TriggerHeaderVisitor extends SqlBaseVisitor<TriggerBuilder> {

	private final TriggerBuilder builder = new TriggerBuilder();

	@Override
	public TriggerBuilder visitCreateTrigStmt(CreateTrigStmtContext ctx) {
		builder.declareObject(ctx.qualified_name().getText());
		builder.declareName(ctx.func_name().getText());
		builder.declareActionTime(ctx.triggerActionTime().getText());
		builder.declareEvent(ctx.triggerEvents().getText());
		return super.visitCreateTrigStmt(ctx);
	}
	
	@Override
	protected TriggerBuilder defaultResult() {
		return builder;
	}

}
