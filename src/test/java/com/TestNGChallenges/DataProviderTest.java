package com.TestNGChallenges;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest{
	
  WebDriver driver;
  @DataProvider(name = "Authentication")     // use DataProvider to connect with the method.
	// Object i the parent/ super class of java store all types of data.
	public static Object[][] credentials(){      //This is a method with multidimension array
		return new Object[][] {
			                       { "tanvirpatwary16@gmail.com", "Tester01" },
			                       { "tanvirpatwary45@gmail.com", "Tester001" }, 
			                       { "tanvirpatwary00@gmail.com", "Tester000" },
		                           { "test123456565656@gmail.com", "dsfsf" } };
	}

	@Test(dataProvider="Authentication")
  public void getLogIn(String Username, String Password) {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  // ( this line called upcasting)
	    driver.get("https://automationexercise.com/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Username");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
	    driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	    //driver.quit();
  }
	
	
	
	
	
	
	
	
	
}















/* for practice multidimension data.

public static void main(String[] args) {  // multidimension array
	String name [][]= {
			{ "tanvirpatwary16@gmail.com", "Tester01" },
			{ "tanvirpatwary45@gmail.com", "Tester001" }, 
			{ "tanvirpatwary00@gmail.com", "Tester000" },
			{ "test123456565656@gmail.com", "dsfsf" } };
}
*/


	
	
	
	
	

