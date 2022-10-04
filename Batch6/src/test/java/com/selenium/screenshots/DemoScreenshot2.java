package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenshot2 {

	@Test
	public void testScreenshotElement() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		WebElement element = driver.findElement(By.id("btnLogin"));
		File src = element.getScreenshotAs(OutputType.FILE);
		DemoScreenshot1 ds = new DemoScreenshot1();
		String time = ds.getTime();
		
		FileUtils.copyFile(src, new File(".//Screenshots/Dashboard_" + time + ".png"));
	}

}
