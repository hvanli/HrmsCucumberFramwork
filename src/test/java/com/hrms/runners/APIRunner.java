package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
				glue = "com.hrms.API.steps.practice", 
				dryRun = true,
//				plugin= {"pretty", "html:target/html/cucumber-default"},
//				monochrome=true,
				tags = { "@SyntaxHRMSAPIEndToEnd" })

public class APIRunner {
}