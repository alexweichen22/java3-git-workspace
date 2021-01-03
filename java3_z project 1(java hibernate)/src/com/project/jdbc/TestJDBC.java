package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/project_books_info?useSSL=false&serverTimezone=UTC";
		String user = "jac2020ipd22";
		String pass = "jac2020ipd22";
		
		try {System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection Sucessful!!!");		}
		catch(Exception exc){exc.printStackTrace();}
	}
}
