package com.easygov.keywords;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.easygov.automation.getpageobjects.GetPage;

public class FullScreen extends GetPage{

	public FullScreen(WebDriver driver) {
		super(driver, "FullScreen");
		
	}

	public void clickAlbum() {
		
		String currentURL  = driver.getCurrentUrl();
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(currentURL);
			try {
				HttpResponse response = client.execute(request);
				if (response.getStatusLine().getStatusCode() == 200)
					System.out.println(response.getStatusLine().getStatusCode());
				element("click_album").click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public boolean verifyMediaDisplayed() {
		return isElementDisplayed("click_media");
		
	}
	
	public void clickMedia() throws RuntimeException, IOException, IOException  {
		hardWait(5);
		element("click_media").click();
		hardWait(5);
		}
	
	public boolean verifyFullScreenIsDisplayed() {
		
		return isElementDisplayed("full_screen");
	}
	
	public void firstMediaFileName() {
		
		Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.cssSelector(".header-gradient"));
		 builder.moveToElement(element).build().perform();
		element("info").click();
		String name1 =element("info_name").getText();
		element("info_close").click();
		
	}
	
	
	public void clickNextArrow(){
		
		String currentURL  = driver.getCurrentUrl();
		Actions builder = new Actions(driver);
		WebElement element= null;
		WebElement element1=null;
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(currentURL);
			try {
				HttpResponse response = client.execute(request);
				if (response.getStatusLine().getStatusCode() == 200)
					
				element = driver.findElement(By.cssSelector(".header-gradient"));
				 builder.moveToElement(element).build().perform();
				 element1 = driver.findElement(By.cssSelector(".view-next-arrow"));
				 //element1 = driver.findElement(By.cssSelector(".media-row>.media-control-group:nth-child(2)>.media-control"));
				 element1.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
           hardWait(12);
           
		}
	
	public void clickPlayPause(){
		hardWait(6);
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector(".header-gradient"));
		 builder.moveToElement(element).build().perform();
		 WebElement element2 = driver.findElement(By.cssSelector(".media-row>.media-control-group:nth-child(2)>.media-control"));
		 element2.click();
		 hardWait(8);	
	
	}}
