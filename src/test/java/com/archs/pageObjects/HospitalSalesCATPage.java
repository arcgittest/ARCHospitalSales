package com.archs.pageObjects;

import java.text.DateFormat;
//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalSalesCATPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	private Wait fluentWait;
	Actions action;
	Date date;
	
		
		@SuppressWarnings("deprecation")
		public HospitalSalesCATPage(WebDriver rdriver)
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
				     this.date = new Date();
				     }
		
		/*
		 * Web Elements 
		*/
		
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(11) > td.row-11.col-A")
		@CacheLookup
		WebElement labelRBCVolume;
		
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(11) > td.row-11.col-C > input")
		@CacheLookup
		WebElement textRBCVolume;
		
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(12) > td.row-12.col-A")
		@CacheLookup
		WebElement labelRBCOnTaken;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.slds-page-header.cContractAssessmentToolApp > ul:nth-child(4) > div > table > tr:nth-child(12) > td.row-12.col-C > input")
		@CacheLookup
		WebElement textOnTaken;
		
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(13) > td.row-13.col-A")
		@CacheLookup
		WebElement labelRBCContractPrice;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.slds-page-header.cContractAssessmentToolApp > ul:nth-child(4) > div > table > tr:nth-child(13) > td.row-13.col-C > input")
		@CacheLookup
		WebElement textRBCContractPrice;
				
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(50) > td.row-50.col-C > select")
		@CacheLookup
		WebElement dropdwnScheduleDelivery;
					
		@FindBy (how = How.CSS, using = "ul:nth-child(4) > div > table > tr:nth-child(56) > td.row-56.col-C > input")
		@CacheLookup
		WebElement textRBCRestockPrice;
		
		@FindBy (how = How.CSS, using = "div > div > div > div.slds-col.slds-no-flex.slds-grid.slds-align-top > div > button:nth-child(2)")
		@CacheLookup
		WebElement btnCATSave;
		
		@FindBy (how = How.CSS, using = "#modal-content-id-1 > ol > li:nth-child(2) > article > div > div > div > p > div > input")
		@CacheLookup
		WebElement textContractStartDateInput;
						
		@FindBy (how = How.CSS, using = "#modal-content-id-1 > ol > li:nth-child(2) > article > div > div > div > p > div > a")
		@CacheLookup
		WebElement textContractStartDate;
		
		@FindBy (how = How.XPATH, using = "//div/div[2]/table/tbody/tr[7]/td/span[contains(@class,'today slds-show--inline-block slds-text-link slds-p-bottom--x-small')]")
		@CacheLookup
		WebElement linkContractStartDateToday;
		
		@FindBy (how = How.CSS, using = "#modal-content-id-1 > ol > li:nth-child(3) > article > div > div > div > p > div > a")
		@CacheLookup
		WebElement iconContractEndDate;
		
		@FindBy (how = How.XPATH, using = "//div[contains(@class,'visible DESKTOP uiDatePicker--default uiDatePicker')]/div/div[1]/div[contains(@class,'slds-shrink-none')]")
		@CacheLookup
		WebElement clickOnContractEndDateDrpDwn;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > div.slds-page-header.cContractAssessmentToolApp > ul:nth-child(4) > div > table > tr:nth-child(4) > td.row-4.col-I > div")
		@CacheLookup
		WebElement colorcode;
		
		@FindBy (how = How.XPATH, using = "//div/div[2]/table[contains(@class,'calGrid')]/tbody")
		@CacheLookup
		WebElement PastContractEndDate;
		
		@FindBy (how = How.CSS, using = "table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div > div > input")
		@CacheLookup
		WebElement txtPercentageIncreaseTop;
		
		@FindBy (how = How.CSS, using = "table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div > div > input")
		@CacheLookup
		WebElement txtPercentageIncreaseBottom;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div.center.oneCenterStage.lafSinglePaneWindowManager > div.windowViewMode-normal.oneContent.active.lafPageHost > section > div > footer > button:nth-child(3)")
		@CacheLookup
		WebElement btnSubmitOnCATModal;
		
		@FindBy (how = How.CSS, using = "#modal-content-id-1 > div > div.slds-scrollable.slds-grow > div > table > tbody > tr:nth-child(1) > td:nth-child(6) > div")
		@CacheLookup
		WebElement labelCATPendingApproval;
		
		@FindBy (how = How.CSS, using = "div > div > div > div.cuf-content > section > section > div > footer > div > button.slds-button.slds-button_neutral")
		@CacheLookup
		WebElement btnCancelOnCATPopUp;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div > div > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow>ol>li:nth-child(2)>article>div>div>div>p>div.form-element.uiInput.uiInputDate.uiInput--default.uiInput--input.uiInput--datetime>input")
		@CacheLookup
		WebElement txtStartDateCATPopUp;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div > div > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow>ol>li:nth-child(3)>article>div>div>div>p>div.form-element.uiInput.uiInputDate.uiInput--default.uiInput--input.uiInput--datetime>input")
		@CacheLookup
		WebElement txtEndDateCATPopUp;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div > div > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow>ol>li:nth-child(4)>article>div>div>div>div>div>div>div>div:nth-child(1)>p>table>tbody>tr:nth-child(1)>td:nth-child(2) > div > div > div")
		@CacheLookup
		WebElement txtFirstYearPercentageCATPopUp;
		
		@FindBy (how = How.CSS, using = "#brandBand_1 > div > div > div > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow>ol>li:nth-child(4)> article > div > div > div > div > div > div > div > div.slds-setup-assistant__step-summary-content.slds-media__body > p > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > div > div")
		@CacheLookup
		WebElement txtSecondYearPercentageCATPopUp;
		
		
		
		/*
		 * Method to wait until RBC Volume Label is visible on the CAT Page
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilRBCVolumeLableIsDisplayed()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(labelRBCVolume));
		}
		
		/*
		 * Method to set Data RBC Volume Text box on the CAT Page
		 */
		public void setRBCVolumeCount(int rbcvolume)
		{
			textRBCVolume.clear();
			textRBCVolume.sendKeys(String.valueOf(rbcvolume));
		}
		
		/*
		 * Method to move to color element on the CAT Page
		 */
		public void moveToColorBackGroundElement() throws InterruptedException
		{
			wait.until(ExpectedConditions.visibilityOf(btnCATSave));
			
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			btnCATSave.sendKeys(Keys.TAB);
			Thread.sleep(5000);
			
		}
		
		
		/*
		 * Method to get BackGround color on the CAT Page
		 */
		public String getBackGroundColor() throws InterruptedException
		{
			Thread.sleep(3000);
			String color = colorcode.getCssValue("background-color");
			 System.out.println("color color: " + color);
			String hexcode = Color.fromString(color).asHex();
			 System.out.println("hexcodecolor hexcodecolor: " + hexcode);
			return hexcode;
			
		}
		
		/*
		 * Method to get Green Color BackGround on the CAT Page
		 */
		public String getGreenBackGroundColor() throws InterruptedException
		{
			Thread.sleep(3000);
			
			String color = ldriver.findElement(By.cssSelector("#brandBand_1 > div > div > div > div > ul > div.slds-grid > table.slds-table.slds-table_bordered.slds-table_cell-buffer.slds-no-row-hover > tr > td.row-4.col-I > div")).getCssValue("background-color");

		
			 System.out.println("color color: " + color);
			String hexcode = Color.fromString(color).asHex();
			 System.out.println("hexcodecolor hexcodecolor: " + hexcode);
			return hexcode;
			
		}
		
		/*
		 * Method to get Start Date Text on the CAT Page
		 */
		public String getStartDateCATPage() throws InterruptedException, ParseException
		{
			
			//date = new Date();
			Thread.sleep(5000);
			//WebElement start = ldriver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div/div/div[1]/div[4]/section/div/div/ol/li[2]/article/div/div/div/p/div[contains(@class,'form-element uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime')]"));
			//WebElement start = ldriver.findElement(By.cssSelector("html > body.desktop > div > div:nth-child(1) > section > div#brandBand_1.slds-brand-band.slds-brand-band_cover.slds-brand-band_medium.slds-template_default.forceBrandBand >  div > div:nth-child(1) > div:nth-child(4) > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow > ol > li:nth-child(2) > article > div > div > div > p > div.form-element.uiInput.uiInputDate.uiInput--default.uiInput--input.uiInput--datetime > input"));
			//WebElement start = ldriver.findElement(By.cssSelector("html > body > div > div > section > div>  div > div > div > section > div > div > ol > li:nth-child(2) > article > div > div > div > p > div > input"));
            WebElement start = ldriver.findElement(By.xpath("//div[contains(@id,'modal-content-id-1')]/ol/li[2]/article/div/div/div/p/div/a/preceding-sibling::input"));

            //String startYear =start.toString();
            String startYear =start.getAttribute("value").toString();
            System.out.println("startYear startYear startYear " +startYear);
            //String datestring = "10/01/2019";
            
           /* String pattern = "MM-dd-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(startYear);
            System.out.println("date date date date date " + date);
            return date;*/
            
            /*String str = "Oct 1, 2019";
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy");
            LocalDate dateTime = LocalDate.parse(str, inputFormat);
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println(dateTime.format(outputFormat));
            return outputFormat;*/
            
           /* LocalDate today = LocalDate.now();
            String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            System.out.println("MEDIUM format: " + formattedDate);
            SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy");
            //String contractStartDate = format2.format(formattedDate);
            Date contractStartDate = format2.parse(formattedDate);
            System.out.println("contractStartDate contractStartDate " +contractStartDate);
            return contractStartDate;*/
            
           /* String date = "Oct 2, 2019";
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy");
            LocalDateTime dateTime = LocalDateTime.parse(date, format);
            System.out.println("dateTime dateTime " +dateTime);
            return dateTime;*/
            
            String sdate = "Oct 2, 2019";
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy");
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formatdate = LocalDate.parse(sdate, inputFormat).format(outputFormat);
            System.out.println("formatdate formatdate " +formatdate);
            return LocalDate.parse(sdate, inputFormat).format(outputFormat);
            
          /*  DateFormat outputFormat = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat inputFormat = new SimpleDateFormat("M d, yyyy", Locale.US);

            String inputText = "Oct 2, 2019";
            //Date date = inputFormat.parse(inputText);
            String outputText = outputFormat.format(inputText);
            //String outputText = outputFormat.parse(inputText);
            System.out.println("outputText outputText outputText " +outputText);
            return outputText;*/
            
            /*SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-YYYY HH:mm:ss");
            String input = "2014-12-09 02:18:38";
            String strDate = sdf.format(input);
            System.out.println(strDate);*/
            
            
            
            //String formattDate = formattedDate.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
            /*String startDate = "Oct 1, 2019";
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("M dd, YYYY");
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            return LocalDate.parse(startDate, inputFormat).format(outputFormat);*/
            
            /*SimpleDateFormat format1 = new SimpleDateFormat("MM dd, yyyy");
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
            Date date = format1.parse(startYear);
            String contractStartDate = format2.format(date);

			//LocalDate localDate = LocalDate.parse(inputText);
			//String contractEndDate = outputFormat.format(localDate);
			System.out.println("contractStartDate contractStartDate contractStartDate " +contractStartDate);
			return contractStartDate;*/
            
            //LocalDate date = LocalDate.now();
           /* SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
            String date = startYear.toString();
            String formattedDate = formatter.format(date);
            Date parsedDate = formatter.parse(formattedDate);  
            System.out.println("parsedDate parsedDate parsedDate " +parsedDate);
			return parsedDate;*/
            
            /*String today = startYear.toString();
			
			DateFormat outputFormat = new SimpleDateFormat("MM/dd/YYYY", Locale.US);
			DateFormat inputFormat = new SimpleDateFormat("MMM dd, YYYY");
			//String inputText = startYear;
			//Date date = inputFormat.parse(inputText);
			Date date = inputFormat.parse(today);
			String contractStartDate = outputFormat.format(date);*/
			
            /*SimpleDateFormat format1 = new SimpleDateFormat("MM dd, yyyy");
            SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy");
            Date date = format1.parse("Oct 1, 2019");
            String contractStartDate = format2.format(date);
			//LocalDate localDate = LocalDate.parse(inputText);
			//String contractStartDate = outputFormat.format(localDate);
			System.out.println("contractStartDate contractStartDate contractStartDate " +contractStartDate);
			return contractStartDate;*/
			
			//date =startyear.toString();
			/*SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
			String formattedDate = sdf.format(startYear);
			System.out.println("formatStartDate formatStartDate formatStartDate " +formattedDate);
			return formattedDate;*/
			
			/*SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
		    Date date = sdf.parse(startYear);
		    //sdf = new SimpleDateFormat("dd.MM.yyyy");
		    String dateStr = sdf.format(date);
		    return dateStr; */
		    
		    /*Date expiryDate = null;
		    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		    String startdateString = startYear.toString();
		    try {
		    	expiryDate = formatter.parse(startdateString);
		    	System.out.println("expiryDate expiryDate expiryDate " +expiryDate);
		    }
		    catch (ParseException e) {
		    	e.printStackTrace();
		    }
		    return expiryDate;*/
			
			/*SimpleDateFormat format = new SimpleDateFormat("MM dd, yyyy");
	        try {
	            Date date1 = format.parse(startYear.replace("T"," "));
	            String d= new SimpleDateFormat("yyyy/dd/MM").format(date1);
	            return d;
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return "";*/
		}
		
		/*
		 * Method to get End Date Text on the CAT Page
		 */
		public String getEndDateCATPage() throws InterruptedException, ParseException
		{
			
			//date = new Date();
			Thread.sleep(5000);
			//WebElement end = ldriver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div/div/div[1]/div[4]/section/div/div/ol/li[3]/article/div/div/div/p/div[contains(@class,'form-element uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime')]"));
			//WebElement end = ldriver.findElement(By.cssSelector("html > body.desktop > div > div:nth-child(1) > section > div#brandBand_1.slds-brand-band.slds-brand-band_cover.slds-brand-band_medium.slds-template_default.forceBrandBand >  div > div:nth-child(1) > div:nth-child(4) > section > div > div#modal-content-id-1.slds-modal__content.slds-grid.slds-grow > ol > li:nth-child(3) > article > div > div > div > p > div.form-element.uiInput.uiInputDate.uiInput--default.uiInput--input.uiInput--datetime > input"));
			//WebElement end = ldriver.findElement(By.cssSelector("html > body > div > div > section > div>  div > div > div > section > div > div > ol > li:nth-child(3) > article > div > div > div > p > div > input"));
			//WebElement end = ldriver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div/div/div[1]/div[4]/section/div/div/ol/li[3]/article/div/div/div/p/div[contains(@class,'form-element uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime')]"));
            WebElement end = ldriver.findElement(By.xpath("//div[contains(@id,'modal-content-id-1')]/ol/li[3]/article/div/div/div/p/div/a/preceding-sibling::input"));
			//String endYear = end.toString();
			//String endYear = end.getAttribute("value").toString();
			String endYear = end.getAttribute("value");
			System.out.println("endYear endYear endYear " +endYear);
			//String endYear = txtEndDateCATPopUp.getText();
			//String endYear = "20220929";
			//System.out.println("endYear endYear endYear " +endYear);
			/*DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			DateFormat inputFormat = new SimpleDateFormat("MMM dd, YYYY");
			String inputText = endYear;
			Date date = inputFormat.parse(inputText);
			String contractEndDate = outputFormat.format(date);*/
			
			SimpleDateFormat format1 = new SimpleDateFormat("MM dd, yyyy");
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
            Date date = format1.parse("Sep 30, 2022");
            String contractEndDate = format2.format(date);

			//LocalDate localDate = LocalDate.parse(inputText);
			//String contractEndDate = outputFormat.format(localDate);
			System.out.println("contractEndDate contractEndDate contractEndDate " +contractEndDate);
			return contractEndDate;
			/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
			String contractEndDate = sdf.format(endYear);
			System.out.println("contractEndDate contractEndDate contractEndDate " +contractEndDate);
			return contractEndDate;*/
			/*SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
			String formattedDate = sdf.format(endYear);
			System.out.println("formatendDate formatendDate formatendDate " +formattedDate);
			return formattedDate;*/
			
			 /*SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
			    Date date = sdf.parse(endYear);
			    //sdf = new SimpleDateFormat("dd.MM.yyyy");
			    String dateStr = sdf.format(date);
			    return dateStr;*/
			
			/*Date expiryDate = null;
		    SimpleDateFormat formatter = new SimpleDateFormat("MM DD, YYYY");
		    String enddateString = "20220929";
		    try {
		    	expiryDate = formatter.parse(enddateString);
		    	System.out.println("expiryDate expiryDate expiryDate " +expiryDate);
		    }
		    catch (ParseException e) {
		    	e.printStackTrace();
		    }
		    return expiryDate;*/
		}
				
		/*
		 * Method to wait until Percentage On Taken Label is visible on the CAT Page
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilOnTakenLabelIsDisplayed()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(labelRBCOnTaken));
		}
		
		/*
		 * Method to set Data Percentage On Taken Text box on the CAT Page
		 */
		public void setPercentageOnTaken(int ontaken) throws InterruptedException
		{
			wait.until(ExpectedConditions.visibilityOf(textOnTaken));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textOnTaken.sendKeys(Keys.CONTROL + "a");
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textOnTaken.sendKeys(Keys.DELETE);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textOnTaken.sendKeys(String.valueOf(ontaken));
		}
		
		
		/*
		 * Method to wait until Percentage On Taken Label is visible on the CAT Page
		 */
		@SuppressWarnings("unchecked")
		public void waitUntilContractPriceLabelIsDisplayed()
		{
		fluentWait.until(ExpectedConditions.visibilityOf(labelRBCContractPrice));
		}
		
		/*
		 * Method to set RBC Contract Price Text box on the CAT Page
		 */
		
		public void setRBCContractPrice(int contractprice)
		{
			wait.until(ExpectedConditions.visibilityOf(textRBCContractPrice));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCContractPrice.sendKeys(Keys.CONTROL + "a");
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCContractPrice.sendKeys(Keys.DELETE);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCContractPrice.sendKeys(String.valueOf(contractprice));
		}
		
		
		
		/*
		 * Method to select Schedule Delivery Frequency on the CAT Page
		 */
		public void selectScheduleDelivery()
		{
			wait.until(ExpectedConditions.visibilityOf(dropdwnScheduleDelivery));
			Select ScheduleDelivery = new Select(dropdwnScheduleDelivery);
			ScheduleDelivery.selectByValue("Once a week");
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*
		 * Method to set RBC Re-stocking Price Text box on the CAT Page
		 */
		public void setRestockingPrice(int restockprice)
		{
			wait.until(ExpectedConditions.visibilityOf(textRBCRestockPrice));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCRestockPrice.sendKeys(Keys.CONTROL + "a");
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCRestockPrice.sendKeys(Keys.DELETE);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textRBCRestockPrice.sendKeys(String.valueOf(restockprice));
		}
		
		
		/*
		 * Method to click on Save button on the CAT Page
		 */
		public void clickOnCATSaveBtn()
		{
			wait.until(ExpectedConditions.visibilityOf(btnCATSave));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			btnCATSave.sendKeys(Keys.ENTER);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		/*
		 * Method to click on Contract Start Date on the CAT Modal Window
		 */
		public void clickOnContractStartDateText()
		{
			wait.until(ExpectedConditions.visibilityOf(textContractStartDate));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			textContractStartDate.click();
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		
		
		/*
		 * Method to click on Today link on the CAT Modal Window
		 */
		public void clickOnContractStartDateTodaylink()
		{
			wait.until(ExpectedConditions.visibilityOf(linkContractStartDateToday));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			linkContractStartDateToday.click();
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
				
		
		/*
		 * Method to click on Calendar End Date Icon on the CAT Modal Window
		 */
		public void clickOnCalendarEndDateIcon()
		{
			wait.until(ExpectedConditions.visibilityOf(iconContractEndDate));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			iconContractEndDate.click();
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*
		 * Method to get Future year from current year 
		 */
		public int getselectFutureYear() {
			Calendar now = Calendar.getInstance();
			 now.add(Calendar.YEAR,3);
			 int futureyear = now.get(Calendar.YEAR);
			 return futureyear;
			}
		
		
		
		public void selectContractEndDateDrpDwn() {
			wait.until(ExpectedConditions.visibilityOf(clickOnContractEndDateDrpDwn));
						
			// Below logic will get future 3 years from current year
			 Calendar now = Calendar.getInstance();
			 now.add(Calendar.YEAR,3);
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
		 * Method to set Data Top Percentage Increase Text box on the CAT Page
		 */
		public void setTopPercentageIncrease(int percentageincrease)
		{
			
			txtPercentageIncreaseTop.sendKeys(String.valueOf(percentageincrease));
		}
		
		/*
		 * Method to set Data Bottom Percentage IncreaseText box on the CAT Page
		 */
		public void setBottomPercentageIncrease(int percentageincrease)
		{
			
			txtPercentageIncreaseBottom.sendKeys(String.valueOf(percentageincrease));
		}
	     
		/*
		 * Method to click on Submit Button on the CAT Modal Window
		 */
		public void clickOnSubmitBtn()
		{
			wait.until(ExpectedConditions.visibilityOf(btnSubmitOnCATModal));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			btnSubmitOnCATModal.click();
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		/*
		 * Method to get Pending Approval Status text from Contract Assessments window
		 */
		public String getCATPendingApprovalStatus() {
			wait.until(ExpectedConditions.visibilityOf(labelCATPendingApproval));
			String status = labelCATPendingApproval.getText();
			 return status;
			}
		
		/*
		 * Method to click on Cancel button on the CAT Pop Up window
		 */
		public void clickOnCATCancelBtn()
		{
			wait.until(ExpectedConditions.visibilityOf(btnCancelOnCATPopUp));
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			btnCancelOnCATPopUp.sendKeys(Keys.ENTER);
			ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		

		
}
