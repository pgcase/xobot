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
package org.pgcase.xobot.dbproc.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class DbprocJdbc {
	
	public static final String CONTEXT_SCHEMA_PUBLIC = "public"; //$NON-NLS-1$

	public static final String CONTEXT_SCHEMA_KEY = "schema"; //$NON-NLS-1$

	public static final String EXTRACTOR_TYPE_JDBC = "JDBC"; //$NON-NLS-1$
	
	private DbprocJdbc() {
		//block
	}

	public static String getSql(String filename) throws IOException {
		try (InputStream is = new FileInputStream(filename)) {
			return getSqlRaw(filename, is);
		}
	}

	public static String getSqlFmt1(String filename, String addString) throws IOException {
		return String.format(getSql(filename),addString);
	}

	public static String getBundleSql(String bundleSqlFilename) throws IOException {
		try (InputStream is = DbprocJdbc.class.getResourceAsStream(bundleSqlFilename)) {
			return getSqlRaw(bundleSqlFilename, is);
		}
	}
	
	static String getSqlRaw(String filename, InputStream inputStream) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			StringBuilder sb = new StringBuilder();
			String nextLine;
			while(null != (nextLine = reader.readLine())) {
				sb.append(nextLine);
				sb.append('\n');
			}
			return sb.toString();
		}
	}
	
	public static String extractSchema(Map<String, Object> context) {
		return String.valueOf(context.getOrDefault(CONTEXT_SCHEMA_KEY, (Object)CONTEXT_SCHEMA_PUBLIC));
	}

}
