package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"src\\java\\resource\\application_test\\Login.feature"},

		glue = {"stepdefinations"},
		
		plugin = {"pretty"},
		
		publish = true


		)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
