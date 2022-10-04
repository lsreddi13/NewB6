package com.testng.retry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng.parameter.MyRetry;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestclassSample {

	@Test(retryAnalyzer = MyRetry.class)
	public void test2() {
		
	
		
		System.out.println("P2te1 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		Assert.assertEquals(driver.getTitle(), "ddd", "title is not matched.");
	}
	
	@Test
	public void test3() {
		
		Assert.assertEquals(3, 4);
		
//		System.out.println("P2te1 - " + Thread.currentThread().getId());
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.gmail.com");
//		
//		Assert.assertEquals(driver.getTitle(), "ddd", "title is not matched.");
	}
}
