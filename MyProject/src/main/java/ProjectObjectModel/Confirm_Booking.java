package ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Booking {
	
	public WebDriver driver;
	
	@FindBy(id="search_hotel")
	private WebElement searchHotels;
	
	@FindBy(id="my_itinerary")
	private WebElement myItinerary;
	
	@FindBy(id="logout")
	private WebElement logout;

	public Confirm_Booking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getSearchHotels() {
		return searchHotels;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
