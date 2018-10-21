package com.easygov.StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.easygov.automation.TestSessionInitiator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FullScreenStepdefs {
	TestSessionInitiator test = CucumberHooks.test;
	WebDriver driver;
	@Then("^User click on 'fgf' album$")
	public void user_click_on_fgf_album() throws Throwable {
	    test.fullscreen.clickAlbum();
	}

	@Then("^User should be able to access Media Asset page$")
	public void user_should_be_able_to_access_Media_Asset_page() throws Throwable {
		Assert.assertTrue("Media is not displayed",test.fullscreen.verifyMediaDisplayed());

	}

	@Then("^User click on any media file$")
	public void user_click_on_any_media_file() throws Throwable {
		test.fullscreen.clickMedia();
	}

	@Then("^User should be able to view media file in Full Screen View$")
	public void user_should_be_able_to_view_media_file_in_Full_Screen_View() throws Throwable {
		Assert.assertTrue("Full screen is not displayed",test.fullscreen.verifyFullScreenIsDisplayed());
	}
	@When("^User click on next arrow button$")
	public void user_click_on_next_arrow_button() throws Throwable {
		test.fullscreen.clickNextArrow();
	}
	@When("^User click PlayPause button$")
	public void user_click_PlayPause_button() throws Throwable {
		test.fullscreen.clickPlayPause();
}
	
	@Given("^The first media file name is 'star_trails'$")
	public void the_first_media_file_name_is_star_trails() throws Throwable {
		test.fullscreen.firstMediaFileName();
	  
	}

	@Then("^The second media file name is '%(\\d+)EE(\\d+)C(\\d+)BEF(\\d+)FE(\\d+)CDB(\\d+)C(\\d+)A(\\d+)DE(\\d+)BA(\\d+)D(\\d+)A(\\d+)BA(\\d+)%(\\d+)Epimgpsh_fullsize_distr'$")
	public void the_second_media_file_name_is_EE_C_BEF_FE_CDB_C_A_DE_BA_D_A_BA_Epimgpsh_fullsize_distr(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) throws Throwable {
	  
	}

	@Then("^User should be able to view changed media file$")
	public void user_should_be_able_to_view_changed_media_file() throws Throwable {
	   
	}

	@Given("^User close the browser$")
	public void user_close_the_browser() throws Throwable{
		
		
	}


}
