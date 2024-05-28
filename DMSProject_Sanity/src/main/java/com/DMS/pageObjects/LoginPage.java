package com.DMS.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{
	static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="//small[contains(text(),'Forgot')]")
	WebElement forgotpass;
	@FindBy(xpath="//h2[contains(text(),'Dashboard')]")
	WebElement homepage;
	@FindBy(xpath="//img[@title='User profile']")
	WebElement profile;
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	WebElement logoutoption;
	@FindBy(xpath="//span[normalize-space()='Invalid username or password']")
	WebElement err1;
	

	//public Object setUsername;
	
	
	
	public void clearEmail()
	{
		email.clear();
	}
	
	
	public void clearPwd()
	{
		password.clear();
	}
	
	public void setEmail(String uname)
	{
		email.sendKeys(uname);
	}
	

	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public String verifyHomepage()
	{
		String text=homepage.getText();
		return text;
	}
	public void profileIcon()
	{
		
		profile.click();
	}
	public void logout()
	{
		logoutoption.click();
	}
	
	public String ErrorMsg()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
}