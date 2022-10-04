package com.java.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame {

	@Test
	public void test() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(5000);
		List<WebElement> li = driver.findElements(By.tagName("iframe"));

		System.out.println(li.size());
for(int i=0; i<li.size(); i++) {
		driver.switchTo().frame(0);
		//do actions
		driver.switchTo().parentFrame();
		
//		driver.switchTo().defaultContent();
}
		driver.switchTo().frame("__ccpaLocator");
	
		
		
	}

}
