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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class TestResult extends AbstractComponent{
	static WebDriver driver;
	public TestResult(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Configure Exam menu
	@FindBy(xpath="(//img[@alt='projects menu'])[2]")
	WebElement training;
	@FindBy(xpath="//b[normalize-space()='Online Test']")
	WebElement testResult;
	
	//initiator
	@FindBy(xpath="//a[@id='Initiator']")
	WebElement initiator;
	@FindBy(xpath="//div[@id='tab-1']//input[@type='text']")
	WebElement employeeName1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='col-12 col-md-1 my-1 pr-md-1']//select[@placeholder='Search']")
	WebElement result1;
	@FindBy(xpath="//div[@id='tab-1']//div[@class='col-12 col-md-2 my-1 pr-md-1']//select[@placeholder='Search']")
	WebElement status1;
	@FindBy(xpath="(//input[@type='date'])[1]")
	WebElement examDateFrom1;
	@FindBy(xpath="(//input[@type='date'])[2]")
	WebElement examDateTo1;
	@FindBy(xpath="//div[@id='tab-1']//span[@type='button'][normalize-space()='Search']")
	WebElement search1;
	
	//Initiator web table
	@FindBy(xpath="//td[1]")
	List<WebElement> employee1;
	@FindBy(xpath="//td[2]")
	List<WebElement> testName1;
	@FindBy(xpath="//td[3]")
	List<WebElement> supervisorName1;
	@FindBy(xpath="//td[4]")
	List<WebElement> examDate1;
	@FindBy(xpath="//td[5]")
	List<WebElement> rslt1;
	@FindBy(xpath="//td[6]")
	List<WebElement> stat1;
	@FindBy(xpath="//td[7]")
	List<WebElement> view1;
	@FindBy(xpath="//td[8]")
	List<WebElement> download1;
	@FindBy(xpath="//td[9]")
	List<WebElement> retest1;
	
	//Supervisor
	@FindBy(xpath="//a[@id='Supervisor']")
	WebElement supervisor;
	@FindBy(xpath="//div[@id='tab-2']//input[@type='text']")
	WebElement employeeName2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='col-12 col-md-1 my-1 pr-md-1']//select[@placeholder='Search']")
	WebElement result2;
	@FindBy(xpath="//div[@id='tab-2']//div[@class='col-12 col-md-2 my-1 pr-md-1']//select[@placeholder='Search']")
	WebElement status2;
	@FindBy(xpath="(//input[@type='date'])[3]")
	WebElement examDateFrom2;
	@FindBy(xpath="(//input[@type='date'])[4]")
	WebElement examdateTo2;
	@FindBy(xpath="//div[@id='tab-2']//span[@type='button'][normalize-space()='Search']")
	WebElement search2;
	
	//Supervisor web table
	@FindBy(xpath="//td[1]")
	List<WebElement> employee2;
	@FindBy(xpath="//td[2]")
	List<WebElement> testName2;
	@FindBy(xpath="//td[3]")
	List<WebElement> supervisorName2;
	@FindBy(xpath="//td[4]")
	List<WebElement> examDate2;
	@FindBy(xpath="//td[5]")
	List<WebElement> rslt2;
	@FindBy(xpath="//td[6]")
	List<WebElement> stat2;
	@FindBy(xpath="//td[7]")
	List<WebElement> view2;
	@FindBy(xpath="//td[8]")
	List<WebElement> retest2;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/i[1]")
	WebElement view2a;
	
	//Employee
	@FindBy(xpath="//a[@id='Employee']")
	WebElement employee;
	@FindBy(xpath="//td[1]")
	List<WebElement> employee3;
	@FindBy(xpath="//td[2]")
	List<WebElement> testName3;
	@FindBy(xpath="//td[3]")
	List<WebElement> supervisorName3;
	@FindBy(xpath="//td[4]")
	List<WebElement> examDate3;
	@FindBy(xpath="//td[5]")
	List<WebElement> rslt3;
	@FindBy(xpath="//td[6]")
	List<WebElement> stat3;
	@FindBy(xpath="//td[7]")
	List<WebElement> view3;
	@FindBy(xpath="//td[8]")
	List<WebElement> retest3;
	
	//Sign
	@FindBy(xpath="//img[@alt='create version']")
	WebElement sign;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='templatePassword']")
	WebElement pwd;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reason;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit;
	
	//Exam
	@FindBy(xpath="//button[normalize-space()='Start Test']")
	WebElement startExam;
	@FindBy(xpath="//label[@for='218016ec-4ce1-4cc1-ac66-3657fa6614400']")
	WebElement ans1;
	@FindBy(xpath="//label[@for='620d6e6b-1649-4a98-9a59-c862afcf6c010']")
	WebElement ans2;
	@FindBy(xpath="//label[@for='661a2103-0130-4c11-8e5f-292d5cf4c8750']")
	WebElement ans3;
	@FindBy(xpath="//label[@for='3ca4f8b7-a3e4-46c5-a56b-fc96603d6bf80']")
	WebElement ans4;
	@FindBy(xpath="//label[@for='bfab2d95-b51b-4187-b819-8609ddf1dc512']")
	WebElement ans5;
	@FindBy(xpath="//label[@for='2f21c2df-1b0b-45bc-96f1-66eb2c6ea3212']")
	WebElement ans6;
	@FindBy(xpath="//label[@for='fe17e24c-3951-4bca-ae29-400e734ce8711']")
	WebElement ans7;
	@FindBy(xpath="//label[@for='87265486-2948-4372-84c0-45d7383893ec0']")
	WebElement ans8;
	@FindBy(xpath="//label[@for='fce4a695-71a7-4f72-a341-08302d6a8ec70']")
	WebElement ans9;
	@FindBy(xpath="//label[@for='c9a0b831-8041-40d1-9afb-61ee77c469260']")
	WebElement ans10;
	@FindBy(xpath="//span[@type='button']")
	WebElement submit1;
	
	
	public void clickOnTestResult1() throws InterruptedException
	{
		Thread.sleep(2000);
		testResult.click();
		Thread.sleep(2000);
	}
	
	public void clickOnView_Supervisor() throws InterruptedException
	{
		Thread.sleep(2000);
		view2a.click();
		Thread.sleep(2000);
	}
	
	public void clickOnTestResult2() throws InterruptedException
	{
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		testResult.click();
		Thread.sleep(2000);
	}
	
	public void clickOnTestResult3() throws InterruptedException
	{
		Thread.sleep(2000);
		training.click();
		Thread.sleep(2000);
		testResult.click();
		Thread.sleep(2000);
		supervisor.click();
		Thread.sleep(2000);
	}
	
	public void clickOnInitiator() throws InterruptedException
	{
		Thread.sleep(2000);
		initiator.click();
		Thread.sleep(2000);
	}
	
	public void clickOnSupervisor() throws InterruptedException
	{
		Thread.sleep(2000);
		supervisor.click();
		Thread.sleep(2000);
	}
	
	public void clickOnEmployee() throws InterruptedException
	{
		Thread.sleep(2000);
		employee.click();
		Thread.sleep(2000);
	}
	
	public void employeeNameSearch_Supervisor(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		employeeName2.sendKeys(name);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
	}
	
	public Boolean employeeNameSearchValidation_Supervisor(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = employee2.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  employee2.get(i).getText();
			if(text.contains(name))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void resultSearch_Supervisor(String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result2);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
	}
	
	public Boolean resultSearchValidation_Supervisor(String rs) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = rslt2.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  rslt2.get(i).getText();
			if(text.contains(rs))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}

	public void statusSearch_Supervisor(String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(status2);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
	}
	
	public Boolean statusSearchValidation_Supervisor(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = stat2.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  stat2.get(i).getText();
			if(text.contains(status))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void dateSearch_Supervisor(String d1,String d2) throws InterruptedException
	{
		Thread.sleep(2000);
		examDateFrom2.sendKeys(d1);
		Thread.sleep(2000);
		examdateTo2.sendKeys(d2);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
	}
	
	public Boolean dateSearchValidation_Supervisor(String dt) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = examDate2.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  examDate2.get(i).getText();
			if(text.contains(dt))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void signTest3(String rs,String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result2);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		Select os1 = new Select(status2);
		os1.selectByVisibleText(st);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i)[7]")).click();
		Thread.sleep(2000);
	}
	
	public void signTest3a(String rs,String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result2);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		Select os1 = new Select(status2);
		os1.selectByVisibleText(st);
		Thread.sleep(2000);
		search2.click();
		Thread.sleep(2000);
	}
	
	public void signTest4(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		sign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pwd.sendKeys(pw);
		Thread.sleep(2000);
		Select os = new Select(reason);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);		
	}
	
	
	public void view_Supervisor(String name) throws InterruptedException
	{
		for(int i=0;i<testName2.size();i++)
		{
			String text=testName2.get(i).getText();
			if(text.equals(name))
			{
				view2.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
	public void retest_Supervisor(String name) throws InterruptedException
	{
		for(int i=0;i<testName2.size();i++)
		{
			String text=testName2.get(i).getText();
			if(text.equals(name))
			{
				retest2.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void downloadTest1(String rs,String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result1);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		Select os1 = new Select(status1);
		os1.selectByVisibleText(st);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i)[4]")).click();
		Thread.sleep(2000);
	}
	
	public void employeeNameSearch_Initiator(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		employeeName1.sendKeys(name);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean employeeNameSearchValidation_Initiator(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = employee1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  employee1.get(i).getText();
			if(text.contains(name))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void resultSearch_Initiator(String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result1);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean resultSearchValidation_Initiator(String rs) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = rslt1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  rslt1.get(i).getText();
			if(text.contains(rs))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}

	public void statusSearch_Initiator(String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(status1);
		os.selectByVisibleText(st);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean statusSearchValidation_Initiator(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = stat1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  stat1.get(i).getText();
			if(text.contains(status))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void dateSearch_Initiator(String d1,String d2) throws InterruptedException
	{
		Thread.sleep(2000);
		examDateFrom1.sendKeys(d1);
		Thread.sleep(2000);
		examDateTo1.sendKeys(d2);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
	}
	
	public Boolean dateSearchValidation_Initiator(String dt) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = examDate1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  examDate1.get(i).getText();
			if(text.contains(dt))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public void signTest1(String rs,String st) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(result1);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		Select os1 = new Select(status1);
		os1.selectByVisibleText(st);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i)[3]")).click();
		Thread.sleep(2000);
	}
	
	public void signTest2(String em,String pw,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		sign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		pwd.sendKeys(pw);
		Thread.sleep(2000);
		Select os = new Select(reason);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);		
	}
	
//	public static boolean testSignnAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signed successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void view_Initiator(String name) throws InterruptedException
	{
		for(int i=0;i<testName1.size();i++)
		{
			String text=testName1.get(i).getText();
			if(text.equals(name))
			{
				view1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void download_Initiator(String name) throws InterruptedException
	{
		for(int i=0;i<testName1.size();i++)
		{
			String text=testName1.get(i).getText();
			if(text.equals(name))
			{
				download1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void retest_Initiator(String name) throws InterruptedException
	{
		for(int i=0;i<testName1.size();i++)
		{
			String text=testName1.get(i).getText();
			if(text.equals(name))
			{
				retest1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void view_Employee(String name) throws InterruptedException
	{
		for(int i=0;i<testName3.size();i++)
		{
			String text=testName3.get(i).getText();
			if(text.equals(name))
			{
				view3.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
	public void retest_Employee(String name) throws InterruptedException
	{
		for(int i=0;i<testName3.size();i++)
		{
			String text=testName3.get(i).getText();
			if(text.equals(name))
			{
				retest3.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void submitExam1(String st) throws InterruptedException
	{
		for(int i=0;i<stat3.size();i++)
		{
			String text=stat3.get(i).getText();
			if(text.equals(st))
			{
				view3.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void submitExam2() throws InterruptedException
	{
		Thread.sleep(2000);
		startExam.click();
		Thread.sleep(2000);
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		elementWait(submit1);
		submit1.click();
		Thread.sleep(2000);
	}
	
	
//	public static boolean submitExamAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to submit the answer?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Answers submitted successfully"));
//			alert2.accept();
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
