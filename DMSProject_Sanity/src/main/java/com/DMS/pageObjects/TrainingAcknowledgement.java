package com.DMS.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;

import com.AbstractComponents.AbstractComponent;

public class TrainingAcknowledgement extends AbstractComponent{
	static WebDriver driver;
	public TrainingAcknowledgement(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Dashboard
	@FindBy(xpath="//a[@href='/dashboard']//img[@alt='dashboard menu']")
	WebElement dashboard;
	
	//Training acknowledgement menu
	@FindBy(xpath="(//img[@alt='projects menu'])[2]")
	WebElement training;
	@FindBy(xpath="//b[normalize-space()='Training Acknowledgement']")
	WebElement trainingAcknowledgement;
	
	@FindBy(xpath="//a[normalize-space()='My Training']")
	WebElement myTraining;
	@FindBy(xpath="//a[normalize-space()='Verification']")
	WebElement verification;
	@FindBy(xpath="//a[normalize-space()='Assign Training']")
	WebElement assignTraining;
	
	//My training
	@FindBy(xpath="//td[1]")
	List<WebElement> trainingName1;
	@FindBy(xpath="//td[2]")
	List<WebElement> trainerName1;
	@FindBy(xpath="//td[3]")
	List<WebElement> startDate1;
	@FindBy(xpath="//td[4]")
	List<WebElement> endDate1;
	@FindBy(xpath="//td[5]")
	List<WebElement> status1;
	@FindBy(xpath="//td[6]")
	List<WebElement> view1;
	
	@FindBy(xpath="//img[@alt='Edit document']")
	WebElement download;
	
	//Verification
	@FindBy(xpath="//td[1]")
	List<WebElement> trainingName2;
	@FindBy(xpath="//td[2]")
	List<WebElement> traineeName2;
	@FindBy(xpath="//td[3]")
	List<WebElement> startDate2;
	@FindBy(xpath="//td[4]")
	List<WebElement> endDate2;
	@FindBy(xpath="//td[5]")
	List<WebElement> status2;
	@FindBy(xpath="//td[6]")
	List<WebElement> view2;
	
	//Assign training
	@FindBy(xpath="//td[1]")
	List<WebElement> trainingName3;
	@FindBy(xpath="//td[2]")
	List<WebElement> traineeName3;
	@FindBy(xpath="//td[3]")
	List<WebElement> trainerName3;
	@FindBy(xpath="//td[4]")
	List<WebElement> startDate3;
	@FindBy(xpath="//td[5]")
	List<WebElement> endDate3;
	@FindBy(xpath="//td[6]")
	List<WebElement> status3;
	@FindBy(xpath="//td[7]")
	List<WebElement> view3;
	
	//Sign_TraineeSOP
	@FindBy(xpath="//input[@id='agreement']")
	WebElement agree1;
	@FindBy(xpath="//b[contains(text(),'Click here to sign')]")
	WebElement sign1;
	@FindBy(xpath="//input[@id='email']")
	WebElement email1;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd1;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reason1;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit1;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]/span[1]/i[1]")
	WebElement close1;
	
	//Download
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")
	WebElement download1;
	
	
	
	public void clickOnTrainingAcknowledgement() throws InterruptedException
	{
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		trainingAcknowledgement.click();
		Thread.sleep(2000);
	}
	
	public void clickOnMyTraining() throws InterruptedException
	{
		Thread.sleep(2000);
		myTraining.click();
		Thread.sleep(2000);
	}
	
	public void clickOnDashboard() throws InterruptedException
	{
		Thread.sleep(2000);
		dashboard.click();
		Thread.sleep(2000);
	}
	
	public void clickOnDownload() throws InterruptedException
	{
		Thread.sleep(2000);
		download.click();
		Thread.sleep(2000);
	}
	
	public void clickOnVerification() throws InterruptedException
	{
		Thread.sleep(2000);
		verification.click();
		Thread.sleep(2000);
	}
	
	public void clickOnAssignTraining() throws InterruptedException
	{
		Thread.sleep(2000);
		assignTraining.click();
		Thread.sleep(2000);
	}
	
	public void clickOnDownload1() throws InterruptedException
	{
		Thread.sleep(2000);
		download1.click();
		Thread.sleep(2000);
	}
	
	public void sign_TraineeSop(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(agree1);
		agree1.click();
		Thread.sleep(2000);
		sign1.click();
		Thread.sleep(2000);
		email1.sendKeys(em);
		Thread.sleep(2000);
		pwd1.sendKeys(pwd);
		Thread.sleep(2000);
		Select s = new Select(reason1);
		s.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit1.click();
		Thread.sleep(2000);			
	}
	
	public void clickOnTrainingAcknowledgement1() throws InterruptedException
	{
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(2000);	
		elementWait(training);
		training.click();
		Thread.sleep(2000);	
		trainingAcknowledgement.click();
		Thread.sleep(2000);	
	}
	
	public void sign_TrainerSop(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		elementWait(sign1);
		sign1.click();
		Thread.sleep(2000);
		email1.sendKeys(em);
		Thread.sleep(2000);
		pwd1.sendKeys(pwd);
		Thread.sleep(2000);
		Select s = new Select(reason1);
		s.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit1.click();
		Thread.sleep(2000);		
	}
	
	public void selView1(String st) throws InterruptedException
	{
		for(int i=0;i<status1.size();i++)
		{
			String text=status1.get(i).getText();
			if(text.equals(st))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selView2(String st) throws InterruptedException
	{
		for(int i=0;i<status2.size();i++)
		{
			String text=status2.get(i).getText();
			if(text.equals(st))
			{
				view2.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selView3(String st) throws InterruptedException
	{
		for(int i=0;i<status3.size();i++)
		{
			String text=status3.get(i).getText();
			if(text.equals(st))
			{
				Thread.sleep(3000);
				view3.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
//	public static boolean DigiSignAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("You have Digi-signed successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
}
