package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public static void test() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/project_books_info?useSSL=false&serverTimezone=UTC";
		String user = "jac2020ipd22";
		String pass = "jac2020ipd22";
		
		try {System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection Sucessful!!!");		}
		catch(Exception exc){
			System.out.println("ERROR!  Connection Exception Catched!!!");
			}

	}
	
	public static void printSomething(String input) {
		System.out.println(input);
	}
	
	public static String returnDouble(String input) {
		return input+input;
	}
}
