package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportSteps extends CommonMethods{

	@Given("i navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() {
		dashboard.navigateToReports();
	}
	
	@When("i enter an invalid {string}")
	public void i_enter_an_invalid(String string) {
		sendText(report.reportNameSearcBox, string);
	}

	@When("i click search button")
	public void i_click_search_button() {
		jsClick(report.searchBtn);
	}

	@Then("i see No Record Found message")
	public void i_see_No_Record_Found_message() {
		System.out.println(report.noRecordFoundMsg.getText());
		boolean errMsgDisp=report.noRecordFoundMsg.isDisplayed();
		Assert.assertTrue("No Record Found message is not displayed", errMsgDisp);
	}
	
	@When("i enter an valid  {string}")
	public void i_enter_an_valid(String string) {
		sendText(report.reportNameSearcBox, string);
	}

	@Then("i see the {string} report displayed")
	public void i_see_the_report_displayed(String string) {
		String pimReportResult=report.pimReportResultName.getText();
		Assert.assertTrue("No Record Found message is not displayed", pimReportResult.contains(string));
	}
}
