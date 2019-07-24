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
	
	@FindBy (how = How.CSS, using = "div > div > div.inlineFooter > div > div > button.slds-button.slds-button--neutral.uiButton--brand.uiButton.forceActionButton")
	@CacheLookup
	WebElement btnSave;
	
	
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
	public void setONegSurcharge(int onegsurcharge)
	{
		
		txtboxONegSurcharge.sendKeys(String.valueOf(onegsurcharge));
	}
	
	/*
	 * Method to click on Save Button on the New Blood Contract Page
	 */
	
	public void clickOnSaveButton()
	{
		btnSave.click();
	}
	
}
