package com.selenium.tables;

public class DemoSplitString {

	public static void main(String[] args) {
		String str = "Username : Admin";

		String[] s = str.split(":");
		String uname = s[1];
		
		System.out.println(uname.trim());

	}
}
