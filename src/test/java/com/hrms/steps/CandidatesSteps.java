package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CandidatesSteps extends CommonMethods{

	@Given("i navigate to Candidates Page")
	public void i_navigate_to_Candidates_Page() {
		dashboard.navigateToCandidatesPage();
	}

	@When("i enter {string}")
	public void i_enter(String string) {
		sendText(candidate.candidateName, string);
	}

	@When("i click search button in Candidate")
	public void i_click_search_button_in_Candidate() {
		click(candidate.searchBtn);
	}

	@Then("i see candidate name in search results")
	public void i_see_candidate_name_in_search_results() {
		boolean candidateNameDis=candidate.candidateNameInResultTable.isDisplayed();
		Assert.assertTrue("Candidate Name did not displayed", candidateNameDis);
		
	}

	@When("i click Add button")
	public void i_click_Add_button() {
		click(candidate.addBtn);
	}

	@When("i enter {string}, {string}, {string} and {string}")
	public void i_enter_and(String string, String string2, String string3, String string4) {
		sendText(addCandidate.firstName,  string);
		sendText(addCandidate.lastName,  string2);
		sendText(addCandidate.email,  string3);
		sendText(addCandidate.contactNo,  string4);		
	}
	
	@When("i select {string}")
	public void i_select(String string) {
		selectByVisibleText(addCandidate.vacancy, string);
	}
	
	@When("i select  {string} of Application")
	public void i_select_of_Application(String string) {
		sendText(addCandidate.calender,  string);
	}

	@Then("i see Candidate is added successfully")
	public void i_see_Candidate_is_added_successfully() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(addCandidate.applicationStatus));
		Assert.assertTrue("Application status displayed", addCandidate.applicationStatus.isDisplayed());

	}
}
