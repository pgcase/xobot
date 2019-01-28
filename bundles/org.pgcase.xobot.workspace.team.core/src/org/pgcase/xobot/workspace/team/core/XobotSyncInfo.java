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
package org.pgcase.xobot.workspace.team.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.synchronize.SyncInfo;
import org.eclipse.team.core.variants.IResourceVariant;
import org.eclipse.team.core.variants.IResourceVariantComparator;

public class XobotSyncInfo extends SyncInfo {

	public XobotSyncInfo(IResource local, IResourceVariant base, IResourceVariant remote, IResourceVariantComparator comparator) {
		super(local, base, remote, comparator);
	}

	protected int calculateKind() throws TeamException {
		//FIXME: revisit
		if (getLocal().getType() != IResource.FILE) {
			if (getLocal().exists() && getRemote() != null) {
				return IN_SYNC;
			}
		}
		return super.calculateKind();
	}
	
	public IResourceVariant getBase() {
		//FIXME: revisit
		return super.getBase();
	}
}