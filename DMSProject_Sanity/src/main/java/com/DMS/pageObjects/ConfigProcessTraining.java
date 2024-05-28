package com.DMS.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class ConfigProcessTraining extends AbstractComponent{
	static WebDriver driver;
	public ConfigProcessTraining(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Config process training menu
	@FindBy(xpath="(//img[@alt='projects menu'])[2]")
	WebElement training;
	@FindBy(xpath="//b[normalize-space()='Config Process Training']")
	WebElement configProcessTraining;
	
	//Search
	@FindBy(xpath="//input[@type='text']")
	WebElement nameSearch;
	@FindBy(xpath="//select[@placeholder='Designation']")
	WebElement designationSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> name;
	@FindBy(xpath="//td[2]")
	List<WebElement> email;
	@FindBy(xpath="//td[3]")
	List<WebElement> designation;
	@FindBy(xpath="//td[4]")
	List<WebElement> createdDate;
	@FindBy(xpath="//td[5]")
	List<WebElement> assignTraining;
	
	//Assign SOP
	@FindBy(xpath="(//input[@id='trainee'])[1]")
	WebElement trainingName;
	@FindBy(xpath="//select[@id='trainer']")
	WebElement trainer;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[4]/div")
	WebElement SOP1;
	@FindBy(xpath="//li[contains(@id,'multiselect-option- ITS-004-GL')]")
	WebElement SOP2;
	@FindBy(xpath="//li[contains(@id,'multiselect-option- ITS-007-GL')]")
	WebElement SOP3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[4]/div/span[2]")
	WebElement SOP4;
	@FindBy(xpath="(//input[@type='date'])[1]")
	WebElement startDate;
	@FindBy(xpath="(//input[@type='date'])[2]")
	WebElement endDate;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
//	public static boolean invitationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Invited successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void clickOnConfigProcessTraining() throws InterruptedException
	{		
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		configProcessTraining.click();
		Thread.sleep(2000);
	}
	
	public void searchByName(String name) throws InterruptedException
	{		
		Thread.sleep(2000);
		nameSearch.sendKeys(name);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void searchByDesignation(String des) throws InterruptedException
	{		
		Thread.sleep(2000);
		Select os = new Select(designationSearch);
		os.selectByVisibleText(des);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	
	public void selUser(String user) throws InterruptedException
	{
		for(int i=0;i<name.size();i++)
		{
			String text=name.get(i).getText();
			if(text.equals(user))
			{
				assignTraining.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void assignTraining(String name,String tr,String dt1,String dt2) throws InterruptedException
	{		
		Thread.sleep(2000);
		trainingName.sendKeys(name);
		Thread.sleep(2000);
		Select os = new Select(trainer);
		os.selectByVisibleText(tr);
		Thread.sleep(2000);
		SOP1.click();
		Thread.sleep(2000);
		SOP2.click();
		Thread.sleep(2000);
		SOP3.click();
		Thread.sleep(2000);
		SOP4.click();
		Thread.sleep(2000);
		startDate.sendKeys(dt1);
		Thread.sleep(2000);
		endDate.sendKeys(dt2);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public Boolean nameSearchValidation(String nm) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =name.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<name.size();i++)
			{
				String stat=name.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean designationSearchValidation(String des) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =designation.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<designation.size();i++)
			{
				String stat=designation.get(i).getText();
				if (!(stat.contains(des))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
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
