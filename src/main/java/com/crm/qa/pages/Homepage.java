package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase{

	@FindBy(xpath="//a[@id='loginMenuHeader']")
	WebElement loginBtn;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnLoginLbl() {
		
		loginBtn.click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

