package com.archs.testCases;

import java.util.concurrent.TimeoutException;
import org.testng.annotations.Test;
import com.archs.pageObjects.HospitalSalesAccountDetailsPage;
import com.archs.pageObjects.HospitalSalesCATPage;
import com.archs.pageObjects.HospitalSalesContractAssessmentPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import junit.framework.Assert;

public class SingleHospitalSalesCATPendingApprovalStatusTest extends TestBase{
	
	int contractprice = 250;
	int restockprice = 20;
	int percentageincrease = 2;
	int onegsurcharge = 100;
	String ExpectedStatus = "Pending Approval";
	String ActualStatus;

	@Test
	public void SingleHSCATPendingApprovalStatusTest() throws InterruptedException, TimeoutException
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
		
		hscp.setRBCContractPrice(contractprice);
		hscp.selectScheduleDelivery();
		hscp.setRestockingPrice(restockprice);
		hscp.clickOnCATSaveBtn();
		hscp.clickOnContractStartDateText();
		hscp.clickOnContractStartDateTodaylink();
		hscp.clickOnCalendarEndDateIcon();
		hscp.getselectFutureYear();
		hscp.selectContractEndDateDrpDwn();
		hscp.setTopPercentageIncrease(percentageincrease);
		hscp.setBottomPercentageIncrease(percentageincrease);
		hscp.clickOnSubmitBtn();
		Thread.sleep(5000);
		hsadp.clickOnCATButton();
        Thread.sleep(9000);
        
        ActualStatus = hsadp.getCATStatusOnModalPage();
    	Assert.assertEquals(ExpectedStatus, ActualStatus);
    	
    	driver.navigate().refresh();
		driver.get(arccontractassessmentURL);
		
		HospitalSalesContractAssessmentPage hscap = new HospitalSalesContractAssessmentPage(driver);

		hscap.clickOnContractAssessmentDropDown();
		hscap.clickOnContractAssessmentDeleteLink();
		hscap.clickOnContractAssessmentDeleteBtn();
	}
}
