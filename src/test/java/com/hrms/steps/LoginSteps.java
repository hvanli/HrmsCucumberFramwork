package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps extends CommonMethods{

	@Given("i enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,  ConfigsReader.getProperty("password"));		
	}

	@When("i click login button")
	public void _click_login_button() {
		click(login.loginBtn);
	}

	@Then("i successfully logged in")
	public void i_successfully_logged_in() {
		System.out.println("I am logged in");
	}

	@Then("i see welcome text")
	public void i_see_welcome_text() {
		String welcome=dashboard.welcomeBtn.getText();
		Assert.assertTrue("Welcome Text Mismatch", welcome.contains(ConfigsReader.getProperty("username")));
		System.out.println("I see welcome text");
	}
	
	@Given("i enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,  "qwerty123");
	}

	@Then("i see -Invalid credentials-message")
	public void i_see_Invalid_credentials_message() {
		boolean error=login.errorMessage.isDisplayed();
		Assert.assertTrue("Error message is not displayed", error);
	}
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		sendText(login.username, string);
		sendText(login.password, string2);
	}

	@Then("I see {string}")
	public void i_see(String string) {
		String errMsg=login.errorMessage.getText();
		Assert.assertTrue("Error Message Mismatch", errMsg.equals(string));
		
	}
	
	@When("I enter invalid username, password and I see Error Message")
	public void i_enter_and(DataTable userCredentials) throws InterruptedException {
		List<Map<String, String>> userInfo=userCredentials.asMaps();
		
		for(Map<String, String> user:userInfo) {
			sendText(login.username, user.get("Username"));
			sendText(login.password, user.get("Password"));
			
			click(login.loginBtn);
			
			String expErrMsg=user.get("ErrorMessage");
			String actErrMsg=login.errorMessage.getText();
			Assert.assertTrue("Error message mismatch", expErrMsg.equals(actErrMsg));
		}		
	}
	
	

}
