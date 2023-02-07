package cucumberExample;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

	@BeforeAll
	public static void beforeall(){
		System.out.println("\nBefore tests\n");
	}
	
	@AfterAll
	public static void afterall(){
		System.out.println("\nAfter tests\n");
	}
}
