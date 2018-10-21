package com.easygov.keywords;

import org.openqa.selenium.WebDriver;

import com.easygov.automation.getpageobjects.GetPage;

public class LoginPage extends GetPage {

	public LoginPage(WebDriver driver) {
		super(driver, "Login");
	}

	public String getTitle() {
		return getPageTitle();
	}

	public void enterUsername(String username) {
		element("inp_loginEmail").sendKeys(username);
	}

	public void enterPassword(String password) {
		element("inp_loginPassword").sendKeys(password);
	}
	
	public void clicklang() {
		element("lang").click();
	}
	
	public void clickSubmit() {
		element("btn_submit").click();
	}
	
	public void clickSignUp() {
		hardWait(3);
		element("btn_click").click();
	}

	public boolean verifyUserIsOnLoginPage() {
		return isElementDisplayed("remember_me_checkbox");
	}
	
}
