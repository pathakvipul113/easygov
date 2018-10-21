package com.easygov.keywords;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.easygov.automation.getpageobjects.GetPage;
import com.google.common.io.Files;

public class Upload extends GetPage{

	String qty =null;
	public Upload(WebDriver driver) {
		super(driver, "Upload");
	}
	
	public void clickSideBarAlbum() {
		hardWait(3);
		element("click_album").click();
	}
	
	public void clickSideBarUpload() {
		hardWait(3);
		element("click_upload").click();
	}
	public String getAlbumName() {
		return element("alb_created").getText();
	}
	
	public void clickAddNewAlbumButton() {
		element("add_new_albm").click();
		
	}
	
	public String getFileContent() {
		return element("file_size").getText();
	}
	
	public boolean verifyAlbumCreated(String albumTitle) {
		return isElementDisplayed("alb_created");
	}
	
	public boolean verifyFileContent(int waitTime) {
		hardWait(waitTime);
		System.out.println(element("file_size").getText());
		System.out.println(qty);
		return getFileContent().contains(qty+" of "+qty);
	}
	
	public boolean verifyUserIsUploadPage() {
		hardWait(3);
		return isElementDisplayed("upload_page");
	}
	
	public void SelectAlbumFromDropdown(String alb) {
		
	Select dropdown = new Select(element("dropdown"));

		dropdown.selectByVisibleText(alb);
		
	}
	
	public void closeDialog() {
		element("close_dialog").click();
		hardWait(1);
	}
	
	public void selectImageFilesAndUpload(String fileqty) {
		
		File folder = new File("D:\\iMemoriesmedia\\Travel.jpg");
		   String filesList = "";
		   filesList= folder.getAbsolutePath();
		   System.out.println("Checking for Element");
		   elementWithoutWait("click_select").sendKeys(filesList);
		   System.out.println(element("file_size").getText());
		   String ext = Files.getFileExtension(filesList);
	       System.out.println(ext); 
		   qty = fileqty;
		  
	}
	
	
	
	public boolean verifyUpload(int waitTime) {
		hardWait(waitTime);
		
		boolean displayed = isElementDisplayed("upload_dlg");
		return displayed;	
	}
	
public void selectVideoFilesAndUpload() {
		
		File folder = new File("D:\\\\DCIM\\\\Camera\\1.jpg");
//		   File[] files = folder.listFiles();
		   String filesList = "";
//		   for(int i = 0; i < files.length;i++){
//		       filesList += (i != 0 ?"\n":"") + files[i].getAbsolutePath();
//		   }
		   filesList= folder.getAbsolutePath();
		   System.out.println("Checking for Element");
		   elementWithoutWait("click_select").sendKeys(filesList);
		   //hardWait(15);
	}

public void selectImageFilesAndBulkUpload() {
	
	File folder = new File("C:\\Users\\Vipul\\Desktop\\WAU");
	   File[] files = folder.listFiles();
	   String filesList = "";
	   for(int i = 0; i < files.length;i++){
	       filesList += (i != 0 ?"\n":"") + files[i].getAbsolutePath();
	       String ext = Files.getFileExtension(filesList);
	       System.out.println(ext); 
	   }
	   System.out.println("Checking for Element");
	   elementWithoutWait("click_select").sendKeys(filesList);
	   //hardWait(15);
}

public void selectVideoFilesAndBulkUpload() {
	
	File folder = new File("C:\\Users\\Vipul\\Desktop\\Video");
	   File[] files = folder.listFiles();
	   String filesList = "";
	   for(int i = 0; i < files.length;i++){
	       filesList += (i != 0 ?"\n":"") + files[i].getAbsolutePath();
	   }
	   System.out.println("Checking for Element");
	   elementWithoutWait("click_select").sendKeys(filesList);
	   //hardWait(15);
}
public void selectImageVideoFilesAndBulkUpload() {
	
	File folder = new File("C:\\Users\\Vipul\\Desktop\\Mix");
	   File[] files = folder.listFiles();
	   String filesList = "";
	   for(int i = 0; i < files.length;i++){
	       filesList += (i != 0 ?"\n":"") + files[i].getAbsolutePath();
	   }
	   System.out.println("Checking for Element");
	   elementWithoutWait("click_select").sendKeys(filesList);
	   //hardWait(15);
}
public boolean verifyUploadProgress() {
	boolean displayed = isElementDisplayed("upload_prgrs");
	hardWait(5);
	return displayed;	
	
}
	
}
