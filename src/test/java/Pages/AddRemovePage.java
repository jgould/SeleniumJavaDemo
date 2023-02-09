package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemovePage extends BasePage  {	
	
	public AddRemovePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Add Element']") public WebElement addElementButton;
	@FindBy(xpath = "//button[normalize-space()='Remove Element']") public WebElement removeElementButton;
	
}
