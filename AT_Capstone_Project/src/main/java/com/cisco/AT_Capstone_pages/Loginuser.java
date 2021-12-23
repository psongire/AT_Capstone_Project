package com.cisco.AT_Capstone_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginuser 
{
	Actions actions;
	
	@FindBy(name = "email_id")
	private WebElement email;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(css = "body > form > table > tbody > tr:nth-child(3) > td > button")
	private WebElement login;
	
	@FindBy(css = "body > a:nth-child(3)")
	private WebElement signinlink;
	
	
	

	public Loginuser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		signinlink.click();
	}
	public  void details() throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys("mac@gmail.com");
		password.sendKeys("mac123");
		
	}
	public void click_login()
	{
		login.click();
	}

}
