package com.freecrm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.base.TestBase;
import com.freecrm.qa.util.TestUtil;

public class LoginToFreeCrm extends TestBase {

		@FindBy(xpath="//span[contains(text(),'Log In')]")
		WebElement logInBtn;
		
		@FindBy(name="email")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
		WebElement finalLoginBtn;
		
		public LoginToFreeCrm() {
			PageFactory.initElements(driver, this);
		}
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public void clickLogIn() throws InterruptedException {
			
			Thread.sleep(5000);
			//logInBtn.click();
			driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		}
		
		public void enterUserNameAndPassword(String user, String password) {
						
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userName.sendKeys(user);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			this.password.sendKeys(password);
			
		}
		
		public FreeCrmHomePage logIn() {
			
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			finalLoginBtn.click();
			
			return new FreeCrmHomePage();
			
		}
		
}
