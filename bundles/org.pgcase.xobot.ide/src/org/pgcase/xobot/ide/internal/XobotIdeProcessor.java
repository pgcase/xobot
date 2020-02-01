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
package org.pgcase.xobot.ide.internal;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

public class XobotIdeProcessor {

	@Inject
	private MApplication application;

	public XobotIdeProcessor() {
	}
	
	@Execute
	public void execute() {
		MWindow window = application.getChildren().get(0);
		window.setLabel(XobotIdeInternalMessages.getString("XobotIdeProcessor.application_title")); //$NON-NLS-1$
		window.setIconURI("platform:/plugin/org.pgcase.xobot.ide/images/xobot32.png"); //$NON-NLS-1$
	}

}
