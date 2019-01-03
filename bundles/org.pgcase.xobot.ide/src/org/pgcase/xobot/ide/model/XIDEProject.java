package org.pgcase.xobot.ide.model;

import java.util.Map;

public interface XIDEProject {
	
  String getName();
  
  XIDESource getSource();
  
  Map<String,XIDEToolchain> getToolcahins();
  
  boolean activateToolchain(String name);
}
