package com.archs.testCases;


import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.archs.pageObjects.HospitalSalesAccountDetailsPage;
import com.archs.pageObjects.HospitalSalesAccountRelatedDetailsPage;
import com.archs.pageObjects.HospitalSalesCATPage;
import com.archs.pageObjects.HospitalSalesContractAssessmentPage;
import com.archs.pageObjects.HospitalSalesContractPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import com.archs.pageObjects.HospitalSalesNewBloodContractPage;
import com.archs.pageObjects.HospitalSalesPriceListPage;


public class SingleHospitalSalesCATPageValidationTest extends TestBase {
	
	//int rbcvolume = 500;
	//int ontaken = 17;
	int contractprice = 250;
	int restockprice = 20;
	int percentageincrease = 2;
	int onegsurcharge = 100;
		
	float lrrbcPrice = 250.00f;
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
	

	@Test
	public void SingleHospitalSalesCATPageValidation() throws InterruptedException, TimeoutException, ParseException
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
		hscp.getStartDateCATPage();
		hscp.setTopPercentageIncrease(percentageincrease);
		hscp.setBottomPercentageIncrease(percentageincrease);
		
		hscp.getEndDateCATPage();
		Thread.sleep(9000);
		/*hscp.clickOnSubmitBtn();
		hsadp.waitUntilAccountTabIsDisplayed();
		hsadp.clickOnContractAssessmentLink();
		
		
		
		HospitalSalesContractAssessmentPage hscap = new HospitalSalesContractAssessmentPage(driver);
		hscap.waitUntilAccountTabIsDisplayed();
		hscap.clickOnContractAssessmentName();
		hscap.clickOnAccountHistoryDrpDwn();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
		hsnbcp.clickOnSaveButton();
		
		
		
		HospitalSalesContractPage hsc = new HospitalSalesContractPage(driver);
		hsc.waitUntilTranslateTabIsDisplayed();
		hsc.clickOnGoButton();
		Thread.sleep(2000);
		
		HospitalSalesPriceListPage hsplp = new HospitalSalesPriceListPage(driver);
		
		hsplp.setLrbcPrice(lrrbcPrice);
		Thread.sleep(1000);
		
		
		hsplp.setDeglycedFeePrice(deglycedfee);
		Thread.sleep(1000);
		hsplp.setFrozenFeePrice(frozenfee);
		Thread.sleep(1000);
		hsplp.setIrrdFeePrice(irrdFee);
		Thread.sleep(1000);
		hsplp.setFDPFeePrice(AutoSdpFee);
		Thread.sleep(1000);
		hsplp.setIrrdpSdpFeePrice(irrdpSdpFee);
		Thread.sleep(1000);
		hsplp.setDirdFeePrice(dirdFee);
		Thread.sleep(1000);
		hsplp.setWashedFeePrice(washedFee);
		Thread.sleep(1000);
		hsplp.setShpScheduledPrice(shpscheduled);
		Thread.sleep(1000);
		hsplp.setShpNoChargePrice(shpnocharge);
		Thread.sleep(1000);
		hsplp.setTypeABFeePrice(typeabFee);
		Thread.sleep(1000);
		hsplp.setHemoglobinFeePrice(hemoglobinFee);
		Thread.sleep(1000);
		hsplp.setantiCMVFeePrice(antiCMVFee);
		Thread.sleep(1000);
		hsplp.setTypeAbcCryoFee(typAbcCryoFee);
		Thread.sleep(1000);
		hsplp.setDisRbcPrice(disRbcPrice);
		Thread.sleep(1000);
		hsplp.setShpHospitalFee(shpHospitalFee);
		Thread.sleep(1000);
		hsplp.setDisSdpFee(disSDPFee);
		Thread.sleep(1000);
		hsplp.setTypeABPooledCryoFee(pooledCryoFee);
		Thread.sleep(1000);
		hsplp.setSHPUnscheduledFee(SHPUnscheduledFee);
		Thread.sleep(1000);
		hsplp.setSATFee(SATFee);
		Thread.sleep(1000);
		hsplp.setSURBloodFee(surBloodFee);
		Thread.sleep(1000);
		hsplp.clickOnSDPPrice();
		Thread.sleep(1000);
		
		hsplp.clickOnNextButton();
		hsplp.clickOnEscalateButton();
		hsplp.clickOnApplyAllButton();
		
		hsplp.setLrbcPrice(lrrbcPrice);
		Thread.sleep(1000);
		hsplp.setSecondYearDeglycedFeePrice(deglycedfee);
		Thread.sleep(1000);
		hsplp.setSecondYearFrozenFeePrice(frozenfee);
		Thread.sleep(1000);
		hsplp.setSecondYearIrrdFeePrice(irrdFee);
		Thread.sleep(1000);
		hsplp.setSecondYearFDPFeePrice(AutoSdpFee);
		Thread.sleep(1000);
		hsplp.setSecondYearIrrdpSdpFeePrice(irrdpSdpFee);
		Thread.sleep(1000);
		hsplp.setSecondYearDirdFeePrice(dirdFee);
		Thread.sleep(1000);
		hsplp.setSecondYearWashedFeePrice(washedFee);
		Thread.sleep(1000);
		hsplp.setSecondYearShpScheduledPrice(shpscheduled);
		Thread.sleep(1000);
		hsplp.setSecondYearShpNoChargePrice(shpnocharge);
		Thread.sleep(1000);
		hsplp.setSecondYearTypeABFeePrice(typeabFee);
		Thread.sleep(1000);
		hsplp.setSecondYearHemoglobinFeePrice(hemoglobinFee);
		Thread.sleep(1000);
		hsplp.setSecondYearAntiCMVFeePrice(antiCMVFee);
		Thread.sleep(1000);
		hsplp.setSecondYearTypeABCCryoFeePrice(typAbcCryoFee);
		Thread.sleep(1000);
		hsplp.setSecondYearDisRbcPrice(disRbcPrice);
		Thread.sleep(1000);
		hsplp.setSecondYearShpHospitalFee(shpHospitalFee);
		Thread.sleep(1000);
		hsplp.setSecondYearDisSdpFee(disSDPFee);
		Thread.sleep(1000);
		hsplp.setSecondYearTypeAbcCryoFee(pooledCryoFee);
		Thread.sleep(1000);
		hsplp.setSecondYearSHPUnscheduledFee(SHPUnscheduledFee);
		Thread.sleep(1000);
		hsplp.setSecondYearSATFee(SATFee);
		Thread.sleep(1000);
		hsplp.setsecondYearSURBloodFee(surBloodFee);
		Thread.sleep(1000);
		hsplp.clickOnSecondYearLRRBCPrice();
		Thread.sleep(1000);
		
		hsplp.clickOnSecondNextButton();
		hsplp.clickOnSecondEscalateButton();
		hsplp.clickOnSecondApplyAllButton();
		
		
		
		
		hsplp.clickOnTopNextButton();
		
		hsplp.clickOnTranslateSaveButton();
		hsplp.waitUntilSavingPriceListModalIsNotDisplayed();
		//hsplp.clickOnExitButton();
		
		driver.get(arcaccountdetailURL);
		Thread.sleep(3000);
		
		
		HospitalSalesAccountRelatedDetailsPage hsardp = new HospitalSalesAccountRelatedDetailsPage(driver);
		hsardp.clickOnAccountRelatedLink();
		hsardp.clickOnContractsLink();
		hsc.clickOnContractLink();
		hsc.waitUntilPriceListTabIsDisplayed();
		hsc.selectFuturVersionDrpDwnOption();
		hsc.clickOnApplyBtn();
		hsc.clickOnApplyBttn();
		hsc.clickOnExitBttn();
		Thread.sleep(5000);*/
		
		
		/*hsardp.clickOnContractsDrpDwn();
		hsardp.clickOnContractDeleteLink();
		hsardp.clickOnDeleteBtn();
		//Thread.sleep(5000);
		
		driver.navigate().refresh();
		driver.get(arccontractassessmentURL);
		//hsadp.clickOnContractAssessmentLink();
		//hscap.waitUntilAccountTabIsDisplayed();
		hscap.clickOnContractAssessmentDropDown();
		hscap.clickOnContractAssessmentDeleteLink();
		hscap.clickOnContractAssessmentDeleteBtn();*/
		
	}
}
