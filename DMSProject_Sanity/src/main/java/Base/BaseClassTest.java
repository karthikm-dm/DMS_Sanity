package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import com.DMS.pageObjects.LoginPage;
import com.DMS.utilities.ReadConfig;

public class BaseClassTest {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String chromepath=readconfig.getChromePath();

	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) throws InterruptedException
	{
		logger=Logger.getLogger("DMS Project");
		DOMConfigurator.configure("log4j.xml");
		
		if(br.equals("chrome"))
		{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(br.equals("geckodriver")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(baseURL);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Enterd password");
		lp.clickLogin();
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
		
	}