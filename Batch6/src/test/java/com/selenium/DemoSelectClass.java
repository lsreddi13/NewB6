package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSelectClass {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";

		driver.get(url);
		
		// click create account

		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		selectItem(month, "12");

		//
//		obj.selectByIndex(11);
//		Thread.sleep(2000);
//		obj.selectByVisibleText("Mar");

//		obj.selectByValue("12");

//		driver.navigate().to("file:///C:/Users/Lenovo/OneDrive/Desktop/test1.html");
//
//		WebElement multiSelector = driver.findElement(By.id("cars"));

//		Select obj2 = new Select(multiSelector);

		/*
		 * obj2.selectByIndex(0); obj2.selectByIndex(1); obj2.selectByIndex(2);
		 * obj2.selectByIndex(3);
		 * 
		 * Thread.sleep(2000); obj2.deselectAll();
		 */

		/*
		 * List<WebElement> li =
		 * driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		 * 
		 * System.out.println("month count : "+ li.size());
		 * 
		 * // boolean apr_month_exist = li.contains("Apr"); //
		 * System.out.println(apr_month_exist); List li2 = new ArrayList(); for
		 * (WebElement we : li) { System.out.println(we.getText()); we.click();
		 * Thread.sleep(3000); li2.add(we.getText()); }
		 * 
		 * 
		 * System.out.println(li2);
		 * 
		 * System.out.println("Apr month exists : "+ li2.contains("Apr"));
		 * 
		 * }
		 */
	}

	public void selectItem(WebElement w, String val) {
		Select obj = new Select(w);
		obj.selectByValue(val);

	}
}
