package com.hrms.API.steps.practice;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_GetAllEmployeesApiSteps extends CommonMethods{
	
	private static RequestSpecification request;
	private Response response;

	@Given("User creates request for SyntaxApi")
	public void user_creates_request_for_SyntaxApi() {
		
		request=given().header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("getAllEmployees retrieves response")
	public void getallemployees_retrieves_response() {
		
		response=request.when().get(API_Constants.GET_ALL_EMPLOYEES_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for getAllEmployees")
	public void status_Code_is_for_getAllEmployees(Integer int1) {
		
		response.then().assertThat().statusCode(int1);
	}
}
