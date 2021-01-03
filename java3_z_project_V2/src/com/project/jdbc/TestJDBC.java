package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	
	public static void main(String[] args) {
		JDBC.test();
	}
	
	
	public static void printSomething(String input) {
		System.out.println(input);
	}
	
	public static String returnDouble(String input) {
		return input+input;
	}
}
