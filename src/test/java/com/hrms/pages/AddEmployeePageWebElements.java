package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageWebElements extends BaseClass{

	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement userPassword;
	
	@FindBy(id="re_password")
	public WebElement confirmUserPassword;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="employeeId")
	public WebElement empId;
	
	@FindBy(xpath="//span[@for='firstName']")
	public WebElement firstNameError;
	
	@FindBy(xpath="//span[@for='lastName']")
	public WebElement lastNameError;
	
	
	public AddEmployeePageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
