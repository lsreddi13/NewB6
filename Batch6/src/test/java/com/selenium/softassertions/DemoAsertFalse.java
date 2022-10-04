package com.selenium.softassertions;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAsertFalse {
	static String url = "https://www.facebook.com/";
	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// webdriver manger setup to use the browser driver.
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the application.

	}
	@Test
	public void testAssertFalse() {
		driver.get(url);
		Boolean exp1 = driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");
		
		Assert.assertTrue(true);
		
		
		Boolean exp2 = driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");
		Assert.assertFalse(false);
		
		Assert.assertNotSame(2, 5); // pass
//		Assert.assertNotSame(3, 5); // fail
		Assert.assertSame(exp1, exp2);
		Assert.assertFalse(false); // pass
		Assert.assertTrue(true); //pass
//		Assert.assertNotEquals(exp1, exp2, url);
//		Assert.assertNotSame(exp1, exp2);
//		Assert.assertNotNull(exp1);
	
		
		
		
	}
}
