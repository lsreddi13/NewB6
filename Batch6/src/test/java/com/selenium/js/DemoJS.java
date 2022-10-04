package com.selenium.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoJS {

	static String url = "https://www.facebook.com/";
	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// webdriver manger setup to use the browser driver.
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the application.

	}

	@Test
	public void testAssertFalse() {
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement button = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", button);

		
		String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);	
        
        
        
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);	
        
        String TitleName = js.executeScript("return document.title;").toString();			
        System.out.println("Title of the page = "+TitleName);	
        
        js.executeScript("window.location = 'http://www.amazon.in'");	
        
    
        
        js.executeScript("window.scrollBy(0,600)");	
        
        WebElement scroll = driver.findElement(By.xpath("//h2/span[contains(text(), 'Up to 50% off | Kitchen appliances, cookware & more')]"));
        
        js.executeScript("arguments[0].scrollIntoView()", scroll);	
        
	}

}
