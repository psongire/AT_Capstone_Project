package com.cisco.AT_Capstone_testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cisco.AT_Capstone_pages.Booking;
import com.cisco.AT_Capstone_pages.HomeSignup;
import com.cisco.AT_Capstone_pages.Loginuser;

public class Driver extends Tools {

	protected static HomeSignup signup;
	protected static Booking book;
	protected static Loginuser login;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		
		signup = new HomeSignup(driver);
		book = new Booking(driver);
		login = new Loginuser(driver);
		

	}

}
