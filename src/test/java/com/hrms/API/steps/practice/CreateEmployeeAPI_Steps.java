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
import org.junit.Assert;;

public class CreateEmployeeAPI_Steps extends CommonMethods{

	private static RequestSpecification request;
	private Response response;
	public static String createdEmpId;


	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
		request=given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
		
		request.body(readJson(API_Constants.CREATE_EMPLOYEE_JSON_FILEPATH));
	}

	@When("create retrieves response")
	public void create_retrieves_response() {

		response=request.when().post(API_Constants.CREATE_EMPLOYEE_URI);
		
		response.prettyPrint();
		
		createdEmpId=response.jsonPath().getString("Employee[0].employee_id");
		System.out.println("Created employee's id is : "+createdEmpId);
	}

	@Then("status code is {int}")
	public void status_code_is(int int1) {

		
		Assert.assertEquals(int1, response.getStatusCode());
		
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {

		response.then().body("Message", equalTo("Entry Created"));
		request=given().param("employee_id", createdEmpId)
				.header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
		
		response=request.when().get(API_Constants.CREATE_EMPLOYEE_URI);

		String actualEmpId=response.jsonPath().getString("employee[0].employee_id");
		Assert.assertEquals("Employee ID mismatch!!", createdEmpId,  actualEmpId);
	}
}
