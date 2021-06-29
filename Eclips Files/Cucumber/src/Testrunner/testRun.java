package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/feature"},
		glue={"stepDef"},
		plugin = {"pretty","html:target/cucumber-report"}
		
		)




public class testRun {

}
