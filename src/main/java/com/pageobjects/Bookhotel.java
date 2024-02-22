package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BasceClass;

public class Bookhotel extends BasceClass {
	
	@FindBy(xpath =  "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[12]/td[2]/input")
	WebElement first_name;
	
	@FindBy(id ="last_name")
	WebElement last_name;
	
	@FindBy(id = "address")
	WebElement address;
	
	@FindBy(id = "cc_num")
    WebElement ccnumber;
	
	@FindBy(id = "cc_type")
	WebElement creditcard_type;
	
	@FindBy(id = "cc_exp_month")
	WebElement exp_month;
	
	@FindBy(id = "cc_exp_year")
	WebElement exp_years;
	
	@FindBy(id = "cc_cvv")
	WebElement cvv;
	
	@FindBy(id = "book_now")
	WebElement book;
	
	public Bookhotel() {
		PageFactory.initElements(driver, this);
	}
	
	public void booking_hotel() {
		Action.sendkeys(first_name, "Malik");
		Action.sendkeys(last_name, "kamalbasha");
		Action.sendkeys(address, "87/78, nesavukara st , krishnagiri");
		Action.sendkeys(ccnumber, "5469123443261256");
		Action.selectbyIndex(creditcard_type, 3);
		Action.selectbyIndex(exp_month, 4);
		Action.selectbyIndex(exp_years, 5);
		Action.sendkeys(cvv, "667");
		Action.click(book);
		

		
		
	}
	
	
	
}
