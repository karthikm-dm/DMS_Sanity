package com.DMS.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.DocumentApprovals;
import com.DMS.pageObjects.LoginPage;
import com.DMS.pageObjects.MyFiles;
import com.DMS.utilities.XLUtility;

import Base.BaseClass;

public class TC_010_DocumentApprovals extends BaseClass {
	
	@Test(dataProvider = "DD1",priority=1, description = "Approve the document")
	public void viewDocumet_Approval(String email,String password) throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		DocumentApprovals da = new DocumentApprovals(driver);
		da.clickOnApprovals();
		da.statusSearch("Pending");
		da.documentTitleSearch("DA");
		da.selView("DA");
		da.viewStatus_approve("Approved");
		Assert.assertEquals(da.Alert(),"Are you sure you want to approve the document?");
		Assert.assertEquals(da.Alert(),"The document approved successfully.");
		da.clickOnApprovals();
		
	}

	@Test(priority=2, description = "Reject the document")
	public void viewDocumet_Reject() throws IOException, InterruptedException
	{
		DocumentApprovals da = new DocumentApprovals(driver);
		da.statusSearch("Pending");
		da.documentTitleSearch("DR");
		da.selView("DR");
		da.viewStatus_reject("Rejected");
		
		Assert.assertEquals(da.Alert(),"Are you sure you want to reject the document?");
		Assert.assertEquals(da.Alert(),"The document rejected successfully.");
		da.clickOnApprovals();	
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\DocumentApproval.xlsx";
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
