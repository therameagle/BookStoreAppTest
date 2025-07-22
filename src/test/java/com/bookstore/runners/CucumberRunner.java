package com.bookstore.runners;
//import the Package
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/* 
 * This class is used to check for 
 * Running the Test cases
*/
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // add the stepdefinition file
				glue = "com/bookstore/stepDefinition", // add the stepdefinition file
				plugin = {"html:target/default-html-reports.html" }, // generate the html report 
				dryRun = false,
		        tags = "@testScenario")
public class CucumberRunner {
}
