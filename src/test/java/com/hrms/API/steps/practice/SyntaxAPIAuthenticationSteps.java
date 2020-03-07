package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

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
	public void user_generates_token() {
		request=given().header("Content-Type", "application/json");
		
		response=request.body(readJson(API_Constants.GENERATE_TOKEN_JSON_FILEPATH))
				.when().post(API_Constants.GENERATE_TOKEN_URI);
		
		Token= "Bearer "+response.jsonPath().getString("token");
		System.out.println(Token);
		
		Assert.assertEquals(200, response.getStatusCode());
		
	}
}
