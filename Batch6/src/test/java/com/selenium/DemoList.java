package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoList {

	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		// open application
		driver.get(url);
		
		String uname_xpath = "//input[@name='txtUsername']";
		String pwd_xpath = "//input[@type='password']";
		String loginBtn_xpath = "//input[@value='LOGIN']";
		
		String username = "Admin";
		String password = "admin123";

		
		
		// enter user name
		
//		driver.findElement(By.xpath(uname_xpath)).sendKeys(username);
		
		
		// enter password
//		driver.findElement(By.xpath(pwd_xpath)).sendKeys(password);
		// click login
		
//		driver.findElement(By.xpath(loginBtn_xpath)).isDisplayed();
//		System.out.println("Login button is displayed ? : "+driver.findElement(By.xpath(loginBtn_xpath)).isDisplayed());

//		Assert.assertEquals(actual value, expected value, message);
		
//		Assert.assertEquals(driver.findElement(By.xpath(loginBtn_xpath)).isDisplayed(), false, "test failed login button not displayed.");
		
		Assert.assertNotEquals(driver.findElement(By.xpath(loginBtn_xpath)).isDisplayed(), false, "test failed login button not displayed.");
		
		System.out.println("Test passs");
		
		//		driver.findElement(By.xpath(loginBtn_xpath)).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
