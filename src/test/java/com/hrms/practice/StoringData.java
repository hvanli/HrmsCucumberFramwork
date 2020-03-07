package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class StoringData {

	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
	
	//jdbc:type of driver:host:port/name of the database
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void getAndStoreData() throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		System.out.println("Connection is created");

		Statement st = connection.createStatement();

		ResultSet rSet = st.executeQuery("select id, name, country_code from ohrm_location;");
		
		List<Map<String, String>> listDataLocations=new ArrayList<>();
		
		while(rSet.next()) {
			
			Map<String, String> map=new LinkedHashMap<>();
			
			map.put("id", rSet.getObject("id").toString());
			
			map.put("name", rSet.getObject("name").toString());
			
			map.put("country_code", rSet.getObject("country_code").toString());	
			
			listDataLocations.add(map);
		}
		
		System.out.println(listDataLocations);
	}
	
	@Test
	public void getAndStoreDataEnhanced() throws SQLException {
		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		System.out.println("Connection is created");

		Statement st = connection.createStatement();

		ResultSet rSet = st.executeQuery("select * from ohrm_location;");

		ResultSetMetaData rSetMetaData=rSet.getMetaData();
		int cols=rSetMetaData.getColumnCount();
		
		List<Map<String, String>> listDataLocations=new ArrayList<>();
		
		while(rSet.next()) {
			
			Map<String, String> map=new LinkedHashMap<>();
			
			for(int i=1; i<=cols; i++) {
				String key=rSetMetaData.getColumnName(i);
				String value=rSet.getObject(key).toString();
				map.put(key, value);
			}			
			
			listDataLocations.add(map);
		}		
		System.out.println(listDataLocations);
		
		rSet.close();
		st.close();
		connection.close();
	}
}
