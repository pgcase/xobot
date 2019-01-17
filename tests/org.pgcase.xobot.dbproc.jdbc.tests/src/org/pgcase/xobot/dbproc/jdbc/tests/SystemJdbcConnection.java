package org.pgcase.xobot.dbproc.jdbc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.pgcase.xobot.dbproc.jdbc.DbprocJdbc;

/*
 * Precondition:
 * 
 * - Exists DB as gived in 'dbUrl' with 'dbUser'/'dbPasswd' credentials,
 *   user have grants - create/drop schema, create/drop function/triggers/tables
 *   
 * - Schema 'dbSchema' don't used by any other needs or don't exists
 *   (will be drop in tests)
 * 
 */

public class SystemJdbcConnection implements java.io.Closeable {
	private Connection connection;
	private String dbSchema = "dbproc_test_schema"; //$NON-NLS-1$ 
	
	private static String DB_HOST;		// "ec2-54-75-230-41.eu-west-1.compute.amazonaws.com";
	private static Integer DB_PORT;		// "5432";
	private static String DB_DATABASE;	// "d85oais0tvhf9u";
	private static Boolean DB_USE_SSL;	// "true";
	private static String DB_URL;
	private static String DB_USER;		// "emdrxnlgxoypnd";
	private static String DB_PASSWD;	// "2b60eb62b1856a479f2ee4d023cda6f666ca9b2cb2a352bf7078ba58c65145a4";
	
	private static final String FILE_CONN_INI = "config/pg_connection.ini"; //$NON-NLS-1S
	private static final String FILE_SQL_DROP_SCHEMA = "sql/drop-test-schema.sql"; //$NON-NLS-1S
	private static final String FILE_SQL_CREATE_SCHEMA = "sql/create-test-schema.sql"; //$NON-NLS-1S
	private String sqlDropSchema;
	private String sqlCreateSchema;
	
	public SystemJdbcConnection() throws SQLException, IOException {
		try {
	        sqlDropSchema = DbprocJdbc.getSqlFmt1(FILE_SQL_DROP_SCHEMA,dbSchema);
	        sqlCreateSchema = DbprocJdbc.getSqlFmt1(FILE_SQL_CREATE_SCHEMA,dbSchema);

	        Properties props = new Properties();
			props.load(new FileInputStream(new File(FILE_CONN_INI)));
			
			DB_HOST = props.getProperty("host");
			DB_PORT = Integer.valueOf(props.getProperty("port", "5432"));
			DB_DATABASE = props.getProperty("database");
			DB_USE_SSL = Boolean.valueOf(props.getProperty("use_ssl"));
			DB_USER = props.getProperty("user");
			DB_PASSWD = props.getProperty("password");
			
	        connection = DriverManager.getConnection(
	        		"jdbc:postgresql://"
	        		+ DB_HOST + ":" 
	        		+ String.valueOf(DB_PORT) + "/" + DB_DATABASE
	        		,DB_USER,DB_PASSWD);
	        
			Statement statement = connection.createStatement();
			statement.execute(sqlDropSchema);
			if (!connection.getAutoCommit()) {
				connection.commit();
			}
			
			statement = connection.createStatement();
			statement.execute(sqlCreateSchema);
			if (!connection.getAutoCommit()) {
				connection.commit();
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void close() {
		try {
			connection.createStatement().execute(sqlDropSchema);
			if (!connection.getAutoCommit()) {
				connection.commit();
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public String getSchema() {
		return dbSchema;
	}
	
}

