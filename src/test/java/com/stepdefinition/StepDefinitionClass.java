package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass;
import com.pom_class.BookHotel;
import com.pom_class.LogOut;
import com.pom_class.LoginPagePom;
import com.pom_class.SearchHotelPom;
import com.pom_class.SelectHotelPom;
import com.test_runner.Test_Runner_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends BaseClass {

	public static WebDriver driver = Test_Runner_class.driver;
	public static LoginPagePom l = new LoginPagePom(driver);
	public static SearchHotelPom sh = new SearchHotelPom(driver);
	public static SelectHotelPom sp = new SelectHotelPom(driver);
	public static BookHotel bh = new BookHotel(driver);
	public static LogOut l1 = new LogOut(driver);
	
	@Given("^User enters the adactin URL$")
	public void user_enters_the_adactin_URL() throws Throwable {
	    get("https://adactinhotelapp.com/index.php");
		
	}

	@When("^User enters the username$")
	public void user_enters_the_username() throws Throwable {
	    inputValues(l.getUsername(), "saranyasathyaraj");
		
	}

	@When("^User enters the password$")
	public void user_enters_the_password() throws Throwable {
	   inputValues(l.getPassword(), "*Sathya#1219");
	}

	@Then("^User clicks the login button and navigate to search hotel page$")
	public void user_clicks_the_login_button_and_navigate_to_search_hotel_page() throws Throwable {
	   elementClick(l.getLogin());
	}
	
	@When("^User selects the location$")
	public void user_selects_the_location() throws Throwable {
	    dropDown(sh.getLocation(), "Visible text", "London");
	}

	@When("^User selects the hotels$")
	public void user_selects_the_hotels() throws Throwable {
	    dropDown(sh.getHotels(), "value", "Hotel Cornice");
	}
	@When("^User selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
   
		dropDown(sh.getRoomType(), "index", "1");
	}

	@When("^User selects adults per room$")
	public void user_selects_adults_per_room() throws Throwable {
		dropDown(sh.getAdult(), "Value", "1");
		
	}

	@When("^User selects the children per room$")
	public void user_selects_the_children_per_room() throws Throwable {
		dropDown(sh.getChild(), "value", "2");  
	}

	@Then("^User click on the search button and verify navigate to select hotel$")
	public void user_click_on_the_search_button_and_verify_navigate_to_select_hotel() throws Throwable {
	    elementClick(sh.getSubmit());
		
	}
	@When("^User select the hotel by clicking the radio button$")
	public void user_select_the_hotel_by_clicking_the_radio_button() throws Throwable {
	    radioButton(sp.getHotel());
	}

	@Then("^User clicks the continue button and verify navigate to the book hotel$")
	public void user_clicks_the_continue_button_and_verify_navigate_to_the_book_hotel() throws Throwable {
	    elementClick(sp.getConti());
	}
	
	@When("^User enters the first name$")
	public void user_enters_the_first_name() throws Throwable {
	   inputValues(bh.getFname(), "Saranya");
		
	}

	@When("^User enters the Last name$")
	public void user_enters_the_Last_name() throws Throwable {
	    inputValues(bh.getLname(), "Sathyaraj");
	}

	@When("^User enters the address$")
	public void user_enters_the_address() throws Throwable {
	   inputValues(bh.getAddr(), "London");
	}

	@When("^User enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
	 inputValues(bh.getCardName(), "1234567890123456"); 
	}

	@When("^User enters the Credit card type$")
	public void user_enters_the_Credit_card_type() throws Throwable {
	 radioButton(bh.getCardType()); 
	}

	@When("^User selects the ExpiryMonth$")
	public void user_selects_the_ExpiryMonth() throws Throwable {
	  radioButton(bh.getMonth());
	}

	@When("^User selects the Year$")
	public void user_selects_the_Year() throws Throwable {
	   radioButton(bh.getYear());
	}

	@When("^User enters the CVV$")
	public void user_enters_the_CVV() throws Throwable {
	   inputValues(bh.getCvv(), "123");
	}

	@Then("^User clicks on Book now button and verify navigate to the booking confirmation$")
	public void user_clicks_on_Book_now_button_and_verify_navigate_to_the_booking_confirmation() throws Throwable {
	 elementClick(bh.getClick());
	}
	
	@When("^User clicks the logout button and verify the successfully logout page$")
	public void user_clicks_the_logout_button_and_verify_the_successfully_logout_page() throws Throwable {
	    elementClick(l1.getLogOut());
	}


}
