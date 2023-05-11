package sceond.tn.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import secondtest.tn.basepage.ParentClass;

public class Hooks extends ParentClass{
@Before
public void setUp() {
	getOpenApplication();
}
//@After	
public void tearDown() {
driver.quit();
}
	
	
	
	
	
	
	
	
	
	
}	



