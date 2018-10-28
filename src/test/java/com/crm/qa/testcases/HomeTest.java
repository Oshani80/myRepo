package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

public class HomeTest extends TestBase{
	
	Homepage homepage;
	LoginPage loginPage;
	public HomeTest() {
		super();
	}
	
	public void setUp()  {
		initialization();
		homepage = new Homepage();
	}
	
	public void clickOnProfileLoginLabelTest() {
		loginPage = homepage.clickOnLoginLbl();		
		
	}
}
