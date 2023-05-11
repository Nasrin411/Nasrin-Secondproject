package secondtest.tn.genericpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import secondtest.tn.basepage.ParentClass;

public class CommonUtil extends ParentClass{

public static void actionClick(WebElement ele) {	 // this is static method. WebElement is a class, ele is object.
// Why it is static: Because we can not extend the class. we can call by class name. we no need to create object again and again.Make static for reuse the code.
	Actions ac = new Actions(driver);   // Actions class coming from the selenium.
		ac.click(ele).build().perform();	                            // After import actions it shows driver error.
			                            // for driver error we have to extends the class.
	 
	
}
}
