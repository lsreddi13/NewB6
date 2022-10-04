package com.selenium.cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCssSelector {

	@Test
	public void testCssSelector() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {

			driver.get("https://www.snowflake.com/");
			System.out.println("page title before going to fb page : " + driver.getTitle());

			driver.navigate().to("https://www.fb.com/");
			System.out.println("page title after going to fb page : " + driver.getTitle());

			driver.navigate().back();
			System.out.println("page title after using back : " + driver.getTitle());

			driver.navigate().forward();
			System.out.println("page title after using forward : " + driver.getTitle());

//		driver.navigate().refresh();
//			driver.get("https://www.snowflake.com/");
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#menu-item-93779")));
			boolean s = driver.findElement(By.cssSelector("#menu-item-93779")).isDisplayed();

			
			driver.findElement(By.cssSelector("#month > option:nth-of-type(2)")).click();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error : "+ e);
		} finally {
			driver.close();
		}
		
//	driver.quit();

	}

}
