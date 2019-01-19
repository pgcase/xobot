/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
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
package org.pgcase.xobot.dbproc.antlr.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.pgcase.xobot.dbproc.antlr.triggers.PgTriggerParseHeader;
import org.pgcase.xobot.dbproc.runtime.triggers.XTriggerDescriptor;

@SuppressWarnings("nls")
class SimpleTriggerTest {

	private static final String SIMPLE_TRIGGER = "sql/simple_trigger.sql"; //$NON-NLS-1$

	
	@Test
	void testTrigger() throws IOException {
		FileInputStream in = new FileInputStream(SIMPLE_TRIGGER);
		XTriggerDescriptor pg_trigger_header = PgTriggerParseHeader.parse(in, new SystemIssueReporter());
		assertEquals("perform_d",pg_trigger_header.getName(),"Incorrect trigger name");
		assertEquals("tbl2",pg_trigger_header.getObject(),"Incorrect trigger table");
		assertEquals("after",pg_trigger_header.getAction(),"Incorrect trigger action");
        //System.out.println(pg_trigger_header);
	}

}
