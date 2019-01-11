package org.pgcase.xobot.dbproc.runtime.triggers;

public class TriggerBuilder {

	private String object;
	private String name;
	private String actionTime;
	private String event;

	public TriggerBuilder declareName(String name) {
		this.name = name;
		return this;
	}

	public TriggerBuilder declareObject(String object) {
		this.object = object;
		return this;
	}

	public TriggerBuilder declareActionTime(String actionTime) {
		this.actionTime = actionTime;
		return this;
	}

	public TriggerBuilder declareEvent(String event) {
		this.event = event;
		return this;
	}

	public XTriggerDescriptor toTrigger() {
		return new TriggerDescriptorImpl(object, name, actionTime, event);
	}
}
