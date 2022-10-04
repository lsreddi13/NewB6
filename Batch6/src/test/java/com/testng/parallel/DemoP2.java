package com.testng.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Ignore
public class DemoP2 {
	WebDriver driver;

	@Test
	public void te1() {
		System.out.println("P2te1 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
	}

	@Test
	public void te2() {
		System.out.println("P2te2 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@Test
	public void te3() {
		System.out.println("P2te3 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.eenadu.net");
	}

	@Test
	public void te4() {
		System.out.println("P2te4 - " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
	}
}
