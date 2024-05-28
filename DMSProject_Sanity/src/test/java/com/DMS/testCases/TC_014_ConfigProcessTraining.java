package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigProcessTraining;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_014_ConfigProcessTraining extends BaseClassTest {

	
	@Test(dataProvider = "DD1",priority=1, description = "Assign SOP")
	public void assignSOP(String TraineeName,String SOP, String Trainer, String StartDate, String EndDate) throws IOException, InterruptedException
	{
		ConfigProcessTraining cp = new ConfigProcessTraining(driver);
		cp.clickOnConfigProcessTraining();
		cp.searchByName(TraineeName);
		cp.selUser(TraineeName);
		cp.assignTraining(SOP, Trainer, StartDate, EndDate);
		Assert.assertEquals(cp.Alert(),"Invited successfully");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\ConfigProcessTraining.xlsx";
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
