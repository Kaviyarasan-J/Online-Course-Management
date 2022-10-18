package com.MySql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
		public static Connection getConnection() throws SQLException, ClassNotFoundException  {
		    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		    String DB_URL = "jdbc:mysql://localhost:3306/crud";
		    String UNAME = "root";
		    String PASSWORD = "Kaviyarasan@753";
			Class.forName(JDBC_DRIVER);
			Connection	con = DriverManager.getConnection(DB_URL, UNAME, PASSWORD);
			return con;
		}

}
