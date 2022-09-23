package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebElementMethods3 {

	WebDriver driver;

	@Test
	public void testNavigationMethods() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// click create account
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		Thread.sleep(3000);

		WebElement gender = driver
				.findElement(By.xpath("//label[contains(text(), 'Female')]/following-sibling::input"));

		boolean genderIsSelected = gender.isSelected();
		System.out.println("genderIsSelected : " + genderIsSelected);
		
		gender.click();
		
		boolean genderIsSelected2 = gender.isSelected();
		System.out.println("genderIsSelected ? : " + genderIsSelected2);
	}

}
