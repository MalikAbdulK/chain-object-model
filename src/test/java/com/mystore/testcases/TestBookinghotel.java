package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BasceClass;
import com.pageobjects.Bookhotel;
import com.pageobjects.Loginpage;
import com.pageobjects.SearchHotel;
import com.pageobjects.SearchPage;

public class TestBookinghotel extends BasceClass {
	Loginpage lg;
	SearchPage sg;
	SearchHotel sh;
	Bookhotel bh;
	

@BeforeMethod
public void setup() {
	launchapp();
	
}
//@AfterMethod
//public void Quit() {
//	driver.quit();
//}

@Test
public void booking() {
 lg= new Loginpage();
 sg =  lg.logg();
 sh = sg.page_serch();
 bh = sh.hotel_search();
 bh.booking_hotel();
 
 
 




}




}