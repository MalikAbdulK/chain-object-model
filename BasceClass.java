package com.mystore.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasceClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	

		@BeforeTest
		public void cong() throws Exception {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Malik\\eclipse-workspace\\MyStoreProject\\Configuration\\Config.properties");
		prop.load(file);
		
		}
	 
		public static void launchapp() {
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		} else {
			System.err.println("launch browser");
			
			}
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
}

		
