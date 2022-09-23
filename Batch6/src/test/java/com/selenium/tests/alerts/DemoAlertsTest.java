package com.selenium.tests.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlertsTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test(enabled = true, priority = 0)
	public void testSimpleAlert() {
		// click "Click for JS Alert" button and handle the simple alert
		WebElement simpleAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simpleAlertBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test(enabled = true, priority = 1)
	public void testConfirmationAlert() throws InterruptedException {

		// click "Click for JS Alert" button and handle the simple alert

		WebElement simpleAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		simpleAlertBtn.click();
		Thread.sleep(4000);

//		driver.switchTo().alert().accept();

		Alert alert = driver.switchTo().alert();

		alert.accept();
		Thread.sleep(4000);
		WebElement simpleAlertBtn2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		simpleAlertBtn2.click();
		Thread.sleep(4000);
		Alert aa = driver.switchTo().alert();

		aa.dismiss();
		Thread.sleep(4000);

	}

	@Test(enabled = true, priority = 2)
	public void testPromptAlert() throws InterruptedException {

		// click "Click for JS Alert" button and handle the simple alert

		WebElement simpleAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		simpleAlertBtn.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);

		String str = alert.getText();
		System.out.println("alert text : " + str);
		Thread.sleep(4000);
		alert.sendKeys("hello I am Selenium");
		Thread.sleep(4000);

		alert.accept();
		Thread.sleep(4000);
	}

}
