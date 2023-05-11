package secondtest.tn.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
public static Properties prop;
public static FileInputStream file;
public static WebDriver driver;

	public ParentClass() {  // first it was local variable the we change global variable that,s why color purple.
		try {
			 prop = new Properties(); //object
		    file = new FileInputStream("./src/main/java/secondtest/tn/config/Config.properties"); //  it is a object too.                          // In order to read the text file.
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getOpenApplication() {  // This is initialization method
	String browser =  prop.getProperty("browserName"); // use string for store the code. is called string variable.
	if (browser.equals("chrome"))   { // use equal should be same name.like actual value.
	WebDriverManager.chromedriver().setup();   // we use WebDriver because ignore our browser version. but for the 
	                                            // interview system.set propertyI have to pass the browser path.
	 driver = new ChromeDriver ();
	
	}
	
	else if (browser.equals("edge"))  {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver ();
		
	}
	
	
	//else if (browser.equals("safari"))  {
			//WebDriverManager.safaridriver().setup();
			 //driver = new EdgeDriver ();
			
		//}
	else {
	System.out.println(" There is no driver");
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("QA_ENV"));  // pass the URL. driver.getString-video: 5
	}	
	
	
	
	
/*
	   1. public void initilization() {  // for use multiple class use initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  // ( this line called upcasting)
	    driver.get("https://automationexercise.com/login");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tanvirpatwary16@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tester01");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   String text =  driver.findElement(By.xpath("//*[text()=' Home']")).getText();
	   System.out.println("visibility text::"+text);   
		Assert.assertEquals("Home", text); 
	}  */
	
	
}
		
			    
	
    