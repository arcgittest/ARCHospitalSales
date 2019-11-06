package com.archs.testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.archs.pageObjects.HospitalSalesAccountRelatedDetailsPage;
import com.archs.pageObjects.HospitalSalesContractAssessmentPage;
import com.archs.pageObjects.HospitalSalesContractPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import com.archs.pageObjects.HospitalSalesPatientServiceContractPriceListPage;
import com.archs.pageObjects.HospitalSalesPatientServicesContractPage;

public class HospitalSalesCreateNewPatientServiceContractTest extends TestBase {
	
	int bonemarrow = 100;
	int additionalhoursstemcell = 200;
	int operatoronlystemcell = 300;
	
	

	@Test
	public void createNewPatientServiceContractTest() throws InterruptedException, TimeoutException
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
	
	Thread.sleep(2000);
	hsardp.clickOnViewContractsLink();
	
	HospitalSalesContractPage hsc = new HospitalSalesContractPage(driver);
	hsc.waitUntilTranslateTabIsDisplayed();
	hsc.clickOnGoButton();
	Thread.sleep(2000);
	
	HospitalSalesPatientServiceContractPriceListPage hspscpl = new HospitalSalesPatientServiceContractPriceListPage(driver);
	hspscpl.waitUntilBoneMarrowPriceIsDisplayed();
	hspscpl.setAssistBoneMarrowPrice(bonemarrow);
	hspscpl.setAdtnlHrsStemCellPrice(additionalhoursstemcell);
	hspscpl.setOperatorOnlyStemCellPrice(operatoronlystemcell);
	hspscpl.clickOnBoneMarrowPrice();
	hspscpl.clickOnTopNextButton();
	hspscpl.clickOnTranslateSaveButton();
	hspscpl.waitUntilSavingPriceListModalIsNotDisplayed();
	hsscp.waitUntilPriceListTabIsDisplayed();
	hsscp.selectFuturVersionDrpDwnOption();
	hsscp.clickOnApplyBtn();
	hsscp.clickOnApplyBttn();
	//hsscp.clickOnExitBttn();
	//Thread.sleep(5000);
	
	driver.navigate().refresh();
	driver.get(arccontractlistviewURL);
	Thread.sleep(9000);

	//hsardp.clickOnEditContractsViewLink();
	hsardp.clickOnContractListViewDrpDwn();
	Thread.sleep(5000);
	hsardp.clickOnDeleteContractLink();
	Thread.sleep(5000);
	hsardp.clickOnDeleteBtn();
	
	}
}
