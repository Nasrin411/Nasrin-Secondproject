package com.TestNGChallenges;

import org.testng.annotations.Test;

//Without priority how test case will executed?
// Ans: Auto run by Alphabetical order

//In your test cases how to set up priority
//Ans: 1,2,3,4 or ( A,B,C,D,E....)

public class PrirotyTest1 {
	@Test(priority = 2)
public void getMethod1() {
	   System.out.println("getMethod1"); 
}

	@Test(priority = 3)
public void getMethod2() {
	   System.out.println("getMethod2"); 
}

 @Test(priority = 0)
public void getMethod3() {
	   System.out.println("getMethod3"); 
}

@Test(priority = 5)

public void getMethod4() {
	   System.out.println("getMethod4"); 
}



 @Test(priority = 6)

public void getMethod5() {
	   System.out.println("getMethod5"); 
} 
	   
  @Test(priority = 7)
	   public void getMethod6() {
		   System.out.println("getMethod6"); 
	   }

		   @Test(priority = 8)

		   public void getMethod7() {
			   System.out.println("getMethod7"); 
			   
		   } 
		   
			   @Test // we can not use without priority

			   public void getMethod8() {
				   System.out.println("getMethod8"); 
			   }	   
				   
				  @Test

				   public void getMethod9() {
					   System.out.println("getMethod9"); 
					   
		   
	   
	   
	   
}
/*	
// If I want to see number 5 running first the I have to use the priority.

@Test(priority = 0)

public void getMethod0() {
	   System.out.println("getMethod5"); 
}
*/
}



