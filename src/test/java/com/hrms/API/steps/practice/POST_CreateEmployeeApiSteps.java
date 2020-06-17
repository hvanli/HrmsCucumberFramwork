package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_CreateEmployeeApiSteps extends CommonMethods{
	
	private static RequestSpecification request;
	private Response response;
	public static String createdEmpId;

	@Given("User creates request for creating employee on SyntaxApi")
	public void user_creates_request_for_creating_employee_on_SyntaxApi() {
		
		request=given().header("Authorization", SyntaxAPIAuthenticationSteps.Token).header("Content-Type", "application/json");
		request.body(readJson(API_Constants.CREATE_EMPLOYEE_JSON_FILEPATH));
	}

	@When("createEmployee retrieves response")
	public void createemployee_retrieves_response() {
		response=request.when().post(API_Constants.CREATE_EMPLOYEE_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for createEmployee")
	public void status_Code_is_for_createEmployee(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("User Validates Employee Is Created")
	public void user_Validates_Employee_Is_Created() {
		
		response.then().body("Message", equalTo("Entry Created"));
		createdEmpId=response.jsonPath().getString("Employee[0].employee_id");
		System.out.println("Created employee ID is : "+ createdEmpId);
	}
}
