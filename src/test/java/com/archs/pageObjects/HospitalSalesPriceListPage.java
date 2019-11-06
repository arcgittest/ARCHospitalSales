package com.archs.pageObjects;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalSalesPriceListPage {

	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;
	Actions actions;
	
		
		@SuppressWarnings("deprecation")
		public HospitalSalesPriceListPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			this.actions = new Actions(ldriver);
			PageFactory.initElements(rdriver, this);
			this.wait = new WebDriverWait(rdriver, 45);
			this.fluentWait =
		            new FluentWait<WebDriver>(rdriver).withTimeout(1, TimeUnit.MINUTES).pollingEvery(1, TimeUnit.SECONDS)
		                    .ignoring(org.openqa.selenium.NoSuchElementException.class)
		                    .ignoring(org.openqa.selenium.ElementNotVisibleException.class)
		                    .ignoring(org.openqa.selenium.StaleElementReferenceException.class)
		                    .ignoring(org.openqa.selenium.WebDriverException.class)
		                    .ignoring(org.openqa.selenium.TimeoutException.class);
				     }
		
		/*
		 * Web Elements 
		*/
		
		/*@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input[contains(@id,'input-273')]")
		@CacheLookup
		WebElement inputLRRBCPrice;*/
		
		//@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
		//@FindBy (how = How.CSS, using = "html > body > div > div > section > #brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[3]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputLRRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[3]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputRRBCFrozenPrice;
		
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[3]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputSecondLRRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[3]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputSecondEscalateLRRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[3]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputThirdLRRBCPrice;
		
		//@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[3]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[2]/div/span")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement spanLRRBCPrice;
		
		@FindBy (how = How.CSS, using = "#modal-content-id-1 > table > tr:nth-child(2) > td:nth-child(3) > lightning-input > div")
		@CacheLookup
		WebElement modalLRRBCPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement spanSDPPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(11) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement span24HrPlasmaPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(12) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement spanFFPPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(16) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement spanCryoPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(17) > td:nth-child(3) > div > span")
		@CacheLookup
		WebElement spanCryoPoolPrice;
		
		
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td.comment > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputThirdYearLRRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputInitialRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[3]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputWholeBloodLRPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[4]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputWholeBloodPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[5]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputPooledRDPPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div lightning-input > div > input")
		@CacheLookup
		WebElement inputSDPPrice;
		
		@FindBy (how = How.CSS, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[7]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputSDPPASCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[8]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputSDPPASCPathRedPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[9]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputRDPLeukoreducedPrice;
		
		@FindBy (how = How.CSS, using = "ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(11) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement input24HourPlasmaPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(12) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputFPPPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[12]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputFPPDividedPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(16) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputCryoPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(17) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputCryoPoolsPrice;
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDeglycedFeePrice;
		
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputFrozenFeePrice;
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputIrrdFeePrice;
		
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputAutoSDPFeePrice;
		
		
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputIrrdpSDPFeePrice;
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDirdFeePrice;
		
		
		//@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputWashedFeePrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSurBloodTypeLrbcPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputShpScheduledPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputShpNoChargePrice;
		
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputTypeABPlasmaFeePrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputHemoglobinPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputAntiCMVPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputTypeABCryoPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDISRBCPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(9) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSHPHospitalPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(10) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDISSDPPrice;
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputTypeABCryoFeePrice;
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(11) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputTypeABPooledCryoFeePrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(12) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSHPUnscheduledPrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(13) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSATFeePrice;
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(14) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSurBloodFeePrice;
		
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(9) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSdpPascPathRedFee;
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputSdpPascFeePrice;
		
				
		@FindBy (how = How.CSS, using = "div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(2) > button")
		@CacheLookup
		WebElement saveButton;
		
		
		@FindBy (how = How.CSS, using = "div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")
		@CacheLookup
		WebElement nextButton;
		
		
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > button")
		@CacheLookup
		WebElement escalateButton;
		
		
		@FindBy (how = How.CSS, using = "#save > section > div > footer > button:nth-child(2)")
		@CacheLookup
		WebElement applyAllButton;
		
		@FindBy (how = How.CSS, using = "#save > section > div > header")
		@CacheLookup
		WebElement savingPricelistModal;
		
		@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[5]/div/div[1]/div[2]/div[1]/button[contains(@aria-describedby,'navNext')]")
		@CacheLookup
		WebElement firstnextButton;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(2) > li:nth-child(6) > p.slds-text-body_regular > div > div:nth-child(2) > textarea")
		@CacheLookup
		WebElement priceListApprovalTxtArea;
		
		
		/*
		 * Method to wait until LRRBC TextBox is visible on the PriceList Page
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilLRRBCPriceIsDisplayed()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(inputLRRBCPrice));
		}
		
		
		/*
		 * Method to set Data LRRBC Price Text box on the PriceList Page
		 */
		public void setLrbcPrice(float lrrbcPrice) throws InterruptedException
		{
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOf(inputLRRBCPrice));
			
            actions.click().build().perform();
			
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputLRRBCPrice.sendKeys(del + lrrbcPrice);
			
			
		}
		
		/*
		 * Method to click on RBC Frozen Price Text box on the PriceList Page
		 */
		public void clickOnRBCFrozenPrice() throws InterruptedException
		{
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOf(inputRRBCFrozenPrice));
			
            actions.click().build().perform();
					
			
		}
		
		
		/*
		 * Method to set Data LRRBC Price Text box on the PriceList Page
		 */
		public void setApprovalComment(String plApprovalComment) throws InterruptedException
		{
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOf(priceListApprovalTxtArea));
			
            actions.click().build().perform();
			
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			priceListApprovalTxtArea.sendKeys(del + plApprovalComment);
			
			
		}
		
		/*
		 * Method to get LRRBC Price Text box on the PriceList Page
		 */
		public Float getSecondLrbcPriceSpan() throws InterruptedException
		{
			Thread.sleep(9000);
			//wait.until(ExpectedConditions.visibilityOf(inputSecondLRRBCPrice));
			//actions.click(inputSecondLRRBCPrice).click().build().perform();
			//Thread.sleep(1000);
			//wait.until(ExpectedConditions.visibilityOf(spanSDPPrice));
			//String LRRBCPriceSpan = spanLRRBCPrice.getAttribute("value");
			//String SecLRRBCPriceSpan = inputSecondLRRBCPrice.getText();
			String SecLRRBCPriceSpan = inputSecondLRRBCPrice.getAttribute("value");
			System.out.println("SecLRRBCPriceSpan SecLRRBCPriceSpan..... " +SecLRRBCPriceSpan);
			//String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.indexOf("$")+1);
			//String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.lastIndexOf("$"));
			//System.out.println("LRRBCSpanPrice LRRBCSpanPrice..... " +LRRBCSpanPrice);
			//float LRRBCPrice = Float.valueOf(LRRBCSpanPrice.trim()).floatValue();
			//float LRRBCPrice = Float.parseFloat(LRRBCSpanPrice);
			//float LRRBCPrice = Float.valueOf(String.format("%.2f", LRRBCSpanPrice));
			//float LRRBCPrice = Float.valueOf(SecLRRBCPriceSpan.trim()).floatValue();
			
			float LRRBCPrice = Float.parseFloat(SecLRRBCPriceSpan.substring(1));
			//double LRRBCPrice = Double.parseDouble(LRRBCPriceSpan.substring(1));
			//double LRRBCPrice = Double.valueOf(LRRBCSpanPrice);
			System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);
			//LRRBCPrice = Double.valueOf(LRRBCPrice);
			//System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);
		/*	LRRBCPrice = Float.valueOf(LRRBCPriceSpan.substring(1));
			System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);*/
			
			//LRRBCPrice = new Float(LRRBCPrice).valueOf();
			return LRRBCPrice;
            			
			
		}
		
		/*
		 * Method to get Two percent value on Second Year LRRBC Price Text box on the PriceList Page
		 */
		public Float getSecondYearTwoPercentLrbcPriceSpan() throws InterruptedException
		{
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOf(inputSecondEscalateLRRBCPrice));
			String SecLRRBCPriceSpan = inputSecondEscalateLRRBCPrice.getAttribute("value");
			System.out.println("LRRBCPriceSpan LRRBCPriceSpan..... " +SecLRRBCPriceSpan);
			String LRRBCSpanPrice = SecLRRBCPriceSpan.substring(SecLRRBCPriceSpan.indexOf("$")+1);
			//String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.lastIndexOf("$"));
			System.out.println("SecYearLRRBCSpanPrice SecYearLRRBCSpanPrice..... " +LRRBCSpanPrice);
			
			//float LRRBCPrice = Float.valueOf(LRRBCSpanPrice.trim()).floatValue();
			
			float LRBCPrice = Float.parseFloat(SecLRRBCPriceSpan.substring(1));
			
			System.out.println("SecYearLRRBCSpanPrice SecYearLRRBCSpanPrice..... " +LRBCPrice);
			
			
			float LRRBCPrice = ((LRBCPrice * 2) / 100);
			System.out.println("SecYearLRRBCSpanPrice SecYearLRRBCSpanPrice..... " +LRRBCPrice);
			float lrbcprice = Float.sum(LRRBCPrice, LRBCPrice);
			System.out.println("lrbcprice lrbcprice..... " +lrbcprice);
			DecimalFormat twoDForm = new DecimalFormat("#.##");
			float lrbcpricee =Float.valueOf(twoDForm.format(lrbcprice));
			System.out.println("SecYearLRRBCSpanPrice SecYearLRRBCSpanPrice..... " +lrbcpricee);
			return Float.valueOf(twoDForm.format(lrbcprice));
			//return lrbcprice;
            			
			
		}
		
		/*
		 * Method to get LRRBC Price Text box on the PriceList Page
		 */
		public Float getThirdLrbcPriceSpan() throws InterruptedException
		{
			Thread.sleep(9000);
			
			String ThirdLRRBCPriceSpan = inputThirdLRRBCPrice.getAttribute("value");
			System.out.println("ThirdLRRBCPriceSpan ThirdLRRBCPriceSpan..... " +ThirdLRRBCPriceSpan);
			
			
			float ThirdLRRBCPrice = Float.parseFloat(ThirdLRRBCPriceSpan.substring(1));
			
			System.out.println("ThirdLRRBCPrice ThirdLRRBCPrice..... " +ThirdLRRBCPrice);
			
			return ThirdLRRBCPrice;
			
		}
		
		/*
		 * Method to get LRRBC Price Text box on the PriceList Page
		 */
		public Float getLrbcPriceSpan() throws InterruptedException
		{
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOf(spanLRRBCPrice));
			
			//wait.until(ExpectedConditions.visibilityOf(spanSDPPrice));
			//String LRRBCPriceSpan = spanLRRBCPrice.getAttribute("value");
			String LRRBCPriceSpan = spanLRRBCPrice.getText();
			System.out.println("LRRBCPriceSpan LRRBCPriceSpan..... " +LRRBCPriceSpan);
			String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.indexOf("$")+1);
			//String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.lastIndexOf("$"));
			System.out.println("LRRBCSpanPrice LRRBCSpanPrice..... " +LRRBCSpanPrice);
			
			//float LRRBCPrice = Float.valueOf(LRRBCSpanPrice.trim()).floatValue();
			
			float LRBCPrice = Float.parseFloat(LRRBCPriceSpan.substring(1));
			
			System.out.println("LRRBCPrice LRRBCPrice..... " +LRBCPrice);
			
			
			float LRRBCPrice = ((LRBCPrice * 2) / 100);
			System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);
			float lrbcprice = Float.sum(LRRBCPrice, LRBCPrice);
			System.out.println("lrbcprice lrbcprice..... " +lrbcprice);
			DecimalFormat twoDForm = new DecimalFormat("#.##");
			float lrbcpricee =Float.valueOf(twoDForm.format(lrbcprice));
			System.out.println("lrbcpricee lrbcpricee..... " +lrbcpricee);
			return Float.valueOf(twoDForm.format(lrbcprice));
			//return lrbcprice;
            			
			
		}
		
		
		/*
		 * Method to get LRRBC Price Text box on the PriceList Page
		 */
		public Float getTwoPercentModalLrbcPrice() throws InterruptedException
		{
			Thread.sleep(9000);
			//wait.until(ExpectedConditions.visibilityOf(modalLRRBCPrice));
			
			//wait.until(ExpectedConditions.visibilityOf(spanSDPPrice));
			//String LRRBCPriceSpan = spanLRRBCPrice.getAttribute("value");
			String LRRBCPriceSpan = modalLRRBCPrice.getText();
			System.out.println("modalLRRBCPrice modalLRRBCPrice..... " +modalLRRBCPrice);
			String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.indexOf("$")+1);
			//String LRRBCSpanPrice = LRRBCPriceSpan.substring(LRRBCPriceSpan.lastIndexOf("$"));
			System.out.println("LRRBCSpanPrice LRRBCSpanPrice..... " +LRRBCSpanPrice);
			//float LRRBCPrice = Float.valueOf(LRRBCSpanPrice.trim()).floatValue();
			//float LRRBCPrice = Float.parseFloat(LRRBCSpanPrice);
			//float LRRBCPrice = Float.valueOf(String.format("%.2f", LRRBCSpanPrice));
			float LRRBCModalPrice = Float.valueOf(LRRBCSpanPrice.trim()).floatValue();
			
			LRRBCModalPrice = Float.parseFloat(LRRBCPriceSpan.substring(1));
			//double LRRBCPrice = Double.parseDouble(LRRBCPriceSpan.substring(1));
			//double LRRBCPrice = Double.valueOf(LRRBCSpanPrice);
			System.out.println("LRRBCModalPrice LRRBCModalPrice..... " +LRRBCModalPrice);
			//LRRBCPrice = Double.valueOf(LRRBCPrice);
			//System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);
		/*	LRRBCPrice = Float.valueOf(LRRBCPriceSpan.substring(1));
			System.out.println("LRRBCPrice LRRBCPrice..... " +LRRBCPrice);*/
			
			//LRRBCPrice = new Float(LRRBCPrice).valueOf();
			return LRRBCModalPrice;
            			
			
		}
		
		
		/*
		 * Method to set Data LRRBC Price Text box For Third Year on the PriceList Page
		 */
		public void setThirdYearLrbcPrice(float lrrbcPrice) throws InterruptedException
		{
			wait.until(ExpectedConditions.visibilityOf(inputThirdYearLRRBCPrice));
			
            actions.click().build().perform();
			
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputThirdYearLRRBCPrice.sendKeys(del + lrrbcPrice);
			
			
		}
		
		/*
		 * Method to set Data in SDP Price Text box on the PriceList Page
		 */
		public void setSDPPrice(int sdpPrice) throws InterruptedException
		{
			
			
			actions.moveToElement(inputSDPPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSDPPrice.sendKeys(del + sdpPrice);
			
						
		}
		
		/*
		 * Method to set Data in SDP Price Text box on the PriceList Page
		 */
		public void clickOnSDPPrice() throws InterruptedException
		{
			/*WebElement element = ldriver.findElement((By.xpath("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input")));
			actions.moveToElement(element).click().build().perform();*/
			
			//actions.moveToElement(inputSurBloodFeePrice).build().perform();
			//Thread.sleep(2000);
			/*String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSurBloodFeePrice.sendKeys(del + surBloodFee);*/
			//actions.click().build().perform();
            //wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input"))));			

			//WebElement element = ldriver.findElement((By.cssSelector(("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector(("div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(5) > div > lightning-input > div > input"))));
			//actions.moveToElement(element).click().build().perform();
			actions.moveToElement(element);
			Thread.sleep(5000);
			actions.click().build().perform();
			/*JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(5000);*/
			//executor.executeScript("arguments[0].click();", element);
			
				
		}
		
			
		/*
		 * Method to click on Initial RBC Price Text box on the PriceList Page
		 */
		public void clickOnInitialRBCPrice() throws InterruptedException
		{
			/*WebElement element = ldriver.findElement((By.xpath("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input")));
			actions.moveToElement(element).click().build().perform();*/
			
			//actions.moveToElement(inputSurBloodFeePrice).build().perform();
			//Thread.sleep(2000);
			/*String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSurBloodFeePrice.sendKeys(del + surBloodFee);*/
			//actions.click().build().perform();
            //wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input"))));			

			//WebElement element = ldriver.findElement((By.cssSelector(("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(5) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.xpath(("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input"))));
			//actions.moveToElement(element).click().build().perform();
			actions.moveToElement(element);
			Thread.sleep(5000);
			actions.click().build().perform();
			/*JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(5000);*/
			//executor.executeScript("arguments[0].click();", element);
			
				
		}
		
		/*
		 * Method to set Data in 24 Hour Price Text box on the PriceList Page
		 */
		public void set24HrPlasmaPrice(int plasmaPrice) throws InterruptedException
		{
			
			
			actions.moveToElement(input24HourPlasmaPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			input24HourPlasmaPrice.sendKeys(del + plasmaPrice);
		
			
		}
		
		
		
		/*
		 * Method to set Data in FPP Price Text box on the PriceList Page
		 */
		public void setFPPPrice(int fppPrice) throws InterruptedException
		{
			
			
			actions.moveToElement(inputFPPPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputFPPPrice.sendKeys(del + fppPrice);
			
			
		}
		
		
		/*
		 * Method to set Data in Cryo Price Text box on the PriceList Page
		 */
		public void setCryoPrice(int cryoPrice) throws InterruptedException
		{
			
			
			actions.moveToElement(inputCryoPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputCryoPrice.sendKeys(del + cryoPrice);
			
			
		}
		
		/*
		 * Method to set Data in Cryo Pools Price Text box on the PriceList Page
		 */
		public void setCryoPoolPrice(int cryoPoolPrice) throws InterruptedException
		{
						
			actions.moveToElement(inputCryoPoolsPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputCryoPoolsPrice.sendKeys(del + cryoPoolPrice);
						
		}
		
		
		/*
		 * Method to set Data in Deglyced Fee Price Text box on the PriceList Page
		 */
		public void setDeglycedFeePrice(int deglycedfee) throws InterruptedException
		{
			
			Thread.sleep(9000);
			//wait.until(ExpectedConditions.visibilityOf(inputDeglycedFeePrice));
			//WebElement element = ldriver.findElement((By.cssSelector(("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector(("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-vertical_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
			actions.moveToElement(element).build();
			Thread.sleep(5000);
			actions.click().build().perform();
			
			/*actions.moveToElement(inputDeglycedFeePrice);
			actions.click().build().perform();*/
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputDeglycedFeePrice.sendKeys(del + deglycedfee);
			
			
						
		}
		
		/*
		 * Method to set Data in Frozen Fee Price Text box on the PriceList Page
		 */
		public void setFrozenFeePrice(int frozenfee) throws InterruptedException
		{

			Thread.sleep(9000);		
			actions.moveToElement(inputFrozenFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputFrozenFeePrice.sendKeys(del + frozenfee);
						
		}
		
		/*
		 * Method to set Data in IRRD Fee Price Text box on the PriceList Page
		 */
		public void setIrrdFeePrice(int irrdFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input"))));		
			actions.moveToElement(inputIrrdFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputIrrdFeePrice.sendKeys(del + irrdFee);
						
		}
		
		/*
		 * Method to set Data in Auto Fee SDP Price Text box on the PriceList Page
		 */
		public void setFDPFeePrice(int AutoSdpFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input"))));			
			actions.moveToElement(inputAutoSDPFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputAutoSDPFeePrice.sendKeys(del + AutoSdpFee);
						
		}
		
		/*
		 * Method to set Data in IRRD Fee SDP Price Text box on the PriceList Page
		 */
		public void setIrrdpSdpFeePrice(int irrdpSdpFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input"))));			
			actions.moveToElement(inputIrrdpSDPFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputIrrdpSDPFeePrice.sendKeys(del + irrdpSdpFee);
						
		}
		
		/*
		 * Method to set Data in DIRD Fee Price Text box on the PriceList Page
		 */
		public void setDirdFeePrice(int dirdFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input"))));			
			actions.moveToElement(inputDirdFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputDirdFeePrice.sendKeys(del + dirdFee);
						
		}
		
		/*
		 * Method to set Data in Washed Fee Price Text box on the PriceList Page
		 */
		public void setWashedFeePrice(int washedFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			actions.moveToElement(inputWashedFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputWashedFeePrice.sendKeys(del + washedFee);
						
		}
		
		/*
		 * Method to set Data in SUR Blood Type LRBC Price Text box on the PriceList Page
		 */
		public void setSurBloodTypeLrbcPrice(int surbloodtypelrbc)
		{
						
			actions.moveToElement(inputSurBloodTypeLrbcPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSurBloodTypeLrbcPrice.sendKeys(del + surbloodtypelrbc);
						
		}
		
		/*
		 * Method to set Data in SHP Scheduled Price Text box on the PriceList Page
		 */
		public void setShpScheduledPrice(int shpscheduled)
		{
						
			actions.moveToElement(inputShpScheduledPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputShpScheduledPrice.sendKeys(del + shpscheduled);
						
		}
		
		/*
		 * Method to set Data in SHP No Charge Price Text box on the PriceList Page
		 */
		public void setShpNoChargePrice(int shpnocharge)
		{
						
			actions.moveToElement(inputShpNoChargePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputShpNoChargePrice.sendKeys(del + shpnocharge);
						
		}
		
		
		
		
		/*
		 * Method to set Data in Type AB Plasma Fee Price Text box on the PriceList Page
		 */
		public void setTypeABFeePrice(int typeabFee)
		{
						
			actions.moveToElement(inputTypeABPlasmaFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputTypeABPlasmaFeePrice.sendKeys(del + typeabFee);
						
		}
		
		/*
		 * Method to set Data in Hemoglobin Fee Price Text box on the PriceList Page
		 */
		public void setHemoglobinFeePrice(int hemoglobinFee)
		{
						
			actions.moveToElement(inputHemoglobinPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputHemoglobinPrice.sendKeys(del + hemoglobinFee);
						
		}
		
		/*
		 * Method to set Data in AntiCMVFee Fee Price Text box on the PriceList Page
		 */
		public void setantiCMVFeePrice(int antiCMVFee)
		{
						
			actions.moveToElement(inputAntiCMVPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputAntiCMVPrice.sendKeys(del + antiCMVFee);
						
		}
		
		/*
		 * Method to set Data in Type ABC Cryo Fee Price Text box on the PriceList Page
		 */
		public void setTypeABCCryoFeePrice(int typeABCCryoFee)
		{
						
			actions.moveToElement(inputTypeABCryoPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputTypeABCryoPrice.sendKeys(del + typeABCCryoFee);
						
		}
		
		/*
		 * Method to set Data in DIS RBC Fee Price Text box on the PriceList Page
		 */
		public void setDisRbcPrice(int disRbcPrice)
		{
						
			actions.moveToElement(inputDISRBCPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputDISRBCPrice.sendKeys(del + disRbcPrice);
						
		}
		
		/*
		 * Method to set Data in SHP Hospital Price Text box on the PriceList Page
		 */
		public void setShpHospitalFee(int shpHospitalFee)
		{
						
			actions.moveToElement(inputSHPHospitalPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSHPHospitalPrice.sendKeys(del + shpHospitalFee);
						
		}
		
		/*
		 * Method to set Data in DIS SDP Price Text box on the PriceList Page
		 */
		public void setDisSdpFee(int disSDPFee)
		{
						
			actions.moveToElement(inputDISSDPPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputDISSDPPrice.sendKeys(del + disSDPFee);
						
		}
		
		/*
		 * Method to set Data in Type ABC Cryo Price Text box on the PriceList Page
		 */
		public void setTypeAbcCryoFee(int typAbcCryoFee)
		{
						
			actions.moveToElement(inputTypeABCryoFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputTypeABCryoFeePrice.sendKeys(del + typAbcCryoFee);
						
		}
		
		/*
		 * Method to set Data in SHP Unscheduled Price Text box on the PriceList Page
		 */
		public void setSHPUnscheduledFee(int SHPUnscheduledFee)
		{
						
			actions.moveToElement(inputSHPUnscheduledPrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSHPUnscheduledPrice.sendKeys(del + SHPUnscheduledFee);
						
		}
		
		/*
		 * Method to set Data in SAT Fee Price Text box on the PriceList Page
		 */
		public void setSATFee(int SATFee)
		{
						
			actions.moveToElement(inputSATFeePrice);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSATFeePrice.sendKeys(del + SATFee);
						
		}
		
		/*
		 * Method to set Data in SUR Blood Fee Price Text box on the PriceList Page
		 */
		public void setSURBloodFee(float surBloodFee) throws InterruptedException
		{
						
			actions.moveToElement(inputSurBloodFeePrice);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSurBloodFeePrice.sendKeys(del + surBloodFee);
			Thread.sleep(3000);
						
		}
		
		
		
		/*
		 * Method to set Data in Typed AB Pooled Cryo Free Price Text box on the PriceList Page
		 */
		public void setTypeABPooledCryoFee(int pooledCryoFee)
		{
						
			actions.moveToElement(inputTypeABPooledCryoFeePrice);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputTypeABPooledCryoFeePrice.sendKeys(del + pooledCryoFee);
						
		}
		

		/*
		 * Method to set Data in SDP PASC Price Text box on the PriceList Page
		 */
		public void setSdpPascFee(int sdppascFee)
		{
						
			actions.moveToElement(inputSdpPascFeePrice);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSdpPascFeePrice.sendKeys(del + sdppascFee);
						
		}
		
		
		
		/*
		 * Method to set Data in SDP PASC Price Text box on the PriceList Page
		 */
		public void setSdpPascPathRedFee(int sdppascPathRedFee)
		{
						
			actions.moveToElement(inputSdpPascPathRedFee);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputSdpPascPathRedFee.sendKeys(del + sdppascPathRedFee);
						
		}
		
		/*
		 * Method to set Data in Deglyced Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearDeglycedFeePrice(int deglycedfee) throws InterruptedException
		{
						
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + deglycedfee);
						
		}
		
		
		/*
		 * Method to set Data in Frozen Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearFrozenFeePrice(int frozenfee) throws InterruptedException
		{
			
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + frozenfee);
						
		}
		
		
		
		
		/*
		 * Method to set Data in IRRD Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearIrrdFeePrice(int irrdFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + irrdFee);
						
		}
		
		/*
		 * Method to set Data in Auto Fee SDP Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearFDPFeePrice(int AutoSdpFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + AutoSdpFee);
						
		}
		
		/*
		 * Method to set Data in IRRD Fee SDP Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearIrrdpSdpFeePrice(int irrdpSdpFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(3) > div > lightning-input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(3) > div > lightning-input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + irrdpSdpFee);
						
		}
		
		
		
		/*
		 * Method to set Data in DIRD Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearDirdFeePrice(int dirdFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + dirdFee);
						
		}
		
		/*
		 * Method to set Data in Washed Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearWashedFeePrice(int washedFee)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + washedFee);
						
		}
		
		/*
		 * Method to set Data in SUR Blood Type LRBC Price Text box for second year on the PriceList Page
		 */
		public void setSeconYearSurBloodTypeLrbcPrice(int surbloodtypelrbc)
		{
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + surbloodtypelrbc);
						
		}
		
		/*
		 * Method to set Data in SHP Scheduled Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearShpScheduledPrice(int shpscheduled)
		{
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + shpscheduled);
						
		}
		
		/*
		 * Method to set Data in SHP No Charge Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearShpNoChargePrice(int shpnocharge)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + shpnocharge);
						
		}
		
		
		
		
		/*
		 * Method to set Data in Type AB Plasma Fee Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearTypeABFeePrice(int typeabFee)
		{
			
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + typeabFee);
						
		}
		
		/*
		 * Method to set Data in Hemoglobin Fee Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearHemoglobinFeePrice(int hemoglobinFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + hemoglobinFee);
						
		}
		
		/*
		 * Method to set Data in AntiCMVFee Fee Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearAntiCMVFeePrice(int antiCMVFee)
		{
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + antiCMVFee);
						
		}
		
		/*
		 * Method to set Data in Type ABC Cryo Fee Price Text box for Second year on the PriceList Page
		 */
		public void setSecondYearTypeABCCryoFeePrice(int typeABCCryoFee)
		{
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + typeABCCryoFee);
						
		}
		
		/*
		 * Method to set Data in DIS RBC Fee Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearDisRbcPrice(int disRbcPrice)
		{
			
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + disRbcPrice);
						
		}
		
		/*
		 * Method to set Data in SHP Hospital Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearShpHospitalFee(int shpHospitalFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(9) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(9) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + shpHospitalFee);
						
		}
		
		/*
		 * Method to set Data in DIS SDP Price Text box for Second Year on the PriceList Page
		 */
		public void setSecondYearDisSdpFee(int disSDPFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(10) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(10) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + disSDPFee);
						
		}
		
		/*
		 * Method to set Data in Type ABC Cryo Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearTypeAbcCryoFee(int typAbcCryoFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(11) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(11) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + typAbcCryoFee);
						
		}
		
		/*
		 * Method to set Data in SHP Unscheduled Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearSHPUnscheduledFee(int SHPUnscheduledFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(12) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(12) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + SHPUnscheduledFee);
						
		}
		
		/*
		 * Method to set Data in SAT Fee Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearSATFee(int SATFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(13) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(13) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + SATFee);
						
		}
		
		/*
		 * Method to set Data in SUR Blood Fee Price Text box for second year on the PriceList Page
		 */
		public void setsecondYearSURBloodFee(float surBloodFee) throws InterruptedException
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(14) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(2) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tbody > tr:nth-child(14) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + surBloodFee);
			Thread.sleep(3000);
						
		}
		
		/*
		 * Method to set Data in LRRBC Price Text box for second year on the PriceList Page
		 */
		public void clickOnSecondYearLRRBCPrice() throws InterruptedException
		{
			
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
			WebElement element = ldriver.findElement((By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			
			
						
		}
		
		
		
		/*
		 * Method to set Data in Typed AB Pooled Cryo Free Price Text box second year on the PriceList Page
		 */
		public void setSecondYearTypeABPooledCryoFee(int pooledCryoFee)
		{
           wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + pooledCryoFee);
						
		}
		

		/*
		 * Method to set Data in SDP PASC Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearSdpPascFee(int sdppascFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + sdppascFee);
						
		}
		
		
		
		/*
		 * Method to set Data in SDP PASC Price Text box for second year on the PriceList Page
		 */
		public void setSecondYearSdpPascPathRedFee(int sdppascPathRedFee)
		{
			
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input"))));			
			WebElement element = ldriver.findElement((By.cssSelector("div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			element.sendKeys(del + sdppascPathRedFee);
						
		}
		
		/*
		 * Method to click on the Save button under PriceList Page
		 */
		public void clickOnSaveButton()
		{
						
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].click();", saveButton);			
		}
		
		/*
		 * Method to click on the Next button under PriceList Page
		 */
		
		public void clickOnNextButton() throws InterruptedException
		{
			
			WebElement element = ldriver.findElement((By.xpath("//button[contains(.,'Next')]")));
			actions.moveToElement(element).click().build().perform();
			Thread.sleep(5000);
			
			
			}
		
		/*
		 * Method to click on the Next button under PriceList Page
		 */
			
		public void clickOnTopNextButton() throws InterruptedException
		{
			
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(4000);
			
				}
		

		/*
		 * Method to click on the Next button under PriceList Page
		 */
		
		
		public void clickOnSecondNextButton() throws InterruptedException
		{
			
			WebElement element = ldriver.findElement((By.xpath("//button[contains(.,'Next')]")));
			actions.moveToElement(element).click().build().perform();
			Thread.sleep(5000);
			/*WebElement element = ldriver.findElement((By.xpath("//button[contains(@class,'slds-button slds-button_neutral')][contains(.,'Next')]")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			Thread.sleep(3000);
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(3000);*/
			
			/*Thread.sleep(3000);
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(3000);*/
			
			/*wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)"))));
			WebElement element = ldriver.findElement((By.cssSelector("div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
			actions.moveToElement(element);
			actions.click().build().perform();*/
			
		}
		
		
		/*
		 * Method to click on the Escalate button under PriceList Page
		 */
		public void clickOnEscalateButton() throws InterruptedException
		{
			WebElement element = ldriver.findElement((By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > button")));
			element.click();
			Thread.sleep(3000);
		}
		
		/*
		 * Method to click on the Escalate button under PriceList Page
		 */
		public void clickOnSecondEscalateButton() throws InterruptedException
		{
				
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > button"))));
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > button")));
			actions.moveToElement(element);
			actions.click().build().perform();
		}
		
		/*
		 * Method to click on the ApplyAll button under PriceList Page
		 */
		public void clickOnApplyAllButton() throws InterruptedException
		{
		    applyAllButton.click();
			Thread.sleep(4000);
			/*wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
			Thread.sleep(4000);
			WebElement element = ldriver.findElement((By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();*/
		}
		
		/*
		 * Method to click on the ApplyAll button under PriceList Page
		 */
		
		
		public void clickOnSecondApplyAllButton() throws InterruptedException
		{
						
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#save > section > div > footer > button:nth-child(2)"))));
			WebElement element = ldriver.findElement((By.cssSelector("#save > section > div > footer > button:nth-child(2)")));
			actions.moveToElement(element);
			actions.click().build().perform();
		}
		
		
		/*
		 * Method to click on the Save button under Translate Page
		 */
		
		public void clickOnTranslateSaveButton() throws InterruptedException
		{
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > ol > li:nth-child(1) > article > div > div > div > div > div > div.slds-media__figure.slds-media__figure_reverse > p > button")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			
			
		}
		
		/*
		 * Method to wait until the Saving Pricelist Modal is not visible on the Create Assessment Tool
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilSavingPriceListModalIsNotDisplayed()
		{
		fluentWait.until(ExpectedConditions.invisibilityOf(savingPricelistModal));
		}
		
		
		/*
		 * Method to click on the Apply button under Translate Page
		 */
		
		public void clickOnApplyButton() throws InterruptedException
		{
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > ol > li:nth-child(2) > article > div > div > div > div > div > div.slds-media__figure.slds-media__figure_reverse > p > button")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			
		}
		
		/*
		 * Method to click on the Exit button under Translate Page
		 */
		
		public void clickOnExitButton() throws InterruptedException
		{
			WebElement element = ldriver.findElement((By.cssSelector("#save > section > div > footer > button.slds-button.slds-button_brand")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			
		}
}
