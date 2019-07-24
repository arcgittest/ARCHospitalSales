package com.archs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HospitalSalesLoginPage {
	
	WebDriver ldriver;
	
	public HospitalSalesLoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath = "//input[contains(@id,'username')]")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy (xpath = "//input[contains(@id,'password')]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (xpath = "//input[contains(@id,'Login')]")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);	
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);	
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}

	
}
