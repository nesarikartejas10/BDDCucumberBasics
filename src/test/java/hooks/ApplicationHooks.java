package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	
	@Before
	public void beforeHook()
	{
		System.out.println("Lauching the browser");
		
	}
	
	@After
	public void afterHook() {
		System.out.println("Shutting down the browser");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step");
	}


}
