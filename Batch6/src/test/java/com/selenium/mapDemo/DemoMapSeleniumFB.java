package com.selenium.mapDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMapSeleniumFB {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("._42ft._4jy0._6lti")).click();

		Thread.sleep(3000);

		WebElement months = driver.findElement(By.cssSelector("#month"));

		Select s = new Select(months);

		List<WebElement> li = driver.findElements(By.cssSelector("#month > option"));
		Map<Integer, String> m = new HashMap<>();
		for (int i = 0; i < li.size(); i++) {
			String month_name = li.get(i).getText();
			int j = i+1;
			m.put(j, month_name);
//			String month_name = driver.findElement(By.cssSelector("#month > option["+i+"]")).getText();
//			System.out.println(month_name);
		}
		System.out.println("size of map : " + m.size());
		
		for(Entry<Integer, String> d : m.entrySet()) {
			System.out.println(d.getKey() + " : " + d.getValue());
		}
//		for(WebElement e : li) {
//			String month_name = e.getText();
//			System.out.println("month name : "+ month_name);
//		}
//		

	}

}
