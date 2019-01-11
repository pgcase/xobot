package org.pgcase.xobot.runtime.antlr.triggers;

import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;
import org.pgcase.xobot.parsers.postgres.SqlParser.CreateTrigStmtContext;
import org.pgcase.xobot.runtime.triggers.XTriggerBuilder;

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
