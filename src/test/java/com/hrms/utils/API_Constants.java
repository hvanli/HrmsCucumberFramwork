package com.hrms.utils;

public class API_Constants {


	
	public static final String CREATE_USER_URI="http://18.232.148.34/syntaxapi/api/createUser.php";
	
	public static final String GENERATE_TOKEN_URI="http://18.232.148.34/syntaxapi/api/generateToken.php";
	
	public static final String GET_ALL_EMPLOYEES_URI="http://18.232.148.34/syntaxapi/api/getAllEmployees.php";
	
	public static final String GET_ONE_EMPLOYEE_URI="http://18.232.148.34/syntaxapi/api/getOneEmployee.php";
	
	public static final String GET_ALL_JOBTITLES_URI="http://18.232.148.34/syntaxapi/api/jobTitle.php";
	
	public static final String GET_ALL_EMPLOYEE_STATUS_URI="http://18.232.148.34/syntaxapi/apiemployeeStatus.php";
	
	public static final String CREATE_EMPLOYEE_URI="http://18.232.148.34/syntaxapi/api/createEmployee.php";
	
	public static final String UPDATE_EMPLOYEE_URI="http://18.232.148.34/syntaxapi/api/updateEmployee.php";
	
	public static final String DELETE_EMPLOYEE_URI="http://18.232.148.34/syntaxapi/api/deleteEmployee.php";
	
	public static final String CREATE_USER_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/createUserBody.json";
	
	public static final String GENERATE_TOKEN_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/generateTokenBody.json";
	
	public static final String CREATE_EMPLOYEE_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/createEmployeeBody.json";
	
	public static final String UPDATE_EMPLOYEE_JSON_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/JSONFiles/updateEmployeeBody.json";
	
	
}
