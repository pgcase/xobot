package org.pgcase.xobot.dbproc.jdbc.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

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

public class SimpleTestJdbcConnection {
	private Connection connection;
	private String dbUrl = "jdbc:postgresql://localhost:5432/postgres"; //$NON-NLS-1$
	private String dbSchema = "dbproc_test_schema"; //$NON-NLS-1$ 
	private String dbUser = "postgres"; //$NON-NLS-1$ 
	private String dbPasswd = "postgres"; //$NON-NLS-1$
	
	private static final String FILE_SQL_DROP_SCHEMA = "sql/drop-test-schema.sql"; //$NON-NLS-1S
	private static final String FILE_SQL_CREATE_SCHEMA = "sql/create-test-schema.sql"; //$NON-NLS-1S
	private String sqlDropSchema;
	private String sqlCreateSchema;
	
	public SimpleTestJdbcConnection() throws SQLException, IOException {
        sqlDropSchema = getSql(FILE_SQL_DROP_SCHEMA);
        sqlCreateSchema = getSql(FILE_SQL_CREATE_SCHEMA);
		connection = DriverManager.getConnection(dbUrl,dbUser,dbPasswd);
		PreparedStatement statement = connection.prepareStatement(sqlDropSchema);
		statement.setString(1, dbSchema);
		statement.execute();
		if (!connection.getAutoCommit()) connection.commit();
		statement = connection.prepareStatement(sqlCreateSchema);
		statement.setString(1, dbSchema);
		statement.setString(2, dbUser);
		statement.execute();
		if (!connection.getAutoCommit()) connection.commit();
	}

	@Override
	public void finalize() throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute(sqlDropSchema);
		connection.close();
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public String getSchema() {
		return dbSchema;
	}
	
	public String getSql(String filename) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		StringBuilder sb = new StringBuilder();
        String nextLine;
        while(null != (nextLine = reader.readLine())) {
            sb.append(nextLine);
            sb.append('\n');
        }
        return sb.toString();
	}
}

