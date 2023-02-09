package cucumberExample.StepDefs;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefs {

	private WebDriver driver;
	
	@Given("I am on the Google")
	public void i_am_on_the_google() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\james.gould\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}
	
	@Given("I dismiss the the Cookies pop up")
	public void i_dismiss_the_the_cookies_pop_up() throws InterruptedException {
		By dismissCookie = By.id("Accept all");
		driver.wait(10);
		driver.findElement(dismissCookie).click();
	}

	private Object WebDriverWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@When("I click on Images")
	public void i_click_on_images() {
	}

	@Then("the Images page will be displayed")
	public void the_images_page_will_be_displayed() {
	}

	
}
