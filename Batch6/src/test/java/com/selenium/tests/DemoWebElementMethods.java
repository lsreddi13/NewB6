package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElementMethods {
	
	WebDriver driver;

	@Test
	public void testNavigationMethods() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://stackoverflow.com/jobs/companies");
		
		
		
		driver.findElement(By.xpath("//input[@id='q']")).getAttribute("placeholder");
		
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("test type text");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='q']")).clear();
		
		driver.navigate().to("http://omayo.blogspot.com/");
		
		if(driver.findElement(By.xpath("//button[@id='but1']")).isDisplayed()) {
			System.out.println("button displayed");
			
			if(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled()) {
				System.out.println("button is enabled");
			
			}else {
				System.out.println("button is not enabled");
			}
			
			if(driver.findElement(By.xpath("//button[@id='but2']")).isEnabled()) {
				System.out.println(" ---------- button is enabled");
			
			}else {
				System.out.println(" ---------- button is not enabled");
			}
			
			
		}else {
			System.out.println("button no t displayed");
		}
		
		
	}

}
