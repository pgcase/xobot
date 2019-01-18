package org.pgcase.xobot.dbproc.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class DbprocJdbc {
	
	public static final String EXTRACTOR_TYPE_JDBC = "JDBC"; //$NON-NLS-1$

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
		return String.valueOf(context.getOrDefault("schema", (Object)"public"));
	}
}
