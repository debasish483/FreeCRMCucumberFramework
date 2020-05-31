package com.freecrm.qa.stepdefinitions;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.pages.FreeCrmHomePage;
import com.freecrm.qa.util.TestUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NavigateToContactsPageStepDefinition extends TestBase {
	
	WebDriver driver;
	FreeCrmHomePage homePage;
	
	//String jSONMenuName = "MenuName";
	
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() {
		homePage = new FreeCrmHomePage();
		String homePageTitle = homePage.homePageTitle();
		Assert.assertEquals("Cogmento CRM",homePageTitle);
	}
	
	@Then("^user clicks on the required \"(.*)\"$")
	public void user_clicks_on_the_required_menu(String Menu) throws IOException, ParseException {
		
		String jSONArrayName = "CreateContact";
			
		String menuName = null;
		String[] data;
	
		data = TestUtil.readMenuData(jSONArrayName, Menu);

		for (int i=0; i<data.length; i++) {
			menuName = data[i];
		}	

		System.out.println(menuName);
		
		homePage.selectMenu(menuName);
	}
	
	@And("^user lands on the contacts page$")
	public void user_lands_on_the_contacts_page() {
		
		String landingPageName = homePage.validateLandingPage();
		Assert.assertEquals("Contacts",landingPageName);
	}
}
