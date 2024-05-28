package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TrainingPlan;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;

public class TC_013_TrainingPlan  extends BaseClass {

	@Test(dataProvider = "DD1",priority=1, description = "Add my training plan")
	public void addTrainingPlan_MyTrainingPlan(String email, String pwd, String sub, String PSD, String PED, String ASD, String AED, String TrainingMethod, String TrainedBy) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnAddTrainingPlan_MyTrainingPlan(sub, PSD, PED, ASD, AED, TrainingMethod, TrainedBy);
		
		Assert.assertEquals(tp.Alert(),"Are you sure want to send the training plan for approval?");
		Assert.assertEquals(tp.Alert(),"Training plan created successfully.");
	}
	
	@Test(priority=2, description = "Export the training plan details")
	public void export_MyTrainingPlan() throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.export_MyTrainingPlan();
	}
	
	@Test(dataProvider = "DD2",priority=3, description = "Assign training plan")
	public void addTrainingPlan_addTrainingPlan(String sub,String  PSD, String PED, String TrainingMethod, String TrainedBy) throws IOException, InterruptedException
	{
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnAddTrainingPlan();
		tp.clickOnAddTrainingPlan_AddTrainingPlan(sub, PSD, PED, TrainingMethod, TrainedBy);
		
		Assert.assertEquals(tp.Alert(),"Training plan created successfully.");
		LoginPage lp=new LoginPage(driver);
		lp.profileIcon();
		lp.logout();
	}
	
	@Test(dataProvider = "DD3",priority=4, description = "Sign the completed training plan")
	public void sign_TrainingPlanForApproval(String email,String pwd,String status,String sub,String SignEmail, String SignPwd, String Remarks) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		TrainingPlan tp = new TrainingPlan(driver);
		tp.clickOnTrainingPlan();
		tp.clickOnTrainingPlanForApproval();
		tp.searchStatus2(status);
		tp.sign1_TrainingPlanForApproval(sub);
		tp.sign2_TrainingPlanForApproval(SignEmail, SignPwd, Remarks);
		Assert.assertEquals(tp.Alert(),"Signed successfully");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TrainingPlan.xlsx";
		int rownum=XLUtility.getRowCount(path, "MyTrainingPlan");
	int colcount=XLUtility.getCellCount(path, "MyTrainingPlan", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "MyTrainingPlan", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TrainingPlan.xlsx";
		int rownum=XLUtility.getRowCount(path, "AddTrainingPlan");
	int colcount=XLUtility.getCellCount(path, "AddTrainingPlan", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "AddTrainingPlan", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TrainingPlan.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sign");
	int colcount=XLUtility.getCellCount(path, "Sign", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sign", i, j);
		}
	}
	
	return data;	

	}
	

	

}
