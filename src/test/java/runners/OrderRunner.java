package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\java\\resource\\application_test\\Order.feature"},
		glue = {"stepdefinations"},
		publish = true,
		plugin = {"pretty"}
		)
public class OrderRunner extends AbstractTestNGCucumberTests{

}
