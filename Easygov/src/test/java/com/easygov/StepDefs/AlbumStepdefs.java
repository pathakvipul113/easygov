package com.easygov.StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AlbumStepdefs {
	TestSessionInitiator test = CucumberHooks.test;

	WebDriver driver;

	@Given("^User click on Add New Album$")
	public void user_click_on_Add_New_Album() throws Throwable {
		test.album.clickAddNewAlbum();
		
	}

	@Then("^ADD NEW ALBUM modal is displayed$")
	public void add_NEW_ALBUM_modal_is_displayed() throws Throwable {
		Assert.assertTrue("ADD NEW ALBUM Modal is not displayed",test.album.albumModalIsDisplayed());

	}
	
	@Then("^Enter Album Title '(.*)' and Description '(.*)'$")
	public void user_enter_Album_Title_Album_test_and_Description_testing_description(String albumTitle, String albumDesc) throws Throwable {
	  test.album.enterAlbTitle(albumTitle);
	  test.album.enterAlbDesc(albumDesc);
	}

	@Then("^Click the save button$")
	public void user_click_the_save_button() throws Throwable {
	   test.album.clickOnSaveButton();
	}

	@Then("^User is able to view the newly created Album with Title '(.*)'$")
	public void user_is_able_to_view_the_newly_created_Album_with_Title_Album_test(String albumTitle) throws Throwable {      
	Assert.assertTrue("New Alubm is not created with title: "+albumTitle,test.album.verifyAlbumExists(albumTitle));
	}

	@Given("^User changes Album name from '(.*)' to '(.*)'")
	public void user_changes_Album_name_from_Album_test__to_Album_test_(String albumTitle, String newAlbumName) throws Throwable {
		test.album.changeAlbumName(albumTitle, newAlbumName);  
	}
	
	@Then("^User is able to view the new Album name '(.*)'")
	public void user_is_able_to_successfully_change_to_new_Album_name_Album_test_(String newAlbumName) throws Throwable {
		newAlbumName = test.album.returnNewAlbumNameGeneratedRandomly();
		Assert.assertTrue("Album name did not changed to :"+newAlbumName,test.album.verifyAlbumExists(newAlbumName)); 
	}
	
	@Given("^Album name '(.*)' exists$")
	public void album_name_Album_test__exists(String newAlbumName) throws Throwable {
		Assert.assertTrue("Album does not exists with name :"+newAlbumName,test.album.verifyAlbumExists(newAlbumName));
	}

	@Then("^User click on Inhand menu of '(.*)'")
	public void user_click_on_Inhand_menu_and_select_delete_Album(String newAlbumName) throws Throwable {
	test.album.clickInhandMenuOfAlbum(newAlbumName);
	    }

	@Then("^click delete Album option$")
	public void select_delete_Album() throws Throwable {
		test.album.clickDeleteAlbumOption( );	
	}

	@Then("^click YES on Confirmation dialog$")
	public void select_yes_on_Confirmation_dialog() throws Throwable {
		test.album.clickYesOnConfirmationDialog();
	}
	
	@Then("^User is able to successfully delete Album name '(.*)'$")
	public void user_is_able_to_successfully_delete_Album_name_Album_test_(String newAlbumName) throws Throwable {
		System.out.println("The status "+test.album.verifyAlbumIsDeleted(newAlbumName));
		Assert.assertTrue("Album with name :"+newAlbumName + " is not deleted",test.album.verifyAlbumIsDeleted(newAlbumName));
	}
	

	@Then("^user click on Inhand menu of '(.*)'$")
	public void user_click_on_Inhand_menu_of_Album_test_(String newName) throws Throwable {
		test.album.userClickOnInHandMenuOfAlbum(newName);
	}
	
	@Then("^select download Album$")
	public void select_download_Album() throws Throwable {
		test.album.selectDownloadAlbum();
	}
	@Then("^user click button GO TO MANAGE DOWNLOADS PAGE$")
	public void go_to_Manage_Downloads_page() throws Throwable {
		test.album.clickGoToManageDownloadsPage();
	}
	
	@Then("^Album '(.*)' is displayed on Manage Downloads page$")
	public void verify_downloaded_Album_is_displayed_on_My_Downloads_page(String albumName) throws Throwable {
		Assert.assertTrue(albumName+ "is not displayed on Manage Downloads page",test.album.verifyDownloadAlbumIsDisplayedonMyDownloadspage(albumName));    
		
	}
	@Then("^'(.*)' is not displayed in the menu$")
	public void download_Album_is_not_displayed_in_the_menu(String newAlbumName) throws Throwable {  
	Assert.assertTrue("Download Album is displayed",test.album.downloadAlbumNotDisplayed(newAlbumName));
	test.album.headerItem();
	}

	@Then("^select Share Album$")
	public void select_Share_Album() throws Throwable {
		test.album.selectShareAlbum();
	}

	@Then("^Copy the shared link$")
	public void copy_the_shared_link() throws Throwable {
		test.album.copySharedLink();
	}

	@Then("^Open copied link in a new window$")
	public void open_copied_link_in_a_new_window() throws Throwable {	
	test.album.openCopiedLinkInNewBrowser();
	    
	}

	@Then("^verify '(.*)' Album is Shared$")
	public void verify_same_Album_is_Shared(String newAlbumName) throws Throwable {
		Assert.assertTrue("Same Album is not shared",test.album.verifyAlbumIsShared(newAlbumName));
	}
}
