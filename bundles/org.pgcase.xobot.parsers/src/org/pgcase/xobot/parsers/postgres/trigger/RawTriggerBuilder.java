package org.pgcase.xobot.parsers.postgres.trigger;

public class RawTriggerBuilder {
	
	private String object;
	private String name;
	private String actionTime;
	private String event;
	
	public RawTriggerBuilder declareName(String name) {
		this.name = name;
		return this;
	}
	
	public RawTriggerBuilder declareObject(String object) {
		this.object = object;
		return this;
	}


	public RawTriggerBuilder declareActionTime(String actionTime) {
		this.actionTime = actionTime;
		return this;
	}
	
	public RawTriggerBuilder declareEvent(String event) {
		this.event = event;
		return this;
	}
	

	public RawTriggerBase toTriggerBase() {
		return new RawTriggerBaseImpl(object, name, actionTime, event); 
	}
}
