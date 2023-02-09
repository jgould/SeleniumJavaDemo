package cucumberExample.StepDefs;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ABPage;
import Pages.AddRemovePage;
import Pages.HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDefs {

	private WebDriver driver;
	
	@Given("I am on the demo page")
	public void I_am_on_the_demo_page() {
		driver = DriverFactory.getDriver();
		new HomePage(driver).load("http://the-internet.herokuapp.com/");
	}
	
	@When("I click on the AB Testing Link")
	public void I_click_on_the_ab_testing_link() throws InterruptedException {
		new HomePage(driver).abTesingLink.click();
	}
		
	@Then("the AB Testing page will be displayed")
	public void the_menu_with_expand() throws InterruptedException {
		new ABPage(driver).pageTitle.click();
	}
	
	@Given("I click on the Add and Remove Elements Link")
	public void I_click_on_the_add_and_remove_Elements_Link() throws InterruptedException {
		new HomePage(driver).addRemoveElemental.click();
	}
	
	@Then("the Add and Remove Elements page will be displayed")
	public void the_add_and_remove_lements_page_will_be_displayed() throws InterruptedException {
		new AddRemovePage(driver).addElementButton.isDisplayed();
	}
	
	@Then("the remove element button will be present")
	public void the_remove_element_button_will_be_present() throws InterruptedException {
		new AddRemovePage(driver).removeElementButton.isDisplayed();
	}
	
}
