package com.selenium.testng.groups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGroups {
	static String url = "https://www.facebook.com/";
	static WebDriver driver;

	@BeforeClass
	public void setUp() {
		// webdriver manger setup to use the browser driver.
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the application.

	}

	@Test(priority = 0, groups = { "smoke", "Regression" })
	public void testsignup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("this is signup method in positive path - smoke and Regression");
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement button = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", button);
	}

	@Test(priority = 1, groups = { "Regression" })
	public void verifyErrorsSignupTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("this is signup method in negative path - Regression");
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

			String fname = driver.findElement(By.xpath("//div[@role='table']/div[2]/div[" + i + "]/div/div[3"))
					.getText();
			System.out.println(id + " : " + fname);
		}
	}

	@Test(priority = 2, groups = { "Regression" })
	public void testAdminSignup() {
		System.out.println("this is signup method in Admin - Regression");
	}

	@Test(priority = 3, groups = { "functional" })
	public void testStaffSignup() {
		System.out.println("this is signup method in Staff -  functional ");
	}

	@Test(priority = 4, groups = { "smoke" })
	public void testLeave() {
		System.out.println("this is Leave method in happy path - smoke");
	}

	@Test(priority = 5, groups = { "Regression" })
	public void testLeaveErrors() {
		System.out.println("this is Leave method in negative path - Regression");
	}

	@Test(priority = 6, groups = { "smoke", "Regression", "functional" })
	public void testApplyLeave() {
		System.out.println("this is Leave method in Apply Leave - smoke, Regression, functional");
	}

	@Test(priority = 7, groups = { "smoke", "Regression" })
	public void testEditLeave() {
		System.out.println("test Edit Leave - smoke, Regression");
	}

	@Test(priority = 8, groups = { "Regression" })
	public void testRejectLeave() {
		System.out.println("this is Leave method in Reject Leave - Regression");
	}

	@Test(priority = 9, groups = { "functional", "Regression" })
	public void testCancelLeave() {
		System.out.println("this is Leave method in Cancel Leave - functional,Regression ");
	}

	@Test(priority = 10, groups = { "smoke", "Regression" })
	public void testApproveLeave() {
		System.out.println("this is Leave method in Approve Leave - smoke, Regression ");
	}

}
