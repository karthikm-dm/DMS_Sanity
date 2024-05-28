
package com.DMS.testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.DMS.pageObjects.Departments;
import com.DMS.pageObjects.MyFiles;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_008_MyFiles extends BaseClassTest {

	
	@Test(priority=1, description = "Main folder creation")
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnMyFiles();
		mf.FolderCreation("DMSEIDSA");
		Assert.assertEquals(mf.Alert(),"Folder created successfully.");
	}
	
	@Test(priority=2, description = "Clone")
	public void MainFolder_Clone() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.cloneFolder("Folder,permission and files","F2","My Files");
		Assert.assertEquals(mf.Alert(),"Are you sure you want to move the folder?");
		Assert.assertEquals(mf.Alert(),"Folder cloned successfully");
	}
	
	
	@Test(priority=3, description = "Set permissions to the folder")
	public void MainFolderPermission() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.permissionsFolder("Quality Analyst");
		Assert.assertEquals(mf.Alert(),"Permission added successfully");
		
	}
	
	@Test(priority=4, description = "Share the folder")
	public void MainFolderShare() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.ShareFolder("Quality Analyst");
		Assert.assertEquals(mf.Alert(),"Folder shared successfully");
	}
	
	@Test(priority=5, description = "Create control form")
	public void MainFolder_Create() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.controlForm("101","High","F1","NA","NA","NA","Neethumol PS","Neethug G","Neethur R");
		Assert.assertEquals(mf.Alert(),"Critical change control form created successfully");
	}
	
	@Test(priority=6, description = "Delete the folder")
	public void MainFolderDelete() throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.clickOnKebabMenu2("DMSEIDSA");
		mf.deleteFolder();
		Assert.assertEquals(mf.Alert(),"Are you sure you want to delete this folder ?");
		Assert.assertEquals(mf.Alert(),"All the folders and documents under this folder will be deleted ?");
		Assert.assertEquals(mf.Alert(),"Folder deleted successfully");
	} 
	
	@Test(dataProvider = "DD1", priority=7, description = "Archive the folder")
	public void MainFolderArchive(String Name) throws IOException, InterruptedException
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation(Name);
		Assert.assertEquals(mf.Alert(),"Folder created successfully");
		mf.clickOnKebabMenu2(Name);
		mf.archiveFolder();
		Assert.assertEquals(mf.Alert(),"Are you sure you want to archive this folder?");
		Assert.assertEquals(mf.Alert(),"By archiving the folder, the selected folder, subfolder(s), and the documents inside the folder(s) will be archived.");
		Assert.assertEquals(mf.Alert(),"Folder archived successfully");
	}
	
	
	@Test(priority=8, description = "Upload the document")
	public void UploadDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.FolderCreation("DMS04");
		Assert.assertEquals(mf.Alert(),"Folder created successfully");

		mf.selFolder2("DMS04");
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(2000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		Assert.assertEquals(mf.Alert(),"Document saved successfully");
		Thread.sleep(2000);
		mf.createDocumentIcon();
		mf.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(2000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(2).docx");
		Assert.assertEquals(mf.Alert(),"Document saved successfully");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)");
	}
	
	
	@Test(priority=9, description = "Add permissions to the document")
	public void PermissionDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.permissionDoc("Quality Analyst");
		Assert.assertEquals(mf.Alert(),"Permission added successfully");
	}
	
	@Test(priority=10, description = "Share the document")
	public void ShareDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.shareDoc("Quality Analyst");
		Assert.assertEquals(mf.Alert(),"Document shared successfully");
	}
	
	@Test(priority=11, description = "Delete the document")
	public void DeleteDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(1).docx");
		mf.deleteDoc();
		Assert.assertEquals(mf.Alert(),"Document deleted successfully");
	}
	
	@Test(priority=12, description = "Archive the document")
	public void ArchiveDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.documentActions("UAT EIDSA - E-Consent(2).docx");
		mf.archiveDoc();
		
		Assert.assertEquals(mf.Alert(),"Are you sure you want to archive this document ?");
		Assert.assertEquals(mf.Alert(),"Document archived successfully");
		Thread.sleep(4000);
	}
	
	@Test(priority=13, description = "Add signers to the document") 
	public void addSignersToTheDocument() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.createDocumentIcon();
		mf.fillDocument_addSigners("DA", "Neethumol PS", "V1.1","UAT Test script","Neethumol PS","Neethu Tester","Neethug G");
		Thread.sleep(4000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		
		Assert.assertEquals(mf.Alert(),"Document saved successfully");
		Thread.sleep(1000);
	}
	
	@Test(priority=14, description = "Edit signers to the document")
	public void editSigners_Document() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.selDoc1();
		mf.addSigners("Neethur R");
		Assert.assertEquals(mf.Alert(),"Signers updated successfully");

	}
	
	@Test(dataProvider = "DD2",priority=15, description = "Sign the document")
	public void signDocument(String UserName,String Password,String Remarks) throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		mf.signDocument(UserName,Password,Remarks);
		Assert.assertEquals(mf.Alert(),"Signature added successfully");
		Thread.sleep(10000);
	}
	
	@Test(priority=16, description = "Set approver to the document")
	public void setApprover_Document() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentApprovalDoc("Quality Analyst");
		
		Assert.assertEquals(dp.Alert(),"Updated successfully");
		Thread.sleep(1000);
	}

	
	@Test(priority=17, description = "Add new version")
	public void addNewVersion() throws Exception
	{
		MyFiles mf = new MyFiles(driver);
		Thread.sleep(10000);
		mf.addNewVersion("DA", "V1.2");
		Thread.sleep(4000);
		mf.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		Assert.assertEquals(mf.Alert(),"Document saved successfully");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\MyFiles.xlsx";
		int rownum=XLUtility.getRowCount(path, "MainFolArchive");
	int colcount=XLUtility.getCellCount(path, "MainFolArchive", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "MainFolArchive", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\SignDocument.xlsx";
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
