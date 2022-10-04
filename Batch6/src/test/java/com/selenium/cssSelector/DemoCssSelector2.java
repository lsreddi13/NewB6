package com.selenium.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCssSelector2 {

	@Test
	public void testCssSelector() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {

			driver.get("https://www.fb.com/");
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);

			// use css to find dyanmmic id

			boolean loginBtnDisplyaed = driver.findElement(By.cssSelector("button[id^='u_0_']")).isDisplayed();
			System.out.println("loginBtnDisplyaed : " + loginBtnDisplyaed);

			driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#month")));
			
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#month > option:first-of-type")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#month > option:last-of-type")).click();
			
			
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#month > option:nth-of-type(4)")).click();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error : " + e);
		} finally {
			driver.close();
		}

//	driver.quit();

	}

}
