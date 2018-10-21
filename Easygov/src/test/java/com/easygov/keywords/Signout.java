package com.easygov.keywords;

import org.openqa.selenium.WebDriver;

import com.easygov.automation.getpageobjects.GetPage;

public class Signout extends GetPage {

	public Signout(WebDriver driver) {
		super(driver, "Signout");
	}

	public boolean isUserOnHomePage() {
		hardWait(5);
		return element("album_title").isDisplayed();
	}

	public void clickHamIcon() {
		element("ham_icon").click();	
	}

	public void clickSignoutbtn() {
		element("signout_btn").click();
	}
	
	/*public String signoutDialog() {
		return element("signout_dialog").getText();
	}*/

	public void clickYesBtn() {
		element("yes_btn").click();	
	}

	public String afterSignoutPage() {
		return element("after_signout").getText();
	}

	public boolean IsYesBtnDisplayed() {
		return element("yes_btn").isDisplayed();
	}
}










