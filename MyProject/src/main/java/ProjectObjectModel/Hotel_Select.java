package ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Select {
	
	public WebDriver driver;
	
	@FindBy(name ="radiobutton_0")
	private WebElement sunShine_SuperDelux;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public Hotel_Select(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getSunShine_SuperDelux() {
		return sunShine_SuperDelux;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	
	
	

}
