package com.selenium.tests.Cookies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieWrite {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try {

			File file = new File("Cookies.data");
			FileReader fileReader = new FileReader(file);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;

					String val;
					if (!(val = token.nextToken()).equals("null")) {
						System.out.println(val);
//						String dDate="Sat Apr 11 12:16:44 IST 2015";
						DateFormat formatter = new SimpleDateFormat(val);
						Date date = formatter.parse(val);
//						System.out.println(date);
						expiry =  date;
//						expiry = new Date(date);
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					System.out.println(ck);
					driver.manage().addCookie(ck); // This will add the stored cookie to your current session
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
	}
}
