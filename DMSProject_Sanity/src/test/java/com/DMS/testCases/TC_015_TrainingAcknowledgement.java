package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.TrainingAcknowledgement;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;

public class TC_015_TrainingAcknowledgement extends BaseClass {

	
	@Test(dataProvider = "DD1",priority=1, description = "Sign the SOP training form")
	public void sign_MyTraining(String email1,String pwd1,String status,String email2, String pwd2, String remarks) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email1);
		lp.setPassword(pwd1);
		lp.clickLogin();
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnTrainingAcknowledgement();
		sl.selView1(status);		
		sl.sign_TraineeSop(email2, pwd2, remarks);
		Assert.assertEquals(sl.Alert(),"You have Digi-signed successfully");
		sl.clickOnTrainingAcknowledgement1();
	}
	
	@Test(priority=2, description = "View the SOP training form")
	public void assignTraining() throws IOException, InterruptedException
	{
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnAssignTraining();
		WebElement ele = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/i[1]"));
		ele.click();
		LoginPage lp=new LoginPage(driver);
		lp.profileIcon();
		lp.logout();
	}
	
	
	@Test(dataProvider = "DD2",priority=3, description = "Sign the SOP training form")
	public void sign_Verification(String email1,String pwd1,String status,String email2, String pwd2, String remarks) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email1);
		lp.setPassword(pwd1);
		lp.clickLogin();
		TrainingAcknowledgement sl = new TrainingAcknowledgement(driver);
		sl.clickOnTrainingAcknowledgement();
		sl.clickOnVerification();
		sl.selView2(status);
		sl.sign_TrainerSop(email2, pwd2, remarks);		
		Assert.assertEquals(sl.Alert(),"You have Digi-signed successfully");
		sl.clickOnTrainingAcknowledgement1();
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TrainingAcknowledgement.xlsx";
		int rownum=XLUtility.getRowCount(path, "sign_MyTraining");
	int colcount=XLUtility.getCellCount(path, "sign_MyTraining", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "sign_MyTraining", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\TrainingAcknowledgement.xlsx";
		int rownum=XLUtility.getRowCount(path, "sign_Verification");
	int colcount=XLUtility.getCellCount(path, "sign_Verification", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "sign_Verification", i, j);
		}
	}
	
	return data;	

	}

}
