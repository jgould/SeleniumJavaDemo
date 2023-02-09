package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//a[normalize-space()='A/B Testing'])[1]") public WebElement abTesingLink;
	@FindBy(xpath = "//a[normalize-space()='Add/Remove Elements']") public WebElement addRemoveElemental;

}
