package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BasceClass;

public class SearchHotel extends BasceClass {

	@FindBy(id = "radiobutton_0")
	WebElement select;
	
	@FindBy(id = "continue")
	WebElement continu;
	
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	public Bookhotel hotel_search() {
		Action.click(select);
		Action.click(continu);
		return new Bookhotel();
	}
}
