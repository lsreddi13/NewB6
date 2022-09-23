package com.selenium.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am beforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am beforeMethod");
	}

	@Test(priority = 0)
	public void testLogin() {
		System.out.println("I am testLogin");
	}
	@Test(priority = 1)
	public void craeteUser() {
		System.out.println("I am craeteUser");
	}
	@Test(priority = 2)
	public void testLogout() {
		System.out.println("I am testLogout");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("I am AfterMethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("I am AfterClass");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("I am AfterTest");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("I am AfterSuite");
	}

}
