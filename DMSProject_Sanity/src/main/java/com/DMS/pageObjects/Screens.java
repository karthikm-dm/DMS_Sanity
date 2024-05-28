package com.DMS.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import com.AbstractComponents.AbstractComponent;

import Base.BaseClassTest;

public class Screens extends AbstractComponent{
	static WebDriver driver;
	public Screens(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Screen menu
	@FindBy(xpath="//a[@href='/administration']//img[@alt='projects menu']")
	WebElement administration;	
	@FindBy(xpath="//b[normalize-space()='Screens']")
	WebElement screensMenu;
	
	//Add screen
	@FindBy(xpath="//img[@alt='Add screen']")
	WebElement addScreen;
	@FindBy(xpath="//input[@placeholder='Screen name']")
	WebElement screenName;
	@FindBy(xpath="//button[@type='button']")
	WebElement add1;
	
	//Screen list
	@FindBy(xpath="//a[@class='list-group-item']")
	List<WebElement> screenList;
	
	//Edit screen
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	WebElement add2;
	
	//Add controls
	@FindBy(xpath="//input[@placeholder='Control name']")
	WebElement addControl;
	@FindBy(xpath="(//button[@class='btn-circle'])[1]")
	WebElement add3;
	
	//Edit control
	@FindBy(xpath="(//img[@class='editicon'])[2]")
	WebElement editControl;
	@FindBy(xpath="//tbody//tr//td//input[@type='text']")
	WebElement editControlName;
	@FindBy(xpath="//i[@class='fa fa-save edit-delete1 my-1']")
	WebElement save;
	
	//Delete control
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[3]/img[1]")
	WebElement deleteControl;
	
	//Delete screen
	@FindBy(xpath="//img[@class='editicon']")
	WebElement deleteScreen;
	
	
	
	public void clickOnScreesMenu() throws InterruptedException
	{		
		Thread.sleep(2000);
		administration.click();
		Thread.sleep(2000);
		screensMenu.click();
		Thread.sleep(2000);
	}
	
	public void AddScreen(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		addScreen.click();
		Thread.sleep(2000);
		screenName.sendKeys(name);
		Thread.sleep(2000);
		add1.click();		
	}
	
	public void EditScreen(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		screenName.clear();
		Thread.sleep(2000);
		screenName.sendKeys(name);
		Thread.sleep(2000);
		add2.click();
		Thread.sleep(1000);
	}
	public void addControl(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		addControl.sendKeys(name);	
		Thread.sleep(2000);
		add3.click();
		Thread.sleep(2000);
	}
	
	public void editControl(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		editControl.click();
		Thread.sleep(3000);
		editControlName.clear();
		Thread.sleep(3000);
		editControlName.sendKeys(name);
		Thread.sleep(3000);
		save.click();		
	}
	
	public void deleteControl() throws InterruptedException
	{		
		Thread.sleep(3000);
		deleteControl.click();
		Thread.sleep(3000);
	}
	
	public void deleteScreen() throws InterruptedException
	{		
		Thread.sleep(3000);
		deleteScreen.click();
		Thread.sleep(3000);
	}
	

//	public static boolean screenCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Screen added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean controlCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Control added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean screenUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Screen updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean controlUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Control updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean controlDeletionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this control?"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean screenDeletionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this screen?"));
//			alert1.accept();
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Screen deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void selScreen(String name) throws InterruptedException
	{
		for(int i=0;i<screenList.size();i++)
		{
			String text=screenList.get(i).getText();
			if(text.equals(name))
			{
				screenList.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
		
	}


