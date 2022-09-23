package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoNAvigationMethods {

	WebDriver driver;

	@Test
	public void testNavigationMethods() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://stackoverflow.com/jobs/companies");
		System.out.println("------------------------");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------");

		driver.navigate().to("https://www.facebook.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------");
		driver.navigate().back();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------");
		driver.navigate().forward();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------");
		driver.navigate().refresh();

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		System.out.println("------------------------");
		
		
//		driver.close();
		
		driver.quit();
	}

}
