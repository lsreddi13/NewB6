package com.selenium.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {
	@Test
	public void testLoginActionsClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		// Store 'box A' as source element
		WebElement d1 = driver.findElement(By.id("draggable"));
		// Store 'box B' as source element
		WebElement d2 = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		// Performs drag and drop action of sourceEle onto the targetEle
		a.dragAndDrop(d1, d2).build().perform();
//		a.keyDown(Keys.CONTROL).sendKeys("V");
//		actionProvider.dragAndDrop(sourceEle, targetEle).build().perform();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.get("http://www.yahoo.com");

		Thread.sleep(5000);
		driver.get("http://www.fb.com");
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();

	}
}
