package com.archs.pageObjects;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	Actions actions;

	public HospitalSalesContractPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		this.actions = new Actions(ldriver);
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
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a > span.title")
	@CacheLookup
	WebElement RelatedTab;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a")
	@CacheLookup
	WebElement TabRelated;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(3) > a > span.title")
	@CacheLookup
	WebElement TranslateTab;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(5) > a > span.title")
	@CacheLookup
	WebElement EscalatorTab;
		
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href,'javascript:') and contains(@title,'Escalators')]")
	@CacheLookup
	WebElement EditEscalatorTab;
	
	@FindBy (how = How.XPATH, using = "//a[contains(.,'Escalators')]/span[contains(@class,'slds-card__header-title slds-truncate slds-m-right--xx-small')]")
	@CacheLookup
	WebElement ContractEscalatorLink;
	
	@FindBy (how = How.CSS, using = "div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(8) > span > div > a > lightning-icon > lightning-primitive-icon")
	@CacheLookup
	WebElement EscalatorsListViewDrpDwn;
	
	@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a > span.title")
	@CacheLookup
	WebElement ContractRelatedTab;
	
	@FindBy (how = How.CSS, using = "div > div > div > div:nth-child(4) > article > div.slds-card__body > div > div > div > div > div.listViewContent > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > div > a > lightning-icon > lightning-primitive-icon")
	@CacheLookup
	WebElement EscalatorDrpDwn;
	
	@FindBy (how = How.XPATH, using = "//li[2]/a[contains(.,'Delete')]")
	@CacheLookup
	WebElement EscalatorDeleteBtn;
	
	@FindBy (how = How.XPATH, using = "//html/body/div[5]/div[2]/div[2]/div[2]/div/div[3]/div/button[2]")
	@CacheLookup
	WebElement EscalatorConfirmDeleteBtn;
	
	
	@FindBy (how = How.XPATH, using = "//div/ul/li[1]/div/div/div[2]/div/div[2]/div/button")
	@CacheLookup
	WebElement FirstEscalatorApplyBtn;
	
	
	@FindBy (how = How.XPATH, using = "//button[contains(.,'Apply Now') and contains(@class,'slds-button slds-button_brand')]")
	@CacheLookup
	WebElement FirstEditEscalatorApplyBtn;
	
	
	
	@FindBy (how = How.CSS, using = "#modal-content-id-1 > p:nth-child(4) > button")
	@CacheLookup
	WebElement FirstVerifyEscalatorApplyBtn;
	
	
	
	@FindBy (how = How.XPATH, using = "//div[contains(@id,'modal-content-id-1')]//button[contains(@class,'slds-button slds-button_brand')]")
	@CacheLookup
	WebElement SecondVerifyEscalatorApplyBtn;
	
	@FindBy (how = How.CSS, using = "#save > section > div > footer > button.slds-button.slds-button_brand")
	@CacheLookup
	WebElement FirstEscalatorExitBtn;
	
	
	
	@FindBy (how = How.XPATH, using = "//button[contains(.,'Exit') and contains(@class,'slds-button slds-button_brand')]")
	@CacheLookup
	WebElement SecondEscalatorExitBtn;
	
	@FindBy (how = How.XPATH, using = "//div/ul/li[2]/div/div/div[2]/div/div[2]/div/button")
	@CacheLookup
	WebElement SecondEscalatorApplyBtn;
	
	@FindBy (how = How.CSS, using = "div > ol > li:nth-child(2) > article:nth-child(3) > div > div > div > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > div")
	@CacheLookup
	WebElement EffectiveDateInput;
	
	@FindBy (how = How.CSS, using = "li:nth-child(4) > article > div > div > div > div > div > div.slds-media__body.slds-m-top_x-small > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > button")
	@CacheLookup
	WebElement GoButton;
	
	@FindBy (how = How.XPATH, using = "//div/div[2]/table[contains(@class,'calGrid')]/tbody")
	@CacheLookup
	WebElement EffectiveStartDate;
	
	@FindBy (how = How.CSS, using = "div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(1) > th > span > a")
	@CacheLookup
	WebElement lnkContract;
	
	@FindBy (how = How.XPATH, using = "//div[contains(@class,'test-id__section-content slds-section__content section__content')]//div/div[4]/div/div/div[2]/span[contains(.,'<Table>')]")
	@CacheLookup
	WebElement spanAttachmentA2;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(4) > a > span.title")
	@CacheLookup
	WebElement PriceListTab;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(4) > a > span.title")
	@CacheLookup
	WebElement PriceTab;
	
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
	
	@FindBy (how = How.XPATH, using = "//input[contains(@class,'input uiInput uiInputNumber uiInput--default uiInput--input')]")
	@CacheLookup
	WebElement inputPercentageIncrease;
	
	@FindBy (how = How.CSS, using = "div > div.slds-col.slds-no-flex.slds-grid.slds-grid_vertical-align-center.actionsContainer > ul > li:nth-child(2) > a")
	@CacheLookup
	WebElement btnEdit;
	
	@FindBy (how = How.XPATH, using = "//td[contains(@data-label,'Action')]/div/button")
	@CacheLookup
	WebElement btnPlusActionIcon;
	
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[2]/div[contains(.,'Contract Start Date')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabStartDate;
	
	@FindBy (how = How.XPATH, using = "//div/div[2]/div[2]/div[contains(.,'Contract End Date')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabEndDate;
	
	@FindBy (how = How.XPATH, using = "//div/div[5]/div[1]/div[contains(.,'Selling Price RBC')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabSellingPriceRBC;
	
	@FindBy (how = How.XPATH, using = "//div/div[6]/div[1]/div[contains(.,'Selling Price SDP')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabSellingPriceSDP;
	
	@FindBy (how = How.XPATH, using = "//div/div[7]/div[1]/div[contains(.,'Volume RBC')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabVolumeRBC;
	
	@FindBy (how = How.XPATH, using = "//div/div[8]/div[1]/div[contains(.,'Volume SDP')]/div[2]/span/span")
	@CacheLookup
	WebElement catDetailsTabVolumeSDP;
	
	/*
	 * Method to get CAT Start Date Text on the Contract Details Page
	 */
	public String getCATDetailStartDateText() throws InterruptedException
	{
		Thread.sleep(5000);
		String startDate = catDetailsTabStartDate.getText();
		System.out.println("CATDetailsTabstartDate CATDetailsTabstartDate..... " +startDate);
		return startDate;
     }
	
	/*
	 * Method to get CAT End Date Text on the Contract Details Page
	 */
	public String getCATDetailEndDateText() throws InterruptedException
	{
		String endDate = catDetailsTabEndDate.getText();
		System.out.println("CATDetailsTabendDate CATDetailsTabendDate..... " +endDate);
		return endDate;
     }
	
	/*
	 * Method to get CAT Selling Price RBC Text on the Contract Details Page
	 */
	public String getCATDetailSellingPriceRBCText() throws InterruptedException
	{
		String sellingPriceRBC = catDetailsTabSellingPriceRBC.getText();
		System.out.println("CATDetailssellingPriceRBC CATDetailssellingPriceRBC..... " +sellingPriceRBC);
		return sellingPriceRBC;
     }
	
	/*
	 * Method to get CAT Selling Price SDP Text on the Contract Details Page
	 */
	public String getCATDetailSellingPriceSDPText() throws InterruptedException
	{
		String sellingPriceSDP = catDetailsTabSellingPriceSDP.getText();
		System.out.println("CATDetailssellingPriceSDP CATDetailssellingPriceSDP..... " +sellingPriceSDP);
		return sellingPriceSDP;
     }
	
	/*
	 * Method to get CAT Volume SDP Text on the Contract Details Page
	 */
	public String getCATDetailVolumeSDPText() throws InterruptedException
	{
		String volumeSDP = catDetailsTabVolumeSDP.getText();
		System.out.println("CATDetailsVolumeSDP CATDetailsVolumeSDP..... " +volumeSDP);
		return volumeSDP;
     }
	
	/*
	 * Method to get CAT Volume RBC Text on the Contract Details Page
	 */
	public String getCATDetailVolumeRBCText() throws InterruptedException
	{
		String volumeRBC = catDetailsTabVolumeRBC.getText();
		System.out.println("CATDetailsVolumeRBC CATDetailsVolumeRBC..... " +volumeRBC);
		return volumeRBC;
     }
	
	/*
	 * Method to click on Go Button on the Contract Page
	 */
	
	public void clickOnGoButton() throws InterruptedException
	{
	  GoButton.click();
	  ldriver.switchTo().alert().accept();
	  Thread.sleep(3000);
	}
	
	
	/*
	 * Method to click on Plus Icon Button on the Contract Page
	 */
	
	public void clickOnPlusIconButton()
	{
		btnPlusActionIcon.click();
	}
	
	/*
	 * Method to click on Edit Button on the Contract Page
	 */
	
	//@SuppressWarnings("unchecked")
	
	public void clickOnEditButton() throws InterruptedException
	{
		//fluentWait.until(ExpectedConditions.visibilityOf(btnEdit));
		//WebElement element = ldriver.findElement((By.xpath("//div/div[1]/div[5]/div[1]/div/div[1]/div/header/div[2]/div/div[contains(@class,'slds-col slds-no-flex slds-grid slds-grid_vertical-align-center actionsContainer')]//ul/li[2]/a/div")));
		WebElement element = ldriver.findElement((By.cssSelector("li.slds-button.slds-button--neutral.slds-truncate > a.forceActionLink[title='Edit']")));
		wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(element)));
		/*actions.moveToElement(element);
		actions.click().build().perform();
		element.click();*/
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", element);
		//actions.moveToElement(element);
		//actions.click().build().perform();
	  //btnEdit.click();
	  Thread.sleep(4000);
	  
	  
	}
	
	
	
	/*
	  Method to wait until Translate Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilTranslateTabIsDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(TranslateTab));
		TranslateTab.click();
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input')]")));
	}
	
	
	
	/*
	  Method to wait until Details Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilDetailsTabIsDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(DetailsTab));
		
	}
	
	/*
	  Method to click Escalators Tab is visible on the Contract Page
	*/
	public void clickOnEscalatorsTab() throws InterruptedException
	{
	EscalatorTab.click();
	Thread.sleep(3000);
	}
	
	/*
	  Method to click Escalators Tab is visible on the Contract Page
	*/
	public void clickOnEditEscalatorsTab() throws InterruptedException
	{
	EditEscalatorTab.click();
	Thread.sleep(3000);
	}
	
	/*
	  Method to click Escalators Link on the Contract Page
	*/
	public void clickOnEscalatorsLink() throws InterruptedException
	{
	ContractEscalatorLink.click();
	Thread.sleep(5000);
	}
	
	/*
	  Method to click Related Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void clickOnRelatedTab() throws InterruptedException
	{
		RelatedTab.click();
		//Thread.sleep(7000);
		fluentWait.until(ExpectedConditions.visibilityOf(ContractEscalatorLink));
	}
	
	
	
	/*
	  Method to click Related Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void clickOnTabRelated() throws InterruptedException
	{
		TabRelated.click();
		//Thread.sleep(7000);
		fluentWait.until(ExpectedConditions.visibilityOf(ContractEscalatorLink));
	}
	
	/*
	  Method to click Escalator Apply button on the Contract Page
	*/
	public void clickOnFirstEscalatorApplyBtn() throws InterruptedException
	{
		FirstEscalatorApplyBtn.click();
		Thread.sleep(1000);
	}
	
	/*
	  Method to click Escalator Apply button on the Contract Page
	*/
	public void clickOnFirstEditEscalatorApplyBtn() throws InterruptedException
	{
		FirstEditEscalatorApplyBtn.click();
		Thread.sleep(2000);
	}
	
	
	
	/*
	  Method to click verify Escalator Apply button on the Contract Page
	*/
	public void clickOnVerifyEscalatorApplyBtn() throws InterruptedException
	{
		FirstVerifyEscalatorApplyBtn.click();
		Thread.sleep(2000);
	}
	
	/*
	  Method to click verify Escalator Apply button on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void clickOnVerifySecondEscalatorApplyBtn() throws InterruptedException
	{
		fluentWait.until(ExpectedConditions.visibilityOf(SecondVerifyEscalatorApplyBtn));
		SecondVerifyEscalatorApplyBtn.click();
		Thread.sleep(2000);
	}
	
	
	/*
	  Method to click verify Escalator Exit button on the Contract Page
	*/
	
	public void clickOnVerifyEscalatorExitBtn() throws InterruptedException
	{
		FirstEscalatorExitBtn.click();
		
		}
	
	/*
	  Method to click verify Escalator Exit button on the Contract Page
	*/
	
	public void clickOnSecondEscalatorExitBtn() throws InterruptedException
	{
		SecondEscalatorExitBtn.click();
		
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
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("window.scrollBy(0, 600)", "");
		
	}
	
	/*
	 * Method to click on Contract Link on the Contract Page
	 */
	
	public void clickOnContractLink()
	{
		lnkContract.click();
	}
	
	/*
	 * Method to set Percentage Increase under TextBox on the Contract Page
	 */
	
	public void setPercentageIncrease(int percentage)
	{
		WebElement element = ldriver.findElement((By.xpath("//input[contains(@class,'input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input')]")));
		actions.moveToElement(element);
		actions.click().build().perform();
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		element.sendKeys(del + percentage);
	}
	
	/*
	 * Method to set Percentage Increase under TextBox on the Contract Page
	 */
	
	public void setSecondPercentageIncrease(int percentage)
	{
		WebElement element = ldriver.findElement((By.xpath("//tr[2]//input[contains(@class,'input uiInputSmartNumber uiInput uiInputNumber uiInput--default uiInput--input')]")));
		actions.moveToElement(element);
		actions.click().build().perform();
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		element.sendKeys(del + percentage);
	}
	
	/*
	 * Method to set Percentage Increase under TextBox on the Contract Page
	 */
	
	public void setThirdPercentageIncrease(int percentage)
	{
		WebElement element = ldriver.findElement((By.xpath("//tr[3]//input[contains(@class,'input uiInput uiInputNumber uiInput--default uiInput--input')]")));
		actions.moveToElement(element);
		actions.click().build().perform();
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		element.sendKeys(del + percentage);
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
	  Method to wait until PriceList Tab is visible on the Contract Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilPriceListTabDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(PriceTab));
		PriceTab.click();
	}
	
	/*
	  Method to select Future Version drop down option on the Contract Page
	*/
	
	//@SuppressWarnings("unchecked")
	public void selectFuturVersionDrpDwnOption()
	{
		wait.until(ExpectedConditions.visibilityOf(drpdwnVersion));
		//actions.moveToElement(drpdwnVersion).click().build().perform();
		Select version = new Select(ldriver.findElement(By.xpath("//select[contains(@class,'version-width select uiInput uiInputSelect uiInput--default uiInput--select')]")));
		version.selectByVisibleText("Future Version");
		//fluentWait.until(ExpectedConditions.visibilityOf(tableHeaderYear1));
		//wait.until(ExpectedConditions.visibilityOf(tableHeaderYear1));
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
		//wait.until(ExpectedConditions.visibilityOf(msgSuccess));
	}
	
	
	/*
	  Method to click on Exit Button on the Contract Page
	*/
	
	public void clickOnExitBttn()
	{
		
		btnExit.click();
	}
	
	
	
	/*
	  Method to verify XML Attachment is displayed on the Contract Page
	*/
	public boolean isXMLAttachmentDisplayed()
	{
		return spanAttachmentA2.isDisplayed();
		
	}
}
