package tests.selenium.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo {
	WebDriver driver;

	@BeforeClass
	public void testSetUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void testDoubleClick() throws InterruptedException {

		try {

//		driver.manage().window().maximize();
			// Double click the button to launch an alertbox
			Actions action = new Actions(driver);
			WebElement link = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
			
			// Switch to the alert box and click on OK button
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Text\n" + alert.getText());
			alert.accept();

		} catch (Exception e) {
			System.out.println("Error - failed double click code : " + e);
		} finally {
			driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		}

	}

	@Test
	public void testRightClick() throws InterruptedException {
		try {

			Actions action = new Actions(driver);
			// Switch to the alert box and click on OK button
			WebElement link2 = driver.findElement(By.cssSelector(".context-menu-one"));
			action.contextClick(link2).perform();
			
			// Click on Edit link on the displayed menu options
			WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
			element.click();

			System.out.println(driver.switchTo().alert().getText());

			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("error at right click method : "+ e);
		}
	}

}
