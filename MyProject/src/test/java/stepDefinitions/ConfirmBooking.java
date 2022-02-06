package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import SDP.ObjectManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmBooking extends BaseClass{

	public static WebDriver driver = BaseClass.driver;
	public static ObjectManager pom = new ObjectManager(driver);

@When("User clicks on MyItinary")
public void user_clicks_on_my_itinary() {
    clikable(pom.confirm_BookingInstance().getMyItinerary());
}

@Then("MyItinary page should occur")
public void my_itinary_page_should_occur() throws IOException {
    explicitwait(pom.myItinaryInstance().getOrderID(), "visibilityof", 3000);
    screenshort("final");
    assertTrue(displayCheck(pom.myItinaryInstance().getOrderID()));
    
}

}
