package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportsPageWebElements extends BaseClass{

	@FindBy(xpath="//h1[text()='Employee Reports']")
	public WebElement reportsPageHeader;
	
	@FindBy(id="search_search")
	public WebElement reportNameSearcBox;
	
	@FindBy(xpath="//input[@value='Search']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//input[@value='Reset']")
	public WebElement resetBtn;
	
	@FindBy(xpath="//input[@value='Reset']")
	public WebElement addBtn;
	
	@FindBy(xpath="//input[@value='Reset']")
	public WebElement deleteBtn;
	
	@FindBy(id="ohrmList_chkSelectAll")
	public WebElement selectAllBtn;
	
	@FindBy(xpath="//a[text()='Report Name']")
	public WebElement searchResultsReportNameHeader;
	
	@FindBy(id="//a[text()='Run']")
	public WebElement runBtn;
	
	@FindBy(id="//a[text()='Edit']")
	public WebElement editBtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td")
	public WebElement noRecordFoundMsg;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement pimReportResultName;
	
	public ReportsPageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
