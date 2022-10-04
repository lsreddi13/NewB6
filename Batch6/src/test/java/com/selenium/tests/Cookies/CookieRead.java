package com.selenium.tests.Cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieRead {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Input Email id and Password If you are already Register
		WebElement userName_ele = driver.findElement(By.name("username"));

		userName_ele.sendKeys("abc123");
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();

		File SrcFile1 = userName_ele.getScreenshotAs(OutputType.FILE);

//		File DestFile1 = new File(".//element1.png");
//		FileUtils.copyFile(SrcFile1, DestFile1);
		FileUtils.copyFile(SrcFile1, new File(".//element1.png"));
		
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File DestFile = new File(".//screen.png");

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

		driver.findElement(By.name("password")).sendKeys("123xyz");
		WebElement loginBtn_ele = driver.findElement(By.name("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn_ele));
		/*
		 * loginBtn_ele.click();
		 * 
		 * // create file named Cookies to store Login Information File file = new
		 * File("Cookies.data"); try { // Delete old file if exists file.delete();
		 * file.createNewFile(); FileWriter fileWrite = new FileWriter(file);
		 * BufferedWriter Bwrite = new BufferedWriter(fileWrite); // loop for getting
		 * the cookie information
		 * 
		 * // loop for getting the cookie information for (Cookie ck :
		 * driver.manage().getCookies()) { Bwrite.write((ck.getName() + ";" +
		 * ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" +
		 * ck.getExpiry() + ";" + ck.isSecure())); Bwrite.newLine(); } Bwrite.close();
		 * fileWrite.close();
		 * 
		 * } catch (Exception ex) { ex.printStackTrace(); }
		 */
	}
}
