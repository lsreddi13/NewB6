package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		//initialize webdriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "http://www.facebook.com";
		driver.get(url);
		
		String pagetitle = driver.getTitle();
		
		System.out.println(pagetitle);
		
		//driver.close();
		
		
	}

}
