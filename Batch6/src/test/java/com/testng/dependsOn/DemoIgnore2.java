package com.testng.dependsOn;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoIgnore2 {

	@Test
	public void te1() {
		System.out.println("te1");
		
	}
	@Ignore
	@Test
	public void te2() {
		System.out.println("te2");
	}
	@Test
	public void te3() {
		System.out.println("te3");
	}
	@Test
	public void te4() {
		System.out.println("te4");
	}
}
