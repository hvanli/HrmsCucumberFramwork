package com.hrms.API.steps.practice;

import io.restassured.RestAssured;

import com.hrms.utils.API_Constants;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE_DeleteCreatedEmployeeApiSteps {

	private RequestSpecification request;
	private Response response;
	
	@Given("User creates request for deleting created employee from SyntaxApi")
	public void user_creates_request_for_deleting_created_employee_from_SyntaxApi() {
		
		request=RestAssured.given().param("employee_id", "9298A")
				.header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("deleteEmployee retrieves response")
	public void deleteemployee_retrieves_response() {
		
		response=request.when().delete(API_Constants.DELETE_EMPLOYEE_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for deleteEmployee")
	public void status_Code_is_for_deleteEmployee(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("User Validates that Employee is Deleted Successfully")
	public void user_Validates_that_Employee_is_Deleted_Successfully() {

		response.then().body("message", equalTo("Entry deleted"));
	}
}
