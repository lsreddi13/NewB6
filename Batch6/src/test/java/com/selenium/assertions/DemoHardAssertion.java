package com.selenium.assertions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHardAssertion {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// send username : admin and password: admin in url before launching the browser
		driver.get("https://www.facebook.com/");

		String pageTitle = driver.getTitle(); 
		 Assert.assertEquals(pageTitle, "Facebook – log in or sign up");

		driver.findElement(By.id("email")).sendKeys("sasi");
		
	}

}
