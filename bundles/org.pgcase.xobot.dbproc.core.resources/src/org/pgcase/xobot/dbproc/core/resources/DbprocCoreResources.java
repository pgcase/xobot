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
package org.pgcase.xobot.dbproc.core.resources;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

public class DbprocCoreResources {

	public static final String ID = "org.pgcase.xobot.dbproc.core.resources"; //$NON-NLS-1$

	// FIXME: Temporary, just to not loose the functionality of logic model
	public static final String FUNCTION_DEFINITION_BODY_EXTENSION = "fdp"; //$NON-NLS-1$
	public static final String FUNCTION_DEFINITION_INDEX_EXTENSION = "fdi"; //$NON-NLS-1$

	public static boolean isBodyFile(IResource resource) {
		return resource instanceof IFile
				&& DbprocCoreResources.FUNCTION_DEFINITION_BODY_EXTENSION.equals(resource.getFileExtension());
	}

	public static boolean isIndexFile(IResource resource) {
		if (resource instanceof IFile) {
			String fileExtension = resource.getFileExtension();
			if (fileExtension != null) {
				return fileExtension.equals(FUNCTION_DEFINITION_INDEX_EXTENSION);
			}
		}
		return false;
	}

}
