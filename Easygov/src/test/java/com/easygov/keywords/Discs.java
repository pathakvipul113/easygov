package com.easygov.keywords;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.easygov.automation.getpageobjects.GetPage;

public class Discs extends GetPage {
	private String step1 = "STEP 1: WHAT KIND OF DISC?";
	private String success = "SUCCESS!";
	String title = "";
	WebElement ele=null;
	
	WebElement edit;
	public Discs(WebDriver driver) {
		super(driver, "Discs");
	}
	
	public void clickSideBarDiscs() {
		hardWait(3);
		element("click_discs").click();
	}
	
	public boolean verifyUserIsdiscsPage() {
		hardWait(3);
		return isElementDisplayed("discs_page");
	}
	
	public void clickStartWizardButton() {
		hardWait(2);
		element("start_wizard").click();
	}

	public String getStepMessage() {
		return element("header").getText();
	}
	
	public boolean verifyUserIsOnStep1() {
		hardWait(5);
		return getStepMessage().contains(step1);
	}
	
	public void selectPhotoRadioButton() {
		hardWait(3);
		element("photo_radio").click();
	}
	
	public void clickNextButton() {
		hardWait(3);
		element("next_button").click();
	}
	
	public void selectSelectedMediaRadioButton() {
		hardWait(3);
		element("selected_media").click();
		hardWait(3);
	}
	
	public List<WebElement> listOfAlbumTitles() {
		  List<WebElement> albumTitles = elementsScrolled("alb_title_list");
		  return albumTitles;
		 }
	
	public List<WebElement> listOfAlbumMenu() {
		List<WebElement> albumTitles = elements("alb_image");
		return albumTitles;
	}
	
	public List<WebElement> listOfDiscTitles() {
		List<WebElement> discTitles = elementsScrolled("disc_title");
		return discTitles;
	}
	
	public List<WebElement> listOfDiscMenu() {
		List<WebElement> discMenu = elements("disc_menu");
		return discMenu;
	}
	
	public List<WebElement> listOfDiscStatus() {
		List<WebElement> discStatus = elementsScrolled("disc_status");
		return discStatus;
	}
	
	public boolean verifyAlbumExists(String albumTitle) {

		hardWait(5);
		boolean status = false;
		for (int i = 0; i < listOfAlbumTitles().size(); i++) {
			if (listOfAlbumTitles().get(i).getText().contains(albumTitle)) {
				status = true;
				listOfAlbumMenu().get(i).click();
				break;
				
			}
		}
		return status;
	}
	public boolean verifyAlbumExists1(String albumTitle) {

		hardWait(5);
		boolean status = false;
		for (int i = 0; i < listOfAlbumTitles().size(); i++) {
			if (listOfAlbumTitles().get(i).getText().contains(albumTitle)) {
				status = true;
				listOfAlbumMenu().get(i).click();
				break;
				
			}
		}
		return status;
	}
	
	public boolean verifyDiscExists() {

		hardWait(5);
		boolean status = false;
		for (WebElement we : listOfDiscTitles()) {
			if (we.getText().contains(title)) {
				status = true;
				ele = we;
				break;
				
			}
		}
		return status;
	}
	
	public void enterTitle() {
		hardWait(2);
		WebElement w = element("title");
		title= "Disctest";
		w.sendKeys(title);
	}
	
	public void selectfiles() {
		element("slct_file").click();
	}
	
	public boolean clickInhandMenuOfDisc(String discName) throws InterruptedException {

		hardWait(3);
		boolean status = false;

		for (int i = 0; i < listOfDiscTitles().size(); i++) {
			if (listOfDiscTitles().get(i).getText().contains(discName)) {
				listOfDiscMenu().get(i).click();
				status = true;
				break;
			}
		}
		return status;
	}
	
	
	public boolean verifydiscStatus() throws InterruptedException {

		hardWait(3);
		boolean status = false;

		for (int i = 0; i < listOfDiscTitles().size(); i++) {
			if (listOfDiscStatus().get(i).getText().contains("1 Photos")) {
				status = true;
				break;
			}
		}
		return status;
	}
	
	public void clickDeleteDiscOption() {
		element("dlte_disc").click();
	}
	
	public void clickYesOnConfirmationDialog() throws InterruptedException {
		hardWait(1);
		element("cnfrm_dialog").click();
		hardWait(3);
	}
	
	public boolean verifyDiscIsDeleted(String disc) {

		hardWait(5);
		boolean status = true;
		for (WebElement we : listOfDiscTitles()) {
			if (we.getText().contains(disc)) {
				status = false;
				break;
			}
		}
		return status;
	}
	
	public void clickSavebutton() {
		hardWait(3);
		element("save_button").click();
		hardWait(3);
	}
	
	public void consolidate_album() {
		hardWait(3);
		element("consolidate").click();
		hardWait(3);
	}
	
	public void clickFinishButton() {
		hardWait(5);
		element("next_button").click();
		
	}
	
	public boolean verifyDisccoverIsDisplayed() {
		hardWait(5);
		return isElementDisplayed("disc_cover");
	}
	public boolean discsExists(String disc) {
		hardWait(5);
		return getDiscTitle().contains(disc);
	}
	
	public String getDiscTitle() {
		return element("disc_title").getText();
	}
	
	public boolean discsExistsdiscCreated() {
		hardWait(5);
		return getSuccessMessage().contains(success);
	}
	
	public String getSuccessMessage() {
		return element("success_msg").getText();
	}
		
}


