package org.pgcase.xobot.ide.elemets;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import org.pgcase.xobot.ide.model.XIDEType;

public class XIDEProcedure implements org.pgcase.xobot.ide.model.XIDEProcedure {
	
	private final String name;
	
	private final String body;
	
	private final boolean isFunction;
	
	private final String owner;
	
	private final String header;
	
	private final UUID ID = UUID.randomUUID();

	public XIDEProcedure(String name, String body, String header, String owner, boolean isFunction) {
		super();
		this.name = name;
		this.body = body;
		this.header = header;
		this.owner = owner;
		this.isFunction = isFunction;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getOwner() {
		return name;
	}

	@Override
	public String getQName() {
		return owner+"."+name;
	}

	@Override
	public UUID getID() {
		return ID;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BigInteger snapshot() {
		// TODO Auto-generated method stub
		return BigInteger.ZERO;
	}

	@Override
	public List<BigInteger> localHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHeader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasReturnValue() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public XIDEType getReturnType() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
