package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.API_Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_GetOneEmployeeApiSteps {

	private static RequestSpecification request;
	private Response response;
	private String expEmpId="9289A";
	
	@Given("User creates request for retrieving one employee")
	public void user_creates_request_for_retrieving_one_employee() {

		request=given().param("employee_id", expEmpId).header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	}

	@When("getOneEmployee retrieves response")
	public void getoneemployee_retrieves_response() {

		response=request.when().get(API_Constants.GET_ONE_EMPLOYEE_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for getOneEmployee")
	public void status_Code_is_for_getOneEmployee(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("User asserts given employee is retrieved")
	public void user_asserts_given_employee_is_retrieved() {
		
		String actualEmpId=response.jsonPath().getString("employee[0].employee_id");
		Assert.assertEquals(expEmpId, actualEmpId);
	}
}
