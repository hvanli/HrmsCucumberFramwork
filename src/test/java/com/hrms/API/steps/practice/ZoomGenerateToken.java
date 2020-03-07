package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ZoomGenerateToken extends CommonMethods{
	
	private Response response;
	private static RequestSpecification request;
	public static String Token;

	@Given("user generetes a token")
	public void user_generetes_a_token() {

		request=given().header("Content-Type", "application/json");
		
		response=request.body(readJson(API_Constants.GENERATE_TOKEN_JSON_FILEPATH))
				.when().post(API_Constants.GENERATE_TOKEN_URI);
		
		response.prettyPrint();
		Token="Bearer "+response.jsonPath().getString("token");
		
		System.out.println("New Token is: "+Token);
		
		Assert.assertEquals(200, response.getStatusCode());
	}
}
