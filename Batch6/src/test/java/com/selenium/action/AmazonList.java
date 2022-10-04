package com.selenium.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonList {
	
	

	@Test
	public void scenario1() {

		List a_list = new ArrayList<>();
		List exp_list = Arrays.asList("Create a Wish List", "Wish from Any Website", "Wishlist",
				"Discover Your Style", "Explore Showroom");
		// open the browser // open the amazon
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement we = driver.findElement(By.id("nav-link-accountList"));

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(we).build().perform();

		List<WebElement> li = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a/span"));

//		System.out.println(li.size());

		for (int i = 1; i <= li.size(); i++) {
			String item = driver.findElement(By.xpath("//div[@id='nav-al-wishlist']/a[" + i + "]/span")).getText();
//			System.out.println(item);

			a_list.add(item);
		}

//		System.out.println(a_list);
		
		Assert.assertEquals(a_list, exp_list, "list does not matched");

//			create an empty list array 

//			mouse hover on singin name

//			get all the list items in to the list array

		// craete an expected lsit from the requiment

//			compare two list arrays and show the results

	}

}
