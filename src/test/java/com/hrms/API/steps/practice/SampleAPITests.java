package com.hrms.API.steps.practice;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleAPITests {

//	@Test
	public void getAllJobTittles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1ODI5OTYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjY5ODE5NiwidXNlcklkIjoiNjAifQ.MPmL-xywGqBz95SV20gVOsVkVVbeF2ZIYrxmbrlYul4")
				.when().get("http://3.90.45.91/syntaxapi/api/jobTitle.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

//	@Test
	public void getOneEmployee() {

		Response response = RestAssured.given().param("employee_id", "3382").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1ODI5OTYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjY5ODE5NiwidXNlcklkIjoiNjAifQ.MPmL-xywGqBz95SV20gVOsVkVVbeF2ZIYrxmbrlYul4")
				.when().get("http://3.90.45.91/syntaxapi/api/getOneEmployee.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

//	@Test
	public void getAllEmployeeStatus() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1ODI5OTYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjY5ODE5NiwidXNlcklkIjoiNjAifQ.MPmL-xywGqBz95SV20gVOsVkVVbeF2ZIYrxmbrlYul4")
				.when().get("http://3.90.45.91/syntaxapi/api/employeeStatus.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

//	@Test
	public void getAllEmployees() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1ODI5OTYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjY5ODE5NiwidXNlcklkIjoiNjAifQ.MPmL-xywGqBz95SV20gVOsVkVVbeF2ZIYrxmbrlYul4")
				.when().get("http://3.90.45.91/syntaxapi/api/getAllEmployees.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	@Test
	public void createOneEmlpoyee() {
		Response response = RestAssured.given().header("contentType", "application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI1ODI5OTYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjY5ODE5NiwidXNlcklkIjoiNjAifQ.MPmL-xywGqBz95SV20gVOsVkVVbeF2ZIYrxmbrlYul4")

				.body("{\r\n" + "  \"emp_firstname\": \"Michael\",\r\n" + "  \"emp_lastname\": \"Knight\",\r\n"
						+ "  \"emp_middle_name\": \"Mike\",\r\n" + "  \"emp_gender\": \"1\",\r\n"
						+ "  \"emp_birthday\": \"1960-01-22\",\r\n" + "  \"emp_status\": \"Zero hours contract\",\r\n"
						+ "  \"emp_job_title\": \"Graphic Designer\"\r\n" + "}")

//				.param("emp_firstname", "Michael")
//				.param("emp_lastname", "Knight")
//				.param("emp_middle_name", "Mike")
//				.param("emp_gender", "1")
//				.param("emp_birthday", "1960-01-22")
//				.param("emp_status", "Zero hours contract")
//				.param("emp_job_title", "Graphic Designer")
				.when().post("http://3.90.45.91/syntaxapi/api/createEmployee.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}
}
