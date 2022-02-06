package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import SDP.ObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import propertiesFile.FileReaderManager;



public class Login extends BaseClass{
	
public static WebDriver driver= BaseClass.driver;
public static ObjectManager pom = new ObjectManager(driver);

@Given("User landing on the hotel sign in page")
public void user_landing_on_the_hotel_sign_in_page() throws IOException {
	
	 getUrl(FileReaderManager.fileReaderManagerInstance().configReader().getUrl());
	
}


@When("User enters the username {string} and password {string}")
public void user_enters_the_username_and_password(String userName, String password) throws InterruptedException {
  sendValues(pom.loginInstance().getUserName(), userName);
sendValues(pom.loginInstance().getPassword(), password);
}


@When("User clicking on the login button")
public void user_clicking_on_the_login_button() {
	clikable(pom.loginInstance().getLogin());
}

@Then("Hotel search page should appear")
public void hotel_search_page_should_appear() {
		assertTrue(displayCheck(pom.holtelSearchInstance().getLocation()));
}

@When("User enters the username <username> and password <password>")
public void user_enters_the_username_username_and_password_password(String userName, String password) {
	 sendValues(pom.loginInstance().getUserName(), userName);
	 sendValues(pom.loginInstance().getPassword(), password);
}


}
