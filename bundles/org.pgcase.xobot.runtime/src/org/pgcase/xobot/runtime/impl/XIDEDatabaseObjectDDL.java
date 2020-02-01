/*******************************************************************************
 * Copyright (c) 2019-2020 ArSysOp
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
