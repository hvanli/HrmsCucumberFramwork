package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SyntaxAPIAuthenticationSteps extends CommonMethods{

	/**
	 * Please import the following import static io.restassured.RestAssured.*; - you
	 * need to manually type it
	 */

	/** Declaring global and static variables */

	private Response response;
	public static String Token;
	private static RequestSpecification request;

	@Given("user generates token")
//	@Test
	public void user_generates_token() {
		request=given().header("Content-Type", "application/json").
				body(readJson(API_Constants.GENERATE_TOKEN_JSON_FILEPATH));
		
				
		
		response=request.when().post(API_Constants.GENERATE_TOKEN_URI);
		
		response.prettyPrint();
		
		Token= "Bearer "+response.jsonPath().getString("token");
		
		System.out.println(Token);

		
//		Assert.assertEquals(201, response.getStatusCode());
		
		response.then().assertThat().statusCode(201);
		
	}
}
