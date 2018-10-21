package com.easygov.StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignoutStepdefs {
	TestSessionInitiator test = CucumberHooks.test;

	/*@Given("^User is on home page of the application$")
	public void user_is_on_home_page_of_the_application() throws Throwable {
	    Assert.assertTrue("User is not on the home page of the application", test.signout.isUserOnHomePage());
	}
*/
	@Given("^User click on hamburger_menu button$")
	public void user_click_on_hamburger_menu_button() throws Throwable {
		test.signout.clickHamIcon();
	}

	@Given("^User click on sign_out button$")
	public void user_click_on_sign_out_button() throws Throwable {
	    test.signout.clickSignoutbtn();
	}

	@Then("^Signout confirmation dialog is displayed$")
	public void signout_confirmation_dialog_is_displayed() throws Throwable {
	    Assert.assertTrue("Signout Confirmation dislog is not displayed", test.signout.IsYesBtnDisplayed());
	}

	@Then("^User click on Yes button$")
	public void user_click_on_Yes_button() throws Throwable {
	   test.signout.clickYesBtn();
	}

	@Then("^User is successfully able to signout from the application$")
	public void user_is_successfullt_able_to_signout_from_the_application() throws Throwable {
	    Assert.assertTrue("User is not able to Signout from the application", test.signout.afterSignoutPage().contains("Why  iMemories"));
	}


}
