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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AbstractComponents.AbstractComponent;

public class ConfigBookmarkSign extends AbstractComponent{
	static WebDriver driver;
	public ConfigBookmarkSign(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Config Bookmark(Sign) menu
	@FindBy(xpath="//a[@href='/administration']//img[@alt='projects menu']")
	WebElement administration;
	@FindBy(xpath="//b[normalize-space()='Config Bookmark(Sign)']")
	WebElement configBookmarkSign;
	
	//Search
	@FindBy(xpath="//input[@type='text']")
	WebElement dpcumentTypeSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Table
	@FindBy(xpath="//td[1]")
	List<WebElement> documentTypeTable;
	@FindBy(xpath="//td[2]")
	List<WebElement> bookmarkTable;
	@FindBy(xpath="//td[3]")
	List<WebElement> edit1Table;
	@FindBy(xpath="//td[4]")
	List<WebElement> edit2Table;
	@FindBy(xpath="//td[5]")
	List<WebElement> deleteDocType;
	
	//Create document type
	@FindBy(xpath="//img[@alt='Create Document Type']")
	WebElement createDocumentType;
	@FindBy(xpath="//input[@id='designation-name']")
	WebElement dcumentTypeName;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement add;
	
	//Edit document type
	@FindBy(xpath="//input[@class='form-control']")
	WebElement editDocumentType;
	@FindBy(xpath="//img[@alt='save the information']")
	WebElement saveEditedDcumentTypeName;
	
	//Edit bookmark
	//Add bookmark
	@FindBy(xpath="//img[@alt='Create Designation']")
	WebElement addSignatureBookmark;
	@FindBy(xpath="//input[@placeholder='Enter bookmark name']")
	WebElement enterBookmarkName;
	@FindBy(xpath="//img[@alt='save the information']")
	WebElement saveBookmarkName;
	
	@FindBy(xpath="//td[1]")
	List<WebElement> signingOrder;
	@FindBy(xpath="//td[2]")
	List<WebElement> bookmark;
	@FindBy(xpath="//td[3]")
	List<WebElement> editRole1;
	@FindBy(xpath="//td[4]")
	List<WebElement> delete;
	
	@FindBy(xpath="//div[@class='text-center']//img[@alt='Edit']")
	WebElement editRole2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/img[1]")
	WebElement deleteRole2;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement editBookmark;
	@FindBy(xpath="//img[@alt='save the information']")
	WebElement saveBookmark;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement closeBookmarkWndow;
	
	public void clickOnConfigBookmark() throws InterruptedException
	{		
		Thread.sleep(2000);
		administration.click();
		Thread.sleep(2000);	
		configBookmarkSign.click();
		Thread.sleep(2000);	
	}
	
	public void editRole() throws InterruptedException
	{		
		Thread.sleep(2000);
		editRole2.click();
		Thread.sleep(2000);	
	}
	
	public void deleteRole() throws InterruptedException
	{		
		Thread.sleep(2000);
		deleteRole2.click();
		Thread.sleep(2000);	
	}
	
	public void createDocumentType(String doctype) throws InterruptedException
	{		
		Thread.sleep(2000);
		createDocumentType.click();
		Thread.sleep(2000);	
		dcumentTypeName.sendKeys(doctype);
		Thread.sleep(2000);	
		add.click();
		Thread.sleep(2000);	
	}
	
	
	public void docTypeSearch(String doc) throws InterruptedException
	{
		Thread.sleep(2000);
		dpcumentTypeSearch.sendKeys(doc);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean docTypeSearchValidation(String doc) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =documentTypeTable.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<documentTypeTable.size();i++)
			{
				String stat=documentTypeTable.get(i).getText();
				if (!(stat.contains(doc))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void editDocType1(String doc) throws InterruptedException
	{
		for(int i=0;i<documentTypeTable.size();i++)
		{
			String text=documentTypeTable.get(i).getText();
			if(text.equals(doc))
			{
				edit1Table.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void editDocType2(String newDoc) throws InterruptedException
	{
		Thread.sleep(2000);
		editDocumentType.clear();
		Thread.sleep(2000);
		editDocumentType.sendKeys(newDoc);
		Thread.sleep(2000);
		saveEditedDcumentTypeName.click();
		Thread.sleep(2000);
	}
	
	
	
	public void addBookmark1(String doc) throws InterruptedException
	{
		for(int i=0;i<documentTypeTable.size();i++)
		{
			String text=documentTypeTable.get(i).getText();
			if(text.equals(doc))
			{
				edit2Table.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void addBookmark2(String bk) throws InterruptedException
	{
		Thread.sleep(2000);
		addSignatureBookmark.click();
		Thread.sleep(2000);
		enterBookmarkName.sendKeys(bk);
		Thread.sleep(2000);
		saveBookmarkName.click();
		Thread.sleep(2000);
	}

	
	
	public void editBookmark1(String doc) throws InterruptedException
	{
		for(int i=0;i<bookmark.size();i++)
		{
			String text=bookmark.get(i).getText();
			if(text.equals(doc))
			{
				editRole1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void editBookmark2(String bk) throws InterruptedException
	{
		Thread.sleep(2000);
		editBookmark.clear();
		Thread.sleep(2000);
		editBookmark.sendKeys(bk);
		Thread.sleep(2000);
		saveBookmark.click();
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
	
//	public static boolean bookmarkUpdationALert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Bookmark details updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void deleteBookmark1(String doc) throws InterruptedException
	{
		for(int i=0;i<bookmark.size();i++)
		{
			String text=bookmark.get(i).getText();
			if(text.equals(doc))
			{
				delete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
//	public static boolean bookmarkDeletionALert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this bookmark?"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void closeBookmarkWndow() throws InterruptedException
	{
		Thread.sleep(2000);
		closeBookmarkWndow.click();
		Thread.sleep(2000);
	}
	
	public void deletDocumentType(String doc) throws InterruptedException
	{
		for(int i=0;i<documentTypeTable.size();i++)
		{
			String text=documentTypeTable.get(i).getText();
			if(text.equals(doc))
			{
				deleteDocType.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
//	public static boolean deleteDocumentTyepALert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this Document Type?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Document Type Deleted"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
}
