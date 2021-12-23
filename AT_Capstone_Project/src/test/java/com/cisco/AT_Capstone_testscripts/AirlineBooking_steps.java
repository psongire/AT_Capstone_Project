package com.cisco.AT_Capstone_testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AirlineBooking_steps extends Driver
{
	@Given("the user click on the login\\/signup button")
	public void the_user_click_on_the_login_signup_button() 
	{
		signup.click_signup();
	    
	}

	@Given("he clicks on the not a member?SignUp")
	public void he_clicks_on_the_not_a_member_sign_up() 
	{
	    signup.notmember();
	}

	@Given("he entered the valid details")
	public void he_entered_the_valid_details() 
	{
	    signup.enter_data();
	}
	@Given("he clicks on the signup button")
	public void he_clicks_on_the_signup_button() 
	{
		signup.sign_up();
	}
	@Then("the user registered succesfully")
	public void the_user_registered_succesfully() 
	{
		
		System.out.println("user registered succesfully");
	}
	
	
	

	@Given("the user clicks on the login page")
	public void the_user_clicks_on_the_login_page() throws InterruptedException 
	{
		
		login.login();
	}

	@Given("he enters the details")
	public void he_enters_the_details() throws InterruptedException 
	{
	    login.details();
	}
	
	@Given("he clicks on the login button")
	public void he_clicks_on_the_login_button() 
	{
	   login.click_login();
	}
	
	
	
	@Given("he clicks on the home button")
	public void he_clicks_on_the_home_button() throws InterruptedException 
	{
		 book.click_home();
	}

	@Given("the user select the source location")
	public void the_user_select_the_source_location() throws InterruptedException 
	{
	    book.bnglr();
	}

	@Given("he selects destination")
	public void he_selects_destination() throws InterruptedException 
	{
		book.chennai();
	    
	}
	
	@Given("he clicks on the submit button")
	public void he_clicks_on_the_submit_button() throws InterruptedException 
	{
		book.submit_but();
	}

	@Given("he clicks on the book Flight")
	public void he_clicks_on_the_book_flight() throws InterruptedException 
	{
		book.book_fli();
	}

	@Given("he clicks on the confirm bookings")
	public void he_clicks_on_the_confirm_bookings() throws InterruptedException 
	{
	    book.Confirm_book();
	}

	@Given("he see his bookings")
	public void he_see_his_bookings() 
	{
		book.see_book();
	}

	@Then("the user login searching and booking verified succesfully")
	public void the_user_login_searching_and_booking_verified_succesfully()
	{
		System.out.println("user search login and verification successfull");
	}

}
