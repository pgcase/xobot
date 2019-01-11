package org.pgcase.xobot.runtime.antlr;

import org.pgcase.xobot.parsers.postgres.PlPgSqlParser.CreateTrigStmtContext;
import org.pgcase.xobot.runtime.XTriggerDescriptor;
import org.pgcase.xobot.runtime.XTriggerBuilder;
import org.pgcase.xobot.parsers.postgres.SqlBaseVisitor;

public class TriggerHeaderVisitor extends SqlBaseVisitor<CreateTrigStmtContext> {

	private final XTriggerBuilder builder = new XTriggerBuilder();

	public XTriggerDescriptor getResultFunction() {
		return builder.toTriggerBase();
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
