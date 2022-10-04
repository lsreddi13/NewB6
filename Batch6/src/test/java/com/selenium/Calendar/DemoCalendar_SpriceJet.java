package com.selenium.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCalendar_SpriceJet {
	public static WebDriver driver;

	@Test
	public void setUp() {
		// webdriver manger setup to use the browser driver.
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");

		String date = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]//div[@data-testid='departure-date-dropdown-label-test-id']/div[2]/div[1]"))
				.getText();
		System.out.println("print default date : " + date);

		driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]//div[@data-testid='departure-date-dropdown-label-test-id']/div/div[2]"))
				.click();

		// which date you want to select - select 27 march
		selectDate("June", "28");
		String date2 = driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]//div[@data-testid='departure-date-dropdown-label-test-id']/div[2]/div[1]"))
				.getText();
		System.out.println("print selected date : " + date2);

	}
//	public void clickBtn(String target_xpath) {
//		driver.findElement(By.xpath(target_xpath)).click();
//	}
//	
//	public void typeTxt(String target_xpath, String val) {
//		driver.findElement(By.xpath(target_xpath)).sendKeys(val);
//	}

	public void selectDate(String month, String date) {
		// March, 27
		driver.findElement(
				By.xpath("//div[@data-testid='undefined-month-" + month + "-2022']//div[text()='" + date + "']"))
				.click();
	}
}
