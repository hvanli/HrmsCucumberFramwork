package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class CandidatesPageWebElements extends BaseClass{

	@FindBy(xpath="//h1[text()='Candidates']")
	public WebElement candidatesPageHeader;
	
	@FindBy(id="candidateSearch_jobTitle")
	public WebElement jobTitle;
	
	@FindBy(id="candidateSearch_candidateName")
	public WebElement candidateName;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	public WebElement methodOfApplication;
	
	@FindBy(id="candidateSearch_jobVacancy")
	public WebElement vacancy;
	
	@FindBy(id="candidateSearch_keywords")
	public WebElement keywords;
	
	@FindBy(id="candidateSearch_hiringManager")
	public WebElement hiringManager;
	
	@FindBy(id="candidateSearch_status")
	public WebElement status;
	
	@FindBy(id="candidateSearch[dateApplication][from]")
	public WebElement dateOfApplicationFrom;
	
	@FindBy(id="candidateSearch_toDate")
	public WebElement dateOfApplicationTo;
	
	@FindBy(id="btnSrch")
	public WebElement searchBtn;
	
	@FindBy(id="btnRst")
	public WebElement resetBtn;
	
	@FindBy(id="btnAdd")
	public WebElement addBtn;
	
	@FindBy(id="btnDelete")
	public WebElement deleteBtn;
	
	@FindBy(id="ohrmList_chkSelectAll")
	public WebElement selectAll;
	
	@FindBy(xpath="input[id^=ohrmList_chkSelectRecord]")
	public List<WebElement> selectList;
	
	@FindBy(xpath="//a[text()='Vacancy']")
	public WebElement sortByVacancy;
	
	@FindBy(xpath="//a[text()='Candidate']")
	public WebElement sortByCandidateName;
	
	@FindBy(xpath="//a[text()='Hiring Manager']")
	public WebElement sortByHiringManager;
	
	@FindBy(xpath="//a[text()='Date of Application']")
	public WebElement sortByDateOfApplication;
	
	@FindBy(xpath="//a[text()='Status']")
	public WebElement sortByStatus;
	
	@FindBy(xpath="//table[@id='resultTable']")
	public WebElement resultTable;
	
	@FindBy(xpath="//a[starts-with(@href,'addCandidate?')]")
	public WebElement candidateNameInResultTable;
	

	
	
	
	public CandidatesPageWebElements() {
		PageFactory.initElements(driver,  this);
	}
	
	
	
	
}
