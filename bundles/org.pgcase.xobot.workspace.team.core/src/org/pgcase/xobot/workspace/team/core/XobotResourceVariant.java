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
package org.pgcase.xobot.workspace.team.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.osgi.util.NLS;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.variants.CachedResourceVariant;

public class XobotResourceVariant extends CachedResourceVariant {
	
	private java.io.File ioFile;
	private byte[] bytes;
	
	public XobotResourceVariant(java.io.File file) {
		this.ioFile = file;
	}
	
	public XobotResourceVariant(java.io.File file, byte[] bytes) {
		this.ioFile = file;
		this.bytes = bytes;
	}
	
	protected void fetchContents(IProgressMonitor monitor) throws TeamException {
		setContents(getContents(), monitor);
	}
	
	protected String getCachePath() {
		return getFilePath() + String.valueOf(' ') + ioFile.lastModified();
	}
	
	private String getFilePath() {
		try {
			return ioFile.getCanonicalPath();
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, TeamCore.ID, 0, 
					NLS.bind(WorkspaceTeamCoreMessages.XobotResourceVariant_message_failed_to_obtain_canonical_path, ioFile.getAbsolutePath()), e);
			//FIXME: report
			e.printStackTrace();
			return ioFile.getAbsolutePath();
		}
	}

	protected String getCacheId() {
		return TeamCore.ID;
	}
	
	public String getName() {
		return ioFile.getName();
	}
	
	public boolean isContainer() {
		return ioFile.isDirectory();
	}
	
	public String getContentIdentifier() {
		//FIXME: rework
		return new Date(ioFile.lastModified()).toString();
	}
	
	public byte[] asBytes() {
		if (bytes == null) {
			//FIXME: rework
			bytes = Long.toString(ioFile.lastModified()).getBytes();
		} 
		return bytes;
	}

	public XobotResourceVariant[] members() {
		if (isContainer()) {
			java.io.File[] members = ioFile.listFiles();
			if (members == null) {
				members = new java.io.File[0];
			}
			XobotResourceVariant[] result = new XobotResourceVariant[members.length];
			for (int i = 0; i < members.length; i++) {
				result[i] = new XobotResourceVariant(members[i]);
			}
			return result;
		}
		return new XobotResourceVariant[0];
	}

	public InputStream getContents() throws TeamException {
		try {
			return new BufferedInputStream(new FileInputStream(ioFile));
		} catch (FileNotFoundException e) {
			String pattern = WorkspaceTeamCoreMessages.XobotResourceVariant_message_failed_to_fetch_contents;
			String message = NLS.bind(pattern, ioFile);
			throw new TeamException(message, e);
		}
	}
	
	public java.io.File getFile(){
		return ioFile;
	}
}
