package com.freecrm.qa.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.FreeCrmHomePage;
import com.freecrm.qa.pages.LoginToFreeCrm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToFreeCRMStepDefinition extends TestBase {
	
	WebDriver driver ;
	LoginToFreeCrm logIn;
	FreeCrmHomePage homePage;
	
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
	
		initialization();
	}
	
	@When("^page title is Free CRM$")
	public void page_title_is_Free_CRM(){
		
		logIn = new LoginToFreeCrm();
		String loginPageTitle = logIn.validateLoginPageTitle();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small",loginPageTitle);
		
	}
	
	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws InterruptedException{
		
		Thread.sleep(3000);
		logIn.clickLogIn();
		
	}
	
	@Then("^user types the username and password$")
	public void user_types_the_username_and_password() {
		
		logIn.enterUserNameAndPassword(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Then("^user again clicks on the login button$")
	public void user_again_clicks_on_the_login_button(){
		
		homePage = logIn.logIn();
	}
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		
		String homePageTitle = homePage.homePageTitle();
		Assert.assertEquals("Cogmento CRM",homePageTitle);
		
	}
}
