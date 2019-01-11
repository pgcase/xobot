package org.pgcase.xobot.dbproc.antlr.triggers;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.pgcase.xobot.dbproc.antlr.SyntaxErrorListener;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;
import org.pgcase.xobot.dbproc.runtime.triggers.TriggerBuilder;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;
import org.pgcase.xobot.parsers.postgres.SqlLexer;
import org.pgcase.xobot.parsers.postgres.SqlParser;

public class PgTriggerParseHeader {
	public static XTriggerDescriptor parse(InputStream in, XIssueReporter reporter) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(in);

		SqlLexer lexer = new SqlLexer(input);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		final SqlParser parser = new SqlParser(tokens);

		final SyntaxErrorListener syntaxError = new SyntaxErrorListener(reporter);

		parser.addErrorListener(syntaxError);
		parser.addErrorListener(new DiagnosticErrorListener());

		final ParseTree tree = parser.stmt();

		TriggerHeaderVisitor visitor = new TriggerHeaderVisitor();

		TriggerBuilder builder = visitor.visit(tree);
		return builder.toTrigger();

	}
}
