package com.DMS.pageObjects;

import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.AbstractComponents.AbstractComponent;
import java.time.Duration;
import org.openqa.selenium.Alert;
//import org.testng.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.JavascriptExecutor;

public class DesignationPage extends AbstractComponent{
	static WebDriver driver;
	public DesignationPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Designation menu
	@FindBy(xpath="//a[@href='/administration']//img[@alt='projects menu']")
	WebElement administration;	
	@FindBy(xpath="//b[normalize-space()='Designation']")
	WebElement designationMenu;
	
	//Create Designation
	@FindBy(xpath="//img[@alt='Create Designation']")
	WebElement createDesignation;
	
	//search
	@FindBy(xpath="//label[contains(text(),'Designation Name')]//following-sibling::input[1]")
	WebElement designationName1;
	@FindBy(xpath="//label[contains(text(),'Status')]//following-sibling::select")
	WebElement status;
	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement search;
	
	//web table
	@FindBy(xpath="//td[1]")
	List<WebElement> Designation;
	@FindBy(xpath="//td[2]")
	List<WebElement> Description;
	@FindBy(xpath="//td[3]")
	List<WebElement> Privilege;
	@FindBy(xpath="//td[4]")
	List<WebElement> Active;
	@FindBy(xpath="//td[5]")
	List<WebElement> Edit;
	@FindBy(xpath="//td[6]")
	List<WebElement> Delete;
	
	//Create designation
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement designationName2;
	@FindBy(xpath="//label[contains(text(),'Description')]//following-sibling::input[1]")
	WebElement description;
	@FindBy(xpath="//input[@id='active-modal']")
	WebElement active;
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement add;
	
	//Privilege
	@FindBy(xpath="//input[@id='selectall']")
	WebElement screens;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	
	//edit
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]/input[1]")
	WebElement editdes;
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/img[1]")
	WebElement savedes;
	
	public void clickDesignation() throws InterruptedException
	{		
		Thread.sleep(3000);
		administration.click();
		Thread.sleep(3000);
		designationMenu.click();
		Thread.sleep(3000);		
	}
	
	public void clickCreateDesignation(String dname,String des) throws InterruptedException
	{		
		Thread.sleep(3000);
		createDesignation.click();
		Thread.sleep(2000);
		designationName2.sendKeys(dname);
		Thread.sleep(3000);
		add.click();
	}
	
	public void setPrivilege() throws InterruptedException
	{		
		Thread.sleep(5000);
		screens.click();
		Thread.sleep(5000);	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);	
		save.click();
		Thread.sleep(3000);
	}
	
	public void editdes(String edit) throws InterruptedException
	{		
		Thread.sleep(3000);
		editdes.sendKeys(edit);
		Thread.sleep(3000);	
		savedes.click();
		Thread.sleep(3000);
	}
	
	
	
//	public static boolean creationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Designation created successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean editAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to update the details?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Updated successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
	
//	public static boolean privilegeAlert2() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Screen privilege updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean privilegeAlert1() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Screen privilege saved successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean deleteAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this designation?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}	
	
	public void privilege(String des) throws InterruptedException
	{
		for(int i=0;i<Designation.size();i++)
		{
			String text=Designation.get(i).getText();
			if(text.equals(des))
			{
				Privilege.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void edit1(String des) throws InterruptedException
	{
		for(int i=0;i<Designation.size();i++)
		{
			String text=Designation.get(i).getText();
			if(text.equals(des))
			{
				Edit.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void delete(String des) throws InterruptedException
	{
		for(int i=0;i<Designation.size();i++)
		{
			String text=Designation.get(i).getText();
			if(text.equals(des))
			{
				Delete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void desSeach(String name) throws InterruptedException
	{
		Thread.sleep(4000);
		designationName1.sendKeys(name);
		Thread.sleep(4000);
		search.click();
		Thread.sleep(3000);
	}
	
	public void statSeach(String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(status);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		search.click();
	}
	
	public Boolean desNameValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =Designation.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<Designation.size();i++)
			{
				String stat=Designation.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean statusValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =Active.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<Active.size();i++)
			{
				String stat=Active.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	

}
