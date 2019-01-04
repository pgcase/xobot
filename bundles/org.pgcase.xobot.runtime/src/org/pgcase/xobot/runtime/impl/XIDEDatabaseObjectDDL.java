package org.pgcase.xobot.runtime.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

public class XIDEDatabaseObjectDDL implements org.pgcase.xobot.runtime.XIDEDatabaseObjectDDL {
	
	private final String name;
	
	private final String body;
	
	private final UUID ID = UUID.randomUUID();

	public XIDEDatabaseObjectDDL(String name, String body) {
		super();
		this.name = name;
		this.body = body;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public UUID getID() {
		return ID;
	}

	@Override
	public String getBody() {
		return body;
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BigInteger snapshot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BigInteger> localHistory() {
		// TODO Auto-generated method stub
		return null;
	}

}
