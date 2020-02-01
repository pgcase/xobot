/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
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
package org.pgcase.xobot.basis.jface;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.wizard.WizardPage;

public class WizardPages {
	
	public static void updatePage(WizardPage page, IStatus result) {
		int severity = result.getSeverity();
		switch (severity) {
		case IStatus.ERROR:
			updatePageError(page, result);
			break;
		case IStatus.WARNING:
			updatePageWarning(page, result);
			break;
		case IStatus.INFO:
			updatePageInfo(page, result);
			break;
		case IStatus.OK:
			updatePageOk(page, result);
			break;
		default:
			updatePageError(page, result);
			break;
		}
	}

	private static void updatePageError(WizardPage page, IStatus result) {
		String message = result.getMessage();
		page.setErrorMessage(message);
		page.setPageComplete(false);
	}

	private static void updatePageWarning(WizardPage page, IStatus result) {
		page.setErrorMessage(null);
		page.setMessage(result.getMessage(), IMessageProvider.WARNING);
		page.setPageComplete(true);
	}

	private static void updatePageInfo(WizardPage page, IStatus result) {
		page.setErrorMessage(null);
		page.setMessage(result.getMessage(), IMessageProvider.INFORMATION);
		page.setPageComplete(true);
	}

	private static void updatePageOk(WizardPage page, IStatus result) {
		page.setErrorMessage(null);
		page.setMessage(result.getMessage());
		page.setPageComplete(true);
	}

}
