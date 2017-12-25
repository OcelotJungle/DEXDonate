package ru.ocelotjungle.dexdonate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
	private static DatabaseManager instance;

	private Connection connection;
	private Statement statement;
	
	private DatabaseManager() {
		try {
			connectDatabase();
			validateDatabase();
			
			connection.setAutoCommit(true);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	private void connectDatabase() throws SQLException {
		connection = DriverManager.getConnection("jdbc:sqlite:Database.s3db");
		statement = connection.createStatement();
	}
	
	private void validateDatabase() throws SQLException {
		statement.execute("CREATE TABLE if not exists 'accounts' "
				+ "('id' INT UNSIGNED NOT NULL PRIMARY KEY AUTOINCREMENT, "
				+ "'playername' TEXT NOT NULL, "
				+ "'accountname' TEXT NOT NULL);");
	}
	
	public static DatabaseManager getInstance() {
		return instance == null ? new DatabaseManager() : instance;
	}
	
	public void registerAccount(String playername, String accountname) throws SQLException {
		statement.execute("INSERT INTO 'accounts' ('playername', 'accountname') VALUES ('" + playername + "', '" + accountname + "');");
	}
}
