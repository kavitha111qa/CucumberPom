package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\kavitha\\eclipse-workspace\\CucumberPom\\src\\main\\java\\com\\qa\\feature\\freecrm.feature"
		,glue={"com.qa.stepDefinition"}
		 ,format={"pretty","html:test-output","junit:junit_xml/cucumber.xml"}
		 ,strict =true
		 ,dryRun = false
	     ,monochrome =true 
	    // ,tags = {"~@SmokeTest, @RegressionTest"}
	     )
public class TestRunner {
	
	

}
