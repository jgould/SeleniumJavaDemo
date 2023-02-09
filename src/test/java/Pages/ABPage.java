package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABPage extends BasePage {

	public ABPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//h3[normalize-space()='A/B Test Control'])[1]") public WebElement pageTitle;
	
}
