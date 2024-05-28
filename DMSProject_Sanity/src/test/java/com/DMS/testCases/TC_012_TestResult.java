package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TestResult;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;

public class TC_012_TestResult extends BaseClass {
	
	@Test(dataProvider = "DD1",priority=1, description = "Submit the exam")
	public void submitExam(String email,String password) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.clickOnEmployee();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		
		Assert.assertEquals(ee.Alert(),"Are you sure you want to submit the answer?");
		Assert.assertEquals(ee.Alert(),"Answers submitted successfully");
		driver.navigate().back();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		Assert.assertEquals(ee.Alert(),"Are you sure you want to submit the answer?");
		Assert.assertEquals(ee.Alert(),"Answers submitted successfully");
		driver.navigate().back();
		ee.submitExam1("Initiated");
		ee.submitExam2();
		Assert.assertEquals(ee.Alert(),"Are you sure you want to submit the answer?");
		Assert.assertEquals(ee.Alert(),"Answers submitted successfully");
		driver.navigate().refresh();
		lp.profileIcon();
		lp.logout();
	}
	
	@Test(dataProvider = "DD2",priority=2, description = "Sign the completed test")
	public void signTest_Initiator(String email,String password,String UserName,String Password,String Remarks) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		TestResult ee = new TestResult(driver);
		ee.clickOnTestResult2();
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment12");
		ee.signTest2(UserName,Password,Remarks);
		
		Assert.assertEquals(ee.Alert(),"Signed successfully");
		ee.clickOnTestResult2();
		ee.statusSearch_Initiator("Completed");
		ee.view_Initiator("Assessment12");
		ee.signTest2(UserName,Password,Remarks);
		Assert.assertEquals(ee.Alert(),"Signed successfully");
		ee.clickOnTestResult2();
	}
	
	@Test(dataProvider = "DD3",priority=3, description = "Sign the completed test")
	public void sign_test_Supervisor(String UserName,String Password,String Remarks) throws IOException, InterruptedException
	{
		TestResult ee = new TestResult(driver);
		ee.clickOnSupervisor();
		ee.signTest3a("Failed", "Completed");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/i[1]")).click();		
		ee.signTest2(UserName,Password,Remarks);
		Assert.assertEquals(ee.Alert(),"Signed successfully");
		ee.clickOnTestResult2();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TestResult.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return data;	

	}
	
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TestResult.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet2");
	int colcount=XLUtility.getCellCount(path, "Sheet2", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet2", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TestResult.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet3");
	int colcount=XLUtility.getCellCount(path, "Sheet3", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet3", i, j);
		}
	}
	
	return data;	

	}
	


}
