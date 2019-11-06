package com.archs.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class HospitalSalesAccountRelatedDetailsPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;
	Actions actions;
		
		@SuppressWarnings("deprecation")
		public HospitalSalesAccountRelatedDetailsPage(WebDriver rdriver)
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
		
		//@FindBy (how = How.CSS, using = "div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a")
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.flexipagePage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a")
		@CacheLookup
		WebElement linkRelated;
		
		@FindBy (how = How.CSS, using = "div.windowViewMode-normal.oneContent.active.lafPageHost > div.flexipagePage.oneRecordHomeFlexipage > div > div.row.row-main > div.column.region-main > div > div > div > ul > li:nth-child(2) > a")
		@CacheLookup
		WebElement tabRelated;
		
		@FindBy (how = How.CSS, using = "div > div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton")
		@CacheLookup
		WebElement btnContractDelete;
		
		@FindBy (how = How.CSS, using = "div:nth-child(2) > div > div > div:nth-child(3) > article > div.slds-card__header.slds-grid > header > div.slds-media__body > h2 > a")
		@CacheLookup
		WebElement linkContracts;
		
		@FindBy (how = How.CSS, using = "div > div > table > tbody > tr > th:nth-child(2) > span > a")
		@CacheLookup
		WebElement linkContractsListView;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > th > span > a")
		@CacheLookup
		WebElement linkEditContractsListView;
		
		@FindBy (how = How.XPATH, using = "//a[contains(@href,'/lightning/r') and contains(@class,'slds-truncate outputLookupLink slds-truncate forceOutputLookup')]")
		@CacheLookup
		WebElement linkContractsEditListView;
		
		
		/*@FindBy (how = How.CSS, using = "div:nth-child(2) > div > div > div:nth-child(3) > article > div.slds-card__body > div > div > div > ul > li:nth-child(1) > div.forceVirtualActionMarker.forceVirtualAction > a > lightning-icon > lightning-primitive-icon")
		@CacheLookup
		WebElement linkContractDrpdwn;*/
		
		@FindBy (how = How.CSS, using = "div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(9) > span > div > a > lightning-icon > lightning-primitive-icon")
		@CacheLookup
		WebElement linkContractDrpdwn;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(9) > span > div > a")
		@CacheLookup
		WebElement linkEditContractDrpdwn;
		
		@FindBy (how = How.CSS, using = "div > div > table > tbody > tr > td:nth-child(9) > span > div > a > lightning-icon > lightning-primitive-icon")
		@CacheLookup
		WebElement linkEditContractsDrpdwn;
		
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > span > div > a > lightning-icon > lightning-primitive-icon")
		@CacheLookup
		WebElement linkEscalatorsListViewDrpdwn;
		
		//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(9) > span > div > a > lightning-icon > lightning-primitive-icon")
		@FindBy (how = How.CSS, using = "div > div > div > div > div > div > div > div > table > tbody > tr > td > span > div > a > lightning-icon > lightning-primitive-icon")
		//@FindBy (how = How.XPATH, using = "//a[contains(@class,'rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger')]")
		//@FindBy (how = How.XPATH, using = "//div/div[1]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[8]/span/div/a/lightning-icon/lightning-primitive-icon")
		@CacheLookup
		WebElement linkContractListViewDrpdwn;
		
		
		
		
		//@FindBy (how = How.CSS, using = "div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > span > div > a > lightning-icon > lightning-primitive-icon > svg.slds-icon.slds-icon-text-default.slds-icon_xx-small")
		//@FindBy (how = How.CSS, using = "div > div > div > div > div > div > div > div > div > div > div > div > div > table > tbody > tr > td > span > div > a > lightning-icon > lightning-primitive-icon > svg.slds-icon.slds-icon-text-default.slds-icon_xx-small")
		//@FindBy (how = How.XPATH, using = "//div[contains(@id,'brandBand_1')]/div/div[1]/div[5]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr/td[7]/span/div/a[contains(@class,'rowActionsPlaceHolder slds-button slds-button--icon-x-small slds-button--icon-border-filled keyboardMode--trigger')]")
		@FindBy (how = How.CSS, using = "div > div > table > tbody > tr > td:nth-child(8) > span > div > a > lightning-icon > lightning-primitive-icon")
		@CacheLookup
		WebElement linkSecondEscalatorsListViewDrpdwn;
		
		@FindBy (how = How.XPATH, using = "//a[contains(.,'Delete')]")
		@CacheLookup
		WebElement linkContractDelete;
		
		@FindBy (how = How.XPATH, using = "//div/ul/li[2]//a[contains(.,'Delete')]")
		@CacheLookup
		WebElement linkDeleteContract;
		
		@FindBy (how = How.CSS, using = "div > ul > li:nth-child(2) > a > div.forceActionLink")
		//@FindBy (how = How.CSS, using = "div > ul > li:nth-child(2) > a")
		//@FindBy (how = How.XPATH, using = "//div[contains(@class,'branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default')]//li[2]/a[contains(@title,'Delete')and contains(@aria-disabled,'false')]/div[contains(.,'Delete')]")
		@CacheLookup
		WebElement linkDeleteEscalator;
		
		//@FindBy (how = How.CSS, using = "div > ul > li:nth-child(2) > a > div.forceActionLink")
		@FindBy (how = How.CSS, using = "div > ul > li:nth-child(2) > a")
		//@FindBy (how = How.XPATH, using = "//div[contains(@class,'branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default')]//li[2]/a[contains(@title,'Delete')and contains(@aria-disabled,'false')]/div[contains(.,'Delete')]")
		@CacheLookup
		WebElement linkContractListViewDeleteLink;
		
		
		
		@FindBy (how = How.CSS, using = "body > div.desktop.container.forceStyle.oneOne.lafStandardLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div.DESKTOP.uiContainerManager > div > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton")
		@CacheLookup
		WebElement btnDelete;
		
		@FindBy (how = How.CSS, using = "body > div.desktop.container.forceStyle.oneOne.lafStandardLayoutContainer.lafAppLayoutHost.forceAccess.forceStyle.oneOne > div.DESKTOP.uiContainerManager > div > div.panel.slds-modal.slds-fade-in-open > div > div.modal-footer.slds-modal__footer > div > button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton")
		@CacheLookup
		WebElement contractListViewbtnDelete;
		
		
		@FindBy (how = How.XPATH, using = "/html/body/div[5]/div[2]/div/div[2]/div/div[3]/div/button[2]")
		@CacheLookup
		WebElement btnEscalatorDelete;
		
		/*@FindBy (how = How.XPATH, using = "//div[2]/div/div/div[3]/article/div[2]/div/div/ul/li/a")
		@CacheLookup
		WebElement btnNewContract;*/
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div > div > div > div.slds-page-header--object-home.slds-page-header_joined.slds-page-header_bleed.slds-page-header.slds-shrink-none.test-headerRegion.forceListViewManagerHeader > div:nth-child(1) > div.slds-col.slds-no-flex.slds-grid.slds-align-top.slds-p-bottom--xx-small.test-lvmForceActionsContainer > ul > li > a > div")
		@CacheLookup
		WebElement btnNewContract;
			
		@FindBy (how = How.CSS, using = "div > div > div.actionBody > div > h2")
		@CacheLookup
		WebElement headerNewContract;
		
		
		/*
		 * Method to Click on Account Related Link on the Account Details Page 
		 */	
		public void clickOnAccountRelatedLink()
		{
			wait.until(ExpectedConditions.visibilityOf(linkRelated));
			actions.moveToElement(linkRelated).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(linkContracts));
		}
		
		/*
		 * Method to Click on Account Related Link on the Account Details Page 
		 */	
		public void clickOnRelatedLink()
		{
			wait.until(ExpectedConditions.visibilityOf(linkRelated));
			actions.moveToElement(linkRelated).click().build().perform();
		}
		
		/*
		 * Method to Click on Contracts Link on the Account Related Page 
		 */	
		public void clickOnContractsLink()
		{
		actions.moveToElement(linkContracts).click().build().perform();
		
		}
		
		
		
		/*
		 * Method to wait until the Progress Bar is visible on the Create Assessment Tool
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilContractDetailPageIsDisplayed()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(btnNewContract));
		}
		
		
		/*
		 * Method to Click on Contracts Drop DownLink on the Account Related Page 
		 */	
		public void clickOnContractsDrpDwn()
		{
		actions.moveToElement(linkContractDrpdwn).click().build().perform();
		}
		
		/*
		 * Method to Click on Contracts Drop DownLink on the Contract List View Page 
		 */	
		public void clickOnEditContractsDrpDwn()
		{
		actions.moveToElement(linkEditContractDrpdwn).click().build().perform();
		}
		
		/*
		 * Method to Click on Contracts Drop DownLink on the Contract List View Page 
		 */	
		public void clickOnContractDrpDwn()
		{
		actions.moveToElement(linkEditContractDrpdwn).click().build().perform();
		}
		
		/*
		 * Method to Click on Escalators Drop DownLink on the Contract List View Page 
		 */	
		public void clickOnEscalatorsListViewDrpDwn()
		{
		actions.moveToElement(linkEscalatorsListViewDrpdwn).click().build().perform();
		}
		
		/*
		 * Method to Click on Escalators Drop DownLink on the Contract List View Page 
		 */	
		@SuppressWarnings("unchecked")
		public void clickOnSecondEscalatorsListViewDrpDwn()
		{
			fluentWait.until(ExpectedConditions.visibilityOf(linkSecondEscalatorsListViewDrpdwn));
		actions.moveToElement(linkSecondEscalatorsListViewDrpdwn).click().build().perform();
		
		}
		
		/*
		 * Method to Click on Contract Drop DownLink on the Contract List View Page 
		 */	
		@SuppressWarnings("unchecked")
		public void clickOnContractListViewDrpDwn()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(linkContractListViewDrpdwn));
		actions.moveToElement(linkContractListViewDrpdwn).click().build().perform();
		//fluentWait.until(ExpectedConditions.visibilityOf(linkContractListViewDeleteLink));
		}
		
		
		
		/*
		 * Method to Click on Contract Delete DropDown Link on the Account Related Page 
		 */	
		@SuppressWarnings("unchecked")
		public void clickOnContractListViewDeleteLink()
		{
		actions.moveToElement(linkContractListViewDeleteLink).click().build().perform();
		fluentWait.until(ExpectedConditions.visibilityOf(contractListViewbtnDelete));
		
		}
		
		/*
		 * Method to Click on Contract Delete DropDown Link on the Account Related Page 
		 */	
		//@SuppressWarnings("unchecked")
		public void clickOnContractDeleteLink()
		{
		actions.moveToElement(linkContractDelete).click().build().perform();
		//fluentWait.until(ExpectedConditions.visibilityOf(btnDelete));
		
		}
		
		/*
		 * Method to Click on Contract Delete DropDown Link on the Account Related Page 
		 */	
		public void clickOnDeleteContractLink()
		{
		actions.moveToElement(linkDeleteContract).click().build().perform();
		}
		
		/*
		 * Method to Click on Escalator Delete DropDown Link 
		 * on the Escalator List View Page 
		 */	
		public void clickOnDeleteEscalatorLink()
		{
		actions.moveToElement(linkDeleteEscalator).click().build().perform();
		}
		
		
		/*
		 * Method to Click on Delete Button on the Contract List view Page 
		 */	
		public void clickOnContractListViewDeleteBtn() throws InterruptedException
		{
			actions.moveToElement(contractListViewbtnDelete).click().build().perform();
			Thread.sleep(8000);

		}
		
		
		/*
		 * Method to Click on Delete Button on the Account Related Page 
		 */	
		public void clickOnDeleteBtn() throws InterruptedException
		{
			actions.moveToElement(btnDelete).click().build().perform();
			Thread.sleep(8000);

		}
		
		/*
		 * Method to Click on Delete Button on Escalator List View Page 
		 */	
		public void clickOnEscalatorDeleteBtn() throws InterruptedException
		{
			actions.moveToElement(btnEscalatorDelete).click().build().perform();
			Thread.sleep(8000);

		}
		
		/*
		 * Method to Click on New Button under Contract Section
		 * on the Account Related Page 
		 */	
		@SuppressWarnings("unchecked")
		public void clickOnNewBtn() throws InterruptedException
		{
			
			//Thread.sleep(9000);
			//fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("div.slds-col.slds-no-flex.slds-grid.slds-align-top.slds-p-bottom--xx-small.test-lvmForceActionsContainer > ul > li > a")));
			//actions.moveToElement(btnNewContract);
			//actions.click().build().perform();
			//Thread.sleep(10000);
			btnNewContract.click();
			fluentWait.until(ExpectedConditions.visibilityOf(headerNewContract));
			//fluentWait.until(ExpectedConditions..presenceOfElementLocated(By.xpath("//input[contains(@value,'012G00000010tyFIAQ')]")));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@value,'012G00000010tyFIAQ')]")));

			

		}
		
		/*
		 * Method to Click on Contracts Link on List View Contracts Page 
		 */	
		public void clickOnViewContractsLink()
		{
		actions.moveToElement(linkContractsListView).click().build().perform();
		
		}
		
		/*
		 * Method to get Status on List View Contracts Page 
		 */	
		public String getContractStatusOnListView()
		{
			WebElement textStatusWebElement= ldriver.findElement(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(5) > span > span"));
			String statusText= textStatusWebElement.getText();
			System.out.println("Inner text is :"+statusText);
			return statusText;
			}
		
		/*
		 * Method to get TYPE on List View Contracts Page 
		 */	
		public String getContractTypeOnListView()
		{
			WebElement textTypeWebElement= ldriver.findElement(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div > div.slds-grid.listDisplays.safari-workaround-anchor > div > div.slds-col.slds-no-space.forceListViewManagerPrimaryDisplayManager > div.hideSelection.forceListViewManagerGrid > div.listViewContent.slds-table--header-fixed_container > div.uiScroller.scroller-wrapper.scroll-bidirectional.native > div > div > table > tbody > tr > td:nth-child(7) > span > span"));
			String typeText= textTypeWebElement.getText();
			System.out.println("Inner text is :"+typeText);
			return typeText;
			}
		
		
		/*
		 * Method to Click on Edit Contracts Link on List View Contracts Page 
		 */	
		public void clickOnEditContractsViewLink()
		{
		actions.moveToElement(linkEditContractsListView).click().build().perform();
		
		}
		
		/*
		 * Method to Click on Contracts Edit Link on List View Contracts Page 
		 */	
		@SuppressWarnings("unchecked")
		public void clickOnContractsEditViewLink()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(linkContractsEditListView));
		actions.moveToElement(linkContractsEditListView).click().build().perform();
		
		}
		
}
