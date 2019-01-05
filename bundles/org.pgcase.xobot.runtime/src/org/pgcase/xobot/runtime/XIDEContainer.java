package org.pgcase.xobot.runtime;

import java.util.Collection;

public interface XIDEContainer extends XIDEItem {
	
  XIDEContainerType getContainerType();	
	
  Collection<XIDEContainer>	getContainers();
	
  Collection<XIDEItem> getItems();
  
}
