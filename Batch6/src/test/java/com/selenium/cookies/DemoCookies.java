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

public class DemoCookies {

	@Test
	public void testCookies() throws InterruptedException {

		String url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String url2 = "https://www.amazon.in/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		

//		Cookie cok = new Cookie("fasd", "fasd");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("before : " + cookies);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		WebElement pwdInputBox = driver.findElement(By.id("txtPassword"));
		pwdInputBox.sendKeys("admin123");
		pwdInputBox.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		Set<Cookie> cookies2 = driver.manage().getCookies();
		System.out.println("after " + cookies2);
		String str2 = null;
		for (Cookie ck2 : cookies2) {
			str2 = ck2.getName();
			System.out.println(str2);

		}

		driver.manage().deleteAllCookies();

		driver.manage().deleteCookieNamed(str2);

		driver.navigate().refresh();
		

	}
}
