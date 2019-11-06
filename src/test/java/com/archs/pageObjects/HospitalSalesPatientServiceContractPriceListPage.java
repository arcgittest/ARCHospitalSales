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

public class HospitalSalesPatientServiceContractPriceListPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;
	Actions actions;
	
	@SuppressWarnings("deprecation")
	public HospitalSalesPatientServiceContractPriceListPage(WebDriver rdriver)
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
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
	//@FindBy (how = How.CSS, using = "div > div > div > div > ul > div > div > div > div > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputAssistForBoneMarrow;
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
	//@FindBy (how = How.CSS, using = "div > div > div > div > ul > div > div > div > div > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputAdditionalHrsStemCell;
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(5) > div > lightning-input > div > input")
	//@FindBy (how = How.CSS, using = "div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(3) > td > div > lightning-input > div > input")
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[3]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputOperatorOnlyStemCell;
	
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")
	@FindBy (how = How.CSS, using = "div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(2) > td > div > lightning-input > div > input")
	//@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]//ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputAssistForBoneMarrow1;
	
		
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cPricelist > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
	//@FindBy (how = How.CSS, using = "div > div > div > div > ul > div > div > div > div > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
	//@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")
	@FindBy (how = How.CSS, using = "div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(3) > td > div > lightning-input > div > input")
	@CacheLookup
	WebElement inputAdditionalHrsStemCell1;
	
	@FindBy (how = How.CSS, using = "div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(4) > td > div > lightning-input > div > input")
	//@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]//ul[2]/div/div[1]/div/div[2]/div/table/tr[3]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputOperatorOnlyStemCell1;
		
	//@FindBy (how = How.CSS, using = "div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(5) > td > div > lightning-input > div > input")
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[5]/div/div[2]//ul[2]/div/div[1]/div/div[2]/div/table/tr[4]/td[4]/div/lightning-input/div/input")
	@CacheLookup
	WebElement inputHctProcessing;
	
	
	
	@FindBy (how = How.CSS, using = "#save > section > div > header")
	@CacheLookup
	WebElement savingPricelistModal;
	
	/*
	 * Method to wait until Bone Marrow TextBox is visible on the PriceList Page
	 */
	@SuppressWarnings("unchecked")
	public void waitUntilBoneMarrowPriceIsDisplayed()
	{
	fluentWait.until(ExpectedConditions.visibilityOf(inputAssistForBoneMarrow));
	}
	
	/*
	 * Method to set Data Assist for bone marrow Text box on the PriceList Page
	 */
	public void setAssistBoneMarrowPrice(int bonemarrow) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(inputAssistForBoneMarrow));
		
        actions.click().build().perform();
		
		
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		inputAssistForBoneMarrow.sendKeys(del + bonemarrow);
				
	}
	
	
	
	/*
	 * Method to click Data Assist for bone marrow Text box on the PriceList Page
	 */
	public void clickOnHctProcessingPrice() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(inputHctProcessing));
		//WebElement DIVelement = ldriver.findElement(By.xpath("//div/div[1]/div[5]/div/div[2]//ul[2]/div/div[1]/div/div[2]/div/table/tr[4]/td[4]/div/lightning-input/div/input"));
		//WebElement DIVelement = ldriver.findElement(By.cssSelector("html > body > div > div > section > #brandBand_1 > div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(2) > td:nth-child(2) > div"));

		/*JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		//jse.executeScript("scroll(0, 250)");
		
		jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
        //actions.moveToElement(inputHctProcessing).click().build().perform();
      		
        actions.click().build().perform();*/
        
	ldriver.findElement(By.cssSelector("html > body > div > div > section > #brandBand_1 > div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(2) > td:nth-child(2) > div")).click();

		
						
	}
	
	/*
	 * Method to get Data Assist for bone marrow price list on the PriceList Page
	 */
	public float getAssistBoneMarrowPrice() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(inputAssistForBoneMarrow1));
		
	    WebElement element = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[4]/td[4]/div/lightning-input/div/input"));
		/*JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
		jse.executeScript("arguments[0].click();", element);*/
		Actions builder = new Actions(ldriver);
	    builder.moveToElement( element ).click( element );
	    builder.perform();
		Thread.sleep(5000);
		//WebElement DIVelement = ldriver.findElement(By.cssSelector("html > body > div > div > section > #brandBand_1 > div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"));
		//WebElement DIVElement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/span"));
		//WebElement DIVElement = ldriver.findElement(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div"));
		//WebElement DIVElement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[5]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div"));
		//WebElement DIVElement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input"));
		//WebElement DIVElement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div"));
		//String input = DIVElement.getAttribute("class");
		//WebElement DIVElement = ldriver.findElement(By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"));
		
		
		WebElement DIVelement1 = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input"));
	    builder.moveToElement(DIVelement1).click(DIVelement1);
	    builder.perform();
	    Thread.sleep(5000);
	    
		WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input"));
		//WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[5]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input"));
		//System.out.println("DIVelement DIVelement DIVelement " + DIVelement);
		
		 //Actions builder = new Actions(ldriver);
	     //builder.moveToElement(DIVelement).moveToElement(DIVelement);

	    builder.moveToElement(DIVelement).click(DIVelement);
	    builder.perform();
	    Thread.sleep(9000);
	    
	    
	    
	    WebElement DIVElement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input"));
		String input = DIVElement.getText();
		System.out.println("inputs inputs inputs " + input);

		//JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		//jse.executeScript("scroll(250, 0)");
		//jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
		//actions.moveToElement(inputAssistForBoneMarrow1).click().build().perform();
		Thread.sleep(9000);
		/*String bonemarrow = DIVElement.getText();
		System.out.println("bonemarrow bonemarrow bonemarrow " + bonemarrow);
		float marrow = Float.parseFloat(bonemarrow);
        return marrow;*/
        
        System.out.println("input input input " + input);
		float marrow = Float.parseFloat(input);
        return marrow;
		/*WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input")));
        String bonemarrow = element.getText(); 
        float marrow = Float.parseFloat(bonemarrow);
        return marrow;*/
	}
	
	
	
	/*
	 * Method to set Data Additional Hours Stem Cell Text box on the PriceList Page
	 */
	public void setAdtnlHrsStemCellPrice(int additionalhoursstemcell) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(inputAdditionalHrsStemCell));
		
        actions.click().build().perform();
		
		
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		inputAdditionalHrsStemCell.sendKeys(del + additionalhoursstemcell);
}
	
	/*
	 * Method to get Data Additional Hours Stem Cell price list on the PriceList Page
	 */
	public float getAdditionalHrsStemCellPrice() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(inputAdditionalHrsStemCell1));
		//WebElement DIVelement = ldriver.findElement(By.cssSelector("html > body > div > div > section > #brandBand_1 > div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input"));
		//WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/span"));
		WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[2]/td[4]/div/lightning-input/div/input"));

		//JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		//jse.executeScript("scroll(250, 0)");
		//jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
		//actions.moveToElement(inputAdditionalHrsStemCell1).click().build().perform();
		Thread.sleep(2000);
		String adtnlstemcellprice = DIVelement.getText();
		float stemcellprice = Float.parseFloat(adtnlstemcellprice);
        return stemcellprice;
        
		
		/*//wait.until(ExpectedConditions.visibilityOf(inputAdditionalHrsStemCell1));
		WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(3) > td:nth-child(5) > div > lightning-input > div > input")));
        String adtnlstemcellprice = element.getText(); 
        float stemcellprice = Float.parseFloat(adtnlstemcellprice);
        return stemcellprice;*/
	}
	
	/*
	 * Method to set Data Operator Only Stem Cell Text box on the PriceList Page
	 */
	public void setOperatorOnlyStemCellPrice(int operatoronlystemcell) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(inputOperatorOnlyStemCell));
		
        actions.click().build().perform();
		
		
		String del = Keys.chord(Keys.CONTROL, "a") + Keys.DELETE; 
		inputOperatorOnlyStemCell.sendKeys(del + operatoronlystemcell);
		
}
	
	/*
	 * Method to get Data Operator Only Stem Cell price list on the PriceList Page
	 */
	public float getDataOperatorStemCellPrice() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(inputOperatorOnlyStemCell1));
		//actions.moveToElement(inputOperatorOnlyStemCell1).click().build().perform();
		//WebElement DIVelement = ldriver.findElement(By.cssSelector("html > body > div > div > section > #brandBand_1 > div > div > div > div > div > ul > div > ul > div > div > div > div > div > table > tr:nth-child(4) > td:nth-child(5) > div > lightning-input > div > input"));
		//WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[3]/td[4]/div/lightning-input/span"));
		WebElement DIVelement = ldriver.findElement(By.xpath("//div[contains(@id,'brandBand_1')]/div/div[1]/div[4]/div/div[2]/ul[2]/div/ul[2]/div/div[1]/div/div[2]/div/table/tr[3]/td[4]/div/lightning-input/div/input"));
		//JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		//jse.executeScript("scroll(250, 0)");
		//jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);
		Thread.sleep(2000);
		String operationalstemcellprice = DIVelement.getText();
		float opstemcellprice = Float.parseFloat(operationalstemcellprice);
        return opstemcellprice;
		
		/*WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-page-header.cEscalator > ul:nth-child(4) > div > ul:nth-child(3) > div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(4) > td:nth-child(5) > div > lightning-input > div > input")));
        String operationalstemcellprice = element.getText(); 
        float opstemcellprice = Float.parseFloat(operationalstemcellprice);
        return opstemcellprice;*/
	}
	
	/*
	 * Method to click on bone marrow Price Text box on the PriceList Page
	 */
	public void clickOnBoneMarrowPrice() throws InterruptedException
	{
		//WebElement element = ldriver.findElement((By.cssSelector(("div > div:nth-child(1) > div > div.slds-border_top.slds-border_right.slds-border_bottom.slds-border_left.slds-table--header-fixed_container > div > table > tr:nth-child(2) > td:nth-child(5) > div > lightning-input > div > input"))));
		WebElement element = ldriver.findElement((By.xpath("//div/div[1]/div[4]/div/div[2]/ul[2]/div/div[1]/div/div[2]/div/table/tr[1]/td[4]/div/lightning-input/div/input")));
		actions.moveToElement(element);
		Thread.sleep(5000);
		actions.click().build().perform();
			
	}
	
	/*
	 * Method to click on the Next button under PriceList Page
	 */
		
	public void clickOnTopNextButton() throws InterruptedException
	{
		WebElement element = ldriver.findElement((By.xpath("//button[contains(.,'Next')]")));
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		}
	
	/*
	 * Method to click on the Second Next button under PriceList Page
	 */
		
	public void clickOnSecondTopNextButton() throws InterruptedException
	{
		WebElement element = ldriver.findElement((By.cssSelector("div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		}
	
	/*
	 * Method to click on the Third Next button under PriceList Page
	 */
		
	public void clickOnThirdTopNextButton() throws InterruptedException
	{
		//WebElement element = ldriver.findElement((By.cssSelector("div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
		WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		}
	
	/*
	 * Method to click on the Fourth Next button under PriceList Page
	 */
		
	public void clickOnFourthTopNextButton() throws InterruptedException
	{
		WebElement element = ldriver.findElement((By.cssSelector("#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div > div.slds-grid > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div:nth-child(1) > button:nth-child(2)")));
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
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
}
