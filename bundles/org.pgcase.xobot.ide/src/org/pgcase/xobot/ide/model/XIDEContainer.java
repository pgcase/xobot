package org.pgcase.xobot.ide.model;

import java.util.Collection;

public interface XIDEContainer extends XIDEItem {
	
  XIDEContainerType getContainerType();	
	
  Collection<XIDEContainer>	getContainers();
	
  Collection<XIDEItem> getItems();
  
}
