package com.selenium.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProperties {
	WebDriver driver; //decalred instance var

	String app_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	
//	@BeforeMethod //testng annotatiobn
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver();
//	}

	@Test // test annotation
	public void testPropertiesFile() throws IOException {
		
		driver.get(app_url);
		
		Properties properties = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\b6_workspace\\Batch6\\config.properties");
		properties.load(fis);
		
		String url = properties.getProperty("url");
		
		String uName = properties.getProperty("userName");
		
		String pwd = properties.getProperty("password");
		
		
		
		
		String act_pageTitle = driver.getTitle();
		Assert.assertEquals(act_pageTitle, "dfasdf");// comparing the page title by using assertion

	}
	
	
	@Test // test annotation
	public void testPropertiesFile2() {
		

		driver.get(app_url);

		String act_pageTitle = driver.getTitle();
		Assert.assertEquals(act_pageTitle, "dfasdf");// comparing the page title by using assertion

	}

}
