package com.archs.testCases;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.archs.pageObjects.HospitalSalesAccountDetailsPage;
import com.archs.pageObjects.HospitalSalesAccountRelatedDetailsPage;
import com.archs.pageObjects.HospitalSalesCATPage;
import com.archs.pageObjects.HospitalSalesContractAssessmentPage;
import com.archs.pageObjects.HospitalSalesContractPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import com.archs.pageObjects.HospitalSalesNewBloodContractPage;
import com.archs.pageObjects.HospitalSalesPriceListPage;


public class SingleHospitalSalesPriceListAndContractDetailsTabValidationTest extends TestBase {
	
	//int rbcvolume = 500;
	//int ontaken = 17;
	int contractprice = 250;
	int restockprice = 20;
	int percentageincrease = 2;
	int onegsurcharge = 100;
		
	float lrrbcPrice = 240.00f;
	int sdpPrice = 558;
	int sdppascFee = 650;
	int sdppascPathRedFee = 800;
	int plasmaPrice = 65;
	int fppPrice = 65;
	int cryoPrice = 50;
	int cryoPoolPrice = 100;
	int deglycedfee = 200;
	int frozenfee = 200; 
	int irrdFee = 75;
	int AutoSdpFee = 200;
	int irrdpSdpFee = 75;
	int dirdFee = 400;
	int washedFee = 500;
	int surbloodtypelrbc = 10;
	int shpscheduled = 10;
	int shpnocharge = 10;
	int typeabFee = 20;
	int typAbcCryoFee = 20;
	int hemoglobinFee = 51;
	int antiCMVFee = 52;
	int disRbcPrice = 50;
	int shpHospitalFee = 10;
	int disSDPFee = 50;
	//int typeABCCryoFee = 20;
	int SHPUnscheduledFee = 10;
	int SATFee = 50;
	float surBloodFee = 100.00f;
	int pooledCryoFee = 150;
	String plApprovalComment = "Test Price List Approval Comment";
	String newBloodContractStartDate;
	String newBloodContractEndDate;
	String newBloodContractSellingPriceRBC;
	String newBloodContractSellingPriceSDP;
	String newBloodContractVolumeRBC;
	String newBloodContractVolumeSDP;
	String catDetailTabStartDate;
	String catDetailTabEndDate;
	String catDetailTabSellingPriceRBC;
	String catDetailTabSellingPriceSDP;
	String catDetailTabVolumeRBC;
	String catDetailTabVolumeSDP;


	@Test
	public void SingleHSPriceListAndCATDetailsTabValidationTest() throws InterruptedException, TimeoutException
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
		hsadp.waitUntilAccountTabIsDisplayed();
		Thread.sleep(5000);
		hsadp.clickOnContractAssessmentLink();
		
		
		
		HospitalSalesContractAssessmentPage hscap = new HospitalSalesContractAssessmentPage(driver);
		//hscap.waitUntilAccountTabIsDisplayed();
		hscap.clickOnContractAssessmentName();
		hscap.clickOnAccountHistoryDrpDwn();
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		Thread.sleep(3000);
		hscap.clickOnApproveLink();
		hscap.clickOnApproveBtn();
		driver.navigate().refresh();
		Thread.sleep(6000);
		hscap.clickOnContractAssessmentDrpDwn();
		Thread.sleep(3000);
		hscap.clickOnSecondApproveLink();
		Thread.sleep(3000);
		hscap.clickOnApproveButtonn();
		Thread.sleep(6000);
		driver.get(arcaccountURL);
		Thread.sleep(6000); 
		hsadp.clickOnCATButton();
		hsadp.clickOnCreateContractButton();
		
		
		
		HospitalSalesNewBloodContractPage hsnbcp = new HospitalSalesNewBloodContractPage(driver);
	    hsnbcp.selectLiquidatedDamages();
	    hsnbcp.selectPaymentTerms();
		hsnbcp.setONegSurcharge(onegsurcharge);
		newBloodContractStartDate = hsnbcp.getStartDateText();
		newBloodContractEndDate = hsnbcp.getEndDateText();
		newBloodContractSellingPriceRBC = hsnbcp.getSellingPriceRBCText();
		newBloodContractSellingPriceSDP = hsnbcp.getSellingPriceSDPText();
		newBloodContractVolumeRBC = hsnbcp.getVolumeRBCText();
		newBloodContractVolumeSDP = hsnbcp.getVolumeSDPText();
		hsnbcp.clickOnSaveButton();
		
		
		
		HospitalSalesContractPage hsc = new HospitalSalesContractPage(driver);
		
		//hsc.waitUntilDetailsTabIsDisplayed();
		catDetailTabStartDate = hsc.getCATDetailStartDateText();
		catDetailTabEndDate = hsc.getCATDetailEndDateText();
		catDetailTabSellingPriceRBC = hsc.getCATDetailSellingPriceRBCText();
		catDetailTabSellingPriceSDP = hsc.getCATDetailSellingPriceSDPText();
		catDetailTabVolumeRBC = hsc.getCATDetailVolumeRBCText();
		catDetailTabVolumeSDP = hsc.getCATDetailVolumeSDPText();
		
		SoftAssert softAssertion= new SoftAssert();
		Assert.assertEquals(catDetailTabStartDate, newBloodContractStartDate);
		Assert.assertEquals(catDetailTabEndDate, newBloodContractEndDate);
		Assert.assertEquals(catDetailTabSellingPriceRBC, newBloodContractSellingPriceRBC);
		Assert.assertEquals(catDetailTabSellingPriceSDP, newBloodContractSellingPriceSDP);
		Assert.assertEquals(catDetailTabVolumeRBC, newBloodContractVolumeRBC);
		Assert.assertEquals(catDetailTabVolumeSDP, newBloodContractVolumeSDP);
		
		softAssertion.assertAll();
		Thread.sleep(3000);
		
		driver.get(arccontractassessmentURL);
		Thread.sleep(5000);
		//hsadp.clickOnContractAssessmentLink();
		//hscap.waitUntilAccountTabIsDisplayed();
		hscap.clickOnContractAssessmentDropDown();
		hscap.clickOnContractAssessmentDeleteLink();
		hscap.clickOnContractAssessmentDeleteBtn();
		
	}
}
