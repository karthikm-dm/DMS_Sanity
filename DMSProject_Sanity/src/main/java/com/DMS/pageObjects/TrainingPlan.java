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

public class TrainingPlan extends AbstractComponent{
	static WebDriver driver;
	public TrainingPlan(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Config training plan(Sign) menu
	@FindBy(xpath="(//img[@alt='projects menu'])[2]")
	WebElement training;
	@FindBy(xpath="//b[normalize-space()='Training Plan']")
	WebElement trainingPlan;
	
	//Training plan and record
	@FindBy(xpath="//a[normalize-space()='My Training Plan']")
	WebElement myTrainingPlan;
	@FindBy(xpath="//a[normalize-space()='Training Plan for Approval']")
	WebElement trainingPlanForApproval;
	@FindBy(xpath="//a[normalize-space()='Assign Training Plan']")
	WebElement addTrainingPlan;
	
	//My training plan
	@FindBy(xpath="//div[@id='tab-1']//img[@alt='Filter table icon']")
	WebElement filter1;
	@FindBy(xpath="//img[@alt='Export table icon']")
	WebElement export1;
	@FindBy(xpath="//div[@id='tab-1']//img[@alt='Create row icon']")
	WebElement addTrainingPlan1;
	
	@FindBy(xpath="(//input[@name='start'])[1]")
	WebElement plannedDateTo1;
	@FindBy(xpath="(//input[@name='end'])[1]")
	WebElement plannedDateFrom1;
	@FindBy(xpath="(//input[@name='start'])[2]")
	WebElement actualDateTo1;
	@FindBy(xpath="(//input[@name='end'])[2]")
	WebElement actualDateFrom1;
	@FindBy(xpath="(//select[@name='Status'])[1]")
	WebElement status1;
	@FindBy(xpath="(//span[@type='button'][normalize-space()='Search'])[1]")
	WebElement searchData1;
	@FindBy(xpath="(//span[@type='button'][normalize-space()='Clear'])[1]")
	WebElement clearData1;
	
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[1]")
	List<WebElement> skills1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[2]")
	List<WebElement> trainingDetails1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[3]")
	List<WebElement> trainingActivities1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[4]")
	List<WebElement> plannedTrainingDate1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[5]")
	List<WebElement> actualTrainingDate1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[6]")
	List<WebElement> trainedDate1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[7]")
	List<WebElement> sign1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='form-table-view-container table-responsive']//td[8]")
	List<WebElement> Actions1;
	
	@FindBy(xpath="//div[normalize-space()='Edit']")
	WebElement edit1;
	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement delete1;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement requiredKnowledgeSkillsAbilities1;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement details1;
	@FindBy(xpath="(//input[@type='date'])[5]")
	WebElement plannedStartDate1;
	@FindBy(xpath="(//input[@type='date'])[6]")
	WebElement plannedEndDate1;
	@FindBy(xpath="(//input[@type='date'])[7]")
	WebElement actualStartDate1;
	@FindBy(xpath="(//input[@type='date'])[8]")
	WebElement actualEndDate1;
	@FindBy(xpath="(//select[@name='account'])[1]")
	WebElement methodOfTraining1;
	@FindBy(xpath="(//select[@name='account'])[2]")
	WebElement trainedBy;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement sentForApproval1;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	
	//Training plan for approval
	@FindBy(xpath="(//input[@name='start'])[3]")
	WebElement plannedDateTo2;
	@FindBy(xpath="(//input[@name='end'])[3]")
	WebElement plannedDateFrom2;
	@FindBy(xpath="(//input[@name='start'])[4]")
	WebElement actualDateTo2;
	@FindBy(xpath="(//input[@name='end'])[4]")
	WebElement actualDateFrom2;
	@FindBy(xpath="(//select[@name='Status'])[2]")
	WebElement status2;
	@FindBy(xpath="(//span[@type='button'][normalize-space()='Search'])[2]")
	WebElement searchData2;
	@FindBy(xpath="(//span[@type='button'][normalize-space()='Clear'])[2]")
	WebElement clearData2;
	
	
	@FindBy(xpath="(//button[@class='btn btn-outline btn-success px-4 py-0'])[1]")
	WebElement sign;
	@FindBy(xpath="//input[@id='email']")
	WebElement email1;
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd1;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reason1;
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement submit1;
	
	@FindBy(xpath="//div[@class='position-relative filter-block']//img[@alt='Filter table icon']")
	WebElement filter2;
	
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[1]")
	List<WebElement> employee2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[2]")
	List<WebElement> skills2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[3]")
	List<WebElement> details2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[4]")
	List<WebElement> activities2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[5]")
	List<WebElement> plannedTrainingDate2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[6]")
	List<WebElement> actualTrainingDate2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[7]")
	List<WebElement> trainedBy2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='form-table-view-container']//td[8]")
	List<WebElement> sign2;
	
	//Add training plan
	@FindBy(xpath="(//input[@name='start'])[5]")
	WebElement plannedDateTo3;
	@FindBy(xpath="(//input[@name='end'])[5]")
	WebElement plannedDateFrom3;
	@FindBy(xpath="(//input[@name='start'])[6]")
	WebElement actualDateTo3;
	@FindBy(xpath="(//input[@name='end'])[6]")
	WebElement actualDateFrom3;
	@FindBy(xpath="(//select[@name='Status'])[3]")
	WebElement status3;
	@FindBy(xpath="//div[@id='cardtrainingBody']//span[@type='button'][normalize-space()='Search']")
	WebElement searchData3;
	@FindBy(xpath="//div[@id='cardtrainingBody']//span[@type='button'][normalize-space()='Clear']")
	WebElement clearData3;
	
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[1]")
	List<WebElement> employee3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[2]")
	List<WebElement> skills3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[3]")
	List<WebElement> trainingdetails3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[4]")
	List<WebElement> activities3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[5]")
	List<WebElement> plannedTrainingDate3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[6]")
	List<WebElement> actualTrainingDate3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[7]")
	List<WebElement> trainedBy3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[8]")
	List<WebElement> sign3;
	@FindBy(xpath="//div[@id='tab-3']//div[@class='form-table-view-container']//td[9]")
	List<WebElement> actions3;
	
	@FindBy(xpath="//div[@id='tab-3']//img[@alt='Filter table icon']")
	WebElement filter3;
	@FindBy(xpath="//div[@id='tab-3']//img[@alt='Create row icon']")
	WebElement addTrainingPlan3;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement requiredKnowledgeSkillsAbilities3;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement details4;
	@FindBy(xpath="(//input[@type='date'])[13]")
	WebElement plannedStartDate3;
	@FindBy(xpath="(//input[@type='date'])[14]")
	WebElement plannedEndDate3;
	@FindBy(xpath="(//select[@name='account'])[1]")
	WebElement methodOfTraining3;
	@FindBy(xpath="(//select[@placeholder='Select Training by'])[1]")
	WebElement trainedBy4;
	@FindBy(xpath="//div[@id='tab-3']/div[5]/div/div/div[2]/div/div[7]/div")
	WebElement designation1;
	@FindBy(xpath="//li[@id='multiselect-option-baded23b-1d0a-4219-9b15-ff84dad86db0']")
	WebElement designation2;
	@FindBy(xpath="//div[@id='tab-3']/div[5]/div/div/div[2]/div/div[7]/div/span[2]")
	WebElement designation3;
	@FindBy(xpath="//div[@id='tab-3']/div[5]/div/div/div[2]/div/div[8]/div")
	WebElement users1;
	@FindBy(xpath="//li[@id='multiselect-option-631b1a3f-8e9d-42fe-a35c-a8761f58aca6']")
	WebElement users2;
	@FindBy(xpath="//div[@id='tab-3']/div[5]/div/div/div[2]/div/div[8]/div/span[2]")
	WebElement users3;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear4;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save4;
	
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement edit3;
	@FindBy(xpath="(//div[normalize-space()='Delete'])[1]")
	WebElement delete3;

	
	public void clickOnAddTrainingPlan_AddTrainingPlan(String skills,String date1,String date2,String tr1,String tr2) throws InterruptedException
	{		
		Thread.sleep(2000);
		addTrainingPlan3.click();
		Thread.sleep(2000);
		requiredKnowledgeSkillsAbilities3.sendKeys(skills);
		Thread.sleep(2000);
		plannedStartDate3.sendKeys(date1);
		Thread.sleep(2000);
		plannedEndDate3.sendKeys(date2);
		Thread.sleep(2000);
		Select os = new Select(methodOfTraining3);
		os.selectByVisibleText(tr1);
		Thread.sleep(2000);
		Select os1 = new Select(trainedBy4);
		os1.selectByVisibleText(tr2);
		Thread.sleep(2000);
		users1.click();
		Thread.sleep(2000);
		users2.click();
		Thread.sleep(2000);
		users3.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(2000);
	}
	
//	public static boolean addTrainingPlanAlert_AddTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Training plan created successfully."));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void searchStatus3(String st) throws InterruptedException
	{	
		Thread.sleep(2000);
		filter3.click();
		Thread.sleep(2000);
		Select os = new Select(status3);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		searchData3.click();
		Thread.sleep(2000);
		
	}
	
	public void edit1_AddTrainingPlan(String skills) throws InterruptedException
	{
		for(int i=0;i<skills3.size();i++)
		{
			String text=skills3.get(i).getText();
			if(text.equals(skills))
			{
				Thread.sleep(5000);
				actions3.get(i).click();	
				Thread.sleep(3000);			
				break;	
			}
		}
	}
	
	public void edit2_AddTrainingPlan(String dt) throws InterruptedException
	{		
		Thread.sleep(2000);
		edit3.click();
		Thread.sleep(2000);
		details4.sendKeys(dt);
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(2000);
	}
	
//	public static boolean editTrainingPlanAlert_AddTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Training plan updated successfully."));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void delete1_AddTrainingPlan(String skills) throws InterruptedException
	{
		for(int i=0;i<skills3.size();i++)
		{
			String text=skills3.get(i).getText();
			if(text.equals(skills))
			{
				Thread.sleep(5000);
				actions3.get(i).click();	
				Thread.sleep(3000);			
				break;	
			}
		}
	}
	
	public void delete2_AddTrainingPlan() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete3.click();
		Thread.sleep(2000);
	}
	
//	public static boolean deleteTrainingPlanAlert_AddTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this training plan?"));
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
	
	public void clickOnTrainingPlan() throws InterruptedException
	{		
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		trainingPlan.click();
		Thread.sleep(2000);;
	}
	
	public void clickOnMyTrainingPlan() throws InterruptedException
	{		
		Thread.sleep(2000);
		myTrainingPlan.click();
		Thread.sleep(2000);;
	}
	
	public void clickOnTrainingPlanForApproval() throws InterruptedException
	{		
		Thread.sleep(2000);
		trainingPlanForApproval.click();
		Thread.sleep(2000);;
	}
	
	public void clickOnAddTrainingPlan() throws InterruptedException
	{		
		Thread.sleep(2000);
		addTrainingPlan.click();
		Thread.sleep(2000);;
	}
	
	public void clickOnAddTrainingPlan_MyTrainingPlan(String skills,String date1,String date2,String date3,String date4,String tr1,String tr2) throws InterruptedException
	{		
		Thread.sleep(2000);
		addTrainingPlan1.click();
		Thread.sleep(2000);
		requiredKnowledgeSkillsAbilities1.sendKeys(skills);
		Thread.sleep(2000);
		plannedStartDate1.sendKeys(date1);
		Thread.sleep(2000);
		plannedEndDate1.sendKeys(date2);
		Thread.sleep(2000);
		actualStartDate1.sendKeys(date3);
		Thread.sleep(2000);
		actualEndDate1.sendKeys(date4);
		Thread.sleep(2000);
		Select os = new Select(methodOfTraining1);
		os.selectByVisibleText(tr1);
		Thread.sleep(2000);
		Select os1 = new Select(trainedBy);
		os1.selectByVisibleText(tr2);
		Thread.sleep(2000);
		//sentForApproval1.click();
		//Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean addTrainingPlanAlert_MyTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure want to send the training plan for approval?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Training plan created successfully."));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void edit1_MyTrainingPlan(String skills) throws InterruptedException
	{
		for(int i=0;i<skills1.size();i++)
		{
			String text=skills1.get(i).getText();
			if(text.equals(skills))
			{
				Thread.sleep(5000);
				Actions1.get(i).click();	
				Thread.sleep(3000);			
				break;	
			}
		}
	}
	
	public void edit2_MyTrainingPlan(String dt) throws InterruptedException
	{		
		Thread.sleep(2000);
		edit1.click();
		Thread.sleep(2000);
		details1.sendKeys(dt);
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean editTrainingPlanAlert_MyTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Training plan updated successfully."));
//			alert1.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void delete1_MyTrainingPlan(String skills) throws InterruptedException
	{
		for(int i=0;i<skills1.size();i++)
		{
			String text=skills1.get(i).getText();
			if(text.equals(skills))
			{
				Thread.sleep(5000);
				Actions1.get(i).click();	
				Thread.sleep(3000);			
				break;	
			}
		}
	}
	
	public void delete2_MyTrainingPlan() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete1.click();
		Thread.sleep(2000);
	}
	
//	public static boolean deleteTrainingPlanAlert_MyTrainingPlan() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this training plan?"));
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
	
	public void searchDate1_MyTrainingPlan(String dt1,String dt2) throws InterruptedException
	{	
		Thread.sleep(2000);
		filter1.click();
		Thread.sleep(2000);
		plannedDateTo1.sendKeys(dt1);
		Thread.sleep(2000);
		plannedDateFrom1.sendKeys(dt2);
		Thread.sleep(2000);
		searchData1.click();
		Thread.sleep(2000);
	}
	
	public void searchDate2_MyTrainingPlan(String dt1,String dt2) throws InterruptedException
	{	
		Thread.sleep(2000);
		clearData1.click();
		Thread.sleep(2000);
		actualDateTo1.sendKeys(dt1);
		Thread.sleep(2000);
		actualDateFrom1.sendKeys(dt2);
		Thread.sleep(2000);
		searchData1.click();
		Thread.sleep(2000);
	}
	
	public Boolean dateSearchValidation1_MyTrainingPlan(String dt) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =plannedTrainingDate1.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<plannedTrainingDate1.size();i++)
			{
				String stat=plannedTrainingDate1.get(i).getText();
				if (!(stat.contains(dt))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean dateSearchValidation2_MyTrainingPlan(String dt) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =actualTrainingDate1.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<actualTrainingDate1.size();i++)
			{
				String stat=actualTrainingDate1.get(i).getText();
				if (!(stat.contains(dt))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void clearSearchDate_MyTrainingPlan() throws InterruptedException
	{	
		Thread.sleep(2000);
		clearData1.click();
		Thread.sleep(2000);
	}
	
	public void searchStatus_MyTrainingPlan(String st) throws InterruptedException
	{	
		Thread.sleep(2000);
		clearData1.click();
		Thread.sleep(2000);
		Select os = new Select(status1);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		searchData1.click();
		Thread.sleep(2000);
		
	}
	
	public void searchStatus1(String st) throws InterruptedException
	{	
		Thread.sleep(2000);
		filter1.click();
		Thread.sleep(2000);
		Select os = new Select(status1);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		searchData1.click();
		Thread.sleep(2000);
		
	}
	
	public Boolean statusSearchValidation_MyTrainingPlan(String st) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st1 = true;
		int count =sign1.size();
		if (count<1) 
		{
			st1=false;
		}
		else 
		{
			for (int i=0; i<sign1.size();i++)
			{
				String stat=sign1.get(i).getText();
				if (!(stat.contains(st))) 
				{
					st1=false;
					break;
				}
			}
		}
		return st1;
	}
	
	public void export_MyTrainingPlan() throws InterruptedException
	{	
		Thread.sleep(2000);
		export1.click();
		Thread.sleep(2000);
	}
	
	public void sign1_TrainingPlanForApproval(String skills) throws InterruptedException
	{
		for(int i=0;i<skills2.size();i++)
		{
			String text=skills2.get(i).getText();
			if(text.equals(skills))
			{
				Thread.sleep(5000);
				sign2.get(i).click();	
				Thread.sleep(3000);			
				break;	
			}
		}
	}
	
	public void sign2_TrainingPlanForApproval(String em,String pwd,String rs) throws InterruptedException
	{	
		Thread.sleep(2000);
		email1.sendKeys(em);
		Thread.sleep(2000);
		pwd1.sendKeys(pwd);
		Thread.sleep(2000);
		Select os = new Select(reason1);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit1.click();
		Thread.sleep(2000);	
	}
	
//	public static boolean signALert_TrainingPlanForApproval() throws InterruptedException
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
	
	public void searchStatus2(String st) throws InterruptedException
	{	
		Thread.sleep(2000);
		filter2.click();
		Thread.sleep(2000);
		Select os = new Select(status2);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		searchData2.click();
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

}
