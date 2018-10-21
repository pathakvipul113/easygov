package com.easygov.keywords;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.easygov.automation.getpageobjects.GetPage;

public class AlbumMediaAssetView extends GetPage {
	String c= "";
	WebElement edit;
	String[] mytext = {};

	public AlbumMediaAssetView(WebDriver driver) {
		super(driver, "AlbumMediaAssetView");
	}

	public void clickSelectbutton() {
		hardWait(5);
		element("select_header").click();
		hardWait(5);
	}
	
	public List<WebElement> listOfAlbumTitles() {
		  List<WebElement> albumTitles = elementsScrolled("alb_title_list");
		  return albumTitles;
		 }
	
	public List<WebElement> listOfAlbumMenu() {
		List<WebElement> albumTitles = elements("alb_image");
		return albumTitles;
	}
	
	public boolean verifyAlbumExists(String albumTitle) {

		hardWait(3);
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
	
	public void selectFile() {
		hardWait(3);
	Random r = new java.util.Random();
    List<WebElement> files = driver.findElements(By.xpath(".//*[@id='content-layout']/div[2]/div/div[2]/div[1]/div[2]"));
    if(!files.isEmpty()) {
    WebElement randomElement = files.get(r.nextInt(files.size()));
    randomElement.click();
}}
	
	public void selectFileToDelete() {
		hardWait(3);
		element("second_photo").click();
	}
	
	public void clickAddToDiscbutton() {
		hardWait(5);
		element("add_to_disc").click();
	}
	
	public boolean AddToDiscDialogIsDisplayed() {
		return (element("adddiscdialog").isDisplayed());
	}
	
	public void clickNewDisccbutton() {
		hardWait(5);
		element("new_disc").click();
		hardWait(5);
	}
	
	public boolean DiscDialogIsDisplayed() {
		return (element("disc_dialog").isDisplayed());
	}
	
	public void enterTitle(String title) {
		hardWait(2);
		WebElement w = element("title");
		title= "Disctest";
		w.sendKeys(title);
	}
	
	public void enterSubTitle() {
		hardWait(2);
		element("subtitle").sendKeys("Discsub");
	}
	
	public void clickSaveButton() {
		hardWait(2);
		element("save_button").click();
		hardWait(3);
	}
	
	public void clickBackButton() {
		hardWait(2);
		element("bck_button").click();
		hardWait(3);
	}
	
	public void sharedImage() {
		hardWait(2);
		WebElement img = element("header_img");
		String att =img.getAttribute("src");	
		System.out.println(att); 
		String substr = ".jpg";
		String substr1 = "mb/";
		int pos = att.indexOf(substr);
		int pos1 = att.indexOf(substr1);
		String c= att.substring(pos1+3,pos);
		System.out.println(c); 
			 
		 }	
	public void clickShare() {
		hardWait(2);
		element("share_header").click();
	}
	
	public void clickDeletebutton() {
		hardWait(2);
		element("delete_header").click();
	}
	
	public boolean DeleteDialogIsDisplayed() {
		return (element("delete_dialog").isDisplayed());
	}
	
	public void clickYesbutton() {
		hardWait(2);
		element("yes_btn").click();
	}
	
  public List<WebElement> listOfItems() {
		  List<WebElement> items = elements("items");	  
		  return items;
		 }
  
  public boolean delete()
  {  
	  boolean status = false;
	if(listOfItems().size()== listOfItems().size()-1) {
		status = true;
	}
	return status;  
  }	
	
}