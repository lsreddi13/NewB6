package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.action.AmazonList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
	public void ssss() {
		Assert.assertEquals(2, 3, "fialed");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void addd() {
		
		//
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
		String pageTitle = driver.getTitle();
		System.out.println("Print page title : " + pageTitle);

	}

	@Test
	public void drrr() { //

		driver.get("https://www.facebook.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Print page title : " + pageTitle);

	}
	@BeforeMethod
	public void abc() {
		System.out.println("before method");
	}

	@AfterClass
	public void xyz() {
		driver.close();
	}

}
