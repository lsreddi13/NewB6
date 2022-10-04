package com.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	
	@BeforeClass
	public void cl1(){
		System.out.println("i am before class");
	}
	
	@AfterClass
	public void cl2() {
		System.out.println(" i am after class");
	}
	
	@AfterTest
	public void te1() {
		System.out.println("i am after Test");
	}
	
	@BeforeTest
	public void te2() {
		System.out.println("i am before Test");
	}
	
	@BeforeSuite
	public void tt1() {
		System.out.println("i am before suite");
	}
	@AfterSuite
	public void aff() {
		System.out.println("i am after suite");
	}
	@BeforeMethod
	public void b() {
		System.out.println("i am before method.");
	}
	@AfterMethod
	public void a() {
		System.out.println("i am after method.");
	}

	
	String name1, name2;
	
	public void test123() {
		System.out.println("i am test 123");
	}
	
	@Test
	public void test1() {
		System.out.println(" i am test1 method.");
	}

	
	@Test
	public void test2() {
		System.out.println(" i am test2 method.");
	}
	
	@Test
	public void test3() {
		System.out.println(" i am test3 method.");
	}


}
