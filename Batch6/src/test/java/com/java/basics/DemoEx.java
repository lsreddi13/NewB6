package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoEx {

	@Test
	public void test1() {

		try {
			// initialize webdriver
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			String url = "http://www.facebook.com";
			driver.get(url);

			String pagetitle = driver.getTitle();

			System.out.println(pagetitle);

			driver.findElement(By.id("emil")).sendKeys("sasi");
		} catch (NoSuchElementException e) {
			System.out.println("element not found : " + e);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
	}

}
