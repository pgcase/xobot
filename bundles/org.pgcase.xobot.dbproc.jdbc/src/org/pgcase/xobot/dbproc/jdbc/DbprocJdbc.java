package org.pgcase.xobot.dbproc.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DbprocJdbc {
	
	public static final String EXTRACTOR_TYPE_JDBC = "JDBC"; //$NON-NLS-1$

	public static String getSql(String filename) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
			StringBuilder sb = new StringBuilder();
			String nextLine;
			while(null != (nextLine = reader.readLine())) {
				sb.append(nextLine);
				sb.append('\n');
			}
			return sb.toString();
		}
	}

	public static String getSqlFmt1(String filename, String addString) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
			StringBuilder sb = new StringBuilder();
	        String nextLine;
	        while(null != (nextLine = reader.readLine())) {
	            sb.append(nextLine);
				sb.append('\n');
	        }
        	return String.format(sb.toString(),addString);
		}     
	}

	public static String getBundleSql(String bundleSqlFilename) throws IOException {
		InputStream is = DbprocJdbc.class.getResourceAsStream(bundleSqlFilename);
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
			StringBuilder sb = new StringBuilder();
			String nextLine;
			while(null != (nextLine = reader.readLine())) {
				sb.append(nextLine);
				sb.append('\n');
			}
			return sb.toString();
		}
	}
}
