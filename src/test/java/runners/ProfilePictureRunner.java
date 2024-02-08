package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\java\\resource\\application_test\\ProfilePicture.feature"},
		glue = {"stepdefinations"},
		publish = true,
		plugin = {"pretty"},
	//	tags = "@sanity"
	//	tags = "@sanity or @regression"
      tags = "@regression and @functional",
	//  tags = "not @functional"
      dryRun = true
		
		)
public class ProfilePictureRunner extends AbstractTestNGCucumberTests{

}
