package com.selenium.cookies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCookies2 {

	@Test
	public void testCookies() throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		

//		;
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("before : " + cookies);
		Cookie cok = new Cookie("sasi1", "cookies1");
		driver.manage().addCookie(cok);
		
		driver.manage().addCookie(new Cookie("sasi2", "cookies2"));
		

		Thread.sleep(3000);

		Set<Cookie> cookies2 = driver.manage().getCookies();
		System.out.println("after " + cookies2);
				

	}
}
