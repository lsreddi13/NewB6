package com.selenium.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShiftKeyDemo {

	@Test
	public void testShiftKey() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		try {
			// Navigate to Url
			driver.get("https://google.com/");
			Actions action = new Actions(driver);

			// Store google search box WebElement
			WebElement search = driver.findElement(By.name("q"));
			search.sendKeys("this is simple text typing in the serach box.");
//			Thread.sleep(3000);
			search.clear();
			// Enters text "qwerty" with keyDown SHIFT key and after keyUp SHIFT key
			// (QWERTYqwerty)
			action.keyDown(Keys.SHIFT).sendKeys(search, "Selenium").keyUp(Keys.SHIFT).sendKeys(" automation").perform();
			search.sendKeys(Keys.ENTER);
		
		} catch (Exception e) {
			System.out.println("error - " + e);
		}finally {
//			driver.quit();
		}
	}
}
