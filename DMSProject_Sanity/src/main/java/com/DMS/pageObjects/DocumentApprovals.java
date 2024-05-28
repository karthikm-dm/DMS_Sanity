package com.DMS.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class DocumentApprovals extends AbstractComponent{
	static WebDriver driver;
	public DocumentApprovals(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Approvals  menu
	@FindBy(xpath="//span[normalize-space()='Approvals']")
	WebElement approvals;
	@FindBy(xpath="//input[@type='text']")
	WebElement documentTitle;
	@FindBy(xpath="//input[@type='date']")
	WebElement uploadedDate;
	@FindBy(xpath="//select[@name='account']")
	WebElement approvalStatus;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> documentTitle1;
	@FindBy(xpath="//td[2]")
	List<WebElement> uploadedBy;
	@FindBy(xpath="//td[3]")
	List<WebElement> uploadedDate1;
	@FindBy(xpath="//td[4]")
	List<WebElement> version;
	@FindBy(xpath="//td[5]")
	List<WebElement> approvalStatus1;
	@FindBy(xpath="//td[6]")
	List<WebElement> assignedBy;
	@FindBy(xpath="//td[7]")
	List<WebElement> assignedDate;
	@FindBy(xpath="//td[8]")
	List<WebElement> status;
	@FindBy(xpath="//td[9]")
	List<WebElement> view;
	
	//Approval status
	@FindBy(xpath="//textarea[@placeholder='Enter your comments here']")
	WebElement comments1;
	@FindBy(xpath="//button[normalize-space()='Approve']")
	WebElement approve1;
	@FindBy(xpath="//button[normalize-space()='Reject']")
	WebElement reject1;
	
	//View status
	@FindBy(xpath="//i[@class='fa fa-chevron-down ml-2']")
	WebElement viewStatus1;
	@FindBy(xpath="//span[@aria-hidden='true']")
	WebElement viewStatus2;
	
	//Open document
	@FindBy(xpath="//input[@placeholder='Comments']")
	WebElement comments2;
	@FindBy(xpath="//button[@title='Approve Document']//img[@alt='Approve Status']")
	WebElement approve2;
	@FindBy(xpath="//button[@title='Reject Document']//img[@alt='Approve Status']")
	WebElement reject2;
	
	//Print and Download
	@FindBy(xpath="//div[@class='position-relative mr-2']//img[@alt='Edit document']")
	WebElement download;
	@FindBy(xpath="//div[@class='position-relative']//img[@alt='Edit document']")
	WebElement print;
	@FindBy(xpath="//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]")
	WebElement printCancel;
	
	
	
	public void clickOnApprovals() throws InterruptedException
	{
		Thread.sleep(2000);
		approvals.click();
		Thread.sleep(2000);
	}
	
	public void documentTitleSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		documentTitle.sendKeys(name);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean documentTitleSearchValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = documentTitle1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  documentTitle1.get(i).getText();
			if(text.contains(name))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void dateSearch(String dt) throws InterruptedException
	{
		Thread.sleep(2000);
		uploadedDate.sendKeys(dt);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean dateSearchValidation(String dt) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = uploadedDate1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  uploadedDate1.get(i).getText();
			if(text.contains(dt))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void statusSearch(String st) throws InterruptedException
	{
		Thread.sleep(2000);
		approvalStatus.sendKeys(st);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean statusSearchValidation(String st) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = approvalStatus1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  approvalStatus1.get(i).getText();
			if(text.contains(st))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void selApprovalStatus(String st) throws InterruptedException
	{
		for(int i=0;i<documentTitle1.size();i++)
		{
			String text=documentTitle1.get(i).getText();
			if(text.equals(st))
			{
				approvalStatus1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
	public void selStatus(String st) throws InterruptedException
	{
		for(int i=0;i<documentTitle1.size();i++)
		{
			String text=documentTitle1.get(i).getText();
			if(text.equals(st))
			{
				status.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selView(String name) throws InterruptedException
	{
		for(int i=0;i<documentTitle1.size();i++)
		{
			String text=documentTitle1.get(i).getText();
			if(text.equals(name))
			{
				view.get(i).click();
				Thread.sleep(10000);
				break;	
			}
		}
	}
	
	public void approval1(String cm) throws InterruptedException
	{
		Thread.sleep(2000);
		comments1.sendKeys(cm);
		Thread.sleep(2000);
		approve1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean docApprovalAlert1() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to approve the document?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("The document approved successfully."));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}

	
	public void rejection1(String cm) throws InterruptedException
	{
		Thread.sleep(2000);
		comments1.sendKeys(cm);
		Thread.sleep(2000);
		reject1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean docRejectionAlert1() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to reject the document?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("The document rejected successfully."));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void viewStatus() throws InterruptedException
	{
		Thread.sleep(2000);
		viewStatus1.click();
		Thread.sleep(2000);
		viewStatus2.click();
		Thread.sleep(2000);
	}
	
	public void viewStatus_approve(String cm) throws InterruptedException
	{
		Thread.sleep(2000);
		comments2.sendKeys(cm);
		Thread.sleep(2000);
		approve2.click();
		Thread.sleep(2000);
	}
	
	public void viewStatus_reject(String cm) throws InterruptedException
	{
		Thread.sleep(2000);
		comments2.sendKeys(cm);
		Thread.sleep(2000);
		reject2.click();
		Thread.sleep(2000);
	}
	
	public void downloadAndPrint() throws InterruptedException
	{
		Thread.sleep(5000);
		download.click();
		//Thread.sleep(5000);
		//print.click();
		/*Thread.sleep(20000);
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,500)");
		WebElement printcancel = driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]"));
		printcancel.click();*/
		
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
