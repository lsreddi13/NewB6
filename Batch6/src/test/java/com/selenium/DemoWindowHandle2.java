package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWindowHandle2 {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		String url = "https://digg.com/";
		String url = "https://www.naukri.com/";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='premium-swiper-wrap']//h3"));

		for (WebElement link : li) {
			String sd = link.getText();
			System.out.println("company name : " + sd);
			if (link.isDisplayed()) {
				link.click();
			}
		}
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();

		System.out.println("number of windows opened : " + windows);

		Iterator<String> child = windows.iterator();

		while (child.hasNext()) {

			String windowId = child.next();
			driver.switchTo().window(windowId);
			Thread.sleep(3000);
			String pageTitle = driver.getTitle();
			System.out.println("print page title : " + pageTitle);
			driver.close();
		}
//		driver.quit();
	}
}
