package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.API_Constants;

import static io.restassured.RestAssured.*;

public class SyntaxApiGetOneEmployeeSteps {
	
	private static RequestSpecification request;
	private Response response;

	@Given("user calls getOneEmployee API with empId {int}")
	public void user_calls_getOneEmployee_API_with_empId(Integer int1) {
		request=given().param("employee_id", "3382").header("Content-Type","application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("getOneEmployee retrieves response")
	public void getoneemployee_retrieves_response() {
		response=request.when().get(API_Constants.GET_ONE_EMPLOYEE_URI);
	}

	@Then("status code is {int} for getOneEmployee")
	public void status_code_is_for_getOneEmployee(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
