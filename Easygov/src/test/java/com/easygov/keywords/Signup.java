package com.easygov.keywords;

import org.openqa.selenium.WebDriver;

import com.easygov.automation.getpageobjects.GetPage;


public class Signup extends GetPage {

	private String existing_user_message = "You already have an account with iMemories. Click here to log in to gain access to your existing iMemories account.";
	
	public Signup(WebDriver driver) {
		super(driver, "Signup");
	}

	public String getTitle() {
		return getPageTitle();
	}

	public void enterFirstName(String firstname) {
		element("inp_firstname").sendKeys(firstname);

	}

	public void enterLastName(String lastname) {
		element("inp_lastname").sendKeys(lastname);
	}

	public void enterEmail(String email) {
		element("inp_email").sendKeys(email);
	}

	public void enterPassword(String password) {
		element("inp_password").sendKeys(password);
	}

	public void clickSignUp() {
		element("btn_sign").click();
		hardWait(5);
	}
	
	public void clickLogin() {
		hardWait(3);
		element("click_login").click();
		
	}

	public String getExistingUserMessage() {
		return element("accnt_not_created").getText();
	}

	public boolean verifyExistingUser() {
		
		return getExistingUserMessage().contains(existing_user_message);
		
	}
}
