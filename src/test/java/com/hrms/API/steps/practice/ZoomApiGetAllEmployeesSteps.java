package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.Assert;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ZoomApiGetAllEmployeesSteps extends CommonMethods{
	
	private Response response;
	private static RequestSpecification request;
	
	@When("user calls getAllEmployee API")
	public void user_calls_getAllEmployee_API() {
		
		request=given().header("Content-Type", "application/json").header("Authorization",
				ZoomGenerateToken.Token);
	}

	@When("getAllEmployees retrieves response")
	public void getallemployees_retrieves_response() {
		response=request.when().get(API_Constants.GET_ALL_EMPLOYEES_URI);
		
		response.prettyPrint();
	}

	@Then("status code is {int} for getAllEmployees")
	public void status_code_is_for_getAllEmployees(int int1) {

		Assert.assertEquals(int1, response.getStatusCode());
		
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates all employees are retrieved")
	public void user_validates_all_employees_are_retrieved() {
		
		List<String> empList=response.jsonPath().getList("Employee");
		
		System.out.println("Total number of employees is :"+empList.size());
	}
}
