package com.selenium.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProperties2 {

	WebDriver driver;

	@BeforeMethod // testng annotatiobn
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	@Test // test annotation
	public void testPropertiesFile() throws IOException, InterruptedException {

		Properties properties = new Properties();

		FileInputStream fis = new FileInputStream(".\\config.properties");
		properties.load(fis);

		String url = properties.getProperty("url");

		String uName = properties.getProperty("userName");

		String pwd = properties.getProperty("password");

		System.out.println("Application url : " + url);

		System.out.println("Application User name : " + uName);

		System.out.println("Application password  : " + pwd);

		driver.get(url);

		Thread.sleep(17000);
		driver.findElement(By.name("username")).sendKeys(uName);

		driver.findElement(By.name("password")).sendKeys(pwd);

	}

}
