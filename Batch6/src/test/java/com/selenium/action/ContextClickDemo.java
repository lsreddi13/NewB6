package com.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickDemo {

	@Test
	public void testLoginActionsClass() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement w = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));
		
		Actions a = new Actions(driver);
		a.contextClick(w).build().perform();
		
		driver.findElement(By.xpath("//ul/li[4]/span")).click();
		
		driver.switchTo().alert().accept();
		
	}
}
