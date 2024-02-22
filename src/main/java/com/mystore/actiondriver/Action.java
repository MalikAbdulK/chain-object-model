package com.mystore.actiondriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mystore.base.BasceClass;

public class Action extends  BasceClass {
	
	// getting url
	public static WebDriver url(String url) {
		driver.get(url);
		return driver;
		}
	public static void close() {

		driver.close();
	}

	public static void close_browser() {
		driver.quit();
		
	}
	// Navigate
	public static void navigate_forward() {
		driver.navigate().forward();
	}

	// Click
	public static void click(WebElement element) {
		element.click();
		
	}

	//Clear text
	public static void clear(WebElement element) {
		element.clear();
	}

	//send text
	public static void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
		}


	public static Select dropDownsObject(WebElement element) {
		Select s = new Select(element);
		return s;
	}

	//9 select by value
	public static void selectbyValue(WebElement element, String ind) {
		dropDownsObject(element).selectByValue(ind);
	}

	//10 select by index
	public static void selectbyIndex(WebElement element, int string) {
		dropDownsObject(element).selectByIndex(string);
	}

	//11 select by visible text
	public static void selectbyVisibletext(WebElement element, String sec) {
		dropDownsObject(element).selectByVisibleText(sec);
	}
	public static void screenshot(String loc) throws IOException {
		TakesScreenshot sc= (TakesScreenshot) driver;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File des = new File(loc);
		FileUtils.copyFile(screenshotAs, des);
		
	}
	//drop and up
	public static void scrollup(String suw,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(suw, element);
	}

	//navigate
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	//Navigate-back
	public static void backPage(WebElement element) {
		driver.navigate().back();
	}

	//Navigate-Refresh
	public static void reFresh(WebElement element) {
		driver.navigate().refresh();
	}
	//alert accept
	public static void alert_accept() {
	  Alert a = driver.switchTo().alert();
	  a.accept();
	}
	//alert dismiss
	public static void alert_dismiss() {
		  Alert a = driver.switchTo().alert();
		  a.dismiss();
	}
	//49 frame id
	public static void frameId(String id) {
	driver.switchTo().frame(id);	
	}
	//50 frame index
	public static void frameIndex(int index) {
	driver.switchTo().frame(index);
	}
	//51 frame webelemet
	public static void frameWebelemet(WebElement element) {
	driver.switchTo().frame(element);
	}
	//52 frame exit
	public static void frameExit() {
	driver.switchTo().defaultContent();
	}
	

	public static void isdisplay(WebElement logo) {
		logo.isDisplayed();
	}
	
		
}


