package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;

public class CreateDeals extends TestBase {
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactName;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newButton;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//input[@name='probability']")
	WebElement probability;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement amount;
	
	@FindBy(xpath="//input[@name='commission']")
	WebElement commission;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveDeal;
	
	
	public CreateDeals() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validateContactName() throws InterruptedException {
		
		Thread.sleep(3000);
		Boolean contactNameIsPresent = contactName.isDisplayed();
		return contactNameIsPresent;
		
	}
	
	public void clickDealsLink() {
		
		dealsLink.click();
		
	}
	
	public void clickNewDealsLink() throws InterruptedException {
		
		Thread.sleep(3000);
		newButton.click();
		
	}
	
	public void enterDealDetails(String dealTitle, String dealProbability, String dealAmount, String dealCommission ) throws InterruptedException {
		
		Thread.sleep(3000);
		
		title.sendKeys(dealTitle);
		probability.sendKeys(dealProbability);
		amount.sendKeys(dealAmount);
		commission.sendKeys(dealCommission);
		
	}
	
	public void createNewDeal( ) {
		
		saveDeal.click();
	}
	
	
}
