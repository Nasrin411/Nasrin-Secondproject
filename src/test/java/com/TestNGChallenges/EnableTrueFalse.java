package com.TestNGChallenges;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	// Enable annotation  means one certain things execute. 
	// Like I have 5 test cases some true and some false. it only shows true one.
	
	
	@Test ( enabled=true)
	public void getNasrinM1() {
      System.out.println("getNasrinM1");
	}

	@Test (enabled = true)
	public void getNasrinM2() {
	      System.out.println("getNasrinM2");
		}
	
	@Test (enabled = true)
	public void getNasrinM3() {
	      System.out.println("getNasrinM3");
	     	}
	
	@Test ( enabled = false)
	public void getNasrinM4() {
	      System.out.println("getNasrinM4");
		}
	
	
	@Test (enabled = false)
	public void getNasrinM5() {
	      System.out.println("getNasrinM5");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
