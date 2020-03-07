package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class JdbcDemo {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	//jdbc:type of driver:host:port/name of the database
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void getDataFromDatabase() throws SQLException {
		
		Connection connection=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		System.out.println("Connection is created");
		
		Statement st=connection.createStatement();
		
		ResultSet rSet=st.executeQuery("select * from ohrm_nationality");
		
		rSet.next();
		String firstRowData=rSet.getString("name");
		System.out.println(firstRowData);
		
		rSet.next();
		String secondRowData=rSet.getString("name");
		System.out.println(secondRowData);
		
//		String data;
//		while(rSet.next()) {
//			data=rSet.getObject("name").toString();
//			System.out.println(data);
//		}
		
		ArrayList<String> arrData=new ArrayList<String>();
		
		while(rSet.next()) {
			arrData.add(rSet.getObject("name").toString());
		}
		
		System.out.println(arrData);
		
		rSet.close();
		st.close();
		connection.close();		
	}
}
