package org.pgcase.xobot.runtime.antlr;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.pgcase.xobot.parsers.postgres.SqlLexer;
import org.pgcase.xobot.parsers.postgres.SqlParser;
import org.pgcase.xobot.parsers.postgres.SyntaxErrorListener;
import org.pgcase.xobot.runtime.XTriggerDescriptor;

public class PGTriggerParseHeader {
	public static XTriggerDescriptor parse(InputStream in, List<String> errors) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(in);

		SqlLexer lexer = new SqlLexer(input);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		final SqlParser parser = new SqlParser(tokens);

		final SyntaxErrorListener syntaxError = new SyntaxErrorListener();

		parser.addErrorListener(syntaxError);
		parser.addErrorListener(new DiagnosticErrorListener());

		final ParseTree tree = parser.stmt();

		TriggerHeaderVisitor visitor = new TriggerHeaderVisitor();

		visitor.visit(tree);

		errors.addAll(syntaxError.getErrorMessages());

		return visitor.getResultFunction();

	}
}
