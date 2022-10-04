package com.selenium.browseroptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChrome {
	@Test
	public void testLoginActionsClass() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
//		options.addArguments("--headless");
//		options.addArguments("--disable-notifications");
		options.addArguments("--enable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://in.bookmyshow.com/");

		System.out.println(driver.getTitle());

		

		// how do you run test cases on headless browser.

//		how to open incongnito browser in selenium

//How do you know the confirmation about the page is Loaded<T> successfully?
//		document.readyState = complete by using javascript Executor
//		
//		dom - we can see the document.readystate
//		
//		200 for api response. we can confirm the page loaded successfully.
//		
//		if we receive diff status more then 400 status code then you will see the error page does not loaded successfully

	}
}
