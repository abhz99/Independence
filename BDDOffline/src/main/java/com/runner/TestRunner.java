package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/* @RunWith tells the Junit to run feature files with Cucumber-JUnit dependency, 
 * @CucumberOptions configures the reporting style with the pretty plugin and the location for feature files & step-definition files. 
 */
@RunWith(Cucumber.class)
@CucumberOptions(
					features = ".//features",		// run specific feature files
					glue = "com.stepdefinition",	//package containing stepdef class
					dryRun = false,
					monochrome = true,
					plugin = {"pretty", "html:target"}					
				)
public class TestRunner {


}
