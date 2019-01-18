package org.pgcase.xobot.dbproc.runtime.triggers;

	class TriggerDescriptorImpl implements XTriggerDescriptor {

	private final String object;
	private final String name;
	private final String action;
	private final String events;

	TriggerDescriptorImpl(String object, String name, String action, String events) {
		super();
		this.object = object;
		this.name = name;
		this.action = action;
		this.events = events;
	}

	@Override
	public String getObject() {
		return object;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getAction() {
		return action;
	}

	public String getEvents() {
		return events;
	}

	@Override
	public String toString() {
		return "TriggerDescriptorImpl [object=" + object + ", name=" + name + ", action=" + action + ", events=" + events
				+ "]";
	}

}
