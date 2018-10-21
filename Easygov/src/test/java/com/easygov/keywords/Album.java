package com.easygov.keywords;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.easygov.automation.getpageobjects.GetPage;
import com.easygov.automation.utils.CustomFunctions;

public class Album extends GetPage {
	WebElement edit;
	WebElement store;
	WebDriver wd;

	private String empty_album_message = "CHOOSE ONE OF THE FOLLOWING TO ADD MEMORIES TO YOUR ACCOUNT:";
	private static String new_Album_name = null;
	
	public Album(WebDriver driver) {
		super(driver, "Album");
	}

	public String getTitle() {
		return getPageTitle();
	}
	
	public String returnNewAlbumNameGeneratedRandomly() {
		return new_Album_name;
	}

	
	public boolean verifyUserIsOnEmptyAlbumPage() {
		hardWait(5);
		return getEmptyAlbumMessage().contains(empty_album_message);
	}
	
	public boolean verifyUserIsOnAlbumPage() {
		hardWait(5);
		return isElementDisplayed("alb_page");
	}

	public String getEmptyAlbumMessage() {
		return element("header").getText();
	}
	
	public void fillValidUsername(String username) {
		element("inp_loginEmail").sendKeys(username);
	}

	public void fillValidPassword(String password) {
		element("inp_loginPassword").sendKeys(password);
		element("btn_submit").click();
	}

	public void clickAddNewAlbum() {
		element("alb_click").click();
	}

	public boolean albumModalIsDisplayed() {
		return (element("alb_modal").isDisplayed());

	}

	public void enterAlbTitle(String albumTitle) {
		element("alb_title").sendKeys(albumTitle);
	}

	public void enterAlbDesc(String albumDesc) {
		element("alb_desc").sendKeys(albumDesc);
	}

	public void clickOnSaveButton() {
		element("alb_save").click();
		hardWait(2);
	}

	public boolean verifyAlbumExists(String albumTitle) {

		hardWait(5);
		boolean status = false;
		for (WebElement we : listOfAlbumTitles()) {
			if (we.getText().contains(albumTitle)) {
				status = true;
				edit = we;
				break;
				
			}
		}
		return status;
	}
	
	public List<WebElement> listOfAlbumTitles() {
		  List<WebElement> albumTitles = elementsScrolled("alb_title_list");
		  return albumTitles;
		 }

	public List<WebElement> listOfAlbumMenu() {
		List<WebElement> albumTitles = elements("alb_menu_title");
		return albumTitles;
	}

	public List<WebElement> listOfMenu1() {
		List<WebElement> albumTitles = elements("alb_pop_menu");
		return albumTitles;
	}

	public List<WebElement> listOfAlbum() {
		List<WebElement> albumTitles = elements("alb_dwnl_title");
		return albumTitles;
	}

	public void changeAlbumName(String albumTitle, String newAlbumName) {
		new_Album_name = CustomFunctions.generateRandomString();
		new_Album_name = new_Album_name+"_"+newAlbumName;
		edit.click();
		driver.switchTo().activeElement().sendKeys(new_Album_name);
		driver.switchTo().activeElement().sendKeys(Keys.RETURN);
		driver.navigate().refresh();
		hardWait(7);
	}


	public boolean clickInhandMenuOfAlbum(String newAlbumName) throws InterruptedException {

		hardWait(5);
		boolean status = false;

		for (int i = 0; i < listOfAlbumTitles().size(); i++) {
			if (listOfAlbumTitles().get(i).getText().contains(newAlbumName)) {
				listOfAlbumMenu().get(i).click();
				status = true;
				break;
			}
		}
		return status;
	}

	public void clickDeleteAlbumOption() {
		element("alb_delete_context_menu").click();
	}

	public void clickYesOnConfirmationDialog() throws InterruptedException {
		hardWait(1);
		element("alb_delete_btn").click();
		hardWait(3);
	}

	public boolean verifyAlbumIsDeleted(String newAlbumName) {

		hardWait(5);
		boolean status = true;
		for (WebElement we : listOfAlbumTitles()) {
			if (we.getText().contains(newAlbumName)) {
				status = false;
				break;
			}
		}
		return status;
	}


	public void selectDownloadAlbum() {
		element("alb_down_context_menu").click();
	}

	public void clickGoToManageDownloadsPage() {
		element("alb_mng_dwld").click();
	}

	public boolean verifyDownloadAlbumIsDisplayedonMyDownloadspage(String albumName) {

		hardWait(5);
		boolean status = false;
		for (WebElement we : listOfAlbum()) {
			if (we.getText().contains(albumName)) {
				status = true;
				break;
			}
		}
		return status;

	}

	public boolean verifyAlbumNameavailable(String AlbumExist) {

		hardWait(5);
		boolean status = false;
		for (WebElement we : listOfAlbumTitles()) {
			if (we.getText().contains(AlbumExist)) {
				status = true;
				break;
			}
		}
		return status;

	}

	public boolean userClickOnInHandMenuOfAlbum(String newName) throws InterruptedException {

		hardWait(5);
		boolean status = true;

		for (int i = 0; i < listOfAlbumTitles().size(); i++) {
			if (listOfAlbumTitles().get(i).getText().contains(newName)) {
				listOfAlbumMenu().get(i).click();

				status = true;
				break;
			}
		}

		return status;
	}

	public boolean downloadAlbumNotDisplayed(String newAlbumName) throws InterruptedException {

		boolean status = true;

		for (int i = 0; i < listOfMenu1().size(); i++) {
			if (listOfMenu1().get(i).getText().contains("Download Album")) {
				status = false;
				driver.navigate().refresh();
				break;
			}
		}

		return status;
		
	}

	public void selectShareAlbum() {
		element("alb_share_context_menu").click();
	}

	public void copySharedLink() {
		element("copy_shrd_link").click();
	}

	public void openCopiedLinkInNewBrowser() throws AWTException, UnsupportedFlavorException, IOException {

		String winHandleBefore = driver.getWindowHandle();
		System.out.println(winHandleBefore);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		System.out.println("String from Clipboard:" + result);

		wd = new ChromeDriver();
		wd.get(result);
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();

	}

	public boolean verifyAlbumIsShared(String newAlbumName) throws InterruptedException {

		String albumName = wd.findElement(By.cssSelector(".js_now_playing_title")).getText();
		System.out.println(albumName);
		wd.close();
		boolean status = albumName.equals("fgf");
		System.out.println(status);
		return albumName.equals("fgf");
	}
	
	public void headerItem() {
		element("header_item").click();
		hardWait(2);
	}

}
