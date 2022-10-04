package com.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * print values from dynamic table
 * 
 * print driopdown list values
 * 
 * print driopdown list values into arraylist
 * 
 * 
 * 
 */
public class CopyPasteDemo {
	@Test
	public void testLoginActionsClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		// Performs drag and drop action of sourceEle onto the targetEle
		WebElement s = driver.findElement(By.name("btnI"));
		a.contextClick(s).build().perform();

		s.sendKeys(Keys.DOWN);
		s.sendKeys(Keys.DOWN);

		s.sendKeys(Keys.DOWN);

		s.sendKeys(Keys.DOWN);

		s.sendKeys(Keys.DOWN);

	}
}
