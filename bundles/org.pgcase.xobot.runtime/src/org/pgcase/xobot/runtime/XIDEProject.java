package org.pgcase.xobot.runtime;

import java.util.Map;

public interface XIDEProject {
	
  String getName();
  
  XIDESource getSource();
  
  Map<String,XIDEToolchain> getToolcahins();
  
  boolean activateToolchain(String name);
}
