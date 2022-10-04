package com.selenium.softassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class DemoAssert {
	SoftAssert sf = new SoftAssert();
	
	@Test
	public void test() {
		
		
		System.out.println("this is first");
		sf.assertEquals("Amazon", "Amazon Sales"); //
		System.out.println("this is second");
		sf.assertEquals("Aruna", "Bhagya");
		sf.assertEquals("Aruna1", "Bhagya1");
		sf.assertEquals("Aruna2", "Bhagya2");
		sf.assertEquals("Aruna3", "Bhagya3");
		sf.assertEquals("Aruna4", "Bhagya4");
		
		System.out.println("this is third");
		sf.assertEquals(false, false);
//		sf.fail("hello");
		
		sf.assertAll();
	}

}
