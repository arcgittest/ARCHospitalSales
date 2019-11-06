package com.archs.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalSalesContractAssessmentPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	@SuppressWarnings("rawtypes")
	private Wait fluentWait;
	
	@SuppressWarnings("deprecation")
	public HospitalSalesContractAssessmentPage(WebDriver rdriver) {
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
	
	//@FindBy (how = How.CSS, using = "div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(1) > th > span > a")
	@FindBy (how = How.CSS, using = "div > div > table > tbody > tr:nth-child(1) > th > span > a")
	@CacheLookup
	WebElement linkContractAssessmentName;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(1) > th > span > a")
	@CacheLookup
	WebElement ContractAssessmentNameLink;
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-sidebar-right > div:nth-child(1) > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.CSS, using = "flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.XPATH, using = "//div[contains(@class,'uiMenu')]//div/a[contains(@title,'Show 4 more actions') and contains(@href,'javascript:void(0)')]")
	//@FindBy (how = How.CSS, using = "flexipage-component2:nth-child(1) >  force-progressive-renderer > slot > slot > flexipage-aura-wrapper > div > div > article > div > div > div > div > a > lightning-icon > lightning-primitive-icon")
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-page-decorator > slot > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > force-progressive-renderer > slot > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid.forceRelatedListCardHeader > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.XPATH, using = "//div[contains(@class,'uiMenu')]//div/a[contains(@title,'Show 4 more actions') and contains(@href,'javascript:void(0)')]")
	@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[2]/div/one-record-home-flexipage2/forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c/flexipage-record-page-decorator/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/slot/flexipage-component2[1]/force-progressive-renderer/slot/slot/flexipage-aura-wrapper/div/div/article/div[2]/div/div/div/a/lightning-icon/lightning-primitive-icon")

	@CacheLookup
	WebElement drpdwnApprovalHistory;
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg" )
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg.slds-icon-text-default.slds-icon_xx-small")
	//@FindBy (how = How.CSS, using = "div > div > a.slds-button.slds-button--icon-x-small.slds-button--icon-border-filled > lightning-icon.slds-button__icon.slds-icon-utility-down.slds-icon_container.forceIcon")
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-sidebar-right > div:nth-child(1) > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/one-record-home-flexipage2/forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/slot/flexipage-component2[1]/slot/flexipage-aura-wrapper/div/div/article/div[2]/div/div/div/a")
	@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div/div/one-record-home-flexipage2/forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c/flexipage-record-page-decorator/slot/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/slot/flexipage-component2[1]/force-progressive-renderer/slot/slot/flexipage-aura-wrapper/div/div/article/div[2]/div/div/div/a/lightning-icon/lightning-primitive-icon")
	@CacheLookup
	WebElement ApprovalHistoryDropDown;
	
	@FindBy (how = How.XPATH, using = "//div/ul/li[1]/a[contains(@title,'Approve')]")
	@CacheLookup
	WebElement linkApprove;
	
	@FindBy (how = How.XPATH, using = "//div/ul/li[2]/a[contains(@title,'Reject')]")
	@CacheLookup
	WebElement linkReject;
	
	//@FindBy (how = How.CSS, using = "div > div.slds-col.slds-no-flex.slds-grid.slds-grid_vertical-align-center.actionsContainer > ul > li:nth-child(1) > a > div")
	@FindBy (how = How.XPATH, using = "//div[contains(@style,'top: 79px; opacity: 1; position: absolute; left: 1219px;')]/div[contains(@class,'branding-actions actionMenu')]/ul[contains(@role,'presentation')]/li[contains(@role,'presentation')]/a[contains(@href,'javascript:void(0);')]/div[contains(@role,'button') and contains(.,'Approve')]")
	@CacheLookup
	WebElement linkApproveTwo;
	
	@FindBy (how = How.CSS, using = "div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.modal-button-left.actionButton.uiButton--default.uiButton--brand.uiButton")
	@CacheLookup
	WebElement btnApprove;
	
	@FindBy (how = How.CSS, using = "div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.modal-button-left.actionButton.uiButton--default.uiButton--brand.uiButton")
	@CacheLookup
	WebElement btnReject;
	
	
	
	@FindBy (how = How.CSS, using = "div > div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.modal-button-left.actionButton.uiButton--default.uiButton--brand.uiButton")
	@CacheLookup
	WebElement ApproveBtn;
	
	@FindBy (how = How.CSS, using = "#oneHeader > div.bBottom > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root:nth-child(3) > a")
	@CacheLookup
	WebElement AccountTab;
	
	//@FindBy (how = How.CSS, using = "#oneHeader > div.bBottom > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root:nth-child(7) > a")
	@FindBy (how = How.XPATH, using = "//div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/a")
	@CacheLookup
	WebElement ContractAssessmentTab;
	
	@FindBy (how = How.CSS, using = "div.forceToastManager--default forceToastManager lafStandardLayoutContainer lafAppLayoutHost forceAccess forceStyle oneOne > div.forceVisualMessageQueue")
	@CacheLookup
	WebElement msgApproveMessage;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__header.slds-grid > div > div > div > a > lightning-icon > lightning-primitive-icon > svg")
	//@FindBy (how = How.XPATH, using = "//div[contains(@class,'uiMenu')]//div/a[contains(@title,'Show 4 more actions') and contains(@href,'javascript:void(0)')]")
	@CacheLookup
	WebElement linkPricingDirectorApproval;
	
	//@FindBy (how = How.XPATH, using = "//a[contains(@id,'window') and contains(@href,'/lightning/r/0015600000EL7bRAAT/view') and contains(.,'AMERY HOSPITAL & CLINIC')]")
	@FindBy (how = How.CSS, using ="#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__body > div > div > div > ul > li:nth-child(1) > div.forceVirtualActionMarker.forceVirtualAction")
	@CacheLookup
	WebElement linkCATAccountName;
	
	@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > one-record-home-flexipage2 > forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c > flexipage-record-home-template-desktop2 > div > div.slds-grid.slds-wrap.slds-col.slds-size_1-of-1.row.row-main > div.slds-size_1-of-1.slds-medium-size_4-of-12.slds-large-size_4-of-12.column.region-sidebar-right > slot > slot > flexipage-component2:nth-child(1) > slot > flexipage-aura-wrapper > div > div > article > div.slds-card__body > div > div > div > ul > li:nth-child(1) > div.listItemBody.withActions > h3 > div > a")
	//@FindBy (how = How.XPATH, using = "//a[contains(@class,'textUnderline outputLookupLink slds-truncate forceOutputLookup') and contains(@href,'/lightning/r/04i56000000G9ShAAK/view')]")
	@CacheLookup
	WebElement linkPricingDirectorApprovalRequired;
	
	@FindBy (how = How.CSS, using = "#oneHeader > div.bBottom > one-appnav > div > one-app-nav-bar > nav > div > one-app-nav-bar-item-root:nth-child(7) > a")
	//@FindBy (how = How.XPATH, using = "//a[contains(@class,'textUnderline outputLookupLink slds-truncate forceOutputLookup') and contains(@href,'/lightning/r/04i56000000G9ShAAK/view')]")
	@CacheLookup
	WebElement linkContractAssessmentTab;
	
	@FindBy (how = How.CSS, using = "div.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > span > div > a > lightning-icon > lightning-primitive-icon")
	@CacheLookup
	WebElement drpdwnContractAssessment;
	
	@FindBy (how = How.XPATH, using = "//a[contains(.,'Delete')]")
	@CacheLookup
	WebElement linkDelete;
	
	@FindBy (how = How.CSS, using = "body > div.desktop.container.forceStyle.oneOne.lafStandardLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div.DESKTOP.uiContainerManager > div > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton")
	@CacheLookup
	WebElement btnDelete;
	
	
	
	
	/*
	 * Method to wait until Account Tab is visible on top of the Account Details Page
	 */
	public void waitUntilAccountTabIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(linkContractAssessmentName));
	}
	
	/*
	  Method to wait until CAT Name is visible on top of the Contract Assessment Page
	*/
	@SuppressWarnings("unchecked")
	public void waitUntilCATNameIsDisplayed()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(ContractAssessmentNameLink));
		ContractAssessmentNameLink.click();
	}
	
	/*
	 * Method to click on the top Account History Drop Down on Contract Assessment Page
	 */
	@SuppressWarnings("unchecked")
	public void clickOnAccountHistoryDrpDwn() throws InterruptedException
	{
		fluentWait.until(ExpectedConditions.visibilityOf(drpdwnApprovalHistory));
		Thread.sleep(3000);
		drpdwnApprovalHistory.click();
		
	}
	
	/*
	 * Method to click on the CAT Account Name Link Contract Assessment Page
	 */
	public void clickOnCATAccountNameLink()
	{
		wait.until(ExpectedConditions.visibilityOf(linkCATAccountName));
		linkCATAccountName.click();
		
	}
	
	/*
	 * Method to click on the top Account Tab Contract Assessment Page
	 */
	@SuppressWarnings("unchecked")
	public void clickOnAccountTab()
	{
		fluentWait.until(ExpectedConditions.visibilityOf(AccountTab));
		//wait.until(ExpectedConditions.visibilityOf(AccountTab));
		AccountTab.click();
		
	}
	
	
	/*
	 * Method to click on the top Contract Assessment Tab Contract Assessment Page
	 */
	public void clickOnContractAssessmentTab()
	{
		WebElement element = ldriver.findElement(By.xpath("//div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	
	
	/*
	 * Method to click on the top Contract Assessment Link Contract Assessment Page
	 */
	public void clickOnContractAssessmentLink()
	{
		WebElement element = ldriver.findElement((By.xpath("//div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/a[contains(@title,'Contract Assessments')]")));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	
	
	/*
	 * Method to click on the Price Director Approval Required Link Contract Assessment Page
	 */
	//@SuppressWarnings("unchecked")
	public void clickOnPriceDirectorApprovalRequiredLink()
	{
		
		WebElement element = ldriver.findElement(By.xpath("//div/div[1]/div[4]/one-record-home-flexipage2/forcegenerated-flexipage_contract_assessment_record_page_contract_assessment__c/flexipage-record-home-template-desktop2/div/div[2]/div[2]/slot/slot/flexipage-component2[1]/slot/flexipage-aura-wrapper/div/div/article/div[3]/div/div/div/ul/li[1]/div[2]/h3/div/a"));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	
	/*
	 * Method to click on the top Open Account History Drop Down on Contract Assessment Page
	 */
	//@SuppressWarnings("unchecked")
	public void clickOnContractAssessmentDrpDwn()
	{
		wait.until(ExpectedConditions.visibilityOf(ApprovalHistoryDropDown));
		ApprovalHistoryDropDown.click();
	}
	
	/*
	 * Method to click on Contract Assessment Name link on the CAT Page
	 */
	@SuppressWarnings("unchecked")
	public void clickOnContractAssessmentName()
	{
		//wait.until(ExpectedConditions.visibilityOf(linkContractAssessmentName));
		ldriver.navigate().refresh();
		fluentWait.until(ExpectedConditions.visibilityOf(linkContractAssessmentName));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		linkContractAssessmentName.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	/*
	 * Method to click on Contract Assessment Name link on the CAT Page
	 */
	public void clickOnContractAssessmentNameLink()
	{
		WebElement element = ldriver.findElement((By.xpath("//div/div[1]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[1]/th/span/a[contains(@class,'slds-truncate outputLookupLink slds-truncate forceOutputLookup')]")));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	/*
	 * Method to click on Pricing Director Approval link on the CAT Page
	 */
	//@SuppressWarnings("unchecked")
	public void clickOnPricingDirectorApprovalLink()
	{
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(linkPricingDirectorApproval)));
		linkPricingDirectorApproval.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to wait until Approve Link is visible under Approval History Drop Down
	 */
	public void waitUntilApproveLinkIsDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(linkApprove));
	}
	
	/*
	 * Method to click on Approve link under Approval History Drop Down
	 */
	public void clickOnApproveLink()
	{
		linkApprove.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	/*
	 * Method to click on Reject link under Approval History Drop Down
	 */
	public void clickOnRejectLink()
	{
		linkReject.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*
	 * Method to click on Approve link Two under Approval History Drop Down
	 */
	public void clickOnSecondApproveLink()
	{
		WebElement element = ldriver.findElement(By.xpath("//div/ul/li[1]/a[contains(@title,'Approve')]"));
		JavascriptExecutor executor = (JavascriptExecutor)ldriver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	/*
	 * Method to click on Approve button under Approval History Drop Down
	 */
	
	public void clickOnApproveBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(btnApprove));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnApprove.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	/*
	 * Method to click on Reject button under Approval History Drop Down
	 */
	
	public void clickOnRejectBtn()
	{
		wait.until(ExpectedConditions.visibilityOf(btnReject));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnReject.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	/*
	 * Method to click on Pricing Director Approve button under Approval History Drop Down
	 */
	
	public void clickOnApproveButtonn()
	{
		wait.until(ExpectedConditions.visibilityOf(ApproveBtn));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ApproveBtn.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	/*
	 * Method to click on Approve button under Approve Contract Assessment Modal
	 */
	
	public void clickOnApproveButton()
	{
		wait.until(ExpectedConditions.visibilityOf(ApproveBtn));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ApproveBtn.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	/*
	 * Method to click on the top Contract Assessment Drop Down Contract Assessment Page
	 */
	public void clickOnContractAssessmentDropDown()
	{
		
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		drpdwnContractAssessment.click();
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	/*
	 * Method to click on the Delete Link Drop Down Contract Assessment Page
	 */
	public void clickOnContractAssessmentDeleteLink()
	{
	  linkDelete.click();
	  wait.until(ExpectedConditions.visibilityOf(btnDelete));
	}
	
	/*
	 * Method to click on the Delete Button on Contract Assessment Delete Page
	 */
	public void clickOnContractAssessmentDeleteBtn()
	{
		btnDelete.click();
	  
	}
}
