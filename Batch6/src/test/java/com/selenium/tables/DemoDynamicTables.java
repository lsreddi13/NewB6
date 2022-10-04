package com.selenium.tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDynamicTables {

	@Test
	public void testPrintEmployeeData() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// diable notifications
		// maximize the browser

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		// add implicit wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Username')]")));

		// p[contains(text(), 'Username')]
		// p[contains(text(), 'Username')]

		// print page title
		System.out.println(driver.getTitle());

		// get text user name

//		String str = driver.findElement(By.xpath("//p[contains(text(), 'Username')]")).getText();
//		str = "Username : Admin";

//		String[] s = str.split(":");
//		String uname = s[1].trim();
		String uname = "Admin";
//		String str2 = driver.findElement(By.xpath("//p[contains(text(), 'Username')]/following-sibling::p")).getText();
//
//		String[] s2 = str2.split(":");
//		String pwd = s2[1].trim();
		String pwd = "admin123";
		WebElement UserName_ele = driver.findElement(By.name("username"));
		UserName_ele.clear();
		UserName_ele.sendKeys(uname);

		WebElement Password_ele = driver.findElement(By.name("password"));
		Password_ele.clear();
		Password_ele.sendKeys(pwd);

		WebElement loginBtn_ele1 = driver.findElement(By.xpath("//button"));

		WebElement loginBtn_ele = driver.findElement(By.tagName("button"));

		loginBtn_ele.click();

		// use explicit wait
		List<WebElement> table = driver.findElements(By.xpath("//div[@role='table']/div[2]/div"));

//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) table));

		String recods_count = driver.findElement(By.xpath("//hr/following-sibling::div")).getText();

		// div[@role='table']/div[2]/div[1 to mmax row 36]/div/div[2 to 8]

		List<WebElement> li = driver.findElements(By.xpath("//div[@role='table']/div[2]/div"));
		System.out.println(li.size());

		for (int i = 1; i < li.size(); i++) {

//			String empData = driver.findElement(By.xpath("//div[@role='table']/div[2]/div[" + i + "]")).getText();
//			System.out.println(empData);
			
			String id = driver.findElement(By.xpath("//div[@role='table']/div[2]/div[" + i + "]/div/div[2]")).getText();
			
			
			
			String fname = driver.findElement(By.xpath("//div[@role='table']/div[2]/div[" + i + "]/div/div[3")).getText(); 
			System.out.println(id + " : "+fname);
			
			
		}

	}
}
