package org.pgcase.xobot.dbproc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.pgcase.xobot.dbproc.jdbc.functions.JdbcFunctionExtractor;
import org.pgcase.xobot.dbproc.runtime.functions.XFunctionDescriptor;

public class DbprocJdbc {
	
	public static final String EXTRACTOR_TYPE_JDBC = "JDBC"; //$NON-NLS-1$
	
	/*
	public static void main(String[] args) {
		System.out.println("JDBC PostgreSQL extract test");

		try (Connection connection 
				= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")) {
			System.out.println("Connection = " + connection.toString());
			
			JdbcFunctionExtractor extractor = new JdbcFunctionExtractor();
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("schema", (Object)"data");
			
			@SuppressWarnings("unused")
			Iterable<XFunctionDescriptor> testExtractFunctions 
				= extractor.extractFunctions(connection,context,null);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("JDBC PostgreSQL extract test finished");
	}
	*/
}
