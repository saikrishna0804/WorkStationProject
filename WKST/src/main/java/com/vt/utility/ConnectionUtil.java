package com.vt.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Properties props = new Properties();
	private static String username;
	private static String password;
	private static String url;
	private static String driverClass;
	static {
		try {
			props.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("db_props.properties"));
			driverClass = props.getProperty("driver");
			password = props.getProperty("password");
			username = props.getProperty("username");
			url = props.getProperty("url");
			Class.forName(driverClass);
		} catch (IOException | ClassNotFoundException e ) {
			e.printStackTrace();
		} 
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}
