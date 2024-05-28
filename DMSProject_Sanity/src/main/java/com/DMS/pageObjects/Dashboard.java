package com.DMS.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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

public class Dashboard extends AbstractComponent{
	static WebDriver driver;
	public Dashboard(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Dashboard menu
	@FindBy(xpath="//span[normalize-space()='Dashboard']")
	WebElement Dashboard;
	
	//Approve training plan
	@FindBy(xpath="//table[@class='table table-bordered table-']//td[1]")
	List<WebElement> employee1;
	@FindBy(xpath="//table[@class='table table-bordered table-']//td[2]")
	List<WebElement> skills1;
	@FindBy(xpath="//table[@class='table table-bordered table-']//td[3]")
	List<WebElement> trainingDate1;
	@FindBy(xpath="//table[@class='table table-bordered table-']//td[4]")
	List<WebElement> sign;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	WebElement sign1;
	@FindBy(xpath="//input[@id='email']")
	WebElement email1;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd1;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement rs1;
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement submit1; 
	
	
	//Sign Document
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
	WebElement view1; 
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/img[1]")
	WebElement signDocument1; 
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email2;
	@FindBy(xpath="//input[@id='templatePassword']")
	WebElement pwd2;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement rs2;
	@FindBy(xpath="//span[@class='submit_btn px-5 py-2']")
	WebElement submit2; 
	
	//Sign process training acknowledgement
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
	WebElement view3; 
	@FindBy(xpath="//input[@id='agreement']")
	WebElement iAgree3;
	@FindBy(xpath="//b[normalize-space()='Click here to sign']")
	WebElement clickHereToSign3;
	@FindBy(xpath="//input[@id='email']")
	WebElement email3;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd3;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement rs3;
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement submit3; 
	
	//Sign online test report
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/i[1]")
	WebElement view4; 
	@FindBy(xpath="//img[@alt='create version']")
	WebElement signTest4;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email4;
	@FindBy(xpath="//input[@id='templatePassword']")
	WebElement pwd4;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement rs4;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit4; 
	
	
	public void signOnlineTestReport(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(1000);
		view4.click();
		Thread.sleep(1000);
		signTest4.click();
		Thread.sleep(1000);
		email4.sendKeys(em);
		Thread.sleep(1000);
		pwd4.sendKeys(pw);
		Thread.sleep(1000);
		Select os = new Select(rs4);
		os.selectByVisibleText(rs);
		Thread.sleep(1000);
		submit4.click();
		Thread.sleep(1000);			
	}
	
//	public static boolean signOnlineTestReport_Alert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signed successfully"));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void signProcessTrainingAcknowledgement(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		elementWait(view3);
		Thread.sleep(1000);
		view3.click();
		Thread.sleep(1000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(iAgree3);
		Thread.sleep(1000);
		iAgree3.click();
		Thread.sleep(1000);
		elementWait(clickHereToSign3);
		Thread.sleep(1000);
		clickHereToSign3.click();
		Thread.sleep(1000);
		email3.sendKeys(em);
		Thread.sleep(1000);
		pwd3.sendKeys(pw);
		Thread.sleep(1000);
		Select os = new Select(rs3);
		os.selectByVisibleText(rs);
		Thread.sleep(1000);
		submit3.click();
		Thread.sleep(1000);			
	}
	
//	public static boolean signProcessTrainingAcknowledgement_Alert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("You have Digi-signed successfully"));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	
//	public static boolean signAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signature added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void Dashboard1() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard.click();
		Thread.sleep(2000);
	}
	
	public void Dashboard2() throws InterruptedException
	{
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
		elementWait(Dashboard);
		Dashboard.click();
		Thread.sleep(2000);
	}
	
	public void sign_ApproveTrainingPlan(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		sign1.click();
		Thread.sleep(4000);
		email1.sendKeys(em);
		pwd1.sendKeys(pw);
		Select os = new Select(rs1);
		os.selectByVisibleText(rs);
		submit1.click();
	}
	
//	public static boolean sign_ApproveTrainingPlan_Alert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signed successfully"));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void signDocument(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		view1.click();
		Thread.sleep(5000);
		signDocument1.click();
		Thread.sleep(1000);
		email2.sendKeys(em);
		Thread.sleep(1000);
		pwd2.sendKeys(pw);
		Thread.sleep(1000);
		Select os = new Select(rs2);
		os.selectByVisibleText(rs);
		Thread.sleep(1000);
		submit2.click();
		Thread.sleep(1000);
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
