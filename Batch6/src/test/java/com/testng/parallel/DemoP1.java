package com.testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoP1 {
	WebDriver driver;

	@Test
	public void te1() {
		System.out.println("te1 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.fb.com");
		
	}

	@Test
	public void te2() {
		System.out.println("te2 - " + Thread.currentThread().getId());

		WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
		driver.get("http://www.amazon.com");
	}

	@Test
	public void te3() {
		System.out.println("te3 - " + Thread.currentThread().getId());
		WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
		driver.get("http://www.linkedin.com");
		
	}

	@Test
	public void te4() {
		System.out.println("te4 - " + Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("http://www.sakshi.com");
	}

}
