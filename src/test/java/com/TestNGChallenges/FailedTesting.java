package com.TestNGChallenges;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTesting {

	@Test
	public void getTestOne() {
		Assert.assertTrue(false); // false means test case fail

		System.out.println("getTestOne");
	}

	@Test
	public void getTestTwo() {
		Assert.assertTrue(true); // true means test case pass
		System.out.println("getTestTwo");
	}

	@Test
	public void getTestThree() {
		Assert.assertTrue(true);

		System.out.println("getTestThree");
	}

	@Test
	public void getTestFour() {
		Assert.assertTrue(true);
		System.out.println("getTestFour");

	}

	@Test
	public void getTestFive() {
		Assert.assertTrue(false);
		System.out.println("getTestFive");
	}

}

	
	
	
	
	
	
	
	
	
	
	

