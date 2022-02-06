package ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
		
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(xpath ="//*[@name='adult_room']")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="")
	private WebElement reset;
	
	@FindBy(xpath = "(//*[@class=\"welcome_menu\"]/a)[4]")
	private WebElement logout;
	
	//not in that page
	@FindBy(css = ".reg_success a")
	private WebElement loginAgain;

	public WebElement getLoginAgain() {
		return loginAgain;
	}

	public WebElement getLogout() {
		return logout;
	}

	public Hotel_Search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	

}
