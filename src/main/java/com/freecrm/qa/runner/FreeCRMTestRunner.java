package com.freecrm.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\debasida\\Desktop\\SeleniumFramework\\FREECRMCucumberFrameworkDesign\\src\\main\\java\\com\\freecrm\\qa\\features"
		,glue= {"com.freecrm.qa.stepdefinitions"},
		plugin = {"pretty","html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class FreeCRMTestRunner {

		
}
