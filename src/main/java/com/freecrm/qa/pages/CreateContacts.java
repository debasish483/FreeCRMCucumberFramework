package com.freecrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;

public class CreateContacts extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newButton;
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement pageName;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	public CreateContacts() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validatePageExists(){
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Boolean pageExists = pageName.isDisplayed();
		return pageExists;
		
	}
	

	public void goToContactPage( ) {
		
		newButton.click();
		
	}
	
	
	public void enterContactDetails(String firstName, String lastName ) throws InterruptedException {
		
		Thread.sleep(3000);
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		driver.findElement(By.name("status")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'New')]")).click();
		
	}
	
	public void saveContactDetails( ) {
		saveButton.click();
	}
	
}
