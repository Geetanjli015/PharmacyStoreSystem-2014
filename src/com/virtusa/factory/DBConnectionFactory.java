package com.virtusa.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DBConnectionFactory {
	static Properties properties = null;
	static{//static initializer block will return single instance as it is static 
		ClassLoader classLoader =DBConnectionFactory.class.getClassLoader();
		InputStream inStream = classLoader.getResourceAsStream("database.properties");
		//if web component use context object
		 properties = new Properties();
		try {
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class.forName(properties.getProperty("driverClass"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(
					properties.getProperty("dbURL"),
					properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
