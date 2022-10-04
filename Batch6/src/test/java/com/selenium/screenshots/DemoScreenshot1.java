package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenshot1 {

	public String getTime() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Calendar cal = Calendar.getInstance();
//		System.out.println(dateFormat.format(cal.getTime()));
		return dateFormat.format(cal.getTime());

	}

	@Test
	public void testScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		try {

			driver.findElement(By.id("txtUsername")).sendKeys("Admin");

			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.sendKeys("admin123");
			
			
			
			driver.findElement(By.id("btnLogin")).click();

			// verifying the dashboard page.
//			print Dashboard
			WebElement dash_label = driver.findElement(By.tagName("h1"));
			Assert.assertTrue(dash_label.isDisplayed());
			String label = dash_label.getText();
			String exp_label = "Dashboards";
			Assert.assertEquals(label, exp_label, "Dashboared page label does not matched. ");

//			driver.findElement(By.id("menu_admin_viewAdminModule")).click();		

			String time = getTime();
			File srcF = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcF, new File(".//Screenshots/Dashboard_" + time + ".png"));

		} catch (Exception e) {
			System.out.println(" Error occurred at : " + e);

			String time = getTime();
			File dest = new File(".//Screenshots/Dashboard_error_" + time + ".png");
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, dest);

		}

	}

}
