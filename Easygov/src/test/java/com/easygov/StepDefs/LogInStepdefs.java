package com.easygov.StepDefs;

import static com.easygov.automation.utils.YamlReader.getYamlValue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepdefs {
	TestSessionInitiator test = CucumberHooks.test;

	WebDriver driver;

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_valid_password() throws Throwable {
		test.login.clicklang();
//		test.login.enterUsername(getYamlValue("credentials.login_username"));
//	test.login.enterPassword(getYamlValue("credentials.login_password"));
//	test.login.clickSubmit();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		test.login.clickSubmit();
		Assert.assertTrue("User is not on the Albums page", test.album.verifyUserIsOnEmptyAlbumPage());
	}
	
	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
		Assert.assertTrue("User is not on the Albums page", test.album.verifyUserIsOnAlbumPage());
	}
	

	@Then("^User clicks on Signup button$")
	public void user_clicks_on_Signup_button() throws Throwable {
		test.login.clickSignUp();
	}
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    test.login.verifyUserIsOnLoginPage();
	}
	


}
