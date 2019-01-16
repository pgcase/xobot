package org.pgcase.xobot.dbproc.jdbc.tests;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
	private String dbUrl = "jdbc:postgresql://localhost:5432/postgres"; //$NON-NLS-1$
	private String dbSchema = "dbproc_test_schema"; //$NON-NLS-1$ 
	private String dbUser = "postgres"; //$NON-NLS-1$ 
	private String dbPasswd = "postgres"; //$NON-NLS-1$
	
	private static final String FILE_SQL_DROP_SCHEMA = "sql/drop-test-schema.sql"; //$NON-NLS-1S
	private static final String FILE_SQL_CREATE_SCHEMA = "sql/create-test-schema.sql"; //$NON-NLS-1S
	private String sqlDropSchema;
	private String sqlCreateSchema;
	
	public SystemJdbcConnection() throws SQLException, IOException {
		try {
	        sqlDropSchema = DbprocJdbc.getSqlFmt1(FILE_SQL_DROP_SCHEMA,dbSchema);
	        sqlCreateSchema = DbprocJdbc.getSqlFmt1(FILE_SQL_CREATE_SCHEMA,dbSchema);

	        connection = DriverManager.getConnection(dbUrl,dbUser,dbPasswd);
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

