package com.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActionClass {

	@Test
	public void testLoginActionsClass() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername")));

		WebElement userName = driver.findElement(By.id("txtUsername"));// xpath
		userName.clear();
		userName.sendKeys("Admin");

		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys("admin123");
		pwd.sendKeys(Keys.ENTER);
		
		
		
//	WebElement loginBtn = driver.findElement(By.id("btnLogin"));
//		WebElement loginBtn = driver.findElement(By.className("button"));
//		loginBtn.click();
	}
}
