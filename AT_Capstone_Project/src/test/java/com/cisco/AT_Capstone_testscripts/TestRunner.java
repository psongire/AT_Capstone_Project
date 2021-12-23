package com.cisco.AT_Capstone_testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature", 
					glue = "com.cisco.AT_Capstone_testscripts",
					tags = "@book"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
