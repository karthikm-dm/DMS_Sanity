package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.Dashboard;

import Base.BaseClassTest;

public class TC_017_Dashboard extends BaseClassTest {

	@Test(priority=1, description = "Approve training plan")
	public void approveTrainingPlan() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.sign_ApproveTrainingPlan("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		Assert.assertEquals(db.Alert(),"Signed successfully");
		db.Dashboard2();
	}
	
	@Test(priority=2, description = "Sign document")
	public void signDocument() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signDocument("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		Assert.assertEquals(db.Alert(),"Signature added successfully");
		db.Dashboard2();
	}
	
	@Test(priority=3, description = "Sign process training acknowledgement")
	public void signProcessTrainingAcknowledgement() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signProcessTrainingAcknowledgement("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		Assert.assertEquals(db.Alert(),"You have Digi-signed successfully");
		db.Dashboard2();
	}
	
	@Test(priority=4, description = "Sign online test report")
	public void signOnlineTestReport() throws IOException, InterruptedException
	{
		Dashboard db = new Dashboard(driver);
		db.signOnlineTestReport("neethumolp@datamatica.uk", "Neethu@12345", "Approval");
		Assert.assertEquals(db.Alert(),"Signed successfully");
		db.Dashboard2();
	}
	

}
