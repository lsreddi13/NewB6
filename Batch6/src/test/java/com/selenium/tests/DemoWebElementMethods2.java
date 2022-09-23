package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElementMethods2 {

	WebDriver driver;

	@Test
	public void testNavigationMethods() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=shoe&i=shoes&sprefix=%2Cshoes%2C188&ref=nb_sb_ss_recent_1_0_recent");
		Thread.sleep(3000);
		WebElement we = driver
				.findElement(By.xpath("//span[contains(text(), 'Get It Today')]/preceding-sibling::div//input"));

		boolean checkboxIsSelected = we.isSelected();

		System.out.println("checkboxIsSelected : " + checkboxIsSelected);
		driver.findElement(By.xpath("//span[contains(text(), 'Get It Today')]/preceding-sibling::div//input/.."))
				.click();
		Thread.sleep(3000);

		WebElement we2 = driver
				.findElement(By.xpath("//span[contains(text(), 'Get It Today')]/preceding-sibling::div//input"));
		boolean checkboxIsSelected2 = we2.isSelected();

		System.out.println("checkboxIsSelected : ? " + checkboxIsSelected2);

	}

}
