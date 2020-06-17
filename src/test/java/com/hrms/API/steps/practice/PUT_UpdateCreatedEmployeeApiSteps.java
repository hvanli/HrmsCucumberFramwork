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
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class PUT_UpdateCreatedEmployeeApiSteps extends CommonMethods{

	private RequestSpecification request;
	private Response response;
	
	@Given("User creates request for updating created employee info on SyntaxApi")
	public void user_creates_request_for_updating_created_employee_info_on_SyntaxApi() {
		request=given().header("Authorization", SyntaxAPIAuthenticationSteps.Token).
				header("Content-Type", "application/json").
				body(readJson(API_Constants.UPDATE_EMPLOYEE_JSON_FILEPATH));
	}

	@When("updateEmployee retrieves response")
	public void updateemployee_retrieves_response() {
		
		response=request.when().put(API_Constants.UPDATE_EMPLOYEE_URI);
		response.prettyPrint();
	}

	@Then("Status Code is {int} for updateEmployee")
	public void status_Code_is_for_updateEmployee(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("User Validates that employee is updated successfully")
	public void user_Validates_that_employee_is_updated_successfully() {
		response.then().body("Message", equalTo("Entry updated"));
	}
}
