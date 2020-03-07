package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ZoomDsDemo {

	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	
	Connection connection;
	Statement st;
	ResultSet rSet;
	
	@Test
	public void getDataFromDataBase() throws SQLException {
		connection=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		st=connection.createStatement();
		rSet=st.executeQuery("select name from ohrm_employment_status;");
		
//		rSet.next();
//		String empStatus1=rSet.getObject("name").toString();
//		System.out.println(empStatus1);
//		
//		rSet.next();
//		String empStatus2=rSet.getObject("name").toString();
//		System.out.println(empStatus2);
		
		
//		String empStatus;
//		while(rSet.next()) {
//			empStatus=rSet.getObject("name").toString();
//			System.out.println(empStatus);
//		}
		
		List<String> empStatusList=new ArrayList<>();
		
		while(rSet.next()) {
			String empSt=rSet.getObject("name").toString();
			empStatusList.add(empSt);
		}
		
		System.out.println(empStatusList);
		empStatusList.get(0);
	}
}
