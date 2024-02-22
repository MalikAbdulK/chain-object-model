package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BasceClass;
import com.pageobjects.Loginpage;
import com.pageobjects.SearchPage;

public class TestSearch extends BasceClass {
	SearchPage sp;
	Loginpage lg;

	@BeforeMethod
    public void setup() {
		launchapp();
	}
	@AfterMethod
	public void Quit() {
		//driver.quit();
	}
	@Test(groups = "Smoke")
	public void search() {
		lg =new Loginpage();
	    sp = lg.logg();
	    sp.page_serch();
	 
		
		
	}
	
}
