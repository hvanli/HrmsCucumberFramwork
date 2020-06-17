package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.API_Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_GetCreatedEmployeeApiSteps {

	private RequestSpecification request;
	private Response response;
	
	@Given("User creates request for retieving created employee from SyntaxApi")
	public void user_creates_request_for_retieving_created_employee_from_SyntaxApi() {		
		request=given().param("employee_id", "9298A").
				header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("getOneEmployee retrieves response for created Employee")
	public void getoneemployee_retrieves_response_for_created_Employee() {
		response=request.when().get(API_Constants.GET_ONE_EMPLOYEE_URI);
		response.prettyPrint();
	}
	
	@Then("Status Code is {int} for created getOneEmployee")
	public void status_Code_is_for_created_getOneEmployee(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}
}
