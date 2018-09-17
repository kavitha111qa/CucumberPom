package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Testbase;

public class Homepage extends Testbase{
	
//	@FindBy(xpath="//td[contains(text(),'User: Kavitha Mani')]")
//	WebElement userNameLabel;
	  
	@FindBy(xpath="//td[@class='headertext'and@align='left']")
	WebElement userNameLabel;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public String ValidatehomepageTitle() {	
		return driver.getTitle();	
		}
//	
//	public  boolean validateCorrectUserName() {
//	   return userNameLabel.isDisplayed();
//			
//	}

}
