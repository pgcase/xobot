package org.pgcase.xobot.dbproc.ui.navigator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.pgcase.xobot.basis.ui.navigator.RegistryActionProvider;

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
public class FunctionsActionProvider extends RegistryActionProvider {

	private IAction openAction;

	@Override
	protected void makeActions(ICommonActionExtensionSite aSite) {
		openAction = createOpenAction(getActionSite());
		// TODO Auto-generated method stub
		super.makeActions(aSite);
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, openAction);
		// TODO Auto-generated method stub
		super.fillActionBars(actionBars);
	}

	protected Action createOpenAction(ICommonActionExtensionSite aSite) {
		Action action = new Action() {
			@Override
			public void run() {
				StructuredViewer structuredViewer = getActionSite().getStructuredViewer();
				ISelection selection = structuredViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection new_name = (IStructuredSelection) selection;
					((IStructuredSelection) selection).getFirstElement();
				}
				structuredViewer.refresh();
			}
		};
		action.setText(DBProcUINavigatorMessages.FunctionsActionProvider_action_open_title);
		return action;
	}

}
