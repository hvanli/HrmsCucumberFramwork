package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Task {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	//jdbc:type of driver:host:port/name of the database
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void getDataTask() throws SQLException {
		Connection con=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		System.out.println("Connection established");
		
		Statement st=con.createStatement();
		
	}
}
