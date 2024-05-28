package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DMS.pageObjects.ConfigBookmarkSign;

import Base.BaseClassTest;

public class TC_006_ConfigBookmarkSign extends BaseClassTest {

	@Test(priority=1, description = "Create document type")
	public void createDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.clickOnConfigBookmark();
		cb.createDocumentType("Policy Document");
		Assert.assertEquals(cb.Alert(),"Document Type added successfully");
	
	}
	
	@Test(priority=2, description = "Edit document type")
	public void editDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.docTypeSearch("Policy Document");
		cb.editDocType1("Policy Document");
		cb.editDocType2("Policy Document New");
		Assert.assertEquals(cb.Alert(),"Are you sure you want to update the details?");
		Thread.sleep(2000);
		Assert.assertEquals(cb.Alert(),"Updated successfully");
	}
	
	@Test(priority=3, description = "Add bookmark")
	public void addBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.addBookmark1("Policy Document New");
		cb.addBookmark2("QA");
		Assert.assertEquals(cb.Alert(),"Bookmark details added successfully");
		
	}
	
	@Test(priority=4, description = "Edit book mark")
	public void editBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.editBookmark1("QA");
		cb.editRole();
		cb.editBookmark2("Quality_Analyst");
		Assert.assertEquals(cb.Alert(),"Bookmark details updated successfully");
		
	}
	
	@Test(priority=5, description = "Delete book mark")
	public void deleteBookmark() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		//cb.deleteBookmark1("Quality Analyst");
		cb.deleteRole();
		Assert.assertEquals(cb.Alert(),"Are you sure you want to delete this bookmark?");
		
		cb.closeBookmarkWndow();	
	}
	
	@Test(priority=6, description = "Delete document type")
	public void deleteDocumentType() throws IOException, InterruptedException
	{
		ConfigBookmarkSign cb = new ConfigBookmarkSign(driver);
		cb.deletDocumentType("Policy Document New");
		Assert.assertEquals(cb.Alert(),"Are you sure you want to delete this Document Type?");
		Assert.assertEquals(cb.Alert(),"Document Type Deleted");
	}
	

}
