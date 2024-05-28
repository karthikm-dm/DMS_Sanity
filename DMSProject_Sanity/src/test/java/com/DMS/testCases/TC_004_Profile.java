package com.DMS.testCases;

import Base.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.Profile;
import com.DMS.utilities.XLUtility;

public class TC_004_Profile extends BaseClass {

	@Test(dataProvider = "DD1",priority=1, description = "Change password for DMS account")
	public void changePassword_DMS_Account(String username,String pwd1,String pwd2,String pwd3,String pwd4) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(username);
		lp.setPassword(pwd1);
		lp.clickLogin();
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.changePassword(pwd2, pwd3, pwd4);
		Assert.assertEquals(lp.Alert(),"Password updated successfully");	
	}
	
	/*@Test(priority=2, description = "Create digi sign password")
	public void createDigiSign() throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.clickProfile();
		pp.createDigiSign("Neethu@1", "Neethu@1");
		pp.DigiSignPwdCreationAlert();
		
	}*/
	
	@Test(dataProvider = "DD2",priority=2, description = "Update digi sign password")
	public void updatePasswordForDigiSign(String pwd1,String pwd2,String pwd3) throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.updatePasswordForDigiSign(pwd1, pwd2, pwd3);
		Assert.assertEquals(pp.Alert(),"Are you sure want to save this password for your Digital Signature?");
		Thread.sleep(2000);
		Assert.assertEquals(pp.Alert(),"Are you sure want to save this password for your Digital Signature?");

	}
	
	@Test(dataProvider = "DD3",priority=3, description = "Forgot digi sign password")
	public void forgotDigiSignPassword(String pwd) throws IOException, InterruptedException
	{
		Profile pp = new Profile(driver);
		pp.forgotDigiSignPwd(pwd);
		Assert.assertEquals(pp.Alert(),"An email has been sent to you with a password reset link");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Profile.xlsx";
		int rownum=XLUtility.getRowCount(path, "ChangePassword");
	int colcount=XLUtility.getCellCount(path, "ChangePassword", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "ChangePassword", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Profile.xlsx";
		int rownum=XLUtility.getRowCount(path, "UpdateDigiSignPwd");
	int colcount=XLUtility.getCellCount(path, "UpdateDigiSignPwd", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "UpdateDigiSignPwd", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Profile.xlsx";
		int rownum=XLUtility.getRowCount(path, "ForgotDigiSignPwd");
	int colcount=XLUtility.getCellCount(path, "ForgotDigiSignPwd", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "ForgotDigiSignPwd", i, j);
		}
	}
	
	return data;	

	}



}

