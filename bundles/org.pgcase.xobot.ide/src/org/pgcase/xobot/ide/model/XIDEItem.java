package org.pgcase.xobot.ide.model;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

public interface XIDEItem {
	
 String getName();
 
 String getOwner();
 
 String getQName();
 
 UUID getID();
 
 boolean update();
 
 BigInteger snapshot();
 
 List<BigInteger> localHistory();
}
