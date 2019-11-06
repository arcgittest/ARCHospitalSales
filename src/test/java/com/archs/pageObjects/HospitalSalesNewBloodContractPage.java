package com.archs.pageObjects;

import java.util.List;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalSalesNewBloodContractPage {

	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;

	
	@SuppressWarnings("deprecation")
	public HospitalSalesNewBloodContractPage(WebDriver rdriver)
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
	
	@FindBy (how = How.CSS, using = "div > div:nth-child(3) > div:nth-child(2) > div > div > div > div > div > div > div > a")
	@CacheLookup
	WebElement drpdwnLiquidatedDamages;
	
	@FindBy (how = How.CSS, using = "div > div:nth-child(4) > div:nth-child(2) > div > div > div > div > div > div > div > a")
	@CacheLookup
	WebElement drpdwnPaymentTerms;
	
	@FindBy (how = How.CSS, using = "div > div:nth-child(3) > div:nth-child(1) > div > div > div > input ")
	@CacheLookup
	WebElement txtboxONegSurcharge;
	
	//@FindBy (how = How.CSS, using = "div > div > div.inlineFooter > div > div > button.slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton")
	@FindBy (how = How.XPATH, using = "//div/div/div[2]/div/div/button[not(contains(@title,'Save & New')) and contains(@title,'Save')]")
	@CacheLookup
	WebElement btnSave;
	
	@FindBy (how = How.XPATH, using = "//div/div[1]/div[2]/div/div/div/label[contains(.,'Contract Start Date')]/../div/input")
	@CacheLookup
	WebElement newBloodContractStartDate;
	
	@FindBy (how = How.XPATH, using = "//div/div[2]/div[2]/div/div/div/label[contains(.,'Contract End Date')]/../div/input")
	@CacheLookup
	WebElement newBloodContractEndDate;
	
	@FindBy (how = How.XPATH, using = "//div/div[5]/div[1]/div/div/div/label[contains(.,'Selling Price RBC')]/../input")
	@CacheLookup
	WebElement newBloodContractSellingPriceRBC;
	
	@FindBy (how = How.XPATH, using = "//div/div[6]/div[1]/div/div/div/label[contains(.,'Selling Price SDP')]/../input")
	@CacheLookup
	WebElement newBloodContractSellingPriceSDP;
	
	@FindBy (how = How.XPATH, using = "//div/div[7]/div[1]/div/div/div/label[contains(.,'Volume RBC')]/../input")
	@CacheLookup
	WebElement newBloodContractVolumeRBC;
	
	@FindBy (how = How.XPATH, using = "//div/div[8]/div[1]/div/div/div/label[contains(.,'Volume SDP')]/../input")
	@CacheLookup
	WebElement newBloodContractVolumeSDP;
	
	
	
	
	/*
	 * Method to select LiquidatedDamages Drop down value on the New Blood Contract Page
	 */
	public void selectLiquidatedDamages() throws InterruptedException
	{
		
	    WebElement selectElements = ldriver.findElement(By.cssSelector("div > div:nth-child(3) > div:nth-child(2) > div > div > div > div > div > div > div > a"));
		wait.until(ExpectedConditions.visibilityOf(selectElements));
	    selectElements.click();
	    Thread.sleep(1000);
		WebElement selectElement = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(@title,'Yes') and contains(@role,'menuitemradio')]"));
		wait.until(ExpectedConditions.visibilityOf(selectElement));
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(@title,'Yes') and contains(@role,'menuitemradio')]")).click();
	}
	
	/*
	 * Method to select Payment Terms Drop down value on the New Blood Contract Page
	 */
	public void selectPaymentTerms() throws InterruptedException
	{
		WebElement selectElement = ldriver.findElement(By.cssSelector("div > div:nth-child(4) > div:nth-child(2) > div > div > div > div > div > div > div > a"));
		selectElement.click();
		Thread.sleep(1000);
		WebElement selectElements = ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(@title,'Net 30') and contains(@role,'menuitemradio')]"));
		wait.until(ExpectedConditions.visibilityOf(selectElements));
		Thread.sleep(1000);
		ldriver.findElement(By.xpath("//div/ul/li[2]/a[contains(@title,'Net 30') and contains(@role,'menuitemradio')]")).click();
	 
			
	}
	
	
	/*
	 * Method to set Data under O NegSurcharge Text box on the New Blood Contract Page
	 */
	public void setONegSurcharge(int onegsurcharge) throws InterruptedException
	{
		
		txtboxONegSurcharge.sendKeys(String.valueOf(onegsurcharge));
		Thread.sleep(5000);
	}
	
	/*
	 * Method to click on Save Button on the New Blood Contract Page
	 */
	
	//@SuppressWarnings("unchecked")
	public void clickOnSaveButton() throws InterruptedException
	{
	       //fluentWait.until(ExpectedConditions.elementToBeClickable(btnSave));
		/*wait.until(ExpectedConditions.visibilityOf(btnSave));
		ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSave.sendKeys(Keys.ENTER);*/
		btnSave.click();
		Thread.sleep(5000);
	}
	
	/*
	 * Method to get Start Date on the New Blood Contract Page
	 */
	public String getStartDateText() throws InterruptedException
	{
		Thread.sleep(9000);
		String startDate = newBloodContractStartDate.getAttribute("value");
		System.out.println("New Blood Contract Page StartDate..... " +startDate);
		return startDate;
     }
	
	/*
	 * Method to get End Date on the New Blood Contract Page
	 */
	public String getEndDateText() throws InterruptedException
	{
		String endDate = newBloodContractEndDate.getAttribute("value");
		System.out.println("New Blood Contract Page EndDate..... " +endDate);
		return endDate;
     }
	
	/*
	 * Method to get Selling Price RBC Text on the New Blood Contract Page
	 */
	public String getSellingPriceRBCText() throws InterruptedException
	{
		String sellingPriceRBC = newBloodContractSellingPriceRBC.getAttribute("value");
		System.out.println("New Blood Contract Page sellingPrice RBC..... " +sellingPriceRBC);
		return sellingPriceRBC;
     }
	
	/*
	 * Method to get Selling Price SDP Text on the New Blood Contract Page
	 */
	public String getSellingPriceSDPText() throws InterruptedException
	{
		String sellingPriceSDP = newBloodContractSellingPriceSDP.getAttribute("value");
		System.out.println("New Blood Contract Page sellingPrice SDP ..... " +sellingPriceSDP);
		return sellingPriceSDP;
     }
	
	/*
	 * Method to get Volume RBC Text on the New Blood Contract Page
	 */
	public String getVolumeRBCText() throws InterruptedException
	{
		String volumeRBC = newBloodContractVolumeRBC.getAttribute("value");
		System.out.println("New Blood Contract Page Volume RBC Price..... " +volumeRBC);
		return volumeRBC;
     }
	
	/*
	 * Method to get Volume SDP Text on the New Blood Contract Page
	 */
	public String getVolumeSDPText() throws InterruptedException
	{
		String volumeSDP = newBloodContractVolumeSDP.getAttribute("value");
		System.out.println("New Blood Contract Page volume SDP Price..... " +volumeSDP);
		return volumeSDP;
     }
	
}
