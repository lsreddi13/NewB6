package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindows {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		String url = "https://digg.com/";
		String url = "https://www.naukri.com/";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)", "");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,500)", "");
		
		
		WebElement sp = driver.findElement(By.xpath("//h2[contains(text(), 'Sponsored companies')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", sp);
		
		
		
//		js.executeScript("arguments[0].scrollIntoView();", Element);
		
//		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
		
		
	}
}
