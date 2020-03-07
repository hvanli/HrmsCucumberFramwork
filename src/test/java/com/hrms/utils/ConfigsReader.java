package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	private static Properties prop;
	
	// Properties credentials=readProperties(credentials.properties);
	// Properties configs=readProperties(configurations.properties);
	
	public static Properties readProperties(String filePath) {		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
