package com.DMS.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.DMS.pageObjects.LoginPage;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;
import org.testng.asserts.SoftAssert;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(dataProvider="DD1",priority=1 , description = "Login with invalid credentials")
	public void loginWithInvalidCredentials(String username,String password) throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Enterd password");
		lp.clickLogin();
		Thread.sleep(10000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg(), "Invalid username or password");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}	
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\LoginTest_Negative.xlsx";
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
	
	}


