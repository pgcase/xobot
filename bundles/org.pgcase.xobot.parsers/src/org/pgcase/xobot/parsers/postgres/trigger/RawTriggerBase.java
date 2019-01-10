package org.pgcase.xobot.parsers.postgres.trigger;


public interface RawTriggerBase {
	
 String getObject();
 String getName();
 String getAction();
 String getEvents();
 
}
