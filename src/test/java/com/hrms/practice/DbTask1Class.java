package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DbTask1Class {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void getDataFromHrmDataBase() throws SQLException {
		Connection connection=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		System.out.println("Connection achieved");
		
		Statement st=connection.createStatement();
		
		ResultSet rSet=st.executeQuery("select * from ohrm_job_title;");
		
		String data;
		while(rSet.next()) {
			data=rSet.getObject("job_title").toString();
			System.out.println(data);
		}
		
		rSet.close();
		st.close();
		connection.close();	
	}
}
