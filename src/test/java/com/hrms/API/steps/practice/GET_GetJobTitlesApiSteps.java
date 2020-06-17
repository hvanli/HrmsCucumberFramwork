package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import com.hrms.utils.API_Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_GetJobTitlesApiSteps {

	private static RequestSpecification request;
	private Response response;
	
	@Given("User creates request for getting all job titles from SyntaxApi")
	public void user_creates_request_for_getting_all_job_titles_from_SyntaxApi() {
		
		request=given().header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("jobTitle retrieves response")
	public void jobtitle_retrieves_response() {

		response=request.when().get(API_Constants.GET_ALL_JOBTITLES_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for jobTitle")
	public void status_Code_is_for_jobTitle(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

}
