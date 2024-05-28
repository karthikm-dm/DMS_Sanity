package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.MyFiles;

import Base.BaseClassTest;

public class TC_016_MergeFiles extends BaseClassTest {

	@Test(priority=1, description = "Merge Files from DMS")
	public void mergeFiles_DMS() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.selFolder2("Merge Files");
		mf.mergeFile_DMS("My Files");
		Assert.assertEquals(mf.Alert(),"Files merged successfully");
		
			
	}
	
	@Test(priority=2, description = "Merge Files from local system")
	public void mergeFiles_Local() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.selFolder2("Merge Files");
		mf.mergeFile_local("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(6).pdf");
		Assert.assertEquals(mf.Alert(),"Files merged successfully");

	}

}
