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
package org.pgcase.xobot.dbproc.team.ui.navigator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.team.core.diff.FastDiffFilter;
import org.eclipse.team.core.diff.IDiff;
import org.eclipse.team.core.diff.IThreeWayDiff;
import org.eclipse.team.core.mapping.IMergeContext;
import org.eclipse.team.internal.ui.mapping.ResourceModelProviderOperation;
import org.eclipse.team.ui.mapping.MergeActionHandler;
import org.eclipse.team.ui.mapping.SynchronizationOperation;
import org.eclipse.team.ui.synchronize.ISynchronizePageConfiguration;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionBody;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;

@SuppressWarnings("restriction")
public class DbprocMergeActionHandler extends MergeActionHandler {

	private final class XobotSynchronizeOperation extends ResourceModelProviderOperation {
		public XobotSynchronizeOperation(ISynchronizePageConfiguration configuration, IStructuredSelection selection) {
			super(configuration, selection);
		}

		protected void execute(IProgressMonitor monitor) throws InvocationTargetException {
			// We need to perform special handling for any body file whose parent index is not included in the merge
			try {
				IMergeContext context = (IMergeContext)getContext();
				IDiff[] diffs = getTargetDiffs();
				XFunctionDefinitionBody[] moeMerges = getBodyOnlyMerges();
				IStatus status = context.merge(diffs, overwrite, monitor);
				if (!status.isOK()) {
					throw new CoreException(status);
				}
				// For now, just cycle through each lonely body and update the parent index
				for (int i = 0; i < moeMerges.length; i++) {
					XFunctionDefinitionBody body = moeMerges[i];
					XFunctionDefinitionIndex index = body.getFunctionDefinitionIndex();
					if (body.getResource().exists() && !index.hasBody((IFile)body.getResource()))
						index.addBody((IFile)body.getResource());
					else
						index.remove(body);
				}
			} catch (CoreException e) {
				throw new InvocationTargetException(e);
			}
		}

		private XFunctionDefinitionBody[] getBodyOnlyMerges() {
			List<XFunctionDefinitionBody> result = new ArrayList<>();
			Object[] elements = getElements();
			for (int i = 0; i < elements.length; i++) {
				Object object = elements[i];
				if (object instanceof XFunctionDefinitionBody) {
					XFunctionDefinitionBody moeFile = (XFunctionDefinitionBody) object;
					result.add(moeFile);
				}
			}
			return (XFunctionDefinitionBody[]) result.toArray(new XFunctionDefinitionBody[result.size()]);
		}

		protected FastDiffFilter getDiffFilter() {
			return new FastDiffFilter() {
				public boolean select(IDiff node) {
					if (node instanceof IThreeWayDiff) {
						IThreeWayDiff twd = (IThreeWayDiff) node;
						if ((twd.getDirection() == IThreeWayDiff.OUTGOING && overwrite) || twd.getDirection() == IThreeWayDiff.CONFLICTING || twd.getDirection() == IThreeWayDiff.INCOMING) {
							return true;
						}
						return false;
					}
					// This is must have for for two-way diffs
					return overwrite;
				}
			};
		}
	}

	final boolean overwrite;
	private SynchronizationOperation operation;

	public DbprocMergeActionHandler(ISynchronizePageConfiguration configuration, boolean overwrite) {
		super(configuration);
		this.overwrite = overwrite;
	}

	protected SynchronizationOperation getOperation() {
		if (operation == null) {
			operation = new XobotSynchronizeOperation(getConfiguration(), getStructuredSelection());
		}
		return operation;
	}
	
	protected void updateEnablement(IStructuredSelection selection) {
		operation = null;
		super.updateEnablement(selection);
	}

}
