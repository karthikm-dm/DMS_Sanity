package com.DMS.pageObjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class ConfigOnlineTest extends AbstractComponent{
	static WebDriver driver;
	public ConfigOnlineTest(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Configure Exam menu
	@FindBy(xpath="(//img[@alt='projects menu'])[2]")
	WebElement training;
	@FindBy(xpath="//b[normalize-space()='Config Online Test']")
	WebElement configureExam;
	
	//Search
	@FindBy(xpath="//input[@type='text']")
	WebElement examNameSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement search;
	
	//Test config list
	@FindBy(xpath="//td[1]")
	List<WebElement> examName;
	@FindBy(xpath="//td[2]")
	List<WebElement> supervisorName;
	@FindBy(xpath="//td[3]")
	List<WebElement> percentage;
	@FindBy(xpath="//td[4]")
	List<WebElement> qusNo;
	@FindBy(xpath="//td[5]")
	List<WebElement> time;
	@FindBy(xpath="//td[6]")
	List<WebElement> edit;
	@FindBy(xpath="//td[7]")
	List<WebElement> view;
	
	//Create test
	@FindBy(xpath="//img[@alt='Create test']")
	WebElement createTest;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement testName;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement noOfQus;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement percentageToPass;
	@FindBy(xpath="//input[@placeholder='Hours']")
	WebElement hours;
	@FindBy(xpath="//input[@placeholder='Minutes ']")
	WebElement minutes;
	@FindBy(xpath="//input[@type='date']")
	WebElement examDate;
	@FindBy(xpath="//select[@name='account']")
	WebElement supervisor;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[7]/div")
	WebElement des1;
	@FindBy(xpath="//li[@id='multiselect-option-baded23b-1d0a-4219-9b15-ff84dad86db0']")//li[contains(text(),'Quality Analyst')]
	WebElement des2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[7]/div/span[2]")
	WebElement des3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[8]/div")
	WebElement user1;
	@FindBy(xpath="//li[@id='multiselect-option-631b1a3f-8e9d-42fe-a35c-a8761f58aca6']")//Neethu Tester
	WebElement user2;
	@FindBy(xpath="//li[@id='multiselect-option-4bb7c35e-0e56-4813-82dd-a724b45768bd']")//Neethug G
	WebElement user3;
	@FindBy(xpath="//li[@id='multiselect-option-9bb335ad-d9c4-4c8a-926a-7b39ec12ef1f']")//Neethur R
	WebElement user4;
	@FindBy(xpath="//div[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div[8]/div/span[2]")
	WebElement user5;
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clearTest;
	
	//Edit test
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit2;
	
	
	//Add user
	@FindBy(xpath="//div[@id='tab-1']//img[@alt='Add User']")
	WebElement addUser;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div")
	WebElement desig1;
	@FindBy(xpath="//li[@id='multiselect-option-baded23b-1d0a-4219-9b15-ff84dad86db0']")
	WebElement desig2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div/span[2]")
	WebElement desig3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div")
	WebElement users1;
	@FindBy(xpath="//li[@id='multiselect-option-4bb7c35e-0e56-4813-82dd-a724b45768bd']")//Neethug G
	WebElement users2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div/span[2]")
	WebElement users3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div[2]/button[2]")
	WebElement save;
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement reset1;
	
	//Users list
	@FindBy(xpath="//td[1]")
	List<WebElement> employeeName;
	@FindBy(xpath="//td[2]")
	List<WebElement> testName1;
	@FindBy(xpath="//td[3]")
	List<WebElement> supervisorName1;
	@FindBy(xpath="//td[4]")
	List<WebElement> examDate1;
	@FindBy(xpath="//td[5]")
	List<WebElement> status;
	@FindBy(xpath="//td[6]")
	List<WebElement> view1;
	@FindBy(xpath="//td[7]")
	List<WebElement> actions;
	
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete;
	
	//Create question
	@FindBy(xpath="//a[normalize-space()='Questions']")
	WebElement question;
	@FindBy(xpath="//img[@alt='Create Question']")
	WebElement createQuestion;
	@FindBy(xpath="//input[@placeholder='Question']")
	WebElement question1;
	@FindBy(xpath="//input[@placeholder='options']")
	WebElement options;
	@FindBy(xpath="(//input[@value='UserDto.option'])[1]")
	WebElement setAns;
	@FindBy(xpath="//button[normalize-space()='+ Add']")
	WebElement add;//setAns.click();
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement reset2;
	
	//Web table questions
	@FindBy(xpath="//td[1]")
	List<WebElement> no;
	@FindBy(xpath="//td[2]")
	List<WebElement> qus1;
	@FindBy(xpath="//td[3]")
	List<WebElement> options1;
	@FindBy(xpath="//td[4]")
	List<WebElement> ans;
	@FindBy(xpath="//table[@class='table table-bordered question-table']//i")
	List<WebElement> actions1;
	
	@FindBy(xpath="//div[normalize-space()='Edit']")
	WebElement edit1;
	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement delete1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save2;
	
	//Reference documents
	@FindBy(xpath="//a[normalize-space()='Reference Documents']")
	WebElement referenceDocuments;
	@FindBy(xpath="//div[@id='tab-3']//img[@alt='Add User']")
	WebElement addDocument;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div")
	WebElement type1;
	@FindBy(xpath="//li[@id='multiselect-option-fac89807-60db-4eda-b8a0-f1282132a5a5']")
	WebElement type2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div/div/span[2]")
	WebElement type3;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div")
	WebElement doc1;
	@FindBy(xpath="//li[@id='multiselect-option-5a659398-b44e-4ab5-ae4c-07d51c4202fd']")
	WebElement doc2;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div/div[2]/div/div[2]/div/span[2]")
	WebElement doc3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save3;
	
	//Web table documents
	@FindBy(xpath="//td[1]")
	List<WebElement> docname;
	@FindBy(xpath="//td[2]")
	List<WebElement> version;
	@FindBy(xpath="//td[3]")
	List<WebElement> actions2;
	
	@FindBy(xpath="//div[@id='tab-3']//table[@class='table table-bordered']//i[1]")
	WebElement delete2;
	@FindBy(xpath="(//div[contains(text(),'Delete')])[2]")
	WebElement delete2a;
	
	//Configure exam
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit1;
	
	//Upload question
	@FindBy(xpath="//img[@alt='export_icon']")
	WebElement upload;
	
	 
	public void uploadQus(String doclocation) throws Exception
	{
		Thread.sleep(2000);	
		question.click();
		Thread.sleep(2000);
		upload.click();
		String absolutepath= new File(doclocation).getAbsolutePath();
		//browsedoc.sendKeys(absolutepath);
		Thread.sleep(3000);	
		Robot robot = new Robot();
		// Press the "CTRL" and "V" keys to paste the file path into the file input field
		StringSelection stringSelection = new StringSelection(absolutepath); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Press the "ENTER" key to submit the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}
	
//	public static boolean uploadQusAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to upload the questions?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Questions uploaded successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void clickOnConfigExam() throws InterruptedException
	{		
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		configureExam.click();
		Thread.sleep(2000);;
	}
	
	
	public void configExam() throws InterruptedException
	{		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		submit2.click();
		Thread.sleep(2000);
	}
	
	public void selQus(String num) throws InterruptedException
	{
		for(int i=0;i<no.size();i++)
		{
			String text=no.get(i).getText();
			if(text.equals(num))
			{
				Thread.sleep(5000);
				actions1.get(i).click();	
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void editTest1(String name) throws InterruptedException
	{
		for(int i=0;i<examName.size();i++)
		{
			String text=examName.get(i).getText();
			if(text.equals(name))
			{
				edit.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void viewTest1(String name) throws InterruptedException
	{
		for(int i=0;i<examName.size();i++)
		{
			String text=examName.get(i).getText();
			if(text.equals(name))
			{
				view.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void viewTest2(String name) throws InterruptedException
	{
		for(int i=0;i<status.size();i++)
		{
			String text=status.get(i).getText();
			if(text.equals(name))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void editTest2() throws InterruptedException
	{		
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);;
	}
	
	public void selDoc(String name) throws InterruptedException
	{
		for(int i=0;i<docname.size();i++)
		{
			String text=docname.get(i).getText();
			if(text.equals(name))
			{
				actions2.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void referenceDocuments() throws InterruptedException
	{	
		elementWait(referenceDocuments);
		Thread.sleep(2000);
		referenceDocuments.click();
		Thread.sleep(2000);
		addDocument.click();
		Thread.sleep(2000);
		type1.click();
		Thread.sleep(2000);
		type2.click();
		Thread.sleep(2000);
		type3.click();
		Thread.sleep(2000);
		doc1.click();
		Thread.sleep(2000);
		doc2.click();
		Thread.sleep(2000);
		doc3.click();
		Thread.sleep(2000);
		save3.click();
		Thread.sleep(2000);
	}
	
	public void editQus() throws InterruptedException
	{		
		Thread.sleep(2000);
		edit1.click();
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void deleteQus() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete1.click();
		Thread.sleep(2000);
	}
	
	public void deleteDoc() throws InterruptedException
	{	
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		elementWait(delete2);
		Thread.sleep(3000);
		delete2.click();
		Thread.sleep(3000);
		delete2a.click();
		Thread.sleep(3000);;
	}
	
	
	public void createQuestion1() throws InterruptedException
	{		
		Thread.sleep(2000);
		question.click();
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is statement coverage?");
		options.sendKeys("Testing each line of code at least once");
		setAns.click();
		add.click();
		options.sendKeys("Testing each possible combination of inputs");
		add.click();
		options.sendKeys("Testing the functionality of the software as a whole");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion2() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is system testing?");
		options.sendKeys("Testing individual units or components of the software");
		add.click();
		options.sendKeys("Testing the software as a whole");
		add.click();
		options.sendKeys("Testing the software in a live environment");
		setAns.click();
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion3() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What are the different components of Selenium?");
		options.sendKeys("Selenium Console, Selenium Executor, and Selenium Inspector");
		add.click();
		options.sendKeys("Selenium Server, Selenium Test Runner, and Selenium Client");
		add.click();
		options.sendKeys("Selenium IDE, Selenium WebDriver, and Selenium Grid");
		setAns.click();
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion4() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is unit testing?");
		options.sendKeys("Testing individual units or components of the software");
		setAns.click();
		add.click();
		options.sendKeys("Testing the software as a whole");
		add.click();
		options.sendKeys("Testing the software in a live environment");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion5() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is a JMeter test plan?");
		options.sendKeys("A set of instructions for JMeter to follow when running a performance test");
		setAns.click();
		add.click();
		options.sendKeys("A way to store JMeter test data");
		add.click();
		options.sendKeys("A tool for debugging JMeter tests");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion6() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is an issue in Jira?");
		options.sendKeys("A configuration setting for a Jira project");
		add.click();
		options.sendKeys("A project management tool for tracking deadlines");
		add.click();
		options.sendKeys("A task or piece of work to be done, such as a bug fix or a new feature");
		setAns.click();
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion7() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is regression testing?");
		options.sendKeys("A type of manual testing where the tester only tests new features");
		add.click();
		options.sendKeys("A type of manual testing where the tester tests the software in a new environment");
		add.click();
		options.sendKeys("A type of manual testing where the tester tests the software after changes have been made to it");
		setAns.click();
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion8() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is JMeter?");
		options.sendKeys("A programming language used for building web applications");
		add.click();
		options.sendKeys("An open-source performance testing tool developed by Apache");
		setAns.click();
		add.click();
		options.sendKeys("A database management system");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion9() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is performance testing?");
		options.sendKeys("A type of testing that measures the software's performance under specific conditions, such as load or stress");
		setAns.click();
		add.click();
		options.sendKeys("A type of testing that measures the software's security");
		add.click();
		options.sendKeys("A type of testing that measures the software's stability");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	
	public void createQuestion10() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is the difference between verification and validation in software testing?");
		options.sendKeys("Verification is manual testing, while validation is automated testing");
		add.click();
		options.sendKeys("Verification checks whether the software meets its design specifications, while validation checks whether it meets the user's requirements");
		setAns.click();
		add.click();
		options.sendKeys("Verification is testing the software during development, while validation is testing after development");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion11() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is Selenium?");
		options.sendKeys("A programming language used for building web applications");
		add.click();
		options.sendKeys("A software testing tool used for automated testing of web applications");
		setAns.click();
		add.click();
		options.sendKeys("A database management system");
		add.click();
		options.sendKeys("None of the above");
		add.click();
		save1.click();		
	}
	
	public void createQuestion12() throws InterruptedException
	{		
		Thread.sleep(2000);
		createQuestion.click();
		question1.sendKeys("What is the primary goal of software testing?");
		options.sendKeys("To find defects and improve the quality of the software");
		setAns.click();
		add.click();
		options.sendKeys("To make sure the software is bug-free");
		add.click();
		options.sendKeys("To speed up the development process");
		add.click();
		options.sendKeys("To save costs");
		add.click();
		save1.click();		
	}
	
	
	public void clickOnConfigureExam() throws InterruptedException
	{		
		Thread.sleep(2000);
		configureExam.click();
		Thread.sleep(2000);
	}
	
	public void employeeDeletion() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
	}
	
	public void selEmployeeView(String name) throws InterruptedException
	{
		for(int i=0;i<employeeName.size();i++)
		{
			String text=employeeName.get(i).getText();
			if(text.equals(name))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void selEmployeeActions(String name) throws InterruptedException
	{
		for(int i=0;i<employeeName.size();i++)
		{
			String text=employeeName.get(i).getText();
			if(text.equals(name))
			{
				actions.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void userAddition() throws InterruptedException
	{		
		Thread.sleep(2000);
		addUser.click();
		Thread.sleep(2000);
		desig1.click();
		Thread.sleep(2000);
		desig2.click();
		Thread.sleep(2000);
		desig3.click();
		Thread.sleep(2000);
		users1.click();
		Thread.sleep(2000);
		users2.click();
		Thread.sleep(2000);
		users3.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}

	public void configureExam(String name,String no,String per,String date,String sup) throws InterruptedException
	{		
		Thread.sleep(2000);
		createTest.click();
		Thread.sleep(2000);
		testName.sendKeys(name);
		Thread.sleep(2000);
		noOfQus.sendKeys(no);
		Thread.sleep(2000);
		percentageToPass.sendKeys(per);
		Thread.sleep(2000);
		examDate.sendKeys(date);
		Thread.sleep(2000);
		Select os = new Select(supervisor);
		os.selectByVisibleText(sup);
		Thread.sleep(2000);
		des1.click();
		Thread.sleep(2000);
		des2.click();
		Thread.sleep(2000);
		des3.click();
		Thread.sleep(2000);
		user1.click();
		Thread.sleep(2000);
		user4.click();
		Thread.sleep(2000);
		user5.click();
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
//	public static boolean examConfigurationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Exam configured successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean examConfigurationUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Configuration updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean examConfigurationUpdateAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Configuration updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean referenceDocumentAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean editQusAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Question updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean deleteQusAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this question?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Question deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean deleteDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean qusCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Question created successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean employeeDeletionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this user?"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean userAdditionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("User added succesfullly"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void nameSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		examNameSearch.sendKeys(name);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean nameValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =examName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<examName.size();i++)
			{
				String stat=examName.get(i).getText();
				if (!(stat.contains(name))) 
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
