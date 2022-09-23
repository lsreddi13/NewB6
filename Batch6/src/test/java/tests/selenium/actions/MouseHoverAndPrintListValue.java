package tests.selenium.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAndPrintListValue {
	WebDriver driver;

	@BeforeClass
	public void testSetUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/"); // organce rml application login url
		WebDriverWait wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void mouseHoveronWebElement() {

		try {

			WebElement signInBtn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

			Actions ac = new Actions(driver);
			ac.moveToElement(signInBtn).build().perform();

			List<WebElement> myAccountLsitItems = driver
					.findElements(By.xpath("//div[contains(text(), 'Your Account')]/following-sibling::a"));

			for (WebElement el : myAccountLsitItems) {
				System.out.println(el.getText());
			}
		} catch (Exception e) {
			System.out.println("error : " + e);
		}
	}

}
