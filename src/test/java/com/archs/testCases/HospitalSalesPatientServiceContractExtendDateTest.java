package com.archs.testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.archs.pageObjects.HospitalSalesAccountRelatedDetailsPage;
import com.archs.pageObjects.HospitalSalesContractPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import com.archs.pageObjects.HospitalSalesPatientServiceContractPriceListPage;
import com.archs.pageObjects.HospitalSalesPatientServicesContractPage;

public class HospitalSalesPatientServiceContractExtendDateTest extends TestBase {
	int bonemarrow = 100;
	int additionalhoursstemcell = 200;
	int operatoronlystemcell = 300;
	int percentage = 2;
	
	

	@Test
	public void HSPatientServiceContractExtendDateTest() throws InterruptedException, TimeoutException
	{
	HospitalSalesLoginPage hslp = new HospitalSalesLoginPage(driver);
	hslp.setUserName(username);
	hslp.setPassword(password);
	
	hslp.clickLogin();
	
	
	driver.get(arcaccountURL);
	Thread.sleep(5000);
	
	HospitalSalesAccountRelatedDetailsPage hsardp = new HospitalSalesAccountRelatedDetailsPage(driver);
	hsardp.clickOnAccountRelatedLink();
	Thread.sleep(5000);
	hsardp.clickOnContractsLink();
	hsardp.waitUntilContractDetailPageIsDisplayed();
	hsardp.clickOnNewBtn();
	
	HospitalSalesPatientServicesContractPage hsscp = new HospitalSalesPatientServicesContractPage(driver);
	hsscp.clickOnPatientServicesRadioBtn();
	hsscp.clickOnNextBtn();
	hsscp.clickOnContractStartDateText();
	hsscp.clickOnContractStartDateTodaylink();
	hsscp.clickOnCalendarEndDateIcon();
	hsscp.selectContractEndDateDrpDwn();
	hsscp.selectLiquidatedDamageDrpDwnOption();
	hsscp.selectPaymentTermsDrpDwnOption();
	hsscp.selectTypeDrpDwnOption();
	hsscp.selectStatusDrpDwnOption();
	hsscp.clickOnSaveButton();
	
	Thread.sleep(3000);
	hsardp.clickOnViewContractsLink();
	Thread.sleep(8000);
	//driver.navigate().refresh();
	//Thread.sleep(5000);
	
	HospitalSalesContractPage hsc = new HospitalSalesContractPage(driver);
	hsc.clickOnEditButton();
	//Thread.sleep(8000);
	hsscp.clickOnCalendarStartDateIcon();
	hsscp.clickOnContractEditStartDateTodaylink();
	hsscp.clickOnCalendarEndDateEditIcon();
	
	//Thread.sleep(3000);
	hsscp.selectContractFutureEndDateDrpDwn();
	//Thread.sleep(3000);
	hsscp.clickOnEditPSSaveButton();
	
	
		
	hsc.waitUntilTranslateTabIsDisplayed();
	Thread.sleep(3000);
	hsc.setPercentageIncrease(percentage);
	hsc.clickOnPlusIconButton();
	hsc.setSecondPercentageIncrease(percentage);
	/*hsc.clickOnPlusIconButton();
	hsc.setThirdPercentageIncrease(percentage);*/
	hsc.clickOnGoButton();
	Thread.sleep(2000);
	
	HospitalSalesPatientServiceContractPriceListPage hspscpl = new HospitalSalesPatientServiceContractPriceListPage(driver);
	//hspscpl.waitUntilBoneMarrowPriceIsDisplayed();
	hspscpl.setAssistBoneMarrowPrice(bonemarrow);
	hspscpl.setAdtnlHrsStemCellPrice(additionalhoursstemcell);
	hspscpl.setOperatorOnlyStemCellPrice(operatoronlystemcell);
	hspscpl.clickOnBoneMarrowPrice();
	hspscpl.clickOnTopNextButton();
	hspscpl.clickOnSecondTopNextButton();
	hspscpl.clickOnThirdTopNextButton();
	//hspscpl.clickOnFourthTopNextButton();
	hspscpl.clickOnTranslateSaveButton();
	hspscpl.waitUntilSavingPriceListModalIsNotDisplayed();
	hsscp.waitUntilPriceListTabIsDisplayed();
	hsscp.selectFuturVersionDrpDwnOption();
	hsscp.clickOnApplyBtn();
	hsscp.clickOnApplyBttn();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	driver.get(arccontractlistviewURL);
	Thread.sleep(9000);
	
	hsardp.clickOnEditContractsViewLink();
	hsc.clickOnEscalatorsTab();
	hsc.clickOnFirstEscalatorApplyBtn();
	hsc.clickOnVerifyEscalatorApplyBtn();
	hsc.clickOnVerifyEscalatorExitBtn();
	
	/*driver.navigate().refresh();
	driver.get(arccontractlistviewURL);
	Thread.sleep(9000);
	hsardp.clickOnContractsEditViewLink();*/
	//hsardp.clickOnEditContractsViewLink();
	Thread.sleep(9000);
	hsc.clickOnEditEscalatorsTab();
	hsc.clickOnFirstEditEscalatorApplyBtn();
	//hsc.clickOnVerifyEscalatorApplyBtn();
	hsc.clickOnVerifySecondEscalatorApplyBtn();
	hsc.clickOnSecondEscalatorExitBtn();
	Thread.sleep(4000);
	
	/*hsc.clickOnEscalatorsTab();
	hsc.clickOnFirstEditEscalatorApplyBtn();
	hsc.clickOnVerifySecondEscalatorApplyBtn();
	hsc.clickOnSecondEscalatorExitBtn();*/
	
	hsc.clickOnTabRelated();
	hsc.clickOnEscalatorsLink();
	hsardp.clickOnEscalatorsListViewDrpDwn();
	hsardp.clickOnDeleteContractLink();
	hsardp.clickOnDeleteBtn();
	//Thread.sleep(5000);
	driver.navigate().refresh();
	hsardp.clickOnSecondEscalatorsListViewDrpDwn();
	Thread.sleep(2000);
	hsardp.clickOnDeleteEscalatorLink();
	Thread.sleep(2000);
	hsardp.clickOnEscalatorDeleteBtn();
	Thread.sleep(2000);
	/*hsardp.clickOnSecondEscalatorsListViewDrpDwn();
	Thread.sleep(2000);
	hsardp.clickOnDeleteEscalatorLink();
	Thread.sleep(2000);
	hsardp.clickOnEscalatorDeleteBtn();*/
		
	//driver.navigate().refresh();
	driver.get(arccontractlistviewURL);
	Thread.sleep(9000);
	hsardp.clickOnContractListViewDrpDwn();
	Thread.sleep(9000);
	hsardp.clickOnContractListViewDeleteLink();
	Thread.sleep(9000);
	hsardp.clickOnContractListViewDeleteBtn();
	}

}
