package com.selenium.mapDemo;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebTable {
	@Test
	public void testScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		try {

			driver.findElement(By.id("txtUsername")).sendKeys("Admin");

			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.sendKeys("admin123");

			driver.findElement(By.id("btnLogin")).click();

			driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();

			WebElement resultTable = driver.findElement(By.id("resultTable"));

			if (resultTable.isDisplayed() == true) {
				int rows_count = driver.findElements(By.cssSelector("#resultTable > tbody > tr")).size();

				List<WebElement> li = driver.findElements(By.cssSelector("#resultTable > tbody > tr"));
				System.out.println("Name " + "  :  " + "Status ");
				
				Map<String, String> m1= new HashMap();
				
				for (int i = 1; i <= rows_count; i++) {

					String name = driver
							.findElement(By
									.cssSelector("#resultTable > tbody > tr:nth-of-type(" + i + ") >td:nth-of-type(2)"))
							.getText();

					String status = driver
							.findElement(By
									.cssSelector("#resultTable > tbody > tr:nth-of-type(" + i + ") >td:nth-of-type(5)"))
							.getText();
					
					String role = driver
							.findElement(By
									.cssSelector("#resultTable > tbody > tr:nth-of-type(" + i + ") >td:nth-of-type(3)"))
							.getText();

					String emp = driver
							.findElement(By
									.cssSelector("#resultTable > tbody > tr:nth-of-type(" + i + ") >td:nth-of-type(4)"))
							.getText();
					
					m1.put(name, status);
					
					
					
//					System.out.println(name + " - " + status);
				}
				
				for(Entry<String, String> ee : m1.entrySet()) {
//					System.out.println(ee.getKey() +" - "+ ee.getValue());
					if(ee.getKey().contains("Joe.Root")) {
						System.out.println(ee.getKey() +" - "+ ee.getValue());
					}
				}

				/*
				 * for (WebElement ww : li) { System.out.println(ww.getText());
				 * 
				 * //#resultTable > tbody > tr >td:nth-of-type(2) - to get the emp name
				 * 
				 * 
				 * // #resultTable > tbody > tr >td:nth-of-type(5) - to get the status value
				 * 
				 * 
				 * }
				 */

			}

		} catch (Exception e) {

		}
	}
}
