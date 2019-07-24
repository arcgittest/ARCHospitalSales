package com.archs.testCases;


import org.testng.annotations.Test;

//import com.archs.pageObjects.HospitalSalesAccountDetailsPage;
import com.archs.pageObjects.HospitalSalesLoginPage;

public class HospitalSalesLoginPageTest extends TestBase {
String hometitle = "Home | Salesforce";
//HospitalSalesAccountDetailsPage hsadp = new HospitalSalesAccountDetailsPage(driver);

	@Test
	public void HSLoginPageTest() throws InterruptedException
	{
		HospitalSalesLoginPage hslp = new HospitalSalesLoginPage(driver);
		//HospitalSalesAccountDetailsPage hsadp = new HospitalSalesAccountDetailsPage(driver);
		hslp.setUserName(username);
		hslp.setPassword(password);
		
		hslp.clickLogin();
		driver.get(arcaccountURL);
		Thread.sleep(9000);
		//hsadp = new HospitalSalesAccountDetailsPage(driver);
		//hsadp.mouseHoverOnCATBtn();
		//hsadp.clickOnCATBtn();
		//driver.manage().wait(timeout);
	}

	
}
