package com.cisco.AT_Capstone_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeSignup {
	Actions actions;

	@FindBy(css = "body > a:nth-child(3)")
	private WebElement signinlink;
	
	@FindBy(css = "body > form:nth-child(6) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(3)")
	private WebElement member;
	
	@FindBy(name = "email_id")
	private WebElement eid;
	
	@FindBy(name = "pwd")
	private WebElement pass1;
	
	@FindBy(name = "pwd2")
	private WebElement pass2;
	
	@FindBy(name = "name")
	private WebElement name;
	
	@FindBy(css ="body > form > table > tbody > tr:nth-child(7) > td > button")
	private WebElement signup;
	
	public HomeSignup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	
	}
	public void click_signup() {
		signinlink.click();
	}
	
	public void notmember() {
		member.click();
	}
	public void enter_data( ) {
		eid.sendKeys("mac@gmail.com");
		pass1.sendKeys("mac123");
		pass2.sendKeys("mac123");
		name.sendKeys("mac");
		
	}
	public void sign_up() {
		signup.click();
	}
}
