package org.pgcase.xobot.parsers.postgres.function;

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

public class PGFunctionParseHeader {

	public static RawFunctionBase parse(InputStream in, List<String> errors) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(in);

		SqlLexer lexer = new SqlLexer(input);

		final CommonTokenStream tokens = new CommonTokenStream(lexer);

		final SqlParser parser = new SqlParser(tokens);

		final SyntaxErrorListener syntaxError = new SyntaxErrorListener();

		parser.addErrorListener(syntaxError);
		parser.addErrorListener(new DiagnosticErrorListener());

		final ParseTree tree = parser.stmt();

		FunctionHeaderVisitor visitor = new FunctionHeaderVisitor();

		visitor.visit(tree);

		errors.addAll(syntaxError.getErrorMessages());

		return visitor.getResultFunction();

	}

}
