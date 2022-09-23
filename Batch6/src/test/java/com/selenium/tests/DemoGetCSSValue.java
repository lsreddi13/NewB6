package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGetCSSValue {

	WebDriver driver;

	@Test
	public void testNavigationMethods() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://stackoverflow.com/jobs/companies");

//		String color = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button")).getCssValue("color");

//		Color loginButtonBackgroundColour = Color.fromString(driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button")).getCssValue("background-color"));
//		  
//		System.out.println(loginButtonBackgroundColour);

		String color2 = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button"))
				.getCssValue("color");

		String c = Color.fromString(color2).asHex();

		System.out.println(c);

		Point p = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button"))
				.getLocation();

		System.out.println(p);

		Rectangle s = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button"))
				.getRect();

		System.out.println(s);

		System.out.println("X-Axis - " + s.x); // from left top corner of element
		System.out.println("Y-Axis - " + s.y);
		System.out.println("Element Width - " + s.width);
		System.out.println("Element Height - " + s.height);

		Dimension s1 = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button"))
				.getSize();

		System.out.println(s1);

		String tagnames = driver.findElement(By.xpath("//input[@id='q']/../../following-sibling::div[2]//button"))
				.getTagName();
		System.out.println(tagnames);
	}

}
