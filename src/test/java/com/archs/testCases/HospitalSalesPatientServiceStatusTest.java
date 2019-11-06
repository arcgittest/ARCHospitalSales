package com.archs.testCases;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.archs.pageObjects.HospitalSalesAccountRelatedDetailsPage;
import com.archs.pageObjects.HospitalSalesLoginPage;
import com.archs.pageObjects.HospitalSalesPatientServicesContractPage;

import junit.framework.Assert;

public class HospitalSalesPatientServiceStatusTest extends TestBase{
	
	String ExpectedStatus = "RFP issued or to be issued";
	String ActualStatus;
	
	@Test
	public void HSPatientServiceStatusTest() throws InterruptedException, TimeoutException
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
	Thread.sleep(5000);
	
	ActualStatus = hsardp.getContractStatusOnListView();
	Assert.assertEquals(ExpectedStatus, ActualStatus);
	
	hsardp.clickOnContractListViewDrpDwn();
	Thread.sleep(5000);
	hsardp.clickOnDeleteContractLink();
	Thread.sleep(5000);
	hsardp.clickOnDeleteBtn();
	
	}
}
