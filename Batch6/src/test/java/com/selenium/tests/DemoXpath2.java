package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath2 {

	@Test
	public void printValue() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://stackoverflow.com/questions/23543044/how-to-use-xpath-preceding-sibling-correctly");
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//ol/li[2]/ol/li/a/div/div[contains(text(), 'Compa')]")).click();
		
		System.out.println(driver.getTitle());
		
		String value1 = driver.findElement(By.xpath("//input[@id='q']")).getAttribute("placeholder");
		System.out.println(value1);
//		System.out.println(driver.findElement(By.xpath("//input[@id='q']")).getAttribute("placeholder"));
		
		String btn_value = driver.findElement(By.xpath("//input[@id='q']/../../../div[3]/div/button")).getText();
		
		
		
	}

}
