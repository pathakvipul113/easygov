package com.easygov.StepDefs;

import org.junit.Assert;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AlbumMediaAssetViewStepdefs {
	TestSessionInitiator test = CucumberHooks.test;
	
	@Given("^User click on the existing Album '(.*)'$")
	public void user_click_on_the_existing_Album_Album(String newAlbumName) throws Throwable {
	Assert.assertTrue("Album does not exists with name :"+newAlbumName,test.discs.verifyAlbumExists(newAlbumName));
	    
	}

	@Then("^User Select a file$")
	public void user_Select_a_file() throws Throwable {
		test.mediaassetview.clickSelectbutton();
	   test.mediaassetview.selectFile();    
	}
	
	@Then("^User Select a file to share$")
	public void user_Select_a_file_to_share() throws Throwable {
		test.mediaassetview.clickSelectbutton();
	   test.mediaassetview.selectFile();    
	}
	
	@Then("^User Select a file to delete$")
	public void user_Select_a_file_to_delete() throws Throwable {
		test.mediaassetview.clickSelectbutton();
	   test.mediaassetview.selectFileToDelete(); 
	}
	
	@Then("^Delete the selected file$")
	public void delete_the_selected_file() throws Throwable {
		test.mediaassetview.clickDeletebutton(); 
		Assert.assertTrue("Delete dialog is not displayed",test.mediaassetview.DeleteDialogIsDisplayed());
		test.mediaassetview.clickYesbutton(); 
	}
	
	@Then("^User should be able to delete the selected file successfully$")
	public void user_should_be_able_to_delete_the_selected_file_successfully() throws Throwable {
				
	}
	
	@Then("^Add selected file to a disc$")
	public void add_selected_file_to_a_disc() throws Throwable {
		test.mediaassetview.clickAddToDiscbutton();
		Assert.assertTrue("Add to Disc dialog is not displayed",test.mediaassetview.AddToDiscDialogIsDisplayed());
		test.mediaassetview.clickNewDisccbutton();
		Assert.assertTrue("Disc dialog is not displayed",test.mediaassetview.DiscDialogIsDisplayed());
		test.discs.enterTitle();
		test.mediaassetview.enterSubTitle();
		test.mediaassetview.clickSaveButton();
		test.mediaassetview.clickBackButton();
		test.discs.clickSideBarDiscs();
	    	}

	@Then("^User should be able to add the selected file to a disc successfully$")
	public void user_should_be_able_to_add_the_slected_file_to_a_disc_successfully() throws Throwable {
		Assert.assertTrue("Disc is not created",test.discs.verifyDiscExists());	
		Assert.assertTrue("File count is incorrect",test.discs.verifydiscStatus());		
	}

	@Then("^Share the selected file via shared link$")
	public void share_the_selected_file_via_shared_link() throws Throwable {
		test.mediaassetview.clickShare();
		test.mediaassetview.sharedImage();
	}

	@Then("^User should be able to share the selected file successfully$")
	public void user_should_be_able_to_share_the_slected_file_successfully() throws Throwable {
	    
	}
	

}
