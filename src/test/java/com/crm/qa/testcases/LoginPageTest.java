package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage logingPage;
	Homepage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();   
	    logingPage = new LoginPage();
	}
	//sdfguhiojpkjoihubguvfycdfvgbhnjkopkojoih
//	@Test(priority=1)
//	public void loginPageTitleTest() {
//		String title =logingPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
//		
//	}
//	
//	@Test(priority=2)
//	public void crmLogoImageTest() {
//		boolean flag = logingPage.validateCRMImage();
//		Assert.assertTrue(flag);
//	}
//	
//	@Test(priority=3)
//	public void loginTest()  {
//		homePage=logingPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}
//	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
