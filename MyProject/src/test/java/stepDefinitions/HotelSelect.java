package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import SDP.ObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelSelect extends BaseClass{


	public static WebDriver driver = BaseClass.driver;
	public static ObjectManager pom = new ObjectManager(driver);
	
@When("Users selects the hotel")
public void users_selects_the_hotel() {
    clikable(pom.hotelSelectInstance().getSunShine_SuperDelux());
}

@When("Click on continue")
public void click_on_continue() {
    clikable(pom.hotelSelectInstance().getContinueButton());
}

@Then("Booking a hotel page occurs")
public void booking_a_hotel_page_occurs() {
   explicitwait(pom.bookHotelInstance().getBookNow(), "visibilityof", 3000);
   assertTrue(displayCheck(pom.bookHotelInstance().getBookNow()));
}

}
