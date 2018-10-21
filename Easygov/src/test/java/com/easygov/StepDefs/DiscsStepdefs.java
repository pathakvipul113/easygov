package com.easygov.StepDefs;

import org.junit.Assert;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DiscsStepdefs {

		TestSessionInitiator test = CucumberHooks.test;

	
	@When("^User click on Discs button from the left sidebar$")
	public void user_click_on_Discs_button_from_the_left_sidebar() throws Throwable {
	   test.discs.clickSideBarDiscs();
	}

	@Then("^User should be successfully navigated to Discs page$")
	public void user_should_be_successfully_navigated_to_Discs_page() throws Throwable {
 Assert.assertTrue("User is not on Discs page,test",test.discs.verifyUserIsdiscsPage());
	}

	@Given("^User clicks on START WIZARD button$")
	public void user_clicks_on_START_WIZARD_button() throws Throwable {
		 test.discs.clickStartWizardButton();
		 Assert.assertTrue("User is not on Step1",test.discs.verifyUserIsOnStep1());
	}

	@Then("^User select media files from Album '(.*)' and '(.*)' of Photo DVD Disc type$")
	public void user_select_media_files_from_Album_fgf_and_create_album_test_of_Photo_DVD_Disc_type(String alb1, String alb2) throws Throwable {
		test.discs.selectPhotoRadioButton();
		test.discs.clickNextButton();
		test.discs.selectSelectedMediaRadioButton();
		test.discs.clickNextButton();
	Assert.assertTrue("Album does not exists with name :"+alb1,test.discs.verifyAlbumExists(alb1));
	test.discs.selectfiles();
	test.discs.clickSavebutton();
	Assert.assertTrue("Album does not exists with name :"+alb2,test.discs.verifyAlbumExists1(alb2));
	test.discs.selectfiles();
	test.discs.clickSavebutton();
	test.discs.clickNextButton();	
	}

	@Then("^user consolidate files into Smaller DVDs$")
	public void user_consolidate_files_into_Smaller_DVDs() throws Throwable {
		test.discs.consolidate_album();
		test.discs.clickNextButton();
	}

	@Then("^User should be able to create consolidated Photo DVD Disc '(.*)'$")
	public void user_should_be_able_to_create_consolidated_Photo_DVD_Disc_Disc1(String disc) throws Throwable {
		Assert.assertTrue("Disc cover is not displayed",test.discs.verifyDisccoverIsDisplayed());	
		Assert.assertTrue("Disc is not created with title "+disc ,test.discs.discsExists(disc));
		test.discs.clickFinishButton();
		Assert.assertTrue("Success message is not displayed",test.discs.discsExistsdiscCreated());
		test.discs.clickSideBarDiscs();
		Assert.assertTrue("Disc is not created with title "+disc ,test.discs.discsExists(disc));
	}
	

}
