package com.archs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;

//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;

public class HospitalSalesAccountDetailsPage {
WebDriver ldriver;
private WebDriverWait wait;
private Wait fluentWait;
	
	@SuppressWarnings("deprecation")
	public HospitalSalesAccountDetailsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
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
	
	@FindBy (how = How.CSS, using = "#oneHeader > div.bBottom > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root.navItem.slds-context-bar__item.slds-shrink-none.slds-is-active > a")
	@CacheLookup
	WebElement tabAccount;
	
	@FindBy (how = How.CSS, using = "div.slds-page-header.slds-page-header_record-home.s1FixedTop.forceHighlightsStencilDesktop.forceRecordLayout > div > div.slds-col.slds-no-flex.slds-grid.slds-grid_vertical-align-center.actionsContainer > ul > li:nth-child(1) > a > div")
	@CacheLookup
	WebElement btnCAT;
	
	@FindBy (how = How.XPATH, using = "//div/div[1]/div/div[1]/div/div[1]/div/header/div[2]/div/div[2]/ul/li[1]/a[contains(@title,'CAT') and contains(@role,'button')]")
	@CacheLookup
	WebElement buttonCAT;
	
	//@FindBy (how = How.CSS, using = "div.slds-combobox__form-element > fieldset > div > div > div > div:nth-child(2) > div > button")
	@FindBy (how = How.CSS, using = "#modal-content-id-1 > div > div.slds-p-vertical_x-small.slds-p-horizontal_large.slds-shrink-none.slds-theme_shade > div.slds-form-element > div > div > div > div.slds-combobox__form-element > fieldset > div > div > div > div:nth-child(2) > div > button")
	@CacheLookup
	WebElement btnCreateNewAssessment;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > section > div > header > lightning-progress-bar > div")
	@CacheLookup
	WebElement catProgressBar;
	
	
	@FindBy (how = How.CSS, using = "div.slds-page-header.cContractAssessmentToolApp > ul:nth-child(4) > div > table > tr:nth-child(64) > td.row-64.col-A")
	@CacheLookup
	WebElement TextCreateNewAssessmentTool;
	
	@FindBy (how = How.CSS, using = "#oneHeader > div.bBottom > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root:nth-child(7) > a")
	@CacheLookup
	WebElement linkContractAssessments;
	
	@FindBy (how = How.CSS, using = "#modal-content-id-1 > div > div.slds-scrollable.slds-grow > div > table > tbody > tr:nth-child(1) > td:nth-child(7) > div > a")
	//@FindBy (how = How.CSS, using = "#modal-content-id-1 > div > div.slds-p-vertical_x-small.slds-p-horizontal_large.slds-shrink-none.slds-theme_shade > div.slds-form-element > div > div > div > div.slds-combobox__form-element > fieldset > div > div > div > div:nth-child(2) > div > button")
	@CacheLookup
	WebElement linkCATContract;
	
	
	/*
	 * Method to Click on CAT Button on the Account Details Page 
	 */	
	public void clickOnCATBtn()
	{
	btnCAT.click();		
	}
	
	/*
	 * Method to Click on CAT Button on the Account Details Page 
	 */	
	public void clickOnCATButton()
	{
	
	WebElement element = ldriver.findElement((By.xpath("//div/div[1]/div/div[1]/div/div[1]/div/header/div[2]/div/div[2]/ul/li[1]/a[contains(@title,'CAT') and contains(@role,'button')]")));
	JavascriptExecutor executor = (JavascriptExecutor)ldriver;
	executor.executeScript("arguments[0].click();", element);
	}
	
	/*
	 * Method to Click on Create New Assessment Button on the Create Assessment Pop Up 
	 */
	public void clickOnCreateNewAssesmentBtn()
	{
	wait.until(ExpectedConditions.visibilityOf(btnCreateNewAssessment));
	ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	btnCreateNewAssessment.click();	
	}
	
	/*
	 * Method to Click on Create New Assessment Button on the Create Assessment Pop Up 
	 */
	public void clickOnCreateNewAssesmentButton() throws InterruptedException
	{
	wait.until(ExpectedConditions.visibilityOf(btnCreateNewAssessment));
	
	//wait.until(ExpectedConditions.visibilityOf(linkCATContract));

	Thread.sleep(3000);
	WebElement element = ldriver.findElement((By.xpath("//div/div[1]/div[1]/div/div/div/div[1]/fieldset/div/div/div/div[2]/div/button[contains(@class,'slds-button slds-button_neutral') and contains(.,'Create New Assessment ')]")));
	JavascriptExecutor executor = (JavascriptExecutor)ldriver;
	executor.executeScript("arguments[0].click();", element);	
	}
	
	
	
	/*
	 * Method to Click on CAT Contract Link on the Create Assessment Pop Up 
	 */
	public void clickOnCATContractLink() throws InterruptedException
	{
	wait.until(ExpectedConditions.visibilityOf(btnCreateNewAssessment));
	Thread.sleep(3000);
	WebElement element = ldriver.findElement((By.cssSelector("#modal-content-id-1 > div > div.slds-scrollable.slds-grow > div > table > tbody > tr:nth-child(1) > td:nth-child(7) > div > a")));
	JavascriptExecutor executor = (JavascriptExecutor)ldriver;
	executor.executeScript("arguments[0].click();", element);	
	}
	
	/*
	 * Method to Click on Create Contract Button on the Create Assessment Pop Up Modal Window 
	 */
	public void clickOnCreateContractButton()
	{
	//wait.until(ExpectedConditions.visibilityOf(btnCreateNewAssessment));
	WebElement element = ldriver.findElement((By.xpath("//div[contains(@id,'modal-content-id-1')]//div/div[2]/div/table/tbody/tr[1]/td[5]//button[contains(.,'Create Contract')]")));
	JavascriptExecutor executor = (JavascriptExecutor)ldriver;
	executor.executeScript("arguments[0].click();", element);	
	}
	
	/*
	 * Method to wait until CAT button is visible on the Account Details Page
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilCATtBtnIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(btnCAT));
	}
	
	/*
	 * Method to wait until CAT button is visible on the Account Details Page
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilCATButtonIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(buttonCAT));
	}

	/*
	 * Method to wait until Create CAT button is visible on the Create Assessment Pop Up
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilCreateAssesmentBtnIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(btnCreateNewAssessment));
	}
	
	/*
	 * Method to wait until the Progress Bar is visible on the Create Assessment Tool
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilProgressBarIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(catProgressBar));
	}
	
	
	/*
	 * Method to wait until the Progress Bar is not visible on the Create Assessment Tool
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilProgressBarIsNotDisplayed()
	{
	fluentWait.until(ExpectedConditions.invisibilityOf(catProgressBar));
	}
	
	/*
	 * Method to wait until Contract Assessment Link is visible on the Create Assessment Pop Up
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilContractAssessmentLinkIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(linkContractAssessments));
	}
	
	/*
	 * Method to click on Contract Assessment Link on the Header
	 */
	public void clickOnContractAssessmentLink()
	{
		wait.until(ExpectedConditions.visibilityOf(linkContractAssessments));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkContractAssessments.sendKeys(Keys.ENTER);
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to wait until Account Tab is visible on top of the Account Details Page
	 */
	public void waitUntilAccountTabIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(tabAccount));
	}
	
	/*
	 * Method to click on Account Tab Link on the Header
	 */
	@SuppressWarnings("unchecked")
	public void clickOnAccountTabLink()
	{
		fluentWait.until(ExpectedConditions.elementToBeClickable(tabAccount));
		//ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tabAccount.click();
		//ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
