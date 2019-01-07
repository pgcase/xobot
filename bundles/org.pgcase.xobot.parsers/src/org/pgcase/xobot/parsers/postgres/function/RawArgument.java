package org.pgcase.xobot.parsers.postgres.function;

public class RawArgument {
	
  private final String argClass;
  private final String argType;
  private final String argName;
  private final String argDefault;
  
public RawArgument(String argClass, String argName, String argType, String argDefault) {
	super();
	this.argClass = argClass;
	this.argName = argName;
	this.argType = argType;
	this.argDefault = argDefault;
}

public String getArgClass() {
	return argClass;
}

public String getArgType() {
	return argType;
}

public String getArgName() {
	return argName;
}

public String getArgDefault() {
	return argDefault;
}

@Override
public String toString() {
	return "Function Argument [argClass=" + argClass + ", argType=" + argType + ", argName=" + argName + ", argDefault="
			+ argDefault + "]";
}
  

  
}
