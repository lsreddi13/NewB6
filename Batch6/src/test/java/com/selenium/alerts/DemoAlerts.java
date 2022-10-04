package com.selenium.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlerts {
	WebDriver driver;

	@Test(priority = 0)
	public void testSimpleAlert() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("See an example alert")).click();
		driver.switchTo().alert().dismiss();
	}

	@Test(priority = 1)
	public void testConfirmationAlert() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("See a sample confirm")).click();
		driver.switchTo().alert().accept();

	}

	@Test(priority = 2)
	public void testPromptAlert() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("See a sample prompt")).click();
		Alert a = driver.switchTo().alert();
		String value = a.getText();
		System.out.println("Alert value : " + value);
		a.sendKeys("selenium automation");
		a.accept();
		
	}

	@BeforeClass
	public void test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
