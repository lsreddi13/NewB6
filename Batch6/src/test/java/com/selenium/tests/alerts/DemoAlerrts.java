package com.selenium.tests.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAlerrts {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// send username : admin and password: admin in url before launching the browser
		driver.get("https://admin:admin@the-internet.herokuapp.com/");

		driver.findElement(By.partialLinkText("Basic Auth")).click();
	
		Alert alert = driver.switchTo().alert();		
		
		System.out.println(alert.getText());
		
		WebElement successMessage = driver.findElement(By.xpath("//div[@class='example']//p"));

		System.out.println(successMessage.getText());
	}
	
}
