package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertsion {

	@Test
	public void equal() {
		int a = 2, b = 3, c = 3;
		Assert.assertEquals(a, b, "test failed, values are not same.");
		System.out.println("hello1");

	}
	@Test
	public void equal2() {
		int a = 2, b = 3, c = 3;
		Assert.assertEquals(c, b, "test failed, values are not same.");
		System.out.println("hello1");

	}

	@Test
	public void notEqual() {
		int a = 2, b = 3, c = 3;
		Assert.assertNotEquals(b, c, "test failed, values are same");
		System.out.println("hello2");
	}
	
	@Test
	public void notEqual2() {
		int a = 2, b = 3, c = 3;
		Assert.assertNotEquals(a, c, "test failed, values are same");
		System.out.println("hello2");
	}

}
