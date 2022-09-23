package com.selenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath1 {
	WebDriver driver;

	@Test
	public void DemoTestprintBoolkTitle() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		String appURL = "https://www.amazon.in/s?k=ssc&crid=1AMR9FJP82SCQ&sprefix=ssc+%2Caps%2C216&ref=nb_sb_noss_2";
		driver.get(appURL);

		String value = test2("559");

		System.out.println("item value : " + value);
		
		test3("500");
		

	}

	public String test2(String val) {
		String Title = driver
				.findElement(By.xpath("//span[span=" + val + "]/../.././../../../../../../div[1]/h2/a//span"))
				.getText();

		return Title;
	}

	public void test3(String val) {
		List<WebElement> li = driver
				.findElements(By.xpath("//span[span<" + val + "]/../.././../../../../../../div[1]/h2/a//span"));

		
	for (WebElement item : li) {
		
		System.out.println(item.getText());
		
	}		
		
	}

}
