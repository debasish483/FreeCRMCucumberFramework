package com.freecrm.qa.stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.freecrm.qa.pages.CreateDeals;
import com.freecrm.qa.util.TestUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateDealsStepDefinition {
	
	WebDriver driver;
	CreateDeals dealsPage;
	
	@When("^new contact is created$")
	public void new_contact_is_created() throws InterruptedException {
		
		dealsPage = new CreateDeals();
		Boolean contactNameDisplayed = dealsPage.validateContactName();
		Assert.assertTrue(contactNameDisplayed);
	}
	
	@Then("^user clicks on Deals link$")
	public void user_clicks_on_Deals_link() {
		dealsPage.clickDealsLink();
	}
	
	@And("^user clicks on the New link$")
	public void user_clicks_on_the_New_link() throws InterruptedException{
		dealsPage.clickNewDealsLink();
	}
	
	@Then("^user enters title, probability, amount and commission$")
	public void user_enters_title_probability_amount_and_commission(DataTable dealData) throws IOException, ParseException, InterruptedException {
		
		List<List<String>> deal = dealData.raw();
		String reqdTitle = deal.get(0).get(0);
		String reqdProbability = deal.get(0).get(1);
		String reqdAmount = deal.get(0).get(2);
		String reqdCommission = deal.get(0).get(3);
			
		String jSONArrayName = "CreateDeal";
		String[] data;		
		String reqdDealTitle = null;
		String reqdDealProbability = null;
		String reqdDealAmount =  null;
		String reqdDealCommission = null;
	
		data = TestUtil.readMenuData(jSONArrayName, reqdTitle);
		reqdDealTitle = data[0];
		data = TestUtil.readMenuData(jSONArrayName, reqdProbability);
		reqdDealProbability = data[0];
		data = TestUtil.readMenuData(jSONArrayName, reqdAmount);
		reqdDealAmount = data[0];
		data = TestUtil.readMenuData(jSONArrayName, reqdCommission);
		reqdDealCommission = data[0];
		
		dealsPage.enterDealDetails(reqdDealTitle, reqdDealProbability, reqdDealAmount, reqdDealCommission);
		
	}
	
	@And("^user clicks on Save button to create a deal$")
	public void user_clicks_on_Save_button_to_create_a_deal(){
		dealsPage.createNewDeal();
	}
}
