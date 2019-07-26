package com.archs.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.archs.utilities.ReadConfig;


/*import java.io.BufferedReader;		
import java.io.File;		
import java.io.FileReader;		
import java.util.Date;		
import java.util.StringTokenizer;		
import org.openqa.selenium.Cookie;*/

public class TestBase {
	
	ReadConfig readconfig=new ReadConfig();

	/*public String archsdqaURL = "https://arcbiomed--dqa.cs42.my.salesforce.com/";
	public String arcaccountURL = "https://arcbiomed--dqa.lightning.force.com/lightning/r/Account/0015600000EL7bRAAT/view";
	public String username = "dwaraka.munirathnam@redcross.org.hs.dqa";
	public String password = "Tester@678!";*/
	public String archsdqaURL=readconfig.getLoginURL();
	public String arcaccountURL=readconfig.getAccountURL();
	public String arccatURL=readconfig.getArcCATURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static ChromeOptions options;
	public static FirefoxOptions option;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=Logger.getLogger("ARCHospitalSales");
		PropertyConfigurator.configure("log4j.properties");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		if(br.equals("chrome")) {
	    //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		//options.addArguments("--disable-features=VizDisplayCompositor");
		//options.addArguments("--disable-gpu");
		options.addArguments("--headless");
	    options.addArguments("--window-size=1920,1080");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(archsdqaURL);
		} else if(br.equals("FF")) {
		//System.setProperty("webdriver.gecko.driver",readconfig.getChromePath());
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		option = new FirefoxOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--disable-notifications");
		driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(archsdqaURL);
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
