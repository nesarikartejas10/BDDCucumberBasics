package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\java\\resource\\application_test\\RegistrationDataTable.feature"},
		glue = {"stepdefinations"},
		publish = true,
		plugin = {"pretty"},
		monochrome = true
		
		)
public class RegistrationDataTableRunner extends AbstractTestNGCucumberTests {

}
