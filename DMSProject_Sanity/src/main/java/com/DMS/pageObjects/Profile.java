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

public class Profile extends AbstractComponent{
	static WebDriver driver;
	public Profile(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//profile menu
	@FindBy(xpath="//img[@title='User profile']")
	WebElement userProfile;
	@FindBy(xpath="//div[contains(text(),'Profile')]")
	WebElement profile;
	@FindBy(xpath="//a[normalize-space()='Change Password']")
	WebElement changePassword;
	@FindBy(xpath="//a[normalize-space()='Create Digi Sign']")
	WebElement createDigiSign;
	
	//Change password
	@FindBy(xpath="//input[@placeholder='Current password']")
	WebElement currentPassword;
	@FindBy(xpath="//input[@placeholder='New password']")
	WebElement newPassword1;
	@FindBy(xpath="//input[@placeholder='Confirm new password']")
	WebElement confirmNewPassword1;
	@FindBy(xpath="//button[normalize-space()='Update']")
	WebElement update1;
	
	//Create digi sign
	@FindBy(xpath="//input[@id='password-text']")
	WebElement newPassword2;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='ibox-content']//div[2]//input[1]")
	WebElement confirmNewPassword2;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	//Update password for digi sign
	@FindBy(xpath="//button[normalize-space()='Update digi-sign password']")
	WebElement update2;
	@FindBy(xpath="(//input[@type='password'])[4]")
	WebElement oldPassword;
	@FindBy(xpath="(//input[@id='password-text'])[1]")
	WebElement newPassword3;
	@FindBy(xpath="(//input[@type='password'])[6]")
	WebElement confirmNewPassword3;
	@FindBy(xpath="//button[@class='btn btn-primary px-3 btn-xs ml-3']")
	WebElement update3;
	
	//Forgot digi-sign password
	@FindBy(xpath="//button[normalize-space()='Forgot digi-sign password ?']")
	WebElement forgotDigiSignPwd;
	@FindBy(xpath="//input[@placeholder='Please enter your login password']")
	WebElement loginPwd;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancelBtn;
	@FindBy(xpath="//span[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	//Edit sign
	@FindBy(xpath="//img[@alt='verified icon']")
	WebElement edit;
	@FindBy(xpath="//input[@type='text']")
	WebElement cred;
	@FindBy(xpath="//div[@id='tab-3']//div[3]//img[1]")
	WebElement save1;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit;
	
	//Select signature style
	@FindBy(xpath="//div[@class='ibox-content py-2']//div[1]//label[1]//input[1]")
	WebElement selStyle;
	
	public void forgotDigiSignPwd(String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		forgotDigiSignPwd.click();
		Thread.sleep(2000);
		loginPwd.sendKeys(pwd);
		Thread.sleep(2000);
		confirmBtn.click();
		Thread.sleep(2000);
	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
	
//	public static boolean forgotDigiSignPwdAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("An email has been sent to you with a password reset link"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean DigiSignPwdCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure want to save this password for your Digital Signature?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Digi-sign password created successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void selStyle() throws InterruptedException
	{
		Thread.sleep(2000);
		selStyle.click();
		Thread.sleep(2000);
	}
	
	public void editSign(String name,String id,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		cred.clear();
		Thread.sleep(2000);
		cred.sendKeys(name);
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(id);
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
						
	
	public void updatePasswordForDigiSign(String pwd1,String pwd2,String pwd3) throws InterruptedException
	{
		Thread.sleep(2000);
		createDigiSign.click();
		Thread.sleep(2000);;
		update2.click();
		Thread.sleep(2000);
		oldPassword.sendKeys(pwd1);
		Thread.sleep(2000);
		newPassword3.sendKeys(pwd2);
		Thread.sleep(2000);
		confirmNewPassword3.sendKeys(pwd3);
		Thread.sleep(2000);
		update3.click();
		Thread.sleep(2000);
		
	}
	
	public void createDigiSign(String pwd1,String pwd2) throws InterruptedException
	{
		Thread.sleep(2000);
		createDigiSign.click();
		Thread.sleep(2000);
		newPassword2.sendKeys(pwd1);
		Thread.sleep(2000);
		confirmNewPassword2.sendKeys(pwd2);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);		
	}
	
	public void clickOnCreateDigiSign() throws InterruptedException
	{
		Thread.sleep(2000);
		createDigiSign.click();
		Thread.sleep(2000);
	}
	
	
	
	public void clickProfile() throws InterruptedException
	{
		Thread.sleep(2000);
		userProfile.click();
		Thread.sleep(2000);
		profile.click();
	}
	
	public void changePassword(String pwd1,String pwd2,String pwd3) throws InterruptedException
	{
		Thread.sleep(2000);
		changePassword.click();
		Thread.sleep(2000);
		currentPassword.sendKeys(pwd1);
		Thread.sleep(2000);
		newPassword1.sendKeys(pwd2);
		Thread.sleep(2000);
		confirmNewPassword1.sendKeys(pwd3);
		Thread.sleep(2000);
		update1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean changePasswordAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Password updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean digiSignUpdatePasswordAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure want to save this password for your Digital Signature?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Digital Signature Password created successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean digiSignChangePasswordAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to update password?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Digi-sign password updated successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	
}
