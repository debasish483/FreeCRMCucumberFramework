package com.freecrm.qa.pages;

//import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.util.TestUtil;

public class FreeCrmHomePage extends TestBase {

	
	public FreeCrmHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle() {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver.getTitle();
		
	}
			
	public void selectMenu(String reqdMenu) {
		System.out.println("Menu to be clicked : " +reqdMenu);
		driver.findElement(By.xpath("//span[contains(text(),'"+reqdMenu+"')]")).click();
		
	}
	
	public String validateLandingPage( ) {
		
		String pageName = driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
		
		return pageName;
	}
}
