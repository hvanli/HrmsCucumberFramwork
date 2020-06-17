package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import com.hrms.utils.API_Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_GetAllEmployeeStatusApiSteps {

	private static RequestSpecification request;
	private Response response;
	
	@Given("User creates request for getting all employee status from SyntaxApi")
	public void user_creates_request_for_getting_all_employee_status_from_SyntaxApi() {
		
		request=given().header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("employeeStatus retrieves response")
	public void employeestatus_retrieves_response() {

		response=request.when().get(API_Constants.GET_ALL_EMPLOYEE_STATUS_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for employeeStatus")
	public void status_Code_is_for_employeeStatus(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}
}
