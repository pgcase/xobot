package org.pgcase.xobot.parsers.postgres.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxErrorListener extends BaseErrorListener {
	
	private final List<String> errorMessages = new ArrayList<>();
	
	
	public List<String> getErrorMessages() {
		return errorMessages;
	}

	@Override
	    public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
	            final int charPositionInLine, final String msg, final RecognitionException e) {

	        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

	        if (e != null) {
	            final Parser parser = (Parser) recognizer;
	            final List<String> stack = parser.getRuleInvocationStack();
	            Collections.reverse(stack);
	            
	            errorMessages.addAll(stack);
	            
	            errorMessages.add(String.format("line %d position %d : %s [%s] %s",line,charPositionInLine, msg, offendingSymbol.toString(), e.getMessage()));

	        }

	    }

	
}
