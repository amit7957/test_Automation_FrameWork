package com.amit.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amit.qa.base.TestBase;
import com.amit.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
