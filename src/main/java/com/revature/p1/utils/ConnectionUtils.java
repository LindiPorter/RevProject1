package com.revature.p1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static String url = System.getenv("My_Project");
	private static Connection conn; 
	private static ConnectionUtils cu = new ConnectionUtils();
	
	private ConnectionUtils () {
		if (conn==null) {
			try {
				conn=DriverManager.getConnection(url);
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	public static Connection getInstance () {
		return conn;
	}
}
