package org.pgcase.xobot.dbproc.runtime.triggers;

public class XTriggerBuilder {

	private String object;
	private String name;
	private String actionTime;
	private String event;

	public XTriggerBuilder declareName(String name) {
		this.name = name;
		return this;
	}

	public XTriggerBuilder declareObject(String object) {
		this.object = object;
		return this;
	}

	public XTriggerBuilder declareActionTime(String actionTime) {
		this.actionTime = actionTime;
		return this;
	}

	public XTriggerBuilder declareEvent(String event) {
		this.event = event;
		return this;
	}

	public XTriggerDescriptor toXTrigger() {
		return new XTriggerDescriptorImpl(object, name, actionTime, event);
	}
}
