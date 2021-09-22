package com.amit.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return logoMyStore.isDisplayed();
	}
	
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logoMyStore;
	
}
