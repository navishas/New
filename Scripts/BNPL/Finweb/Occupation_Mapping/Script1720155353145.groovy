import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.channels.SelectableChannel as SelectableChannel
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@1234')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping_LOS.xlsx', 'Sheet1', 
    true)

try {

//change the path when its run in another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
	
	String firstName = excelData.getValue('Fir_Nam', row)
	
	String lastName = excelData.getValue('Las_Nam', row)
	
	String nicId = excelData.getValue('nat_id', row)
	
	//String town = excelData.getValue("dis_desc", row)
	
	String mobileNo = excelData.getValue('Mob_No', row)
    
	String occType = excelData.getValue('Occupation_Type', row)
	
	String businessType = excelData.getValue('Business_Type', row)

    String empType = excelData.getValue('Employer_Type', row)

    String indType = excelData.getValue('Industry_Type', row)

    String secType = excelData.getValue('Sector_Type', row)

    String jobType = excelData.getValue('Job_Type', row)

    String jobTitles = excelData.getValue('Job_Titles', row)

    try {
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Lead'), 20)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Lead'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Register_BNPL'))
		
		WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Get Details From_firstName'),
			firstName)
		
		WebUI.delay(4)
		
		WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Last_Name'),
			lastName)
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_Gender'), 5)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Male'))
		
		WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Mobile_Number'), mobileNo)
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_DOB'), 5)
		
		WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Date_Of_Birth'), "11 Jul 1982")
		
		WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_Marital Status'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Married'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Identifier_Selection'),0)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/Select_Identifier_Selection'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/Select_NIC'))
		
		WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_NIC'), nicId)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create Lead'))
		
		WebUI.delay(8, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_NAVISHA SUKURDEEP (RAMSOKUL)'), FailureHandling.OPTIONAL)
		
		/*/WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))
		
		WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))/*/
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Activity_Complete'),
			5, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Activity_Complete'))
		
		WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'),
			5, FailureHandling.OPTIONAL)
		
		/*/WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))
		
		WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))
		
		WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Copy Address From_mat-input-37'),
			'asdfasdf')
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 0)
		
		WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'),town)
				
		WebUI.delay(3, FailureHandling.OPTIONAL)
		
		List<WebElement> options = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/mat-option/span"))
	
		boolean optionFound = false
		
		for(WebElement option : options)
			{
			
				if(option.getText().contains(town))
					{
						option.click()
						optionFound = true
						System.out.println("Success: Occupation '" + town + "' is selected")
						break
					}
		}
		if (!optionFound) {
			System.out.println("Error: Town '" + town + "' is not present in the dropdown")
		}
		
		String district = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_District_mat-select-value-17'))
		String country = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Country_mat-select-value-19'))
	
		System.out.println("District selected: " + district)
	
		System.out.println("Country selected: " + country)
	
		WebUI.delay(1, FailureHandling.OPTIONAL)
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Drag_Drop'), 0)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Save2'))/*/
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Activity_Complete'))
		
		WebUI.delay(10)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Skip_Task_button'))
	
				       
		WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            10, FailureHandling.OPTIONAL)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Scroll_to_emp'), 5)

        WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))  ////span[contains(text(),'Employed')]/parent::mat-option/parent::div[@role='listbox']

		System.out.println("Number of options found: " + options.size())
		
		for (WebElement option : options) {
			
			String optionText = option.getText().trim()
			System.out.println("Option text: " + optionText)
		}
		
		
        boolean optionFound = false;

        for (WebElement option : options) {
			
			String optionText = option.getText().trim()
			System.out.println("Option text: " + optionText)
			
            if (optionText.contains(occType)) {
                
				option.click()

                optionFound = true;

                System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
				
				executeSalaried(driver, occType, businessType, empType, indType, secType, jobType, jobTitles)

                break
            }
        }
			
			if(!optionFound) {
				
				WebUI.refresh(FailureHandling.OPTIONAL)
				
			//driver.findElement(By.xpath("//span[text()='Employed Contractual']")).click()
			
			//driver.findElement(By.xpath("//mat-option/span[text()='Employed Full Time']")).click()
			
			
			WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'),
				5, FailureHandling.OPTIONAL)
			
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'))
			
			WebUI.delay(3)
			
			WebUI.scrollToElement(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Scroll_to_emp'), 5)
			
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))
			
			WebUI.delay(1)
			
			List<WebElement> options02 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
			
			System.out.println("Number of options found: " + options02.size())
			
			for (WebElement currentOption : options02) {
				
				String optionText02 = currentOption.getText().trim()
				System.out.println("Option text: " + optionText02)
			}

			for (WebElement currentOption : options02) {
				
				if (currentOption.getText().contains(occType)) {
					currentOption.click()
					System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
					
				}
			}

			if (occType.equals('Pensioner') || occType.equals('Unemployed')) {
				
				WebUI.delay(3)
				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
				WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Dividend_textbox'), "10000")
				WebUI.delay(2)
				WebUI.scrollToPosition(1633, 821)
				WebUI.waitForElementClickable(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Salary_Income'), 10, FailureHandling.OPTIONAL)
				WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Salary_Income'), "10000", FailureHandling.OPTIONAL)
				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Unemployed_Pensioner'))
				WebUI.delay(2)
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_scroll_to_deductions'),
					5)
				WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'), 10, FailureHandling.OPTIONAL)
				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'))
				WebUI.delay(3)
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
							5)
				WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
					5, FailureHandling.OPTIONAL)

				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

				WebUI.delay(10, FailureHandling.OPTIONAL)
				WebUI.waitForElementClickable(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Activity_Complete'), 20)
				WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Activity_Complete'))
				WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'),
					5, FailureHandling.OPTIONAL)
		
				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'))
				
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
				
				WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'))

				WebUI.delay(4, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
					0)
				
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_other'),
					0)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_business'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_count'),
					0)

				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
					0)
				
				WebUI.delay(2, FailureHandling.OPTIONAL)

				String occupationCode = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
					FailureHandling.STOP_ON_FAILURE)

				System.out.println('The Occupation Code is: ' + occupationCode)
				
				WebUI.delay(3)
				
				WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
							
			}
				
			}
				
    }
	
	
	
    catch (StaleElementReferenceException e) {
        System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())

        continue
    } catch (NoSuchElementException e) {
        System.out.println('NoSuchElementException occurred: ' + e.getMessage())
    }
	
	
}

}
	
catch (IOException e) {
	e.printStackTrace();
}

private void executeSalaried(WebDriver driver, String occType, String businessType, String empType, String indType, String secType, String jobType, String jobTitles) 

{
	
	if(occType.equals("Employed Contractual") || occType.equals("Employed Full Time") || occType.equals("Employed Part Time"))
		
		{	
			//Select Business Type
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))
			
			List<WebElement> options0 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
			
			System.out.println("Number of options found: " + options0.size())
			
			for (WebElement option0 : options0) {
				
				String optionText0 = option0.getText().trim()
				System.out.println("Option text: " + optionText0)
			}
			
			boolean bustypeFound = false
			
			for(WebElement option0 : options0) {
				
				String optionText0 = option0.getText().trim()
				System.out.println("Option text: " + optionText0)
				
				if(optionText0.contains(businessType)) {
					option0.click()
					bustypeFound = true
					System.out.println(('Success: Business Type \'' + businessType) + '\' is selected')
					break
				}
			}
			
			//Select Employer Name
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'), FailureHandling.OPTIONAL)
	
			List<WebElement> options01 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
			
			/*/for (WebElement option01 : options01) {
				
				String optionText01 = option01.getText().trim()
				System.out.println("Option text: " + optionText01)
			}/*/
	
			boolean empFound = false
	
			for (WebElement option01 : options01) {
				
				/*/String optionText01 = option01.getText().trim()
				System.out.println("Option text: " + optionText01)/*/
				
				if (option01.getText().contains(empType)) {
					
						((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option01)
	
					option01.click()
	
					empFound = true
	
					System.out.println(('Success: Employer \'' + empType) + '\' is selected')
	
					break
				}
			}
			
			if (!empFound) {
				
				System.out.println(('Error: emp \'' + empType) + '\' not found in Employer Type dropdown')
			}
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)
	
			WebUI.delay(2)
	
			List<WebElement> options2 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
	
			boolean indFound = false
	
			for (WebElement option2 : options2) {
				if (option2.getText().contains(indType)) {
						((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option2)
	
					option2.click()
	
					indFound = true
	
					System.out.println(('Success: Industry \'' + indType) + '\' is selected')
	
					break
				}
			}
			
			if (!(indFound)) {
				System.out.println(('Error: Industry \'' + indType) + '\' not found in Industry Type dropdown')
			}
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))
	
			WebUI.delay(2)
	
			List<WebElement> options3 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
	
			boolean sectorFound = false
	
			for (WebElement option3 : options3) {
				if (option3.getText().contains(secType)) {
						((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option3)
	
					option3.click()
	
					sectorFound = true
	
					System.out.println(('Success: Sector \'' + secType) + '\' is selected')
	
					break
				}
			}
			
			if (!(sectorFound)) {
				System.out.println(('Error: Sector \'' + secType) + '\' not found in Sector Type dropdown')
			}
			
			WebUI.delay(2)
			
			WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Years_in_Occupation'),'7')
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))
	
			List<WebElement> options4 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
	
			boolean jobFound = false
	
			for (WebElement option4 : options4) {
				if (option4.getText().contains(jobType)) {
						((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option4)
	
					option4.click()
	
					jobFound = true
	
					System.out.println(('Success: JobType \'' + jobType) + '\' is selected')
	
					break
				}
			}
			
			if (!(indFound)) {
				System.out.println(('Error: JobType \'' + jobType) + '\' not found in Job Type dropdown')
			}
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))
	
			List<WebElement> options5 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
	
			boolean jobtitleFound = false
	
			for (WebElement option5 : options5) {
				if (option5.getText().contains(jobTitles)) {
						((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option5)
	
					option5.click()
	
					jobtitleFound = true
	
					System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')
	
					//WebUI.refresh()
	
					break
				}
			}
			
			if (!(jobtitleFound)) {
				System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
			}
			
				WebUI.delay(4)
			
				WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 0)
				
				WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'),
					5, FailureHandling.OPTIONAL)
			
				 WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
	
						WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Rs_mat-input-6_Basic_Inc'),
							'12000')
						
						WebUI.delay(3)
						
						WebUI.scrollToPosition(1602, 900)
						
						WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'),
							5, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))
								
						
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/scroll_Expense_Details'), 0)
	
						WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'),
							5)
	
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))
	
	
						WebUI.delay(2, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
							0)
	
						WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
							5, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'))
	
						WebUI.delay(10, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))
	
						WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'),
							5, FailureHandling.OPTIONAL)
				
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'))
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
						
						WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'))
	
						WebUI.delay(4, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
							0)
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_other'),
							0)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_business'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_count'),
							0)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
							0)
						
						WebUI.delay(2, FailureHandling.OPTIONAL)
	
						String occupationCode = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
							FailureHandling.STOP_ON_FAILURE)
	
						System.out.println('The Occupation Code is: ' + occupationCode)
						
						WebUI.delay(3)
						
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
				}
				
				if(occType.equals("Self employed No Permit") || occType.equals("Self employed With Permit"))
					
					{
						WebUI.delay(2)
				
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))
						
						List<WebElement> options00 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
						
						System.out.println("Number of options found: " + options00.size())
						
						for (WebElement option00 : options00) {
							
							String optionText00 = option00.getText().trim()
							System.out.println("Option text: " + optionText00)
						}
						
						boolean bustypeFound = false
						
						for(WebElement option00 : options00) {
							
							String optionText00 = option00.getText().trim()
							System.out.println("Option text: " + optionText00)
							
							if(optionText00.contains(businessType)) {
								option00.click()
								bustypeFound = true
								System.out.println(('Success: Business Type \'' + businessType) + '\' is selected')
								break
							}
						}
						
						WebUI.delay(2)
				
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)
				
						WebUI.delay(2)
				
						List<WebElement> options002 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
				
						boolean indFound = false
				
						for (WebElement option002 : options002) {
							if (option002.getText().contains(indType)) {
									((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option002)
				
								option002.click()
				
								indFound = true
				
								System.out.println(('Success: Industry \'' + indType) + '\' is selected')
				
								break
							}
						}
						
						if (!(indFound)) {
							System.out.println(('Error: Industry \'' + indType) + '\' not found in Industry Type dropdown')
						}
						
						WebUI.delay(2)
				
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))
				
						WebUI.delay(2)
				
						List<WebElement> options003 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
				
						boolean sectorFound = false
				
						for (WebElement option003 : options003) {
							if (option003.getText().contains(secType)) {
									((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option003)
				
								option003.click()
				
								sectorFound = true
				
								System.out.println(('Success: Sector \'' + secType) + '\' is selected')
				
								break
							}
						}
						
						if (!(sectorFound)) {
							System.out.println(('Error: Sector \'' + secType) + '\' not found in Sector Type dropdown')
						}
						
						WebUI.delay(2)
						
						WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Years_in_Occupation'),'7')
						
						WebUI.delay(2)
				
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))
				
						List<WebElement> options004 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
				
						boolean jobFound = false
				
						for (WebElement option004 : options004) {
							if (option004.getText().contains(jobType)) {
									((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option004)
				
								option004.click()
				
								jobFound = true
				
								System.out.println(('Success: JobType \'' + jobType) + '\' is selected')
				
								break
							}
						}
						
						if (!(indFound)) {
							System.out.println(('Error: JobType \'' + jobType) + '\' not found in Job Type dropdown')
						}
						
						WebUI.delay(2)
						
						WebUI.scrollToElement(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_scroll_to_Job_Titles'), 5)
						
						WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'), 10)
						
						WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))
				
						List<WebElement> options005 = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span"))
				
						boolean jobtitleFound = false
				
						for (WebElement option005 : options005) {
							if (option005.getText().contains(jobTitles)) {
									((JavascriptExecutor) driver).executeScript('arguments[0].scrollIntoView(true);', option005)
				
								option005.click()
				
								jobtitleFound = true
				
								System.out.println(('Success: JobTitle \'' + jobTitles) + '\' is selected')
				
								//WebUI.refresh()
				
								break
							}
						}
						
						if (!(jobtitleFound)) {
							
							System.out.println(('Error: JobTitles \'' + jobTitles) + '\' not found in Job Title dropdown')
						}
						
							WebUI.delay(4)
						
							WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 0)
							
							WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'),
								5, FailureHandling.OPTIONAL)
						
							 WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
				
									WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Salary_Income'),
										'12000')
									
									WebUI.delay(3)
									
									WebUI.scrollToPosition(1602, 900)
									
									WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'),
										5, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))
											
									
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_scroll_To_Deductions'), 5)
				
									WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'),
										5)
				
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))
				
									WebUI.delay(2, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
										0)
				
									WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
										5, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'))
				
									WebUI.delay(10, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))
				
									WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'),
										5, FailureHandling.OPTIONAL)
							
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'))
									
									WebUI.delay(1, FailureHandling.OPTIONAL)
									
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
									
									WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/button_Initiate_Scorecard'))
				
									WebUI.delay(4, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
									
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
										0)
									
									WebUI.delay(1, FailureHandling.OPTIONAL)
									
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_other'),
										0)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_business'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_count'),
										0)
				
									WebUI.delay(1, FailureHandling.OPTIONAL)
									
									WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
										0)
									
									WebUI.delay(2, FailureHandling.OPTIONAL)
				
									String occupationCode = WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
										FailureHandling.STOP_ON_FAILURE)
				
									System.out.println('The Occupation Code is: ' + occupationCode)
									
									WebUI.delay(3)
									
									WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
							}
								
				
}

	