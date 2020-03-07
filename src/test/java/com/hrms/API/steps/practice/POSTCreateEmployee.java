package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

public class POSTCreateEmployee extends CommonMethods{
	
	private Response response;
	private static RequestSpecification request;
	public static String createdEmployeeId;

	@Given("user calls createEmployee API to verify that an employee was created")
	public void user_calls_createEmployee_API_to_verify_that_an_employee_was_created() {

		request=given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
		request.body(readJson(API_Constants.CREATE_EMPLOYEE_JSON_FILEPATH));
	}

	@When("User retrieves response for createEmployee API")
	public void user_retrieves_response_for_createEmployee_API() {

		response=request.when().post(API_Constants.CREATE_EMPLOYEE_URI);
		response.prettyPrint();
		createdEmployeeId=response.jsonPath().getString("Employee[0].employee_id");
	}

	@Then("status code is {int} for createEmployee API")
	public void status_code_is_for_createEmployee_API(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee was created")
	public void user_validates_employee_was_created() {

	}

}
