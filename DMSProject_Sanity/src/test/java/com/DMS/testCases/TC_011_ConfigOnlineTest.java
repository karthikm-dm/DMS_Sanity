package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DMS.pageObjects.ConfigOnlineTest;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;
import org.openqa.selenium.interactions.Actions;
public class TC_011_ConfigOnlineTest extends BaseClassTest {

	
	@Test(dataProvider = "DD1",priority=1, description = "Create test and assign users")
	public void configureExam(String ExamName,String NoOfQus,String PerToPass,String Date,String SupName) throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
		Assert.assertEquals(ce.Alert(),"Exam configured successfully");
		
	}
	
	@Test(priority=2, description = "Assign users")
	public void userAddition() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.userAddition();
		
		Assert.assertEquals(ce.Alert(),"User added succesfullly");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
	
	@Test(priority=3, description = "Create question")
	public void createQuestion() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.createQuestion1();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion2();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion3();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion4();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion5();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion6();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion7();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion8();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion9();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion10();
		Assert.assertEquals(ce.Alert(),"Question created successfully");
		ce.createQuestion11();
		Assert.assertEquals(ce.Alert(),"Question created successfully");	
		Thread.sleep(5000);	
	}
	
	@Test(dataProvider = "DD1",priority=4, description = "Upload question")
	public void uploadQuestion(String ExamName,String NoOfQus,String PerToPass,String Date,String SupName) throws Exception
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();	
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
		Assert.assertEquals(ce.Alert(),"Exam configured successfully");
		ce.uploadQus("C:\\Users\\NeethumolPS\\Downloads\\Software Testing MCQ 2.xlsx");
		Assert.assertEquals(ce.Alert(),"Questions uploaded successfully");
		driver.navigate().back();
		ce.configureExam(ExamName,NoOfQus,PerToPass,Date,SupName);
		Assert.assertEquals(ce.Alert(),"Exam configured successfully");
		ce.uploadQus("C:\\Users\\NeethumolPS\\Downloads\\Software Testing MCQ 2.xlsx");
		Assert.assertEquals(ce.Alert(),"Questions uploaded successfully");
	}
	
	@Test(priority=5, description = "View test")
	public void viewTest() throws IOException, InterruptedException
	{
		ConfigOnlineTest ce = new ConfigOnlineTest(driver);
		ce.clickOnConfigExam();	
		ce.nameSearch("Assessment04");		
		Thread.sleep(2000);
		ce.viewTest1("Assessment04");
		ce.viewTest2("Signed");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\ConfigOnlineTest.xlsx";
		int rownum=XLUtility.getRowCount(path, "ExamDetails");
	int colcount=XLUtility.getCellCount(path, "ExamDetails", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "ExamDetails", i, j);
		}
	}
	
	return data;	

	}
	

}
