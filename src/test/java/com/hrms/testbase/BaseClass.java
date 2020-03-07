package com.hrms.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class BaseClass{

	public static WebDriver driver;

	
	/**
	 * Use this method in need of opening browser and target url
	 * @param browser The desired browser
	 * @param url	 The desired url
	 */	
	public static void setUp() {
		
		Properties configs=ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		
		switch(configs.getProperty("browser").toLowerCase()) {		
		case"chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver=new ChromeDriver();
			break;
		case"firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver=new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}		
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME,  TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME,  TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get(configs.getProperty("url"));		
	}
	
	public static void tearDown() {
			driver.quit();		
	}
}
