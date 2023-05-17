package com.TestNGChallenges;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;


public class CrossBrowserTesting1  {
	WebDriver driver;  //s an interface for testing which identify the browser.
	
@BeforeMethod             // Before it was cucumber but now coming from testNG
                             // Without @parameter annotation cross browser not run.

@Parameters("CrossNBrowser")        // Parameterized is one of the testNG advance annotation  feature to run our cross browser testing.  
                                   // @parameters = coming from testNg advance annotation, "browser" = is a value.
                                  // we can use any name instead of browser.
                                  // we write down parameterized in manually inside the crossbrowser.xml after test thread-count
                                  // like : <parameter name="CrossBrowser" value="Chrome" />
                                  // Maximum run browser 7. current project 3.

	public void getOpenBrowser(String browser) {  
	
	if(browser.equalsIgnoreCase("Chrome")) {
		//System.out.println(" Test will execute with chorme browser");
		
        WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		//System.out.println(" Test will execute with edge browser");
		
       WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
	}
	
	else if (browser.equalsIgnoreCase("Firefox")) {
		//System.out.println(" Test will execute with firefox browser");
       WebDriverManager.firefoxdriver().setup();
       driver = new FirefoxDriver();
	}
}
	


@Test  // same test cases will run in multiple browser.
public void getLogIn() {
	
	driver.get("https://automationexercise.com/login");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tanvirpatwary16@gmail.com");

	System.out.println("Log in");
}


@AfterMethod	// Before it was cucumber now coming from testNG
public void getCloseBrowser() {
		driver.quit();
	
	}


}


	
	







/*
// 1. In order to open the browser we need to create the method and execute it. Example:
 
 @BeforeMethod
 public void getOpenBrowser(){
 WebDriverManager.chormedriver().setup();
 driver = new ChromeDriver();
 }
 

@AfterMethod	
public void getCloseBrowser() {
		driver.quit();
	System.out.println(" Browser Close");
	}

@Test
public void getLogIn() {
	driver.get("https://automationexercise.com/login");
	driver.manage().window().maximize();
	System.out.println("Log in the Application");
	
// if i want to open different browser in same test cases then, close and login option is same 
 // only change the set in different browser java if .else conditions.we have already parents class.
 

if(browser.equalsIgnoreCase("Chrome")) {
	System.out.println(" Test will execute with chorme browser");
	
    WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
}

else if(browser.equalsIgnoreCase("Edge")) {
		System.out.println(" Test will execute with edge browser");
		
       WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
	}
	
	else if(browser.equalsIgnoreCase(" Firefox")) {
		System.out.println(" Test will execute with firefox browser");
       WebDriverManager.firefoxdriver().setup();
       driver = new FirefoxDriver();
	}



*/