package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Harish\\Study\\Java\\EclipseWS\\MyTestFW\\src\\test\\resources\\features",
				glue={"com.web"},
				tags= "@tag1",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				//plugin = {"html:target/reports/cucumber-html-report.html", "json:target/reports/cucumber.json", "pretty"},
				monochrome=true
				)

public class CucumberRunnerTests {	 
 
}

