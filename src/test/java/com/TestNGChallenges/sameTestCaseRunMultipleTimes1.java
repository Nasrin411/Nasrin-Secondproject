package com.TestNGChallenges;



import org.testng.annotations.Test;

public class sameTestCaseRunMultipleTimes1 {

	@Test(invocationCount=10)
	   public void getMethod1() {
		   System.out.println("getMethod1"); 
	   }
	
	
	@Test(invocationCount=20)
	   public void getMethodN() {
		   System.out.println("getMethodN"); 
	   }
	
	
	
}
