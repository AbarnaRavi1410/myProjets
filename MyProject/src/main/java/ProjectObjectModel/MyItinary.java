package ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItinary {

	public WebDriver driver;
	
	@FindBy(id = "order_id_text")
	private WebElement orderID;

	public MyItinary(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderID() {
		return orderID;
	}
	
}
