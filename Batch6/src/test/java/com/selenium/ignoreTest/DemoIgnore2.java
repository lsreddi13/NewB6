package com.selenium.ignoreTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIgnore2 {
	WebDriver driver;
	@Test(priority = 1)
	public void chromeBro() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://www.fb.com");
	}

	@Test(priority = 0)
	public void operaBro() {
		WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
		driver.get("http://www.fb.com");
	}

	@Test(priority = 3)
	public void firefoxBro() {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("http://www.fb.com");
	}

	
	@Test
	public void edgeBro() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("http://www.fb.com");
	}

	@AfterMethod
	public void closeBro() {
		driver.close();
	}
	
	
	@Test
	public void safariBro() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.get("http://www.fb.com");
	}

}
