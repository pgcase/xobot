package org.pgcase.xobot.parsers.postgres.function;

public interface RawFunctionDeclaration<T> {

	int getArgsCount();

	T getArg(int i);

	int getOptionsSize();

	String getOption(int i);

}
