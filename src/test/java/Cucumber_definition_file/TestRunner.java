package Cucumber_definition_file;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"FeaturesFile"},
		glue={"Cucumber_definition_file"},
		//dryRun = true,
        plugin = {"pretty",
                  "html:target/report/cucumber.html",
                  "json:target/report/cucumber.json"
                 },
	    tags= "@tag1"

		)
 
public class TestRunner extends AbstractTestNGCucumberTests
{
	
 
}
