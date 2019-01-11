package org.pgcase.xobot.dbproc.antlr.triggers;

import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerBuilder;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateTrigStmtContext;

public class TriggerHeaderVisitor extends SqlBaseVisitor<XTriggerBuilder> {

	private final XTriggerBuilder builder = new XTriggerBuilder();

	@Override
	public XTriggerBuilder visitCreateTrigStmt(CreateTrigStmtContext ctx) {
		builder.declareObject(ctx.qualified_name().getText());
		builder.declareName(ctx.func_name().getText());
		builder.declareActionTime(ctx.triggerActionTime().getText());
		builder.declareEvent(ctx.triggerEvents().getText());
		return super.visitCreateTrigStmt(ctx);
	}
	
	@Override
	protected XTriggerBuilder defaultResult() {
		return builder;
	}

}
