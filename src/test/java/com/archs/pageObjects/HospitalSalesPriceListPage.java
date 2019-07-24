package com.archs.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputLRRBCPrice;
		
		
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td.comment > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputThirdYearLRRBCPrice;
		
		@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input")
		@CacheLookup
		WebElement inputRBCPrice;
		
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
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDeglycedFeePrice;
		
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputFrozenFeePrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputIrrdFeePrice;
		
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(5) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputAutoSDPFeePrice;
		
		
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(6) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputIrrdpSDPFeePrice;
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(7) > td:nth-child(3) > div > lightning-input > div > input")
		@CacheLookup
		WebElement inputDirdFeePrice;
		
		
		@FindBy (how = How.CSS, using = "div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(2) > div:nth-child(1) > div.slds-m-around_x-small.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(8) > td:nth-child(3) > div > lightning-input > div > input")
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
			wait.until(ExpectedConditions.visibilityOf(inputLRRBCPrice));
			
            actions.click().build().perform();
			
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputLRRBCPrice.sendKeys(del + lrrbcPrice);
			
			
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
			
			
			actions.moveToElement(inputSDPPrice);
			actions.click().build().perform();
			
			
						
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
			
			
			actions.moveToElement(inputDeglycedFeePrice);
			actions.click().build().perform();
			
			String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
			inputDeglycedFeePrice.sendKeys(del + deglycedfee);
			
			
						
		}
		
		/*
		 * Method to set Data in Frozen Fee Price Text box on the PriceList Page
		 */
		public void setFrozenFeePrice(int frozenfee) throws InterruptedException
		{
						
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
			
			WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(7000);
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
			WebElement element = ldriver.findElement((By.cssSelector("div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
			JavascriptExecutor executor = (JavascriptExecutor)ldriver;
			executor.executeScript("arguments[0].scrollIntoView(true);", element);
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(4000);
			
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
			Thread.sleep(9000);
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
			Thread.sleep(4000);
			WebElement element = ldriver.findElement((By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")));
			actions.moveToElement(element);
			actions.click().build().perform();
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
		
		
}
