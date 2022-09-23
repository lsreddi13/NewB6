package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessage {

	public static void main(String[] args) {
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

		// verify warning message
		String errorMessage = driver.findElement(By.className("_9ay7")).getText();

		System.out.println("error message : " + errorMessage);
		// print warning message
	}

}
