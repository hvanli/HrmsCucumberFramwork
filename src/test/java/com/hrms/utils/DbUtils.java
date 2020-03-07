package com.hrms.utils;

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

public class DbUtils {

	private static Connection conn;
	private static Statement st;
	private static ResultSet rSet;
	private static List<Map<String, String>> listData;
	
	
	/**
	 * this method will create a connection to Database
	 */
	public static void createConnection() {
		try {
			conn=DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"), ConfigsReader.getProperty("dbUsername"), 
					ConfigsReader.getProperty("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method Retrieves data and store data inside List<Map>
	 * @return List<Map<String, String>>
	 */
	public static List<Map<String, String>> storeDataFromDB(String sqlQuerry){
		
		try {
			st=conn.createStatement();
			rSet=st.executeQuery(sqlQuerry);
			ResultSetMetaData rSetData=rSet.getMetaData();
			int cols=rSetData.getColumnCount();
			
			listData=new ArrayList<>();
			
			while(rSet.next()) {
					Map<String, String> rowMap=new LinkedHashMap<>();				
				for(int i=1; i<=cols; i++) {
					String key=rSetData.getColumnName(i);
					String value=rSet.getObject(key).toString();
					
					rowMap.put(key, value);					
				}
				listData.add(rowMap);				
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listData;
	}
	
	public static void closeResources() {
		try {
			if(rSet!=null) {
				rSet.close();
			}
			if(rSet!=null) {
				st.close();
			}
			if(rSet!=null) {
				conn.close();	
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
