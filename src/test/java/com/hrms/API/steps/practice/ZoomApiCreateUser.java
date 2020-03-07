package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ZoomApiCreateUser extends CommonMethods{
	
	private static Response response;
	private static RequestSpecification request;
	public static String email;
	public static String password;

	@Test
	public void createUser() {
		
		request=given().header("Content-Type" , "application/json");
		
		response=request.body(readJson(API_Constants.CREATE_USER_JSON_FILEPATH))
		.when().post(API_Constants.CREATE_USER_URI);
		
		response.prettyPrint();
		
		email=response.jsonPath().getString("employee[0].email");
		System.out.println(email);
		
		password=response.jsonPath().getString("employee[0].password");
		System.out.println(password);
		
		Assert.assertEquals(200, response.getStatusCode());
	}
}
