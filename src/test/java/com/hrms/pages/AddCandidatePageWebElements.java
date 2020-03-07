package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddCandidatePageWebElements extends BaseClass{
	
	@FindBy(id="addCandidate_firstName")
	public WebElement firstName;
	
	@FindBy(id="addCandidate_middleName")
	public WebElement middleName;
	
	@FindBy(id="addCandidate_lastName")
	public WebElement lastName;
	
	@FindBy(id="addCandidate_email")
	public WebElement email;
	
	@FindBy(id="addCandidate_contactNo")
	public WebElement contactNo;
	
	@FindBy(id="addCandidate_vacancy")
	public WebElement vacancy;
	
	@FindBy(id="addCandidate_resume")
	public WebElement resume;
	
	@FindBy(id="addCandidate_keyWords")
	public WebElement keywords;
	
	@FindBy(id="addCandidate_comment")
	public WebElement comment;
	
	@FindBy(id="addCandidate_appliedDate")
	public WebElement calender;
	
	public void selectDate(String month, String year, String day) {
		CommonMethods.click(calender);
		
		WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select mSelect=new Select(months);
		mSelect.selectByVisibleText(month);
		
		WebElement years=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select ySelect=new Select(years);
		ySelect.selectByVisibleText(year);
		
		List<WebElement> dList=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement d:dList) {
			if(d.getText().equals(day)) {
				d.click();
				break;
			}
		}		
	}
	
	@FindBy(xpath="//span[@class='status']")
	public WebElement applicationStatus;	
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	public AddCandidatePageWebElements() {
		PageFactory.initElements(driver,  this);
	}
}
