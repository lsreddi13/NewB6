package com.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertsion3 {

	@Test
	public void testasserttrue() {
		boolean a =true;
		boolean b = false;
		
		Assert.assertTrue(a, "test failed, values are not same.");
		System.out.println("hello1");

	}
	
	@Test
	public void testasserttrue2() {
		boolean a =true;
		boolean b = false;
		
		Assert.assertTrue(b);
		System.out.println("hello1");

	}
	
	@Test
	public void testassertfalse() {
		boolean a =true;
		boolean b = false;
		
		Assert.assertFalse(b);
		System.out.println("hello1");

	}
	@Test
	public void testassertfalse2() {
		boolean a =true;
		boolean b = false;
		
		Assert.assertFalse(a);
		System.out.println("hello1");

	}
	

}
