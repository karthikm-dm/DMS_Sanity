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
import org.openqa.selenium.JavascriptExecutor;

import com.AbstractComponents.AbstractComponent;

public class DocumentTemplate extends AbstractComponent{
	static WebDriver driver;
	public DocumentTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Screen menu
	@FindBy(xpath="//a[@href='/administration']//img[@alt='projects menu']")
	WebElement administration;	
	@FindBy(xpath="//b[normalize-space()='Config Document Template']")
	WebElement documentTemplateMenu;
	@FindBy(xpath="//img[@alt='Create Designation']")
	WebElement createDocumentTemplate;
	@FindBy(xpath="//i[@class='fa fa-table iconsize']")
	WebElement addTable;
	@FindBy(xpath="//img[@alt='Save template']")
	WebElement saveTemplate;
	
	//Add table
	@FindBy(xpath="//select[@class='form-select']")
	WebElement tableHeader;
	@FindBy(xpath="//input[@id='optionscheckbox']")
	WebElement addColumnName;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement add;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement cancel;
	
	//Save template
	@FindBy(xpath="//select[@class='form-select']")
	WebElement documentType;
	@FindBy(xpath="//input[@id='optionscheckbox']")
	WebElement projectName;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save2;
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	WebElement cancel2;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> DocumentName;
	@FindBy(xpath="//td[2]")
	List<WebElement> ProjectName;
	@FindBy(xpath="//td[3]")
	List<WebElement> View;
	@FindBy(xpath="//td[4]")
	List<WebElement> Delete;
	
	public void clickOnDocumentTemplate() throws InterruptedException
	{		
		Thread.sleep(2000);
		administration.click();;
		Thread.sleep(2000);
		documentTemplateMenu.click();
		Thread.sleep(2000);
	}
	
	public void createDocumentTemplate(String header, String c1, String c2, String docType, String name) throws InterruptedException
	{		
		Thread.sleep(2000);
		createDocumentTemplate.click();
		Thread.sleep(2000);
		addTable.click();
		Thread.sleep(2000);
		Select os = new Select(tableHeader);
		os.selectByVisibleText(header);
		Thread.sleep(2000);
		addColumnName.sendKeys(c1);
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		addColumnName.sendKeys(c2);
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
		saveTemplate.click();
		Thread.sleep(2000);
		Select os1 = new Select(documentType);
		os1.selectByVisibleText(docType);
		Thread.sleep(2000);
		projectName.sendKeys(name);
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
//	public static boolean documentTemplateCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Template created successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean deletetionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this Template?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Template deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void view(String name) throws InterruptedException
	{
		for(int i=0;i<ProjectName.size();i++)
		{
			String text=ProjectName.get(i).getText();
			if(text.equals(name))
			{
				View.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void delete(String name) throws InterruptedException
	{
		for(int i=0;i<ProjectName.size();i++)
		{
			String text=ProjectName.get(i).getText();
			if(text.equals(name))
			{
				Delete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
}
