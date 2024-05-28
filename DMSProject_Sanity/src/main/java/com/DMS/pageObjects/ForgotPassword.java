package com.DMS.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class ForgotPassword extends AbstractComponent{
	static WebDriver driver;
	public ForgotPassword(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//small[normalize-space()='Forgot password?']")
	WebElement forgotPassword;
	@FindBy(xpath="//input[@placeholder='Account Email']")
	WebElement accountEmail;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	public void clickOnForgotPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		forgotPassword.click();
		Thread.sleep(2000);
	}
	
	public void accoutEmail(String email) throws InterruptedException
	{
		Thread.sleep(2000);
		accountEmail.sendKeys(email);
		Thread.sleep(2000);
		submit.click();	
	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		alt.accept();
		return msg;	
	}
	
	

}
