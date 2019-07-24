package com.archs.pageObjects;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalSalesContractPage {

	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;

	public HospitalSalesContractPage (WebDriver rdriver) {
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
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li.tabs__item.active.uiTabItem > a > span.title")
	@CacheLookup
	WebElement DetailsTab;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(3) > a > span.title")
	@CacheLookup
	WebElement TranslateTab;
	
	@FindBy (how = How.CSS, using = "div > ol > li:nth-child(2) > article:nth-child(3) > div > div > div > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > div")
	@CacheLookup
	WebElement EffectiveDateInput;
	
	@FindBy (how = How.CSS, using = "li:nth-child(4) > article > div > div > div > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > button")
	@CacheLookup
	WebElement GoButton;
	
	@FindBy (how = How.XPATH, using = "//div/div[2]/table[contains(@class,'calGrid')]/tbody")
	@CacheLookup
	WebElement EffectiveStartDate;
	
	/*
	 * Method to click on Go Button on the Contract Page
	 */
	
	public void clickOnGoButton()
	{
	  GoButton.click();
	}
	
	/*
	  Method to wait until Translate Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilTranslateTabIsDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(TranslateTab));
		TranslateTab.click();
	}
	
	public void selectEffectiveDate() {
		
		Calendar now = Calendar.getInstance();	
		
		 int currentdate = now.get(Calendar.DATE);
		 String effectivedate = Integer.toString(currentdate);
		 
				
		// Below logic will get all the TD and TR from the DatePicker body
		 List<WebElement> columns = EffectiveStartDate.findElements(By.tagName("td"));
		 for (WebElement cell: columns) {
		 String day = cell.getText();
	     
		 // Below logic will click the respective Date on the Contract End Date picker
	     if (cell.getText().contains(effectivedate)) {
	     ldriver.findElement(By.xpath("//div/div[2]/table[contains(@class,'calGrid')]/tbody/tr/td/span[text()= "+day+"]")).click();
	     break;
	         }
	       }
		 }
	
	/*
	 * Method to click on Effective Date Input under Contract Page
	 */
	
	public void clickOnEffectiveDate() throws InterruptedException
	{
		/*Actions builder = new Actions(ldriver);
		
		Action mouseOverDateFiled = builder.moveToElement(EffectiveDateInput).build();
		mouseOverDateFiled.perform();
		wait.until(ExpectedConditions.elementToBeClickable(EffectiveDateInput));*/
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0, 600)", "");
		//WebElement element = ldriver.findElement(By.cssSelector("div > ol > li:nth-child(2) > article:nth-child(3) > div > div > div > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > div"));
		//js.executeScript("arguments[0].click;", element);
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(EffectiveDateInput));
		//EffectiveDateInput.click();
	}
}
