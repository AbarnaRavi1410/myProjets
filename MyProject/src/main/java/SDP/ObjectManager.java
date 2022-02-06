package SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ProjectObjectModel.Book_A_Hotel;
import ProjectObjectModel.Confirm_Booking;
import ProjectObjectModel.Hotel_Search;
import ProjectObjectModel.Hotel_Select;
import ProjectObjectModel.Login_Pg;
import ProjectObjectModel.MyItinary;

public class ObjectManager {
	
	public WebDriver driver;
	private Login_Pg login;
	private Hotel_Search hotelSearch;
	private Hotel_Select hotelSelect;
	private Book_A_Hotel bookHotel;
	private Confirm_Booking confirmBooking;
	private MyItinary myItinaryInstance;
	
	public ObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	
	
	public Login_Pg loginInstance() {
		if (login == null) {
			login = new Login_Pg(driver);
		}
		
		return login;

	}
	
	  public Hotel_Search holtelSearchInstance() {
		  if (hotelSearch == null) {
		  hotelSearch = new Hotel_Search(driver); 
		  }
	  return hotelSearch;
	  }
	 
	
	/*
	 * public Create_Account createAccInstance() { createAcc = new
	 * Create_Account(driver); return createAcc; }
	 */
	
	
	 
	 public Hotel_Select hotelSelectInstance() {
		 if(hotelSelect == null) {
		 hotelSelect = new Hotel_Select(driver);
		 }
		 return hotelSelect;
		 }
	 
	 public Book_A_Hotel bookHotelInstance() { 
		 if (bookHotel == null) {
		 bookHotel = new Book_A_Hotel(driver); 
		 }
		 return bookHotel;
	  
	  }

	 public Confirm_Booking confirm_BookingInstance() { 
		 if(confirmBooking == null) {
	confirmBooking = new Confirm_Booking(driver); 
		 }
	return confirmBooking; 
	}
	 
	public MyItinary myItinaryInstance() {
		if(myItinaryInstance == null) {
			myItinaryInstance = new MyItinary(driver);
		}
		return myItinaryInstance;
		 
	 }


	
	

}
