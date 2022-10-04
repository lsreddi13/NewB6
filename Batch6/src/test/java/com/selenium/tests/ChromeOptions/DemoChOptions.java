package com.selenium.tests.ChromeOptions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChOptions {

	@Test
	public void test() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
//		options.addArguments("--ignore-certificate-errors");
//		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		options.addArguments("incognito");
//		options.addArguments("test-type");
//		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("sasidhar_cdp@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("IndiaN12!");
		driver.findElement(By.name("login")).click();
		
		Set<Cookie> coo = driver.manage().getCookies();
		System.out.println(coo);
		for (Cookie c : coo) {
			System.out.println(c.getDomain() + c.getName() + c.getPath() + c.getValue() +  c.isSecure());
		}
		

	}

}
