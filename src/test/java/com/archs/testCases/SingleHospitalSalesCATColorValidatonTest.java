package com.archs.testCases;

import java.util.concurrent.TimeoutException;
import org.testng.annotations.Test;
import com.archs.pageObjects.HospitalSalesAccountDetailsPage;
import com.archs.pageObjects.HospitalSalesCATPage;
import com.archs.pageObjects.HospitalSalesContractAssessmentPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import junit.framework.Assert;

public class SingleHospitalSalesCATColorValidatonTest extends TestBase{
	
	int contractprice = 250;
	int restockprice = 20;
	int percentageincrease = 2;
	int onegsurcharge = 100;
	String ExpectedStatus = "Pending Approval";
	String ActualStatus;
	String expectedcolorhexcode;
	String actualcolorhexcode = "#90ee90";
	String actualcolourhexcode = "#008000";

	@Test
	public void SingleHospitalSalesCATColourValidatonTest() throws InterruptedException, TimeoutException
	{
		
		HospitalSalesLoginPage hslp = new HospitalSalesLoginPage(driver);
		hslp.setUserName(username);
		hslp.setPassword(password);
		
		hslp.clickLogin();
		
		
		driver.get(arcaccountURL);
		
		
		HospitalSalesAccountDetailsPage hsadp = new HospitalSalesAccountDetailsPage(driver);
		hsadp.waitUntilCATtBtnIsDisplayed();
		hsadp.clickOnCATBtn();
		hsadp.clickOnCreateNewAssesmentButton();
		hsadp.waitUntilProgressBarIsDisplayed();
		hsadp.waitUntilProgressBarIsNotDisplayed();
		
		
		
		HospitalSalesCATPage hscp = new HospitalSalesCATPage(driver);
	
		hscp.waitUntilRBCVolumeLableIsDisplayed();
		//hscp.setRBCVolumeCount(rbcvolume);
		//hscp.setPercentageOnTaken(ontaken);
		expectedcolorhexcode = hscp.getBackGroundColor();
		Assert.assertEquals(expectedcolorhexcode, actualcolorhexcode);
		
		hscp.setRBCContractPrice(contractprice);
		hscp.selectScheduleDelivery();
		hscp.setRestockingPrice(restockprice);
	
		hscp.moveToColorBackGroundElement();
		//hscp.clickOnCATSaveBtn();
		expectedcolorhexcode = hscp.getGreenBackGroundColor();
		Assert.assertEquals(expectedcolorhexcode, actualcolourhexcode);
		
		
	}
}
