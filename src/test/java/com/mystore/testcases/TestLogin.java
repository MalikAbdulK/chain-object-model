package com.mystore.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BasceClass;
import com.pageobjects.Loginpage;

public class TestLogin extends BasceClass {
	Loginpage lg;
	
	
	
	@BeforeMethod
    public void setup() {
		launchapp();
	}
	@AfterMethod
	public void Quit() {
		driver.quit();
	}
	
	@Test(groups = "smoke")
	public void logn() {
		lg = new Loginpage();
		lg.logg();
		
		
	}	
}
		
		
	

