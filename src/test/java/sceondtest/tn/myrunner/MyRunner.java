package sceondtest.tn.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	 plugin= {"pretty","json:target/cucumber.json" },
     features = {".//Features/"},
     glue = { "sceondtest.tn.stepdefinitions","sceond.tn.hooks"}
)
public class MyRunner extends AbstractTestNGCucumberTests {
	
	
}
