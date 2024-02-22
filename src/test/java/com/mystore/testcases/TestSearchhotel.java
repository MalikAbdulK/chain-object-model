package com.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BasceClass;
import com.pageobjects.Loginpage;
import com.pageobjects.SearchHotel;
import com.pageobjects.SearchPage;

public class TestSearchhotel extends BasceClass {
	Loginpage lg;
	SearchPage sg;
	SearchHotel sh;
	
	@BeforeMethod
    public void setup() {
		launchapp();
	}
	
	
	
	@Test
	public void hotel_search() {
		lg = new Loginpage();
		sg = lg.logg();
		sh=sg.page_serch();
		sh.hotel_search();
	}
	

}
