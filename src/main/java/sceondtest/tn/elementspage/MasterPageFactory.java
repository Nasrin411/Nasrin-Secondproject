package sceondtest.tn.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import secondtest.tn.basepage.ParentClass;
import secondtest.tn.genericpage.CommonUtil;

public class MasterPageFactory extends ParentClass{
// Initialization
	public MasterPageFactory () {
		PageFactory.initElements(driver, this);
	}
// Incapsulation		    
   @FindBy(xpath = "//input[@name='email']")
   @CacheLookup
     private WebElement enterEmail; // private method

     public WebElement getEnterEmail() {   //getter setter method. but we use set method.
	    return enterEmail;
}
   
	
     @FindBy(xpath = "//input[@type='password']")
     @CacheLookup
       private WebElement enterPassword; // private method

       public WebElement getEnterPassword() {   //getter setter method. but we use set method.
  	    return enterPassword;
  }
	
       @FindBy(xpath = "//button[@type='submit']")
       @CacheLookup
         private WebElement clickOnLoginBTN; // private method

         public WebElement getClickOnLoginBTN() {   //getter setter method. but we use set method.
    	    return clickOnLoginBTN;
    }	
	
         @FindBy(xpath = "//*[text()=' Home']")
         @CacheLookup
           private WebElement verifyHomePage; // private method

           public WebElement getVerifyHomePage() {   //getter setter method. but we use set method.
      	    return verifyHomePage;
      }     
         
      
           @FindBy(xpath = " //*[text()=' Products']")
           @CacheLookup
             private WebElement clickOnProduct; // private method

             public WebElement getClickOnProduct() {   //getter setter method. but we use set method.
        	    return clickOnProduct;
        }            
           
           
         
	
     public void getLogin(String username, String password) {  
    	 getEnterEmail().sendKeys(username);
    	 getEnterPassword().sendKeys(password);
    	 CommonUtil.actionClick(getClickOnLoginBTN());  // Reusable method.
    	 
    	 // line 50and 51 click method is not reusable.
    	 //Actions ac = new Actions(driver);   // create the object with the help of Actions class.
    	 //ac.click(getclickOnLoginBTN()).build().perform();
    	 // ac is a object from selenium. selenium doesnot connect without driver.
    	 //getclickOnLoginBTN().click(); we are not use it we are use Actions.
    	 
    	 
     }
         
         
}
	

