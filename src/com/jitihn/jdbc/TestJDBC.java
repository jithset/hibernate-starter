package com.jitihn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		String connUrl = "jdbc:mysql://172.17.0.2:3306/hb_student";
		String user = "root";
		String pass = "jithin123";
		
		try {
			System.out.println("Connecting to jdbc");
			Connection connection = DriverManager.getConnection(connUrl, user, pass);
			System.out.println("connected successfully "+ connection);
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
	}
}
