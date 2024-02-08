package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\java\\resource\\application_test\\Profile.feature"},
		glue = {"stepdefinations", "hooks"},
		publish = true,
		plugin = {"pretty"}
		)


public class ProfileRunnner extends AbstractTestNGCucumberTests{

}
