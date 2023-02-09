package Hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private WebDriver driver;
	
	@Before
	public void before() {
		driver = DriverFactory.initializeDriver();
	}
	
	@After
	public void after() {
		driver.quit();
	}

}
