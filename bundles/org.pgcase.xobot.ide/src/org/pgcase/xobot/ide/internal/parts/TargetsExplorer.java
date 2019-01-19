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
package org.pgcase.xobot.ide.internal.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

public class TargetsExplorer {
	
	private TreeViewer treeViewer; 
	
	@Inject
	public TargetsExplorer() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		treeViewer.setContentProvider(new ITreeContentProvider() {
			
			@Override
			public boolean hasChildren(Object element) {
				return true;
			}
			
			@Override
			public Object getParent(Object element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] getElements(Object inputElement) {
				return getChildren(inputElement);
			}
			
			@Override
			public Object[] getChildren(Object parentElement) {
				return new String[] {"Target 1", "Target 2"};
			}
		});
		treeViewer.setLabelProvider(new LabelProvider());
		treeViewer.setInput(new Object());
	}
	
	
	@PreDestroy
	public void preDestroy() {
	}
	
	
	@Focus
	public void onFocus() {
		treeViewer.getTree().setFocus();
	}
	
	
}