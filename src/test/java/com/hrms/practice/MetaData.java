package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	//jdbc:type of driver:host:port/name of the database
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	
	@Test
	public void getMetaData() throws SQLException {
		
		
		
		Connection connection =DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		
		DatabaseMetaData dbData=connection.getMetaData();
		
		String dbName=dbData.getDatabaseProductName();
		String dbVersion=dbData.getDatabaseProductVersion();
		
		System.out.println(dbName);
		System.out.println(dbVersion);
		
		Statement st=connection.createStatement();
		ResultSet rSet=st.executeQuery("select * from hs_hr_employees where emp_number=4353;");

		ResultSetMetaData resultData= rSet.getMetaData();
		
		int cols=resultData.getColumnCount();
		
		System.out.println(cols);
		
		String colName=resultData.getColumnName(1);
		System.out.println(colName);
		
		for(int i=1; i<=cols; i++) {
			colName=resultData.getColumnName(i);
			System.out.println("Column name: "+colName);
		}
		
		rSet.close();
		st.close();
		connection.close();
	}
}
