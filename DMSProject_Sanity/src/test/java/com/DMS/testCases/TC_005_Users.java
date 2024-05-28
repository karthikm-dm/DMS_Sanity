package com.DMS.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DMS.pageObjects.UsersPage;
import com.DMS.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_005_Users extends BaseClassTest {

	@Test(dataProvider = "DD1",priority=1, description = "Create user")
	public void usersPage(String FirstName, String LastName, String UserName, String Email) throws IOException, InterruptedException
	{
		UsersPage up = new UsersPage(driver);
		up.clickUsers();
		up.clickCreateUsers(FirstName, LastName, UserName, Email);
		Assert.assertEquals(up.Alert(),"User created successfully");
		
	}
	
	@Test(dataProvider = "DD2",priority=2, description = "Delete user")
	public void delete(String Name) throws IOException, InterruptedException
	{		
		UsersPage up = new UsersPage(driver);
		up.nameSearch(Name);
		up.delete(Name);
		Assert.assertEquals(up.Alert(),"Are you sure you want to delete this user?");
		Assert.assertEquals(up.Alert(),"User Deleted");
		
	}
	
	@DataProvider(name="DD1")
	 String [][] getData1() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Users.xlsx";
		int rownum=XLUtility.getRowCount(path, "UserCreation");
	int colcount=XLUtility.getCellCount(path, "UserCreation", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "UserCreation", i, j);
		}
	}
	
	return data;	

	}
	
	@DataProvider(name="DD2")
	 String [][] getData2() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\NeethumolPS\\Desktop\\DMS\\Users.xlsx";
		int rownum=XLUtility.getRowCount(path, "UserDeletion");
	int colcount=XLUtility.getCellCount(path, "UserDeletion", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "UserDeletion", i, j);
		}
	}
	
	return data;	

	}
	
	

}
