package com.selenium.basicAuth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBasicAuth {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/basic_auth");

		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		WebElement successMessage = driver.findElement(By.xpath("//div[@class='example']//p"));
		
		System.out.println(successMessage.getText());

	}

}
