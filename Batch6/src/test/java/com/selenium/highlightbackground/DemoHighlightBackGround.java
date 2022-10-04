package com.selenium.highlightbackground;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoHighlightBackGround {

	@Test
	public void testScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

//		try {

			driver.findElement(By.id("txtUsername")).sendKeys("Admin");

			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.sendKeys("admin123");
			JavascriptExecutor kk = (JavascriptExecutor) driver;
			kk.executeScript("arguments[0].setAttribute('style', 'background: Red; border: 2px solid blue;');", pwd);

	}		
}
