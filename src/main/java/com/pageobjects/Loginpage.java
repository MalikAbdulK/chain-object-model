package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BasceClass;

public class Loginpage extends BasceClass{
	
	//@FindBy(xpath = "//img[@src=\"img/AdactIn_logo.png\"]")
	//WebElement logo;
	
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
 public Loginpage() {
	PageFactory.initElements(driver, this);
	
}
	//public void validlogo() {
		//Action.isdisplay(logo);
		
	//}
	
	public SearchPage logg () {
		Action.sendkeys(username, prop.getProperty("username"));
		Action.sendkeys(password, prop.getProperty("password"));
		Action.click(login);
		return new SearchPage();
		
	}
}
