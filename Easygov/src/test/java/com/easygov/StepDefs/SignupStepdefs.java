package com.easygov.StepDefs;

import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;
import com.easygov.automation.utils.CustomFunctions;

import java.util.List;

import org.junit.Assert;


import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class SignupStepdefs {
	TestSessionInitiator test = CucumberHooks.test;
	WebDriver driver;
	
	@Then("^User enter ([^\"]*) as First Name$")
	public void user_enters_Vipul_as_First_Name(String firstname) throws Throwable {
		test.signup.enterFirstName(firstname);
	}

	@Then("^User enter ([^\\\"]*) as Last Name$")
	public void user_enters_Pathak_as_Last_Name(String lastname) throws Throwable {
		test.signup.enterLastName(lastname);
	}

	@Then("^User enter ([^\\\"]*) as Email address$")
	public void user_enters_matest_com_as_Email_address(String email) throws Throwable {
		test.signup.enterEmail(email);
	}
	
	@Then("^User enter data in the required fields$")
	public void user_enter_following_Email_address(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		String signUpEmailId = data.get(1).get(1).toString();
		String random_email = CustomFunctions.generateUniqueEmailId();
		signUpEmailId = signUpEmailId+random_email;
		test.signup.enterEmail(signUpEmailId);
		String signupPassword = data.get(4).get(1).toString();
		test.signup.enterPassword(signupPassword);
		String signupFirstName = data.get(2).get(1).toString();
		test.signup.enterFirstName(signupFirstName);
		String signupLastName = data.get(3).get(1).toString();
		test.signup.enterLastName(signupLastName);
		
	}

	@Then("^User enter ([^\\\"]*) as password$")
	public void user_enters_as_password(String password) throws Throwable {
		test.signup.enterPassword(password);
	}

	@Then("^User click on SignUp button$")
	public void clicks_on_Signup_button() throws Throwable {
		test.signup.clickSignUp();
	}

	@Then("^new user navigates to empty Albums page$")
	public void user_should_be_able_to_create_new_account_successfully() throws Throwable {
		Assert.assertTrue("Account is not created", test.album.verifyUserIsOnEmptyAlbumPage());
	}

	@Then("^User should not be able to create new account$")
	public void user_should_be_not_be_able_to_create_new_account() throws Throwable {
		Assert.assertTrue("Application is able to signup with existing account",
				test.signup.verifyExistingUser());
		
	}

	@Then("^User click on Login button$")
	public void clicks_on_Login_button() throws Throwable {
		test.signup.clickLogin();
	}
	
}
