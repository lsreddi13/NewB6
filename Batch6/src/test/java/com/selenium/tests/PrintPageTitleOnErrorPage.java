package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPageTitleOnErrorPage {

	@Test
	public static void test() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "http://www.facebook.com";

		driver.get(url);

		String pagetitle = driver.getTitle();

		System.out.println(pagetitle);

		// enter email or phone number
		driver.findElement(By.id("email")).sendKeys("fasdfasdfa fdas");
		// enter password
		driver.findElement(By.name("pass")).sendKeys("mypassword");

		// click login
		driver.findElement(By.tagName("button")).click();

		// print warning message
		String errorMessage = driver.findElement(By.className("_9ay7")).getText();

		System.out.println(errorMessage);
		
		//print page title
		String pageTitle2 = driver.getTitle();
		System.out.println(pageTitle2);
	}

}
