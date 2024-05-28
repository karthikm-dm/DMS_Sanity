package com.DMS.testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.Departments;
import com.DMS.pageObjects.ProjectPage;
import com.DMS.pageObjects.UsersPage;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_007_Departments extends BaseClassTest {

	@Test(dataProvider = "DD1",priority=1, description = "Create department")
	public void mainDepartmentCreation(String Name) throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnDepartment();
		dp.createDepartment(Name);
		Assert.assertEquals(dp.Alert(),"Department created successfully");
		driver.navigate().refresh();
	}
	
	@Test(dataProvider = "DD2",priority=2, description = "Create sub department")
	public void subDepartmentCreation(String Name) throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("DMS01");
		dp.createDepartment(Name);
		Assert.assertEquals(dp.Alert(),"Department created successfully");
			
	}
	
	@Test(priority=3, description = "Main folder creation")
	public void mainFolderCreation() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		Thread.sleep(3000);
		dp.selDepartment("DMS01");
		Thread.sleep(3000);
		dp.FolderCreation("Fol1");
		Assert.assertEquals(dp.Alert(),"Folder created successfully");
	}
	
	@Test(priority=4, description = "Clone")
	public void MainFolder_Clone() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.cloneFolder("Folder,permission and files","F1","My Files");
		Assert.assertEquals(dp.Alert(),"Are you sure you want to move the folder?");
		Assert.assertEquals(dp.Alert(),"Folder cloned successfully");
	}
	
	
	@Test(priority=5, description = "Set permissions to the folder")
	public void MainFolder_Permission() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.permissionsFolder("Quality Analyst");
		Assert.assertEquals(dp.Alert(),"Permission added successfully");
	}
	
	@Test(priority=6, description = "Share the folder")
	public void MainFolder_Share() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.ShareFolder("Quality Analyst");
		
		Assert.assertEquals(dp.Alert(),"Folder shared successfully");
	}
	
	@Test(priority=7, description = "Create control form")
	public void MainFolder_Create() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.controlForm("101","High","F1","NA","NA","NA","Neethumol PS","Neethug G","Neethur R");
		
		Assert.assertEquals(dp.Alert(),"Critical change control form created successfully");
	}
	
	@Test(priority=8, description = "Delete the folder")
	public void MainFolder_Delete() throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.clickOnKebabMenu2("Fol1");
		dp.deleteFolder();
		
		Assert.assertEquals(dp.Alert(),"Are you sure you want to delete this folder ?");
		Assert.assertEquals(dp.Alert(),"All the folders and documents under this folder will be deleted ?");
		Assert.assertEquals(dp.Alert(),"Folder deleted successfully");
	
	} 
	
	@Test(dataProvider = "DD3", priority=9, description = "Archive the folder")
	public void MainFolder_Archive(String Name) throws IOException, InterruptedException
	{
		Departments dp = new Departments(driver);
		dp.FolderCreation(Name);
		
		Assert.assertEquals(dp.Alert(),"Folder created successfully");
		dp.clickOnKebabMenu2(Name);
		dp.archiveFolder();
		
		Assert.assertEquals(dp.Alert(),"Are you sure you want to archive this folder?");
		Assert.assertEquals(dp.Alert(),"By archiving the folder, the selected folder, subfolder(s), and the documents inside the folder(s) will be archived.");
		Assert.assertEquals(dp.Alert(),"Folder archived successfully");
	}
	
	@Test(priority=10, description = "Upload the document")
	public void UploadDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.selDepartment("DMS01");
		dp.FolderCreation("Fold4");
		
		Assert.assertEquals(dp.Alert(),"Folder created successfully");
		
		dp.selFolder2("Fold4");
		dp.addDocumentIcon();
		dp.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		
		Assert.assertEquals(dp.Alert(),"Document saved successfully");
		
		Thread.sleep(2000);
		dp.addDocumentIcon();
		dp.fillDocument("D1", "Neethumol PS", "V1.1");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(2).docx");
		
		Assert.assertEquals(dp.Alert(),"Documents saved successfully");
		
		Thread.sleep(2000);
	}
	
	
	@Test(priority=11, description = "Set permissions to the document")
	public void document_Permission() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("UAT EIDSA - E-Consent(1).docx");
		dp.permissionDoc("Quality Analyst");
		
		Assert.assertEquals(dp.Alert(),"Permission added successfully");
		
	}
	
	@Test(priority=12, description = "Share the document")
	public void document_Share() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("UAT EIDSA - E-Consent(1).docx");
		dp.shareDoc("Quality Analyst");
		
		Assert.assertEquals(dp.Alert(),"Document shared successfully");
	}
	
	@Test(priority=13, description = "Delete the document")
	public void document_Delete() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("UAT EIDSA - E-Consent(1).docx");
		dp.deleteDoc();
		
		Assert.assertEquals(dp.Alert(),"Document deleted successfully");
	}
	
	@Test(priority=14, description = "Archive the document")
	public void document_Archive() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentActions("UAT EIDSA - E-Consent(2).docx");
		dp.archiveDoc();
		
		Assert.assertEquals(dp.Alert(),"Are you sure you want to archive this document ?");
		Assert.assertEquals(dp.Alert(),"Document archived successfully");
		
	}
	
	@Test(priority=15, description = "Add signers to the document") 
	public void addSignersToTheDocument() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.addDocumentIcon();
		dp.fillDocument_addSigners("DR", "Neethumol PS", "V1.1","UAT Test script","Neethumol PS","Neethu Tester","Neethug G");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(3).docx");
		
		Assert.assertEquals(dp.Alert(),"Document saved successfully");
		Thread.sleep(1000);
	}
	
	@Test(priority=16, description = "Edit signers")
	public void signersEdit() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.selDoc("UAT EIDSA - E-Consent(3).docx");
		dp.addSigners("Neethur R");
		
		Assert.assertEquals(dp.Alert(),"Signers updated successfully");
		
	}
	
	@Test(dataProvider = "DD4", priority=17, description = "Sign document")
	public void signDocument(String UserName,String Password,String Remarks) throws Exception
	{
		Departments dp = new Departments(driver);
		dp.signDocument(UserName,Password,Remarks);
		
		Assert.assertEquals(dp.Alert(),"Signature added successfully");
		
		Thread.sleep(10000);
	}
	
	@Test(priority=18, description = "Set approvers to the document")
	public void setApprover_Document() throws Exception
	{
		Departments dp = new Departments(driver);
		dp.documentApprovalDoc("Quality Analyst");
		
		Assert.assertEquals(dp.Alert(),"Updated successfully");
		Thread.sleep(1000);
	}

	
	@Test(priority=19, description = "Add new version")
	public void addNewVersion_Doc() throws Exception
	{
		Departments dp = new Departments(driver);
		Thread.sleep(7000);
		dp.addNewVersion("DR", "V1.2");
		Thread.sleep(4000);
		dp.uploadDoc("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
		
		Assert.assertEquals(dp.Alert(),"Document saved successfully");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-300)");
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Departments.xlsx";
		int rownum=XLUtility.getRowCount(path, "DepCreation");
	int colcount=XLUtility.getCellCount(path, "DepCreation", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "DepCreation", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Departments.xlsx";
		int rownum=XLUtility.getRowCount(path, "SubDepCreation");
	int colcount=XLUtility.getCellCount(path, "SubDepCreation", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "SubDepCreation", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD3")
	 String [][] getData3() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Departments.xlsx";
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
	
	@DataProvider(name="DD4")
	 String [][] getData4() throws IOException
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
