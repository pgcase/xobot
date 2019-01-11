package org.pgcase.xobot.parsers.postgres.trigger;

public class RawTriggerBaseImpl implements RawTriggerBase {

	private final String object;
	private final String name;
	private final String action;
	private final String events;

	public RawTriggerBaseImpl(String object, String name, String action, String events) {
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
		return "RawTriggerBaseImpl [object=" + object + ", name=" + name + ", action=" + action + ", events=" + events
				+ "]";
	}

}
