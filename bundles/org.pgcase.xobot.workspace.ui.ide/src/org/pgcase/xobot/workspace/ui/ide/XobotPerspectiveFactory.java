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
package org.pgcase.xobot.workspace.ui.ide;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewFolderResourceWizard;
import org.pgcase.xobot.landscape.ui.navigator.LandscapeUiNavigator;

public class XobotPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}

	public void defineActions(IPageLayout layout) {
		// Add "new wizards".
		layout.addNewWizardShortcut(XobotUiIde.WIZARD_PROJECT_XOBOT);
		layout.addNewWizardShortcut(BasicNewFolderResourceWizard.WIZARD_ID);
		layout.addNewWizardShortcut(BasicNewFileResourceWizard.WIZARD_ID);

		// Add "show views".
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
		layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROGRESS_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);

		layout.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);
	}

	public void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();

		String explorers = "org.pgcase.xobot.workspace.ui.ide.explorers";
		IFolderLayout explorersFolder = layout.createFolder(explorers, IPageLayout.LEFT, 0.26f, editorArea);
		explorersFolder.addPlaceholder(IPageLayout.ID_BOOKMARKS);

		String outlines = "org.pgcase.xobot.workspace.ui.ide.outlines";
		IFolderLayout outlinesFolder = layout.createFolder(outlines, IPageLayout.BOTTOM, 0.50f, explorers);
		outlinesFolder.addPlaceholder(IPageLayout.ID_OUTLINE);

		String sources = "org.pgcase.xobot.workspace.ui.ide.sources";
		IFolderLayout sourcesFolder = layout.createFolder(sources, IPageLayout.RIGHT, 0.66f, editorArea);
		sourcesFolder.addView(LandscapeUiNavigator.VIEW_SOURCES);

		String targets = "org.pgcase.xobot.workspace.ui.ide.targets";
		IFolderLayout targetsFolder = layout.createFolder(targets, IPageLayout.BOTTOM, 0.50f, sources);
		targetsFolder.addView(LandscapeUiNavigator.VIEW_TARGTETS);

		String messages = "org.pgcase.xobot.workspace.ui.ide.messages";
		IFolderLayout messagesFolder = layout.createFolder(messages, IPageLayout.BOTTOM, 0.66f, editorArea);
		messagesFolder.addView(IPageLayout.ID_PROBLEM_VIEW);
		messagesFolder.addView(IPageLayout.ID_TASK_LIST);

	}
}
