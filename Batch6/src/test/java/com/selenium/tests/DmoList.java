package com.selenium.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.LittleEndianDataInputStream;

import io.github.bonigarcia.wdm.WebDriverManager;
//print the number of links displayed in the orange hrm login apge.

//print all links from the ange hrm login page
public class DmoList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		String url = "https://www.linkedin.com/company/orangehrm";
		
//		String url= "https://www.eenadu.net/";

		driver.get(url);

		String pagetitle = driver.getTitle();

		System.out.println(pagetitle);

		// findElement - if we are going to work with snigle webelement
		// findElements - if we are going to work with multiple webelement ( more than
		// one )
		Thread.sleep(3000);
		List<WebElement> list_Links = driver.findElements(By.tagName("a"));

		List<WebElement> list_Links2 = driver.findElements(By.xpath("//a"));

		System.out.println(list_Links.size()); // print the numnber of link in that page.
		
		List<String> li_String = new ArrayList<String>();
		for (WebElement webElement : list_Links2) {
			
			String linksURL = webElement.getAttribute("href");
			System.out.println(linksURL);
			
			li_String.add(linksURL);
			
		}
		
		System.out.println(li_String.size());
		
		for (String str : li_String) {
			System.out.println("links : "+str);
		}
		
		
		
//		how to add elements in the list
//		
//		how to compare 2 lists
//		
//		how to verify an element is available in the list
//		
//		how to remove an element from the list
//		
//		print the list size
//		
//		add list in to another list
		
		
//		for(int i =0; i<list_Links.size(); i++) {
//			String link_url = list_Links.get(i).getAttribute("href");
//			System.out.println(link_url);
//		}
		
	}

}
