package com.easygov.StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class UploadStepdefs {
	
	TestSessionInitiator test = CucumberHooks.test;

	WebDriver driver;

	@When("^User click on Upload button from the left sidebar$")
	public void user_click_on_Upload_button_from_the_left_sidebar() throws Throwable {
		test.upload.clickSideBarUpload();
	}
	
	@Then("^User should be successfully navigated to Upload page$")
	public void user_should_be_successfully_navigated_to_Upload_page() throws Throwable { 
		Assert.assertTrue("User is not on Upload page,test",test.upload.verifyUserIsUploadPage());
	}
	
	@Given("^User open the Upload Dialog popup$")
	public void user_click_on_Add_New_Album() throws Throwable {
		test.upload.clickAddNewAlbumButton();
	}
	
	@Then("^User is able to view the newly created Album with Title '(.*)' in Upload to dropdown$")
	public void user_is_able_to_view_the_newly_created_Album_with_Title_Upload_Album_in_Upload_to_dropdown(String albumTitle) throws Throwable {
		Assert.assertTrue("New Alubm is not created with title: "+albumTitle+"Actual Album title :"+test.upload.getAlbumName(), albumTitle == test.upload.getAlbumName());
	}
	
	@Given("^User select album '(.*)' from upload dropdown$")
	public void user_select_album_fgf_from_upload_dropdown(String albname) throws Throwable {
		test.upload.SelectAlbumFromDropdown(albname);
	}

	@Given("^User upload '(.*)' image/s file in album '(.*)'$")
	public void user_upload_1_images_file_in_album_test_album(String fileqty, String abc) throws Throwable {
		test.upload.selectImageFilesAndUpload(fileqty);
	}
	
	
	
}
