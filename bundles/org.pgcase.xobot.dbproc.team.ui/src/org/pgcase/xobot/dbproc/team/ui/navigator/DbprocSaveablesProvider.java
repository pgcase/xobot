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
package org.pgcase.xobot.dbproc.team.ui.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ui.Saveable;
import org.eclipse.ui.navigator.SaveablesProvider;
import org.pgcase.xobot.dbproc.core.resources.XFunctionDefinitionIndex;

public class DbprocSaveablesProvider extends SaveablesProvider {

	private List<DbprocElementSaveable> saveables = new ArrayList<>();

	public Object[] getElements(Saveable saveable) {
		if (saveable instanceof DbprocElementSaveable) {
			DbprocElementSaveable ms = (DbprocElementSaveable) saveable;
			return new Object[] { ms.getModelObject() };
		}
		return new Object[0];
	}

	public DbprocElementSaveable getSaveable(Object element) {
		for (DbprocElementSaveable saveable : saveables) {
			if (saveable.getModelObject().equals(element)) {
				return saveable;
			}
		}
		return null;
	}

	public Saveable[] getSaveables() {
		return (Saveable[]) saveables.toArray(new Saveable[saveables.size()]);
	}

	public void makeDirty(XFunctionDefinitionIndex index) {
		DbprocElementSaveable saveable = getSaveable(index);
		if (saveable == null) {
			saveable = new DbprocElementSaveable(this, index);
			saveables.add(saveable);
			fireSaveablesOpened(new Saveable[] { saveable });
		}
		(saveable).makeDirty();
		fireSaveablesDirtyChanged(new Saveable[] { saveable });
	}

	public void saved(DbprocElementSaveable saveable) {
		fireSaveablesDirtyChanged(new Saveable[] { saveable });
	}

}
