package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.Testbase;

public class LoginPage extends Testbase { 
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//font[text()='Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@alt,'free crm logo')]")
	WebElement crmLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String ValidateLoginpageTitle() {	
		return driver.getTitle();	
		}
		public boolean validateCRMImage() {
			return crmLogo.isDisplayed();
		
	   }
		public  Homepage validateLogin(String uname, String pword) {
			username.sendKeys(uname);
			password.sendKeys(pword);
			loginBtn.click();
			return new Homepage();
			
			
		}

}
