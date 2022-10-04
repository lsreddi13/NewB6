package com.java.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoUploadFile {

	@Test
	public void test() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(5000);

		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Lenovo\\OneDrive\\Desktop\\bug1.png");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("submitbutton")).click();

		Thread.sleep(3000);
		String outputValue = driver.findElement(By.id("res")).getText();
		System.out.println(outputValue);
	}

}
