package com.TestNGChallenges;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	@Test   // we do  not put dependsOnMethod on 1st browser like open browser.
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");
	}
	
	@Test ( dependsOnMethods= "getOpenBrowser")  // login depends on browser
	public void getLogIn() {
		System.out.println("getLogIn");
	}
	
	
	@Test ( dependsOnMethods= "getLogIn")  // close depends on login
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
