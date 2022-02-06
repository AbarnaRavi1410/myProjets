package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import SDP.ObjectManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelSearch extends BaseClass{
	
	
public static WebDriver driver = BaseClass.driver;
public static ObjectManager pom = new ObjectManager(driver);

@When("User enter the following hotel information")
public void user_enter_the_following_information(DataTable dataTable) {
    List<String> listValues = dataTable.asList();
    dropDown(pom.holtelSearchInstance().getLocation(), listValues.get(0), listValues.get(1));
    dropDown(pom.holtelSearchInstance().getHotel(), listValues.get(2), listValues.get(3));
    dropDown(pom.holtelSearchInstance().getRoomType(), listValues.get(4), listValues.get(5));
}


@When("User enter adult and child per room")
public void user_enter_adult_and_child_per_room(DataTable dataTable) {
   List<String> perRoomDetails = dataTable.asList();
   dropDown(pom.holtelSearchInstance().getAdultsPerRoom(), perRoomDetails.get(0), perRoomDetails.get(1));
   dropDown(pom.holtelSearchInstance().getChildPerRoom(), perRoomDetails.get(2), perRoomDetails.get(3));
}


@When("User selects the {string} and {string} date for the hotel")
public void user_selects_the_and_date_for_the_hotel(String checkin, String checkout) {
	sendValues(pom.holtelSearchInstance().getCheckInDate(), checkin);
	sendValues(pom.holtelSearchInstance().getCheckOutDate(), checkout);
}

@Then("User searches for the Hotel")
public void user_searches_for_the_hotel() {
    
	clikable(pom.holtelSearchInstance().getSearch());
}
@Then("Hotel selection page occurs")
public void hotel_selection_page_occurs() {
	explicitwait(pom.hotelSelectInstance().getContinueButton(),"visibilityof", 5000);
 assertTrue(displayCheck(pom.hotelSelectInstance().getContinueButton()));
}
}
