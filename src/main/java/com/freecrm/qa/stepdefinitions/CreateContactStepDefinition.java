package com.freecrm.qa.stepdefinitions;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import com.freecrm.qa.pages.CreateContacts;
import com.freecrm.qa.util.TestUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CreateContactStepDefinition {
	
	WebDriver driver;
	CreateContacts contactsPage;
	
	@Given("^user is on the contacts page$")
	public void user_is_on_the_contacts_page() {
		contactsPage = new CreateContacts();
		Boolean pageFound = contactsPage.validatePageExists();
		Assert.assertTrue(pageFound);
	}
	
	@Then("^clicks on the New button$")
	public void clicks_on_the_New_button() {
		contactsPage.goToContactPage();
	}
	
	@Then("^fills the required \"(.*)\" name and \"(.*)\" surname$")
	public void fills_the_required_name_and_surname(String Name, String SurName) throws IOException, ParseException, InterruptedException {
		String jSONArrayName = "CreateContact";
		String[] data;		
		String firstName = null;
		String lastName = null;
		data = TestUtil.readMenuData(jSONArrayName, Name);
		firstName = data[0];
		data = TestUtil.readMenuData(jSONArrayName, SurName);
		lastName = data[0];
		
		System.out.println("First name of the contact to be created is : " + firstName);
		System.out.println("Last name of the contact to be created is : " + lastName);
			
		contactsPage.enterContactDetails(firstName, lastName);
	}
	
	@And("^clicks on Save button$")
	public void clicks_on_Save_button() throws Throwable {
		
		contactsPage.saveContactDetails();
	}
}
