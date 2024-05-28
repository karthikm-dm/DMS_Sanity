package com.DMS.pageObjects;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.AbstractComponents.AbstractComponent;
import java.time.Duration;
import org.openqa.selenium.Alert;
//import org.testng.Assert;
import org.openqa.selenium.NoAlertPresentException;

public class UsersPage extends AbstractComponent{
	static WebDriver driver;
	public UsersPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Users menu
	@FindBy(xpath="//a[@href='/administration']//img[@alt='projects menu']")
	WebElement administration;	
	@FindBy(xpath="//b[normalize-space()='Users']")
	WebElement usersMenu;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> Name;
	@FindBy(xpath="//td[2]")
	List<WebElement> Email;
	@FindBy(xpath="//td[3]")
	List<WebElement> Designation;
	@FindBy(xpath="//td[4]")
	List<WebElement> Department;
	@FindBy(xpath="//td[5]")
	List<WebElement> CreatedDate;
	@FindBy(xpath="//td[6]")
	List<WebElement> Active;
	@FindBy(xpath="//td[7]")
	List<WebElement> Edit;
	@FindBy(xpath="//td[8]")
	List<WebElement> Delete;
	
	//Search
	@FindBy(xpath="//label[contains(text(),'Name')]//following-sibling::input[1]")
	WebElement nameSearch;
	@FindBy(xpath="//label[contains(text(),'Designation')]//following-sibling::select")
	WebElement designationSearch;
	@FindBy(xpath="//label[contains(text(),'Department')]//following-sibling::select")
	WebElement departmentSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement Search;
	
	//Create user
	@FindBy(xpath="//img[@alt='Create Designation']")
	WebElement createUser;
	@FindBy(xpath="//img[@alt='export_icon']")
	WebElement uploadUser;
	@FindBy(xpath="//label[contains(text(),'First Name')]//following-sibling::input[1]")
	WebElement firstName;
	@FindBy(xpath="//label[contains(text(),'Last Name')]//following-sibling::input[1]")
	WebElement lastName;
	@FindBy(xpath="//label[contains(text(),'Username')]//following-sibling::input[1]")
	WebElement userName;
	@FindBy(xpath="//label[contains(text(),'Primary Email')]//following-sibling::input[1]")
	WebElement primaryEmail;
	@FindBy(xpath="//label[contains(text(),'Secondary Email')]//following-sibling::input[1]")
	WebElement secondaryEmail;
	@FindBy(xpath="//label[contains(text(),'Phone Number')]//following-sibling::input[1]")
	WebElement phoneNumber;
	@FindBy(xpath="//label[contains(text(),'Designation')]//following-sibling::select")
	WebElement designation;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]")
	WebElement department1;
	@FindBy(xpath="//li[@aria-label='QA']")
	WebElement department2a;
	@FindBy(xpath="//li[@aria-label='AD34']")
	WebElement department2b;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/div[1]/span[2]")
	WebElement department3;
	@FindBy(xpath="//label[contains(text(),'User Type')]//following-sibling::select")
	WebElement userType;
	@FindBy(xpath="//input[@type='date']")
	WebElement dateOfBirth;
	@FindBy(xpath="//label[contains(text(),'Country')]//following-sibling::select")
	WebElement country;
	@FindBy(xpath="//label[contains(text(),'Address Line One')]//following-sibling::input[1]")
	WebElement addressLineOne;
	@FindBy(xpath="//label[contains(text(),'Address Line Two')]//following-sibling::input[1]")
	WebElement addressLineTwo;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active;
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	WebElement clear;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	
	
	
	public void clickUsers() throws InterruptedException
	{		
		Thread.sleep(3000);
		administration.click();
		Thread.sleep(3000);
		usersMenu.click();
		Thread.sleep(3000);		
	}
	public void clickCreateUsers(String fName,String lName,String uName,String pEmail) throws InterruptedException
	{		
		Thread.sleep(3000);
		createUser.click();
		Thread.sleep(2000);	
		firstName.sendKeys(fName);
		Thread.sleep(2000);	
		lastName.sendKeys(lName);
		Thread.sleep(2000);	
		userName.sendKeys(uName);
		Thread.sleep(2000);	
		primaryEmail.sendKeys(pEmail);
		Thread.sleep(2000);
		Select os = new Select(designation);
		os.selectByVisibleText("Quality Analyst");
		Thread.sleep(2000);
		department1.click();
		Thread.sleep(2000);
		department2a.click();
		Thread.sleep(2000);
		department3.click();
		Select os1 = new Select(userType);
		os1.selectByVisibleText("Internal");
		Thread.sleep(2000);
		save.click();
		
	}
	
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
//	public static boolean creationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("User created successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	
//	public static boolean editAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("User details updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean deleteAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains(""));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("User Deleted"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
	
	
	public void edit(String name) throws InterruptedException
	{
		for(int i=0;i<Name.size();i++)
		{
			String text=Name.get(i).getText();
			if(text.equals(name))
			{
				Edit.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void delete(String name) throws InterruptedException
	{
		for(int i=0;i<Name.size();i++)
		{
			String text=Name.get(i).getText();
			if(text.equals(name))
			{
				Delete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
	public void nameSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		nameSearch.sendKeys(name);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void DesignationSearch(String des) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(designationSearch);
		os.selectByVisibleText(des);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
		
	}
	
	public void DepartmentSearch(String dep) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(departmentSearch);
		os.selectByVisibleText(dep);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
		
	}
	
	
	public void edituser1(String eName) throws InterruptedException
	{
		Thread.sleep(2000);
		firstName.clear();
		Thread.sleep(2000);
		firstName.sendKeys(eName);
		Thread.sleep(2000);
		save.click();
		
	}
	
	public void edituser2() throws InterruptedException
	{
		Thread.sleep(2000);
		department1.click();
		Thread.sleep(2000);
		department2b.click();
		Thread.sleep(2000);
		department3.click();
		save.click();
		
	}
	
	public Boolean nameValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =Name.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<Name.size();i++)
			{
				String stat=Name.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean designationValidation(String des) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =Designation.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<Designation.size();i++)
			{
				String stat=Designation.get(i).getText();
				if (!(stat.contains(des))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean departmentValidation(String dep) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =Department.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<Department.size();i++)
			{
				String stat=Department.get(i).getText();
				if (!(stat.contains(dep))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	
}
