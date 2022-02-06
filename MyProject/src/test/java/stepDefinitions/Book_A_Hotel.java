package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import SDP.ObjectManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Book_A_Hotel extends BaseClass {
	
	public static WebDriver driver = BaseClass.driver;
	public static ObjectManager pom = new ObjectManager(driver);

@When("User enters {string} and {string}")
public void user_enters_and(String firstName, String lastName) {
    sendValues(pom.bookHotelInstance().getFirstName(),firstName);
    sendValues(pom.bookHotelInstance().getLastName(),lastName);
}

@When("User enters {string} in billing_address")
public void user_enters_in_billing_address(String billingAddress) {
	sendValues(pom.bookHotelInstance().getBillingAddress(),billingAddress);
}

@When("User enters {string} in credit_card_no")
public void user_enters_in_credit_card_no(String cardNo) {
     sendValues(pom.bookHotelInstance().getCreditCardNo(), cardNo);
}

@When("User selects card type")
public void user_selects_card_type(DataTable dataTable) {
	List<String> cartType = dataTable.asList();
	dropDown(pom.bookHotelInstance().getCreditCardType(),cartType.get(0), cartType.get(1));
    
}

@When("User selects card expiry month and year")
public void user_selects_card_expiry_month_and_year(DataTable dataTable) {
List<String> expiry = dataTable.asList();
   dropDown(pom.bookHotelInstance().getExpiryDate(), expiry.get(0), expiry.get(1));
   dropDown(pom.bookHotelInstance().getExpiryYear(), expiry.get(2), expiry.get(3));
}



@When("User enters the card {string} and {string}")
public void user_enters_the_card_and(String cardNo, String cvv) {
	sendValues(pom.bookHotelInstance().getCreditCardNo(), cardNo);
	sendValues(pom.bookHotelInstance().getCvvNo(), cvv);
}

@Then("clicks on Book now")
public void clicks_on_book_now() {
    clikable(pom.bookHotelInstance().getBookNow());
}

@Then("Booking confirmation page occurs")
public void booking_confirmation_page_occurs() {
   explicitwait(pom.confirm_BookingInstance().getMyItinerary(), "visibilityof", 5000);
   assertTrue(displayCheck(pom.confirm_BookingInstance().getMyItinerary()));

}	
}
