package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\testsachin\\src\\test\\resources\\featurefiles\\exhibitorform.feature",
                 glue="stepdefinitions",plugin = {"pretty","json:target/cucumber-reports/Cucumber.json"})

public class Runnerclass 
{
	
	
}
