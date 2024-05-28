package com.DMS.pageObjects;

import java.io.File;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class ProjectPage extends AbstractComponent{
	static WebDriver driver;
	public ProjectPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Users menu
	@FindBy(xpath="//img[@alt='projects menu']")
	WebElement projectsMenu;
	
	//Project creation
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement createProjectIcon;
	@FindBy(xpath="//label[contains(text(),'Project name')]//following-sibling::input[1]")
	WebElement projectName;
	@FindBy(xpath="//label[contains(text(),'Project code')]//following-sibling::input[1]")
	WebElement projectCode;
	@FindBy(tagName="select")
	WebElement projectType;
	@FindBy(xpath="//textarea[@class='form-control mb-2']")
	WebElement description;
	@FindBy(xpath="//input[@value='true']")
	WebElement active;
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	WebElement clear;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save1;
	
	//project list
	@FindBy(xpath="//div[@id='primaryTree']")
	List<WebElement> projectsList;
	
	@FindBy(xpath="//a[@id='document']")
	WebElement document;
	
	//options from kebab menu of project
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	List<WebElement> kebabMenu1;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement edit1;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archive1;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete1;
	
	//create folder
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement createFolder;
	@FindBy(xpath="//label[contains(text(),'Folder Name')]//following-sibling::input[1]")
	WebElement folderName;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	WebElement selectFormat1;
	@FindBy(xpath="//li[@id='format-multiselect-option-docx']")
	WebElement selectFormat2;
	@FindBy(xpath="//li[@id='format-multiselect-option-xlsx']")
	WebElement selectFormat3;
	@FindBy(xpath="//li[@id='format-multiselect-option-pdf']")
	WebElement selectFormat4;
	@FindBy(xpath="(//input[@id='password'])[1]")
	WebElement prefix;
	@FindBy(xpath="(//input[@id='password'])[2]")
	WebElement majVer;
	@FindBy(xpath="(//input[@id='password'])[3]")
	WebElement minVer;
	@FindBy(xpath="(//input[@id='password'])[4]")
	WebElement minMax;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save2;
	@FindBy(xpath="//body/div[@id='app']/div/div[@class='pace-done body-small']/div[@id='wrapper']/div[@id='page-wrapper']/div[@class='wrapper wrapper-content']/div[@class='row']/div[@class='create-folder-modal']/div[@class='folder-modal-container']/div[@class='ibox-content p-4']/div[@class='form-group pt-2']/span[1]")
	WebElement save3;
	
	//kebab options from main folder
	@FindBy(xpath="//label[@class='tree_label tree_label']") 
	List<WebElement> FoldersList1;
	@FindBy(xpath="//li[@class='d-flex justify-content-between']") 
	List<WebElement> FoldersList2;
	@FindBy(xpath="//i[@class='fa fa-ellipsis-v mr-3']")
	List<WebElement> kebabMenu2;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement edit2;
	@FindBy(xpath="//div[contains(text(),'Send to')]")
	WebElement sendTo2;
	@FindBy(xpath="//div[contains(text(),'Permissions')]")
	WebElement permissions2;
	@FindBy(xpath="//div[contains(text(),'Share')]")
	WebElement share2;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement delete2;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archive2;
	
	//Send To - main folder
	@FindBy(xpath="//label[contains(text(),'Select Department')]//following-sibling::select")
	WebElement selectDepartment1;
	@FindBy(xpath="//label[contains(text(),'QA')]")
	WebElement selectDepartment2;
	@FindBy(xpath="//button[contains(text(),'Move')]")
	WebElement move;
	
	//permissions - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole1;
	@FindBy(xpath="//input[@id='4bb7c35e-0e56-4813-82dd-a724b45768bd']")
	WebElement name1;
	@FindBy(xpath="//input[@id='9bb335ad-d9c4-4c8a-926a-7b39ec12ef1f']")
	WebElement name2;
	//@FindBy(xpath="//input[@id='9b3b3ae4-70be-4bd5-870e-a99f44b00af3']")
	//WebElement name3;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save4;
	
	//share - main folder
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole2;
	@FindBy(xpath="//button[normalize-space()='Share']")
	WebElement share3;
	
	//share - document
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement sharedoc;
	
	//Sub folder creation
	@FindBy(xpath="//label[@class='tree_label tree_label']")
	List<WebElement> clickOnSubFolder;
	@FindBy(xpath="//div[@class='px-2 more-option-icon cursor-pointer']")
	List<WebElement> kebabMenu3;
	
	//Document screen
	@FindBy(xpath="//td[1]")
	List<WebElement> docList;
	@FindBy(xpath="//img[@alt='Add a file']")
	WebElement createDocIcon;	
	@FindBy(xpath="//label[contains(text(),'Title')]//following-sibling::input[1]")
	WebElement docTitle;
	@FindBy(xpath="//select[@id='owner']")
	WebElement docowner;
	@FindBy(xpath="//textarea[@id='document description']")
	WebElement documentDescription;
	@FindBy(xpath="//select[@id='department']")
	WebElement department;
	@FindBy(xpath="//select[@id='category']")
	WebElement catagory;
	@FindBy(xpath="//select[@id='standard']")
	WebElement standard;
	@FindBy(xpath="//select[@id='document type']")
	WebElement doctype;
	@FindBy(xpath="//label[contains(text(),'Version')]//following-sibling::input[1]")
	WebElement docversion;
	@FindBy(xpath="//input[@id='expiry date']")
	WebElement expiryDate;
	@FindBy(xpath="//textarea[@id='changesHistory']")
	WebElement changesHistory;
	@FindBy(xpath="//button[normalize-space()='Browse']")
	WebElement browsedoc;
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveDoc;
	@FindBy(xpath="//div[@id='primaryDocumentTree']//tr")
	List<WebElement> documents;	
	@FindBy(xpath="//div[@id='primaryDocumentTree']//tr//i")
	List<WebElement> documentoptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editDoc;
	@FindBy(xpath="//div[contains(text(),'Send to')]")
	WebElement sendToDoc;
	@FindBy(xpath="//div[contains(text(),'Permissions')]")
	WebElement permissionsDoc;
	@FindBy(xpath="//div[contains(text(),'Share')]")
	WebElement shareDoc;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteDoc;
	@FindBy(xpath="//div[contains(text(),'Archive')]")
	WebElement archiveDoc;
	
	@FindBy(xpath="//input[@id='flexCheckDefault']")
	WebElement addSignersDoc;
	@FindBy(xpath="//table[@class='table table-striped table-bordered dataTables']//td[1]")
	WebElement signingOrderDoc;
	@FindBy(xpath="//table[@class='table table-striped table-bordered dataTables']//td[2]")
	WebElement bookMarkDoc;
	@FindBy(id="//table[@class='table table-striped table-bordered dataTables']//td[3]")
	WebElement userDoc;
	
	@FindBy(xpath="(//select[@id='user'])[1]")
	WebElement select1;
	@FindBy(xpath="(//select[@id='user'])[2]")
	WebElement select2;
	@FindBy(xpath="(//select[@id='user'])[3]")
	WebElement select3;
	
	//Open document - add signers
	@FindBy(xpath="(//img[@alt='create version'])[1]")
	WebElement addSignersUpdateDoc;
	@FindBy(xpath="(//img[@alt='create version'])[2]")
	WebElement approvalsDoc;
	@FindBy(xpath="//div[@class='wrapper wrapper-content']//div[3]//div[1]//img[1]")
	WebElement signDocumentDoc;
	@FindBy(xpath="(//img[@alt='Edit document'])[1]")
	WebElement downloadDoc;
	@FindBy(xpath="(//img[@alt='Edit document'])[2]")
	WebElement PrintDoc;
	@FindBy(xpath="//div[@class='position-relative my-0 py-0 align-self-center']//img[@alt='create version']")
	WebElement addNewVersionDoc;
			
	@FindBy(xpath="(//select[@aria-label='.form-select-lg example'])[1]")
	WebElement user1;
	@FindBy(xpath="(//select[@aria-label='.form-select-lg example'])[2]")
	WebElement user2;
	@FindBy(xpath="(//select[@aria-label='.form-select-lg example'])[3]")
	WebElement user3;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement SubmitDoc;
			
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement emailDoc;
	@FindBy(xpath="//input[@id='templatePassword']")
	WebElement passwordDoc;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reasonDoc;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submitSignDocumentDoc;
	
	@FindBy(xpath="//select[@name='account']")
	WebElement chooseRoleApproval;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement usersApproval1;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	WebElement usersApproval2;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveApproval;
			
	
	//Profile
	@FindBy(xpath="//a[@id='profile']")
	WebElement profile;
	@FindBy(xpath="//img[@alt='Create project role']")
	WebElement addProjectRole;
	@FindBy(xpath="//label[contains(text(),'Role')]//following-sibling::input[1]")
	WebElement role;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveRole1;
	@FindBy(xpath="//div[@class='project-list']//tr")
	List<WebElement> roleList;
	@FindBy(xpath="//div[@class='project-list']//tr//i")////i[@class='fa fa-ellipsis-v']
	List<WebElement> roleOptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editRole;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteRole;
	@FindBy(xpath="//a[contains(text(),'Yes')]")
	WebElement yes;
	@FindBy(xpath="//button[@class='btn btn-primary'][normalize-space()='Save']")
	WebElement saveRole2;
	@FindBy(xpath="//img[@alt='Create Project User']")
	WebElement createUser;
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement chooseRole;
	@FindBy(xpath="//div[@id='tab-2']/div/div/div/div/div[2]/div[3]/div/div/div[2]/div")
	WebElement chooseUser1;
	@FindBy(xpath="//span[normalize-space()='Neethu Tester']")
	WebElement chooseUser2a;
	@FindBy(xpath="//span[normalize-space()='Neethug G']")
	WebElement chooseUser2b;
	@FindBy(xpath="//span[normalize-space()='Neethur R']")
	WebElement chooseUser2c;
	@FindBy(xpath="//div[@id='tab-2']/div/div/div/div/div[2]/div[3]/div/div/div[2]/div/span[2]")
	WebElement chooseUser3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveUser;
	@FindBy(xpath="//div[@class='project-list1']//tr")
	List<WebElement> userList;
	@FindBy(xpath="//div[@class='project-list1']//tr//i")
	List<WebElement> userOptions;
	@FindBy(xpath="//div[contains(text(),'Edit')]")
	WebElement editUser;
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	WebElement deleteUser;
	@FindBy(xpath="//label[contains(text(),'Choose Role')]//following-sibling::select")
	WebElement changeUser;

	
	//Develpoment
	@FindBy(xpath="//a[@id='development']")
	WebElement development;
	@FindBy(xpath="//select[@name='account']")
	WebElement createNewDoc;
	@FindBy(xpath="(//img[@alt='create department'])[2]")
	WebElement devCreateFolder;
	
	//Create unit test document
	@FindBy(xpath="//input[@id='title']")
	WebElement title;
	@FindBy(xpath="//input[@id='Module Name']")
	WebElement moduleName;
	@FindBy(xpath="//input[@id='Story Id']")
	WebElement storyId;
	@FindBy(xpath="//input[@id='Development Start Date']")
	WebElement developmentStartDate;
	@FindBy(xpath="//input[@id='Development End Date']")
	WebElement developmentEndDate;
	@FindBy(xpath="//input[@id='Unit Test Start Date']")
	WebElement unitTestStartDate;
	@FindBy(xpath="//input[@id='Unit Test End Date']")
	WebElement unitTestEndDate;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[5]/div[1]/select[1]")
	WebElement moduleLead;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[6]/div[1]/select[1]")
	WebElement developerName;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[7]/div[1]/select[1]")
	WebElement unitTesterName;
	@FindBy(xpath="//input[@id='Hours Taken']")
	WebElement hoursTaken;
	@FindBy(xpath="//input[@id='Page Link']")
	WebElement pageLink;
	@FindBy(xpath="//textarea[@id='remarks']")
	WebElement remarks;
	@FindBy(xpath="//tbody/tr/td[1]/div[1]/div[1]/input[1]")
	WebElement acceptanceCriteria;
	@FindBy(xpath="(//input[@value='Pass'])[1]")
	WebElement pass1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement fail1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/img[1]")
	WebElement del;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
	WebElement addRow;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/img[1]")
	WebElement del1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs2;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/img[1]")
	WebElement del2;
	@FindBy(xpath="//tbody/tr[3]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes3;
	@FindBy(xpath="//tbody/tr[3]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no3;
	@FindBy(xpath="//tbody/tr[3]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments3;
	@FindBy(xpath="//tbody/tr[3]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs3;
	@FindBy(xpath="//tbody/tr[3]/td[5]/div[1]/img[1]")
	WebElement del3;
	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes4;
	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no4;
	@FindBy(xpath="//tbody/tr[4]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments4;
	@FindBy(xpath="//tbody/tr[4]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs4;
	@FindBy(xpath="//tbody/tr[4]/td[5]/div[1]/img[1]")
	WebElement del4;
	@FindBy(xpath="//tbody/tr[5]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes5;
	@FindBy(xpath="//tbody/tr[5]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no5;
	@FindBy(xpath="//tbody/tr[5]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments5;
	@FindBy(xpath="//tbody/tr[5]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs5;
	@FindBy(xpath="//tbody/tr[5]/td[5]/div[1]/img[1]")
	WebElement del5;
	@FindBy(xpath="//tbody/tr[6]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes6;
	@FindBy(xpath="//tbody/tr[6]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no6;
	@FindBy(xpath="//tbody/tr[6]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments6;
	@FindBy(xpath="//tbody/tr[6]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs6;
	@FindBy(xpath="//tbody/tr[6]/td[5]/div[1]/img[1]")
	WebElement del6;
	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes7;
	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no7;
	@FindBy(xpath="//tbody/tr[7]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments7;
	@FindBy(xpath="//tbody/tr[7]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs7;
	@FindBy(xpath="//tbody/tr[7]/td[5]/div[1]/img[1]")
	WebElement del7;
	@FindBy(xpath="//tbody/tr[8]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes8;
	@FindBy(xpath="//tbody/tr[8]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no8;
	@FindBy(xpath="//tbody/tr[8]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments8;
	@FindBy(xpath="//tbody/tr[8]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs8;
	@FindBy(xpath="//tbody/tr[8]/td[5]/div[1]/img[1]")
	WebElement del8;
	@FindBy(xpath="//tbody/tr[9]/td[2]/div[1]/div[1]/label[1]/input[1]")
	WebElement yes9;
	@FindBy(xpath="//tbody/tr[9]/td[2]/div[1]/div[1]/label[2]/input[1]")
	WebElement no9;
	@FindBy(xpath="//tbody/tr[9]/td[3]/div[1]/div[1]/input[1]")
	WebElement comments9;
	@FindBy(xpath="//tbody/tr[9]/td[4]/div[1]/div[1]/input[1]")
	WebElement bugs9;
	@FindBy(xpath="//tbody/tr[9]/td[5]/div[1]/img[1]")
	WebElement del9;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/img[1]")
	WebElement addRow2;
	@FindBy(xpath="//span[normalize-space()='Save & Sign']")
	WebElement saveAndSign;
	@FindBy(xpath="//span[normalize-space()='Submit & Sign']")
	WebElement submitAndSign;
	@FindBy(xpath="(//span[@class='submit_btn px-5 py-2'])[1]")
	WebElement saveDocument;
	
	//Sign document
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath="//input[@id='templatePassword']")
	WebElement password;
	@FindBy(xpath="//select[@id='reasons']")
	WebElement reason;
	@FindBy(xpath="//div[@class='text-center']//span[@type='button']")
	WebElement submit;
	
	//Web table
	@FindBy(xpath="//td[1]")
	List<WebElement> storyID;
	@FindBy(xpath="//td[2]")
	List<WebElement> name;
	@FindBy(xpath="//td[3]")
	List<WebElement> date;
	@FindBy(xpath="//td[4]")
	List<WebElement> documentName;
	@FindBy(xpath="//td[5]")
	List<WebElement> view;
	@FindBy(xpath="//td[6]")
	List<WebElement> Actions;
	
	//Add new version
	@FindBy(xpath="//div[@class='position-relative my-0 py-0 align-self-center']//img[@alt='create version']")
	WebElement addNewVersion;
	@FindBy(xpath="//label[contains(text(),'Title')]//following-sibling::input[1]")
	WebElement docTitle1;
	@FindBy(xpath="//select[@id='owner']")
	WebElement docowner1;
	@FindBy(xpath="//textarea[@id='description']")
	WebElement documentDescription1;
	@FindBy(xpath="//select[@id='department']")
	WebElement department1;
	@FindBy(xpath="//select[@id='category']")
	WebElement catagory1;
	@FindBy(xpath="//select[@id='standard']")
	WebElement standard1;
	@FindBy(xpath="//select[@id='document type']")
	WebElement doctype1;
	@FindBy(xpath="//label[contains(text(),'Version')]//following-sibling::input[1]")
	WebElement docversion1;
	@FindBy(xpath="//input[@for='expiry-date']")
	WebElement expiryDate1;
	@FindBy(xpath="//textarea[@id='changesHistory']")
	WebElement changesHistory1;
	@FindBy(xpath="//button[normalize-space()='Browse']")
	WebElement browsedoc1;
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveDoc1;
	
	//Download
	@FindBy(xpath="//div[@class='position-relative mr-2']//img[@alt='Edit document']")
	WebElement download;
	
	//Print
	@FindBy(xpath="//div[@class='position-relative']//img[@alt='Edit document']")
	WebElement printDoc;
	@FindBy(xpath="//*[@id=\"sidebar\"]//print-preview-button-strip//div/cr-button[2]")
	WebElement printCancel;
	
	//Sign document
	@FindBy(xpath="//div[@class='wrapper wrapper-content']//div[3]//div[1]//img[1]")
	WebElement signDocument;
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	WebElement enterPassword;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitDoc;
	
	//Document Approval
	@FindBy(xpath="//div[@class='wrapper wrapper-content']//div[3]//div[1]//img[1]")
	WebElement documentApproval;
	@FindBy(xpath="//select[@name='account']")
	WebElement selectRole;
	@FindBy(xpath="//input[@value='Neethumol P S']")
	WebElement selectedUser;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveUser1;
	
	//Add signers
	@FindBy(xpath="//div[@class='wrapper wrapper-content']//div[3]//div[1]//img[1]")
	WebElement addSigners;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div")
	WebElement selectUser1;
	@FindBy(xpath="//li[@id='multiselect-option-neethug@yopmail.com']")
	WebElement selectUser2;
	@FindBy(xpath="//li[@id='multiselect-option-neethumolp@datamatica.uk']")
	WebElement selectUser3;
	@FindBy(xpath="//li[@id='multiselect-option-neethur@yopmail.com']")
	WebElement selectUser4;
	@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div/div/span[2]")
	WebElement selectUser5;
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement addSignersSubmit;
	
	//Kebab options
	@FindBy(xpath="//div[normalize-space()='Edit']")
	WebElement editSavedDocument;
	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement deleteSavedDocument;
	@FindBy(xpath="//div[normalize-space()='New Version']")
	WebElement newVersionOfSavedDocument;
	
	//New version - Unit test
	@FindBy(xpath="//div[contains(text(),'New Version')]")
	WebElement newVersion;
	
	//Share-External User
	@FindBy(xpath="//div[normalize-space()='Share - External User']")
	WebElement externalUser;
	@FindBy(xpath="//input[@id='f2b8cf46-69fc-4bc3-920a-ccd89df1e7e9']")
	WebElement externalUserSel;//Sabu Test User
	@FindBy(xpath="//input[@id='expiry-date']")
	WebElement expiry_Date;
	@FindBy(xpath="//span[normalize-space()='Share']")
	WebElement share;
	
	//Clone
		@FindBy(xpath="//div[normalize-space()='Clone']")
		WebElement clone1;
		@FindBy(xpath="//select[@id='owner']")
		WebElement actionToclone;
		@FindBy(xpath="//input[@class='form-control']")
		WebElement fName1;
		@FindBy(xpath="//select[@class='form-control m-b']")
		WebElement location;
		@FindBy(xpath="//label[normalize-space()='DMS03']")
		WebElement fName2;
		@FindBy(xpath="//button[normalize-space()='Clone']")
		WebElement clone2;
		
		//Create control form
		@FindBy(xpath="//div[normalize-space()='Create']")
		WebElement control;
		@FindBy(xpath="//div[contains(text(),'Control Form')]")
		WebElement controlForm;
		@FindBy(xpath="(//input[@type='text'])[1]")
		WebElement changeNumber;
		@FindBy(xpath="(//input[@type='text'])[2]")
		WebElement riskLevel;
		@FindBy(xpath="(//input[@type='text'])[3]")
		WebElement fileName;
		@FindBy(xpath="(//input[@type='text'])[4]")
		WebElement systemsAffected;
		@FindBy(xpath="(//textarea[@id='ReasonChange'])[1]")
		WebElement reasonsForChange;
		@FindBy(xpath="(//textarea[@name='DescChange'])[1]")
		WebElement descriptionOfChange;
		@FindBy(xpath="(//textarea[@name='DescChange'])[2]")
		WebElement otherSystemsAffected;
		@FindBy(xpath="(//textarea[@name='DescChange'])[3]")
		WebElement testingRequired;
		@FindBy(xpath="//textarea[@id='rollBack']")
		WebElement rollBackPlan;
		@FindBy(xpath="(//select[@class='form-control'])[1]")
		WebElement requestedBy;
		@FindBy(xpath="(//select[@class='form-control'])[2]")
		WebElement reviewedBy;
		@FindBy(xpath="(//select[@class='form-control'])[3]")
		WebElement completedBy;
		@FindBy(xpath="//button[@type='submit']")
		WebElement saveControlForm;
		
		@FindBy(xpath="//a[normalize-space()='UAT EIDSA - E-Consent(3).docx']")
		WebElement docName;
		
		public void selDoc1() throws Exception
		{
			Thread.sleep(2000);	
			docName.click();
			Thread.sleep(2000);	
		}
		
		
		public void controlForm1(String num,String lv,String nm,String sf,String rc,String dc,String sel1,String sel2,String sel3) throws InterruptedException
		{		
			Thread.sleep(3000);
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			jse3.executeScript("window.scrollBy(0,200)");
			elementWait(control);
			Thread.sleep(2000);
			control.click();
			Thread.sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,200)");
			elementWait(controlForm);
			Thread.sleep(2000);
			controlForm.click();
			Thread.sleep(2000);
			changeNumber.sendKeys(num);
			Thread.sleep(2000);
			riskLevel.sendKeys(lv);
			Thread.sleep(2000);
			fileName.sendKeys(nm);
			Thread.sleep(2000);
			systemsAffected.sendKeys(sf);
			Thread.sleep(2000);
			reasonsForChange.sendKeys(rc);
			Thread.sleep(2000);
			descriptionOfChange.sendKeys(dc);
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");
			elementWait(requestedBy);
			Thread.sleep(2000);;
			Select os = new Select(requestedBy);
			os.selectByVisibleText(sel1);
			Thread.sleep(2000);
			Select os1 = new Select(reviewedBy);
			os1.selectByVisibleText(sel2);
			Thread.sleep(2000);
			Select os2 = new Select(completedBy);
			os2.selectByVisibleText(sel3);
			Thread.sleep(2000);
			saveControlForm.click();
			Thread.sleep(2000);
			
		}
		
		public void controlForm2(String num,String lv,String nm,String sf,String rc,String dc,String sel1,String sel2,String sel3) throws InterruptedException
		{		
			Thread.sleep(3000);
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			jse3.executeScript("window.scrollBy(0,200)");
			elementWait(control);
			Thread.sleep(2000);
			control.click();
			Thread.sleep(2000);
			//JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			//jse1.executeScript("window.scrollBy(0,200)");
			//elementWait(controlForm);
			//Thread.sleep(2000);
			controlForm.click();
			Thread.sleep(2000);
			changeNumber.sendKeys(num);
			Thread.sleep(2000);
			riskLevel.sendKeys(lv);
			Thread.sleep(2000);
			fileName.sendKeys(nm);
			Thread.sleep(2000);
			systemsAffected.sendKeys(sf);
			Thread.sleep(2000);
			reasonsForChange.sendKeys(rc);
			Thread.sleep(2000);
			descriptionOfChange.sendKeys(dc);
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");
			elementWait(requestedBy);
			Thread.sleep(2000);;
			Select os = new Select(requestedBy);
			os.selectByVisibleText(sel1);
			Thread.sleep(2000);
			Select os1 = new Select(reviewedBy);
			os1.selectByVisibleText(sel2);
			Thread.sleep(2000);
			Select os2 = new Select(completedBy);
			os2.selectByVisibleText(sel3);
			Thread.sleep(2000);
			saveControlForm.click();
			Thread.sleep(2000);
			
		}
		
		
		
		public void cloneFolder(String clone, String nm, String loc) throws InterruptedException
		{		
			Thread.sleep(3000);
			clone1.click();
			Thread.sleep(3000);
			Select os = new Select(actionToclone);
			os.selectByVisibleText(clone);
			Thread.sleep(3000);
			fName1.sendKeys(nm);
			Thread.sleep(2000);
			Select os1 = new Select(location);
			os1.selectByVisibleText(loc);
			Thread.sleep(2000);
			fName2.click();
			Thread.sleep(3000);
			clone2.click();
			Thread.sleep(3000);		
		}
		
//		public static boolean cloneAlert() throws InterruptedException
//		{
//			try
//			{
//				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait1.until(ExpectedConditions.alertIsPresent());
//				Alert alert1 = driver.switchTo().alert();
//				Assert.assertTrue(alert1.getText().contains("Are you sure you want to move the folder?"));
//				alert1.accept();
//				Thread.sleep(2000);
//				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait2.until(ExpectedConditions.alertIsPresent());
//				Alert alert2 = driver.switchTo().alert();
//				Assert.assertTrue(alert2.getText().contains("Folder cloned successfully"));
//				alert2.accept();
//				return true;
//			} catch (NoAlertPresentException e) {
//				return false;
//			}	
//		}
		
		
//		public static boolean criticalFormAlert() throws InterruptedException
//		{
//			try
//			{
//				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait1.until(ExpectedConditions.alertIsPresent());
//				Alert alert1 = driver.switchTo().alert();
//				Assert.assertTrue(alert1.getText().contains("Critical change control form created successfully"));
//				alert1.accept();
//				Thread.sleep(2000);
//				return true;
//			} catch (NoAlertPresentException e) {
//				return false;
//			}	
//		}

	
	public void shareFolder_ExternalUser(String dt) throws InterruptedException
	{		
		Thread.sleep(2000);
		externalUser.click();
		Thread.sleep(2000);	
		externalUserSel.click();
		Thread.sleep(2000);	
		expiry_Date.sendKeys(dt);
		Thread.sleep(2000);	
		share.click();
		Thread.sleep(10000);	
	}
	
	public void shareFolder_ExternalUser1() throws InterruptedException
	{		
		Thread.sleep(2000);
		externalUser.click();
		Thread.sleep(2000);	
		externalUserSel.click();
		Thread.sleep(2000);		
		share.click();
		//Thread.sleep(50000);
	}
	
//	public static boolean shareFolder_ExternalUserAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Folder shared successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void editSavedDocument() throws InterruptedException
	{		
		Thread.sleep(2000);
		editSavedDocument.click();
		Thread.sleep(2000);			
	}
	
	public void deleteSavedDocument() throws InterruptedException
	{		
		Thread.sleep(2000);
		deleteSavedDocument.click();
		Thread.sleep(2000);			
	}
	
	public void newVersionOfSavedDocument() throws InterruptedException
	{		
		Thread.sleep(2000);
		newVersionOfSavedDocument.click();
		Thread.sleep(2000);			
	}
	
	public void clickOnNewVersion() throws InterruptedException
	{		
		Thread.sleep(2000);
		newVersion.click();
		Thread.sleep(2000);			
	}
	
	public void download() throws InterruptedException
	{		
		Thread.sleep(2000);
		downloadDoc.click();
		Thread.sleep(2000);			
	}
	
	public void documentApprovalDoc(String role) throws InterruptedException
	{		
		Thread.sleep(2000);
		approvalsDoc.click();
		Thread.sleep(2000);		
		Select os = new Select(chooseRoleApproval);
		os.selectByVisibleText(role);
		usersApproval1.click();
		Thread.sleep(2000);
		usersApproval2.click();
		Thread.sleep(2000);
		saveApproval.click();
		Thread.sleep(2000);//Updated successfully
	}
	
	public void print() throws InterruptedException
	{		
		Thread.sleep(3000);
		printDoc.click();
		Thread.sleep(10000);			
	}
	
	
	public void addSigners(String user) throws InterruptedException
	{		
		Thread.sleep(2000);
		addSignersUpdateDoc.click();
		Thread.sleep(2000);	
		Select os = new Select(user3);
		os.selectByVisibleText(user);
		Thread.sleep(2000);
		SubmitDoc.click();
		Thread.sleep(2000);			
	}
	
	public void addNewVersion(String title,String ver) throws InterruptedException
	{		
		Thread.sleep(2000);	
		addNewVersionDoc.click();
		Thread.sleep(2000);	
		docTitle.clear();
		Thread.sleep(2000);	
		docTitle.sendKeys(title);
		Thread.sleep(2000);	
		docversion.sendKeys(ver);
		Thread.sleep(2000);	
	}
	
	public void signDocument(String em,String pwd,String rs) throws InterruptedException
	{		
		Thread.sleep(2000);
		signDocumentDoc.click();
		Thread.sleep(2000);	
		emailDoc.sendKeys(em);
		Thread.sleep(2000);
		passwordDoc.sendKeys(pwd);
		Thread.sleep(2000);	
		Select os = new Select(reasonDoc);
		os.selectByVisibleText(rs);
		Thread.sleep(2000);	
		submitSignDocumentDoc.click();
		Thread.sleep(2000);			
	}
	
//	public static boolean signAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signature added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean addSignersAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Signers updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean uploadDocAlert1() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document saved successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
	
	
//	public static boolean documentApprovalAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	public void editSavedDocument1(String tit) throws InterruptedException
	{
		Thread.sleep(2000);
		title.clear();
		Thread.sleep(2000);
		title.sendKeys(tit);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		elementWait(saveDocument);
		saveDocument.click();
		Thread.sleep(2000);
		
	}
	
	public void savedToSubmitDocument(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		elementWait(submitAndSign);
		submitAndSign.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		Select s = new Select(reason);
		s.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void documentApproval(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		documentApproval.click();
		Thread.sleep(2000);
		Select s = new Select(selectRole);
		s.selectByVisibleText(role);
		Thread.sleep(2000);
		selectedUser.click();
		Thread.sleep(2000);
		saveUser1.click();
		Thread.sleep(2000);
	}
	
	public void addNewVersion(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		addNewVersion.click();
		Thread.sleep(2000);
		Select s = new Select(docowner1);
		s.selectByVisibleText(name);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);		
	}
	
	public void signDocument(String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		signDocument.click();
		Thread.sleep(2000);
		enterPassword.sendKeys(pwd);
		Thread.sleep(2000);
		submitDoc.click();
		Thread.sleep(2000);
	}
	
	public void docDownload() throws InterruptedException
	{
		Thread.sleep(2000);
		download.click();
		Thread.sleep(2000);
	}
	
	public void docPrint() throws InterruptedException
	{
		Thread.sleep(2000);
		printDoc.click();
		Thread.sleep(4000);
		// Choosing the second window which is the print dialog.
        // Switching to opened window of print dialog.
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        // Runs javascript code for cancelling print operation.
        // This code only executes for Chrome browsers.
        JavascriptExecutor js = (JavascriptExecutor)driver;    
        js.executeScript("document.querySelector(\"body > print-preview-app\").shadowRoot.querySelector(\"#sidebar\").shadowRoot.querySelector(\"print-preview-button-strip\").shadowRoot.querySelector(\"div > cr-button.cancel-button\").click();");
        // Switches to main window after print dialog operation.
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
	}
	
	public void uploadDoc1(String doclocation) throws Exception
	{
		Thread.sleep(3000);	
		browsedoc1.click();
		String absolutepath= new File(doclocation).getAbsolutePath();
		//browsedoc1.sendKeys(absolutepath);
		Thread.sleep(3000);	
		Robot robot = new Robot();
		// Press the "CTRL" and "V" keys to paste the file path into the file input field
		StringSelection stringSelection = new StringSelection(absolutepath); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Press the "ENTER" key to submit the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		saveDoc1.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	}
	
	
	public void clickOnView(String id) throws InterruptedException
	{
		for(int i=0;i<storyID.size();i++)
		{
			String text=storyID.get(i).getText();
			if(text.equals(id))
			{
				view.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void clickOnActions(String id) throws InterruptedException
	{
		for(int i=0;i<storyID.size();i++)
		{
			String text=storyID.get(i).getText();
			if(text.equals(id))
			{
				Actions.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void fillDocument_submitAndSign(String doc,String tit,String module,String story,String lead,String devname,String testername,String criteria,String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(2000);
		Select s = new Select(createNewDoc);
		s.selectByVisibleText(doc);
		Thread.sleep(2000);
		title.sendKeys(tit);
		Thread.sleep(2000);
		moduleName.sendKeys(module);
		Thread.sleep(2000);
		storyId.sendKeys(story);
		Thread.sleep(2000);
		Select os = new Select(moduleLead);
		os.selectByVisibleText(lead);
		Thread.sleep(2000);
		Select os1 = new Select(developerName);
		os1.selectByVisibleText(devname);
		Thread.sleep(2000);
		Select os2 = new Select(unitTesterName);
		os2.selectByVisibleText(testername);
		Thread.sleep(2000);
		acceptanceCriteria.sendKeys(criteria);
		Thread.sleep(2000);
		pass1.click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(yes1);
		yes1.click();
		Thread.sleep(2000);
		yes2.click();
		Thread.sleep(2000);
		yes3.click();
		Thread.sleep(2000);		
		yes4.click();
		Thread.sleep(2000);
		yes5.click();
		Thread.sleep(2000);
		yes6.click();
		Thread.sleep(2000);
		yes7.click();
		Thread.sleep(2000);
		yes8.click();
		Thread.sleep(2000);
		yes9.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(saveAndSign);
		saveAndSign.click();
		Thread.sleep(3000);
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		Select s1 = new Select(reason);
		s1.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void addNewVersion_submitDocument1(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(3000);
		addNewVersion.click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(yes1);
		yes1.click();
		Thread.sleep(2000);
		yes2.click();
		Thread.sleep(2000);
		yes3.click();
		Thread.sleep(2000);		
		yes4.click();
		Thread.sleep(2000);
		yes5.click();
		Thread.sleep(2000);
		yes6.click();
		Thread.sleep(2000);
		yes7.click();
		Thread.sleep(2000);
		yes8.click();
		Thread.sleep(2000);
		yes9.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(submitAndSign);
		submitAndSign.click();
		Thread.sleep(3000);
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		Select s1 = new Select(reason);
		s1.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void addNewVersion_submitDocument2(String em,String pwd,String rs) throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(yes1);
		yes1.click();
		Thread.sleep(2000);
		yes2.click();
		Thread.sleep(2000);
		yes3.click();
		Thread.sleep(2000);		
		yes4.click();
		Thread.sleep(2000);
		yes5.click();
		Thread.sleep(2000);
		yes6.click();
		Thread.sleep(2000);
		yes7.click();
		Thread.sleep(2000);
		yes8.click();
		Thread.sleep(2000);
		yes9.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(submitAndSign);
		submitAndSign.click();
		Thread.sleep(3000);
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		Select s1 = new Select(reason);
		s1.selectByVisibleText(rs);
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void addNewVersion_savedDocument() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(yes1);
		yes1.click();
		Thread.sleep(2000);
		yes2.click();
		Thread.sleep(2000);
		yes3.click();
		Thread.sleep(2000);		
		yes4.click();
		Thread.sleep(2000);
		yes5.click();
		Thread.sleep(2000);
		yes6.click();
		Thread.sleep(2000);
		yes7.click();
		Thread.sleep(2000);
		yes8.click();
		Thread.sleep(2000);
		yes9.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(saveDocument);
		saveDocument.click();
		Thread.sleep(3000);
	}
	
	public void fillDocument_save(String doc,String tit,String module,String story,String lead,String devname,String testername,String criteria) throws InterruptedException
	{
		Thread.sleep(2000);
		Select s = new Select(createNewDoc);
		s.selectByVisibleText(doc);
		Thread.sleep(2000);
		title.sendKeys(tit);
		Thread.sleep(2000);
		moduleName.sendKeys(module);
		Thread.sleep(2000);
		storyId.sendKeys(story);
		Thread.sleep(2000);
		Select os = new Select(moduleLead);
		os.selectByVisibleText(lead);
		Thread.sleep(2000);
		Select os1 = new Select(developerName);
		os1.selectByVisibleText(devname);
		Thread.sleep(2000);
		Select os2 = new Select(unitTesterName);
		os2.selectByVisibleText(testername);
		Thread.sleep(2000);
		acceptanceCriteria.sendKeys(criteria);
		Thread.sleep(2000);
		pass1.click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		elementWait(yes1);
		yes1.click();
		Thread.sleep(2000);
		yes2.click();
		Thread.sleep(2000);
		yes3.click();
		Thread.sleep(2000);
		yes4.click();
		Thread.sleep(2000);
		yes5.click();
		Thread.sleep(2000);
		yes6.click();
		Thread.sleep(2000);
		yes7.click();
		Thread.sleep(2000);
		yes8.click();
		Thread.sleep(2000);
		yes9.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		elementWait(saveDocument);
		saveDocument.click();
		Thread.sleep(2000);
	}
	
//	public static boolean documentGenerationAlert_sumbmitAndSign() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document generated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean documentGenerationAlert_save1() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Details saved successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean documentGenerationAlert_save2() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document saved successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
	
	public void clickOnDevelopment() throws InterruptedException
	{
		Thread.sleep(2000);
		development.click();
		Thread.sleep(2000);
		
	}
	
	public void clickOnDocument() throws InterruptedException
	{
		Thread.sleep(2000);
		document.click();
		Thread.sleep(2000);
		
	}
	
	public void createUser(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		createUser.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		chooseUser1.click();
		Thread.sleep(2000);
		chooseUser2a.click();
		Thread.sleep(2000);
		chooseUser2b.click();
		Thread.sleep(2000);
		chooseUser2c.click();
		Thread.sleep(2000);
		chooseUser3.click();
		Thread.sleep(2000);
		saveUser.click();		
	}
	
	public void editUser(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		editUser.click();
		Thread.sleep(2000);
		Select os = new Select(changeUser);
		os.selectByVisibleText(name);
		Thread.sleep(2000);
		saveUser.click();
		Thread.sleep(2000);
		
	}
	
	public void deleteUser() throws InterruptedException
	{
		Thread.sleep(2000);
		deleteUser.click();
		Thread.sleep(2000);
	}
	
	public void ProjectRoleCreation(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
		addProjectRole.click();
		Thread.sleep(2000);
		role.sendKeys(name);
		Thread.sleep(2000);
		saveRole1.click();
		Thread.sleep(2000);
	}
	
	public void profile() throws InterruptedException
	{
		Thread.sleep(2000);
		profile.click();
		Thread.sleep(2000);
	}
	
	public boolean roleActions(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		
		for(int i=0;i<roleList.size();i++)
		{
			String dname=roleList.get(i).getText();
			if(dname.contains(name))
			{
				Thread.sleep(2000);
				roleList.get(i).click();
				Thread.sleep(3000);
				roleOptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public boolean userActions(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		
		for(int i=0;i<userList.size();i++)
		{
			String dname=userList.get(i).getText();
			if(dname.contains(name))
			{
				userOptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public void RoleEdit(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		editRole.click();
		Thread.sleep(2000);
		role.clear();
		Thread.sleep(2000);
		role.sendKeys(name);
		saveRole1.click();
		Thread.sleep(2000);
		
	}
	
	public void RoleDelete() throws InterruptedException
	{
		Thread.sleep(2000);
		deleteRole.click();
		Thread.sleep(2000);
	}
	
	public void RoleImport() throws InterruptedException
	{
		Thread.sleep(2000);
		addProjectRole.click();
		Thread.sleep(2000);
		yes.click();
		Thread.sleep(2000);
		saveRole2.click();
		Thread.sleep(2000);
		
	}
	
	public void clickOnProjectMenu() throws InterruptedException
	{		
		Thread.sleep(2000);
		projectsMenu.click();
		Thread.sleep(2000);		
	}

	
	public void deleteFolder() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete2.click();
		Thread.sleep(2000);
		
	}
	
	public void archiveFolder() throws InterruptedException
	{		
		Thread.sleep(2000);
		archive2.click();
		Thread.sleep(2000);
		
	}
	
	public void SendToFolder(String dep1) throws InterruptedException
	{		
		Thread.sleep(2000);
		sendTo2.click();
		Thread.sleep(2000);
		Select os = new Select(selectDepartment1);
		os.selectByVisibleText(dep1);
		Thread.sleep(2000);
		selectDepartment2.click();
		Thread.sleep(2000);
		move.click();
		Thread.sleep(2000);	
	}
	
	public void permissionsFolder(String role) throws InterruptedException
	{		
		Thread.sleep(2000);
		permissions2.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name1.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(2000);
		
	}
	
	public void ShareFolder(String role) throws InterruptedException
	{		
		Thread.sleep(2000);
		share2.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name2.click();
		Thread.sleep(2000);
		share3.click();
		Thread.sleep(2000);
		
	}
	
	public void ProjectCreation(String pname,String ptype) throws InterruptedException
	{		
		Thread.sleep(2000);
		createProjectIcon.click();
		Thread.sleep(2000);	
		projectName.sendKeys(pname);
		Thread.sleep(2000);	
		Select sel=new Select(projectType);
		sel.selectByVisibleText(ptype);
		Thread.sleep(2000);	
		save1.click();		
	}
	
	public void FolderCreation(String fname) throws InterruptedException
	{		
		Thread.sleep(2000);
		createFolder.click();
		Thread.sleep(2000);
		folderName.sendKeys(fname);
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void devFolderCreation(String fname) throws InterruptedException
	{		
		Thread.sleep(2000);
		devCreateFolder.click();
		Thread.sleep(2000);
		folderName.sendKeys(fname);
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public void FolderEdit() throws InterruptedException
	{		
		Thread.sleep(2000);
		edit2.click();
		Thread.sleep(2000);
		save3.click();
		Thread.sleep(2000);
	}
	
//	public static boolean projectCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Project created successfully."));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean roleNameUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean userUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("User updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean importRoleAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Roles added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
	
//	public static boolean roleCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Role created successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean userCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("User added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean shareFolderAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Folder shared successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean projectEditAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Project details updated successfully."));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean FolderCreationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Folder created successfully."));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean FolderUpdationAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("The folder details updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}		
//	}
//	
//	public static boolean sendToFolderAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to move the folder?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Folder moved successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean savedDocumentDeleteAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean userDeleteAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this user?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean roleDeletionAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this role?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean deleteFolderAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this folder ?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("All the folders and documents under this folder will be deleted ?"));
//			alert2.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait3.until(ExpectedConditions.alertIsPresent());
//			Alert alert3 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Folder deleted successfully"));
//			alert3.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean archiveFolderAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this folder?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("By archiving the folder, the selected folder, subfolder(s), and the documents inside the folder(s) will be archived."));
//			alert2.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait3.until(ExpectedConditions.alertIsPresent());
//			Alert alert3 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Folder archived successfully"));
//			alert3.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean PermissionsFolderAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Permission added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean uploadDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Documents saved successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	//
//		//
//	}
//	
//	public static boolean archiveProjectAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this project?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Project Archived successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean deleteProjectAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this project?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Project deleted successfully"));
//			alert2.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
	public boolean clickOnKebabMenu1(String pname) throws InterruptedException
	{
		Thread.sleep(2000);

		for(int i=0;i<projectsList.size();i++)
		{
			String selpname=projectsList.get(i).getText();
			if(selpname.equals(pname))
			{
				kebabMenu1.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	public boolean clickOnKebabMenu2(String pname) throws InterruptedException
	{
		Thread.sleep(2000);

		for(int i=0;i<FoldersList2.size();i++)
		{
			String selpname=FoldersList2.get(i).getText();
			if(selpname.equals(pname))
			{
				FoldersList2.get(i).click();
				Thread.sleep(2000);
				kebabMenu2.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	public boolean clickOnKebabMenu3(String pname) throws InterruptedException
	{
		Thread.sleep(2000);

		for(int i=0;i<FoldersList2.size();i++)
		{
			String selpname=FoldersList2.get(i).getText();
			if(selpname.equals(pname))
			{
				Thread.sleep(2000);
				FoldersList2.get(i).click();
				Thread.sleep(2000);
				kebabMenu2.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean selFolder2(String name) throws InterruptedException
	{
		Thread.sleep(2000);

		for(int i=0;i<FoldersList1.size();i++)
		{
			String selpname=FoldersList1.get(i).getText();
			if(selpname.equals(name))
			{
				Thread.sleep(2000);
				FoldersList1.get(i).click();
				Thread.sleep(2000);
				return true;
			}
		}
		return false;
	}
	
	public void editProject(String des) throws InterruptedException
	{		
		Thread.sleep(2000);
		edit1.click();
		Thread.sleep(2000);
		description.sendKeys(des);
		Thread.sleep(2000);
		save1.click();
	}
	
	public void archiveProject() throws InterruptedException
	{		
		Thread.sleep(2000);
		archive1.click();
		Thread.sleep(2000);
	}
	
	public void deleteProject() throws InterruptedException
	{		
		Thread.sleep(2000);
		delete1.click();
		Thread.sleep(2000);
	}
	
	public boolean selProject(String pname) throws InterruptedException
	{
		Thread.sleep(2000);

		for(int i=0;i<projectsList.size();i++)
		{
			String inname=projectsList.get(i).getText();
			if(inname.contains(pname))
			{
				projectsList.get(i).click();
				return true;
			}
		}
		return false;
	}
	
	public void createDocumentIcon() throws InterruptedException
	{
		Thread.sleep(2000);
		createDocIcon.click();
		Thread.sleep(2000);
	}
	public void fillDocument(String dtitle,String downer, String ver) throws InterruptedException
	{
		Thread.sleep(2000);	
		docTitle.sendKeys(dtitle);
		Thread.sleep(2000);
		Select sel=new Select(docowner);
		sel.selectByVisibleText(downer);	
		Thread.sleep(2000);
		docversion.sendKeys(ver);
		Thread.sleep(2000);
	}
	
	public void fillDocument_addSigners(String dtitle,String downer, String ver,String type,String name1,String name2,String name3) throws InterruptedException
	{
		Thread.sleep(2000);	
		docTitle.sendKeys(dtitle);
		Thread.sleep(2000);
		Select sel=new Select(docowner);
		sel.selectByVisibleText(downer);	
		Thread.sleep(2000);
		Select sel1=new Select(doctype);
		sel1.selectByVisibleText(type);	
		docversion.sendKeys(ver);
		Thread.sleep(2000);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,300)");
		addSignersDoc.click();
		Thread.sleep(1000);
		Select sel2=new Select(select1);
		sel2.selectByVisibleText(name1);
		Thread.sleep(1000);
		Select sel3=new Select(select2);
		sel3.selectByVisibleText(name2);
		Thread.sleep(1000);
		Select sel4=new Select(select3);
		sel4.selectByVisibleText(name3);
		Thread.sleep(1000);
	}
	
	public void uploadDoc(String doclocation) throws Exception
	{
		Thread.sleep(3000);	
		browsedoc.click();
		String absolutepath= new File(doclocation).getAbsolutePath();
		//browsedoc.sendKeys(absolutepath);
		Thread.sleep(3000);	
		Robot robot = new Robot();
		// Press the "CTRL" and "V" keys to paste the file path into the file input field
		StringSelection stringSelection = new StringSelection(absolutepath); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		// Press the "ENTER" key to submit the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		saveDoc.click();
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	}
	
	public boolean documentActions(String docname) throws InterruptedException
	{
		Thread.sleep(2000);
		
		for(int i=0;i<docList.size();i++)
		{
			String dname=docList.get(i).getText();
			if(dname.contains(docname))
			{
				documentoptions.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public boolean selDoc(String docname) throws InterruptedException
	{
		Thread.sleep(2000);
		
		for(int i=0;i<documents.size();i++)
		{
			String dname=documents.get(i).getText();
			if(dname.contains(docname))
			{
				documents.get(i).click();
				Thread.sleep(1000);
				return true;
			}
		}
		return false;
	}
	
	public void editDoc(String title) throws Exception
	{
		Thread.sleep(2000);	
		editDoc.click();
		Thread.sleep(2000);	
		docTitle.clear();
		Thread.sleep(2000);	
		docTitle.sendKeys(title);
		Thread.sleep(2000);	
		saveDoc.click();
		Thread.sleep(2000);
	}
	
	public void permissionDoc(String role) throws Exception
	{
		Thread.sleep(2000);	
		permissionsDoc.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name1.click();
		Thread.sleep(2000);
		save4.click();
		Thread.sleep(2000);		
	}
	
	public void shareDoc(String role) throws Exception
	{
		Thread.sleep(2000);	
		shareDoc.click();
		Thread.sleep(2000);
		Select os = new Select(chooseRole1);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
		name2.click();
		Thread.sleep(2000);
		sharedoc.click();
		Thread.sleep(2000);		
	}
	
	public void deleteDoc() throws Exception
	{
		Thread.sleep(2000);	
		deleteDoc.click();
		Thread.sleep(2000);	
	}
	
	public void archiveDoc() throws Exception
	{
		Thread.sleep(2000);	
		archiveDoc.click();
		Thread.sleep(2000);	
	}
	
//	public static boolean editDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document updated successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean permissionDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Permission added successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean shareDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Document shared successfully"));
//			alert1.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean deleteDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Document deleted successfully"));
//			alert2.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}
//	
//	public static boolean archiveDocAlert() throws InterruptedException
//	{
//		try
//		{
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait1.until(ExpectedConditions.alertIsPresent());
//			Alert alert1 = driver.switchTo().alert();
//			Assert.assertTrue(alert1.getText().contains("Are you sure you want to archive this document ?"));
//			alert1.accept();
//			Thread.sleep(2000);
//			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait2.until(ExpectedConditions.alertIsPresent());
//			Alert alert2 = driver.switchTo().alert();
//			Assert.assertTrue(alert2.getText().contains("Document archived successfully"));
//			alert2.accept();
//			Thread.sleep(2000);
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}	
//	}

	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}
}
