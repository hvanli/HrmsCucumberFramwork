package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SyntaxApiCreateUserSteps extends CommonMethods {

	private Response response;
	private static RequestSpecification request;

	@Test
	public void createUser() {
		request = given().header("Content-Type", "application/json");

		response = request.body(CommonMethods.readJson(API_Constants.CREATE_USER_JSON_FILEPATH)).when()
				.post(API_Constants.CREATE_USER_URI);

		List<String> createUserResponse = response.jsonPath().getList("employee");

		System.out.println(createUserResponse);

		System.out.println("Response code is :" + response.getStatusCode());

		Assert.assertEquals(200, response.getStatusCode());
	}
}
