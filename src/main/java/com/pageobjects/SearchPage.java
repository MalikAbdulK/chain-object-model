/**
 * 
 */
package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BasceClass;

/**
 * 
 */
public class SearchPage extends BasceClass {

	@FindBy(xpath = "//*[@name = \"location\"]")
	WebElement location;
	
	@FindBy(xpath = "//*[@name=\"hotels\"]")
	WebElement hotels;
	
	@FindBy(id=	"room_type")
	WebElement roomtype;
	
	@FindBy(xpath = "//select[@name=\"room_nos\"]")
	WebElement numberofrooms;
	
	@FindBy(xpath = "//input[@class=\"date_pick\"][1]")
	WebElement checkindate;
	
	@FindBy(xpath = "//input[@name=\"datepick_out\"]")
	WebElement checkoutdate;
	
	@FindBy(id = "adult_room")
	WebElement adultperroom;
	
	@FindBy(id ="child_room")
	WebElement chldroom;
	
	@FindBy(id = "Submit")
	WebElement search;
	

	 public SearchPage() {
			PageFactory.initElements(driver, this);
	
	 }
	
	 public SearchHotel page_serch() {
		 Action.selectbyIndex(location, 3);
		 Action.selectbyValue(hotels, "Hotel Hervey");
		 Action.selectbyVisibletext(roomtype, "Deluxe");
		 Action.selectbyIndex(numberofrooms, 4);
		 Action.clear(checkindate);
		 Action.sendkeys(checkindate, "10/10/2023");
		 Action.clear(checkoutdate);
		 Action.sendkeys(checkoutdate, "15/10/2023");
		 Action.selectbyIndex(adultperroom, 4);
		 Action.selectbyIndex(chldroom, 3);
		 Action.click(search);
		 return new SearchHotel();
		 
	 }
}
