package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginPageWebElements extends CommonMethods{

	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement syntaxLogo;
	
	@FindBy(id="logInPanelHeading")
	public WebElement loginPanelHeading;
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement loginBtn;
	
	public void login(String usrname, String pssword) {
		
		sendText(username, usrname);
		sendText(password, pssword);
		click(loginBtn);
	}
	
	public void login() {
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(loginBtn);
	}	
	
	@FindBy(xpath="//span[@id='spanMessage']")
	public WebElement errorMessage;

	@FindBy(id="openIDForm")
	public WebElement altLoginText;
	
	@FindBy(id="openIdProvider")
	public WebElement alternatinLoginSelectBtn;
	
	
	
	public LoginPageWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
