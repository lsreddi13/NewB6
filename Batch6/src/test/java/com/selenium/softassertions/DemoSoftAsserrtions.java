package com.selenium.softassertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSoftAsserrtions {
	SoftAssert sf = new SoftAssert();

	@Test(priority = 0, enabled = false)
	public void loginHRM() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		sf.assertEquals(false, true);
		WebElement uName = driver.findElement(By.id("txtUsername"));
		uName.sendKeys("Admin");
		sf.assertEquals(false, true);
		WebElement uPwd = driver.findElement(By.id("txtPassword"));
		uPwd.sendKeys("admin123");
		sf.assertEquals(false, true);
		driver.findElement(By.id("btnLogin")).click();
		sf.assertAll();

	}

	@Test(priority = 1)
	public void loginFB() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement uName = driver.findElement(By.name("email"));
		uName.sendKeys("Admin");
//		Assert.assertEquals(false, true);
		Assert.assertEquals(true, true);
//		Assert.assertEquals(true, false); // failed

		WebElement uPwd = driver.findElement(By.name("pass"));
		uPwd.sendKeys("admin123");
		driver.findElement(By.name("login")).click();

		
		String exp_title_beforelogin = "Facebook – log in or sign up";

		String exp_title_afterlogin = "Facebook – sasidhar";
		Thread.sleep(5000);
		String title = driver.getTitle();
		sf.assertEquals(title, exp_title_afterlogin);
		sf.assertAll();

	}

}
