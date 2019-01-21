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
package org.pgcase.xobot.workspace.team.ui.navigator;

import java.io.ByteArrayInputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.SaveablesProvider;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.core.resources.XFunctionDefinitionIndex;
import org.pgcase.xobot.workspace.runtime.XProjectFolderDescriptor;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

//FIXME: move to non-team bundle
public class XobotNavigatorActionProvider extends CommonActionProvider {

	private Action newFunctionIndexAction;
	private Action newFolderAction;
	private Action newFunctionBodyAction;
	private Action deleteAction;
	private Action makeDirty;

	public XobotNavigatorActionProvider() {
		super();
	}
	
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		createActions();
	}

	private void createActions() {
		deleteAction = new Action("Delete") {
			public void run() {
				IStructuredSelection selection = (IStructuredSelection)getContext().getSelection();
				try {
					for (Iterator iter = selection.iterator(); iter.hasNext();) {
						Object object = iter.next();
						if (object instanceof XWorkspaceElementDescriptor) {
							XWorkspaceElementDescriptor element = (XWorkspaceElementDescriptor) object;
							//FIXME: progress
							WorkspaceCoreResources.geWorkspaceElementService().delete(element, new NullProgressMonitor());
						}
					}
				} catch (CoreException e) {
					ErrorDialog.openError(getShell(), null, null, e.getStatus());
				}
			}
		};
		newFolderAction = new Action("Create Folder") {
			public void run() {
				IContainer container = getSelectedContainer();
				if (container != null) {
					String name = promptForName();
					if (name == null)
						return;
					IFolder folder = container.getFolder(new Path(name));
					try {
						folder.create(false, true, null);
					} catch (CoreException e) {
						ErrorDialog.openError(getShell(), null, null, e.getStatus());
					}
				}
			}

			private String promptForName() {
				InputDialog dialog = new InputDialog(getShell(), "Enter Name", "Enter the name of the new folder", "New Folder", null);
				int result = dialog.open();
				if (result == Window.OK) {
					return dialog.getValue();
				}
				return null;
			}
		};
		newFunctionIndexAction = new Action("Create Function Index") {
			public void run() {
				IContainer container = getSelectedContainer();
				if (container != null) {
					String name = promptForName();
					if (name == null)
						return;
					String suffix = "." + WorkspaceCoreResources.FUNCTION_DEFINITION_INDEX_EXTENSION;
					if (!name.endsWith(suffix)) {
						name += suffix;
					}
					IFile file = container.getFile(new Path(name));
					try {
						file.create(new ByteArrayInputStream("".getBytes()), false, null);
					} catch (CoreException e) {
						ErrorDialog.openError(getShell(), null, null, e.getStatus());
					}
				}
			}

			private String promptForName() {
				InputDialog dialog = new InputDialog(getShell(), "Enter Name", "Enter the name of the new function index", "New Function Index", null);
				int result = dialog.open();
				if (result == Window.OK) {
					return dialog.getValue();
				}
				return null;
			}
		};
		newFunctionBodyAction = new Action("Create Function Body") {
			public void run() {
				XFunctionDefinitionIndex functionIndex = getSelectedFunctionFile();
				if (functionIndex != null) {
					String path = promptForPath(functionIndex.getProjectFolder());
					if (path == null) {
						return;
					}
					String suffix = "." + WorkspaceCoreResources.FUNCTION_DEFINITION_BODY_EXTENSION;
					if (!path.endsWith(suffix)) {
						path += suffix;
					}
					XProjectFolderDescriptor parent = functionIndex.getProjectFolder();
					IResource resource = Adapters.adapt(parent, IResource.class);
					if (resource instanceof IContainer) {
						IContainer container = (IContainer) resource;
						IFile file = container.getFile(new Path(path));
						try {
							file.create(new ByteArrayInputStream("".getBytes()), false, null);
							functionIndex.addBody(file);
						} catch (CoreException e) {
							ErrorDialog.openError(getShell(), null, null, e.getStatus());
						}
					} else {
						//FIXME: error
					}
				}
			}

			private String promptForPath(XProjectFolderDescriptor parent) {
				InputDialog dialog = new InputDialog(getShell(), "Enter Path", "Enter the path of the new function body relative to " + parent.getPath(), "New Function Body", null);
				int result = dialog.open();
				if (result == Window.OK) {
					return dialog.getValue();
				}
				return null;
			}
		};
		makeDirty = new Action("Make Dirty") {
			public void run() {
				IStructuredSelection selection = (IStructuredSelection)getContext().getSelection();
				for (Iterator iter = selection.iterator(); iter.hasNext();) {
					Object element = iter.next();
					if (element instanceof XFunctionDefinitionIndex) {
						XFunctionDefinitionIndex mo = (XFunctionDefinitionIndex) element;
						XobotSaveablesProvider provider = getSaveablesProvider();
						provider.makeDirty(mo);
					}
				}
			}

			private XobotSaveablesProvider getSaveablesProvider() {
				ITreeContentProvider provider = getActionSite().getContentService().getContentExtensionById("org.eclipse.team.examples.model.navigator").getContentProvider();
				return (XobotSaveablesProvider)Adapters.adapt(provider, SaveablesProvider.class);
			}
		};
	}
	
	protected Shell getShell() {
		return getActionSite().getViewSite().getShell();
	}

	public void fillContextMenu(IMenuManager menu) {
		super.fillContextMenu(menu);
		menu.add(deleteAction);
		IContainer container = getSelectedContainer();
		if (container != null) {
			menu.add(newFolderAction);
			menu.add(newFunctionIndexAction);
		}
		XFunctionDefinitionIndex modFile = getSelectedFunctionFile();
		if (modFile != null) {
			menu.add(newFunctionBodyAction);
			menu.add(makeDirty);
		}
	}

	IContainer getSelectedContainer() {
		IStructuredSelection selection = (IStructuredSelection)getContext().getSelection();
		if (selection.size() == 1) {
			Object o = selection.getFirstElement();
			IResource adapted = Adapters.adapt(o, IResource.class);
			if (adapted instanceof IContainer) {
				return (IContainer) adapted;
			}
		}
		return null;
	}
	
	XFunctionDefinitionIndex getSelectedFunctionFile() {
		IStructuredSelection selection = (IStructuredSelection)getContext().getSelection();
		if (selection.size() == 1) {
			Object o = selection.getFirstElement();
			if (o instanceof XFunctionDefinitionIndex) {
				return (XFunctionDefinitionIndex) o;
			}
		}
		return null;
	}

}
