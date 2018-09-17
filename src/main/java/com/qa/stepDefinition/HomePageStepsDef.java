package com.qa.stepDefinition;

import org.junit.Assert;

import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;
import com.qa.util.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepsDef extends Testbase {
	
	LoginPage loginpage;
	Homepage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()  {
		Testbase.initialization();
	 
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
		loginpage = new LoginPage();
		String title = loginpage.ValidateLoginpageTitle();
		System.out.println(title);       
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		homepage = loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	@Then("^validate homepage title$")
	public void validate_homepage_title() {
		String hm_title =homepage.ValidatehomepageTitle();
		System.out.println(hm_title);
	    
	}

//	@Then("^validate logged in username$")
//	public void validate_logged_in_username() throws Throwable {
//	     homepage.validateCorrectUserName();
//	  
//	}
}
