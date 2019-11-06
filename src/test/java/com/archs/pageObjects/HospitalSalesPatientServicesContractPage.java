package com.archs.pageObjects;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class HospitalSalesPatientServicesContractPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;
	Actions actions;
	
	@SuppressWarnings("deprecation")
	public HospitalSalesPatientServicesContractPage(WebDriver rdriver)
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
	
	@FindBy (how = How.XPATH, using = "//input[contains(@value,'012G00000010tyFIAQ')]")
	@CacheLookup
	WebElement radioPatientServices;
	
	@FindBy (how = How.XPATH, using = "//button[contains(.,'Next')]")
	@CacheLookup
	WebElement btnNext;
	
	
	@FindBy (how = How.XPATH, using = "//label[contains(.,'Contract Start Date')]/following-sibling::div/input")
	@CacheLookup
	WebElement inputContractStartDate;
	
	@FindBy (how = How.CSS, using = "div > div.uiDatePickerGrid--default.uiDatePickerGrid > table > tbody > tr:nth-child(7) > td > span")
	@CacheLookup
	WebElement linkContractStartDateToday;
	
	@FindBy (how = How.CSS, using = "div > div > table > tbody > tr > td > span.today.slds-show--inline-block.slds-text-link.slds-p-bottom--x-small")
	@CacheLookup
	WebElement linkContractEditStartDateToday;
	
	@FindBy (how = How.XPATH, using = "//label[contains(.,'Contract Start Date')]/following-sibling::div/input/following-sibling::a")
	@CacheLookup
	WebElement iconContractStartDate;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class,'visible DESKTOP uiDatePicker--default uiDatePicker')]/div/div[1]/div[contains(@class,'slds-shrink-none')]")
	@CacheLookup
	WebElement clickOnContractEndDateDrpDwn;
	
	@FindBy (how = How.CSS, using = "div.slds-shrink-none > label > select")
	@CacheLookup
	WebElement clickOnContractEditEndDateDrpDwn;
	
	@FindBy (how = How.XPATH, using = "//label[contains(.,'Contract End Date')]/following-sibling::div/input")
	@CacheLookup
	WebElement inputContractEndDate;
	
	@FindBy (how = How.XPATH, using = "//label[contains(.,'Contract End Date')]/following-sibling::div/input/following-sibling::a")
	@CacheLookup
	WebElement iconContractEndDate;
	
	@FindBy (how = How.CSS, using = "div > div:nth-child(2) > div.slds-grid.slds-col.slds-is-editing.slds-has-flexi-truncate.full.forcePageBlockItem.forcePageBlockItemEdit > div > div > div > div > a.datePicker-openIcon.display")
	@CacheLookup
	WebElement iconEditContractEndDate;
	
	
	@FindBy (how = How.XPATH, using = "//div/div[2]/table[contains(@class,'calGrid')]/tbody")
	@CacheLookup
	WebElement PastContractEndDate;
	
	@FindBy (how = How.XPATH, using = "//span[contains(.,'Liquidated Damages')]/following-sibling::div//a")
	@CacheLookup
	WebElement drpdwnLiqidateDamages;
	
	@FindBy (how = How.XPATH, using = "//span[contains(.,'Payment Terms')]/following-sibling::div//a")
	@CacheLookup
	WebElement drpdwnPaymentTerms;
	
	@FindBy (how = How.XPATH, using = "//span[contains(.,'Type')]/following-sibling::div//a")
	@CacheLookup
	WebElement drpdwnType;
	
	@FindBy (how = How.XPATH, using = "//span[contains(.,'Status')]/following-sibling::div//a")
	@CacheLookup
	WebElement drpdwnStatus;
		
	@FindBy (how = How.CSS, using = "div > div > div.inlineFooter > div > div > button.slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton")
	@CacheLookup
	WebElement btnSave;
	
	//@FindBy (how = How.CSS, using = "button.slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton")
	@FindBy (how = How.CSS, using = "html > body > div > div > div > div > div > div > div > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton")
	@CacheLookup
	WebElement btnEditPSSave;
	
	
	@FindBy (how = How.XPATH, using = "//input[contains(@placeholder,'Search Accounts...')]")
	@CacheLookup
	WebElement inputSearchAccounts;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@title,'FAIRVIEW SOUTHDALE HOSPITAL')]")
	@CacheLookup
	WebElement selectParticularSearchAccounts;
	
	@FindBy (how = How.XPATH, using = "//ul/li/a//div[2]/div[contains(@class,'primaryLabel slds-truncate slds-lookup__result-text')]")
	@CacheLookup
	WebElement selectAllSearchAccounts;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class,'test-id__section-content slds-section__content section__content')]//div/div[4]/div/div/div[2]/span[contains(.,'<Table>')]")
	@CacheLookup
	WebElement spanAttachmentA2;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(4) > a")
	@CacheLookup
	WebElement PriceListTab;
	
	@FindBy (how = How.XPATH, using = "//select[contains(@class,'version-width select uiInput uiInputSelect uiInput--default uiInput--select')]")
	@CacheLookup
	WebElement drpdwnVersion;
	
	@FindBy (how = How.CSS, using = "div > div > ul:nth-child(2) > li:nth-child(2) > p.slds-text-body_regular > button")
	@CacheLookup
	WebElement btnApply;
	
	@FindBy (how = How.CSS, using = "#modal-content-id-1 > p:nth-child(4) > button")
	@CacheLookup
	WebElement ApplyButton;
	
	@FindBy (how = How.XPATH, using = "//body/center/div/table/tbody/tr[2]/th[3]/span[contains(@style,'text-decoration:underline; color:red')]")
	@CacheLookup
	WebElement tableHeaderYear1;
	
	@FindBy (how = How.CSS, using = "body > center > div > table > tbody > tr:nth-child(2) > th:nth-child(4)")
	@CacheLookup
	WebElement tableHeaderYear2;
	
	@FindBy (how = How.CSS, using = "body > center > div > table > tbody > tr:nth-child(2) > th:nth-child(5)")
	@CacheLookup
	WebElement tableHeaderYear3;
	
	@FindBy (how = How.CSS, using = "div > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(2) > button.slds-button.slds-button_neutral")
	@CacheLookup
	WebElement btnPricing;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div > button.slds-button.slds-button_neutral")
	@CacheLookup
	WebElement btnGoBack;
	
	@FindBy (how = How.CSS, using = "#modal-content-id-1 > ol > li > article > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > h3")
	@CacheLookup
	WebElement msgSuccess;
	
	@FindBy (how = How.CSS, using = "#save > section > div > footer > button.slds-button.slds-button_brand")
	@CacheLookup
	WebElement btnExit;
	
	
	/*
	 * Method to Click on Patient Services Radio Button on Contract List View Page 
	 */	
	public void clickOnPatientServicesRadioBtn()
	{
		actions.moveToElement(radioPatientServices).click().build().perform();
	}
	
	/*
	 * Method to Click on Next button on Contract List View Page 
	 */	
	public void clickOnNextBtn()
	{
		actions.moveToElement(btnNext).click().build().perform();
	}
	
	
	/*
	 * Method to click on Contract Start Date on the Create 
	 * New Patient Survey Contract
	 */
	@SuppressWarnings("unchecked")
	public void clickOnContractStartDateText()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(inputContractStartDate));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		inputContractStartDate.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to click on Today link on Create New Patient Survey Contract
	 */
	public void clickOnContractStartDateTodaylink()
	{
		wait.until(ExpectedConditions.visibilityOf(linkContractStartDateToday));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkContractStartDateToday.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	/*
	 * Method to click on Today link on Create New Patient Survey Contract
	 */
	public void clickOnContractEditStartDateTodaylink()
	{
		wait.until(ExpectedConditions.visibilityOf(linkContractEditStartDateToday));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkContractEditStartDateToday.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to click on Calendar End Date Icon Create New Patient Survey Contract
	 */
	public void clickOnCalendarEndDateIcon()
	{
		wait.until(ExpectedConditions.visibilityOf(iconContractEndDate));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iconContractEndDate.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	/*
	 * Method to click on Calendar Start Date Icon Create New Patient Survey Contract
	 */
	@SuppressWarnings("unchecked")
	public void clickOnCalendarStartDateIcon() throws InterruptedException
	{
		fluentWait.until(ExpectedConditions.visibilityOf(iconContractStartDate));
		//wait.until(ExpectedConditions.visibilityOf(iconContractStartDate));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iconContractStartDate.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//fluentWait.until(ExpectedConditions.visibilityOf(linkContractStartDateToday));
	}
	/*
	 * Method to click on Calendar End Date Icon Edit New Patient Survey Contract
	 */
	public void clickOnCalendarEndDateEditIcon()
	{
		wait.until(ExpectedConditions.visibilityOf(iconEditContractEndDate));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iconEditContractEndDate.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to get One Future year from current year 
	 */
	public int getselectFutureYear() {
		Calendar now = Calendar.getInstance();
		 now.add(Calendar.YEAR,1);
		 int futureyear = now.get(Calendar.YEAR);
		 return futureyear;
		}
	
	/*
	 * Method to select One Future year Contract End Date DropDown 
	 */
	public void selectContractEndDateDrpDwn() {
		
		wait.until(ExpectedConditions.visibilityOf(clickOnContractEndDateDrpDwn));
		
		// Below logic will get future 1 year from current year
		 Calendar now = Calendar.getInstance();
		 now.add(Calendar.YEAR,1);
		 int futureyear = now.get(Calendar.YEAR);
		 String futureyears = Integer.toString(futureyear);
		 String years = futureyears;
		
		 //Below logic will get the past date by -1 from current date
		 now.add(Calendar.DATE, -1);
		 int pastdate = now.get(Calendar.DATE);
		 String pastdatee = Integer.toString(pastdate);
		 
		// Below logic will select the future year from the Contract End Date DatePicker
		Select drpdwnenddate = new Select(ldriver.findElement(By.xpath("//div[contains(@class,'visible DESKTOP uiDatePicker--default uiDatePicker')]/div/div[1]/div[contains(@class,'slds-shrink-none')]//select[contains(@class,'slds-select picklist__label')]")));
		drpdwnenddate.selectByValue(years);
		
		// Below logic will get all the TD and TR from the DatePicker body
		 List<WebElement> columns = PastContractEndDate.findElements(By.tagName("td"));
		 for (WebElement cell: columns) {
		 String day = cell.getText();
	     
		 // Below logic will click the respective Date on the Contract End Date picker
	     if (cell.getText().contains(pastdatee)) {
	     ldriver.findElement(By.xpath("//div/div[2]/table[contains(@class,'calGrid')]/tbody/tr/td/span[text()= "+day+"]")).click();
	     break;
	    	}
	       }
		 }
	
	/*
	 * Method to select One Two Future year Contract End Date DropDown 
	 */
	
	public void selectContractFutureEndDateDrpDwn() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(clickOnContractEditEndDateDrpDwn));
					
		// Below logic will get future 2 years from current year
		 Calendar now = Calendar.getInstance();
		 now.add(Calendar.YEAR,2);
		 int futureyear = now.get(Calendar.YEAR);
		 String futureyears = Integer.toString(futureyear);
		 String futuryear = futureyears;
		 
		
		
		 //Below logic will get the past date by -1 from current date
		 now.add(Calendar.DATE, -1);
		 int pastdate = now.get(Calendar.DATE);
		 String pastdatee = Integer.toString(pastdate);
		 
		 
		 
		// Below logic will select the future year from the Contract End Date DatePicker
		 Select drpdwnenddate = new Select(ldriver.findElement(By.cssSelector("div.scroller.slds-datepicker > div.dateBar > div.slds-shrink-none > label > select")));
		 drpdwnenddate.selectByValue(futuryear);
		
		
		 
		// Below logic will get all the TD and TR from the DatePicker body
		
		List<WebElement> columns = ldriver.findElements(By.cssSelector("div > div.uiDatePickerGrid--default.uiDatePickerGrid > table > tbody > tr > td > span[class ='slds-day weekday DESKTOP uiDayInMonthCell--default']"));

		for (WebElement cell: columns) {
		String day = cell.getText();
			 
		 
		 // Below logic will click the respective Date on the Contract End Date picker
	     if (cell.getText().contains(pastdatee)) {
	    ldriver.findElement(By.xpath("//div/div[2]/table/tbody/tr/td/span[text()= "+day+"]")).click();
	    Thread.sleep(4000);
		 break;
	     	}
	       }
		  }
	
	/*
	  Method to select Liquidated Damage drop down option
	  on the Create New Patient Survey Contract
	*/
	
	public void selectLiquidatedDamageDrpDwnOption() throws InterruptedException
	{   
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drpdwnLiqidateDamages));
		element.click();
		Thread.sleep(1000);
		WebElement selectElement = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(.,'Yes')]"));
		selectElement.click();
				
		
	}
	
	/*
	  Method to select Payment Terms drop down option
	  on the Create New Patient Survey Contract
	*/
	
	public void selectPaymentTermsDrpDwnOption() throws InterruptedException
	{   
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drpdwnPaymentTerms));
		element.click();
		Thread.sleep(1000);
		WebElement selectElement = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(.,'Net 30')]"));
		selectElement.click();
	}
	
	/*
	  Method to select Type drop down option 
	  on the Create New Patient Survey Contract
	*/
	
	public void selectTypeDrpDwnOption() throws InterruptedException
	{   
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drpdwnType));
		element.click();
		Thread.sleep(1000);
		WebElement selectElement = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(.,'HCTP')]"));
		selectElement.click();
	}
	
	/*
	  Method to select Status drop down option 
	  on the Create New Patient Survey Contract
	*/
	
	public void selectStatusDrpDwnOption() throws InterruptedException
	{   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(drpdwnStatus));
	    element.click();
	    Thread.sleep(1000);
		WebElement selectElement = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(.,'RFP issued or to be issued')]"));
		selectElement.click();
	}
	
	
	/*
	 * Method to click on Search Account Input under 
	 * Create New Patient Survey Contract
	 */
	public void clickOnSearchAccountInput()
	{
	 inputSearchAccounts.click();
	}
	
	/*
	  Method to select Search Account under Account Lookup 
	  on the Create New Patient Survey Contract
	*/
	
	public void selectSearchAccountLookupOption()
	{   
		Select version = new Select(ldriver.findElement(By.xpath("//ul/li/a//div[2]/div[contains(@class,'primaryLabel slds-truncate slds-lookup__result-text')]")));
		version.selectByVisibleText("FAIRVIEW SOUTHDALE HOSPITAL");
	}
	
	/*
	 * Method to click on Save button on 
	 * Create New Patient Survey Contract
	 */
	public void clickOnSaveButton()
	{
	 btnSave.click();
	}
	
	/*
	 * Method to click on Save button on 
	 * Edit New Patient Survey Contract
	 */
	public void clickOnEditPSSaveButton() throws InterruptedException
	{
	 btnEditPSSave.click();
	 Thread.sleep(5000);
	}
	
	/*
	  Method to wait until PriceList Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilPriceListTabIsDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(PriceListTab));
		PriceListTab.click();
	}
	
	/*
	  Method to select Future Version drop down option on the Contract Page
	*/
	
	public void selectFuturVersionDrpDwnOption()
	{
		wait.until(ExpectedConditions.visibilityOf(drpdwnVersion));
		Select version = new Select(ldriver.findElement(By.xpath("//select[contains(@class,'version-width select uiInput uiInputSelect uiInput--default uiInput--select')]")));
		version.selectByVisibleText("Future Version");
	}
	
	
	
	/*
	  Method to click on Apply Button on the Contract Page
	*/
	
	public void clickOnApplyBtn()
	{
		btnApply.click();
	}
	
	
	
	/*
	  Method to click on Apply Button on the Contract Page
	*/
	
	public void clickOnApplyBttn()
	{
		ApplyButton.click();
		
	}
	
	
	/*
	  Method to click on Exit Button on the Contract Page
	*/
	
	public void clickOnExitBttn()
	{
	 btnExit.click();
	}
	
}
