package org.pgcase.xobot.dbproc.antlr;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.pgcase.xobot.dbproc.runtime.XIssueReporter;

public class SyntaxErrorListener extends BaseErrorListener {

	private final XIssueReporter reporter;

	public SyntaxErrorListener(XIssueReporter reporter) {
		this.reporter = reporter;
	}

	@Override
	public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
			final int charPositionInLine, final String msg, final RecognitionException e) {

		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

		if (e != null) {
			final Parser parser = (Parser) recognizer;
			final List<String> stack = parser.getRuleInvocationStack();
			Collections.reverse(stack);
			for (String message : stack) {
				reporter.reportIssue(recognizer, offendingSymbol, message, null);
			}
			String message = String.format("line %d position %d : %s [%s] %s", line, charPositionInLine, msg,
					offendingSymbol.toString(), e.getMessage());
			reporter.reportIssue(recognizer, offendingSymbol, message, e);
		}

	}

}
