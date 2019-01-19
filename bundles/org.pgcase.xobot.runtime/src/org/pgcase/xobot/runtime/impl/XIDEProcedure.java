/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.runtime.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

import org.pgcase.xobot.runtime.XIDEType;

public class XIDEProcedure implements org.pgcase.xobot.runtime.XIDEProcedure {
	
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
