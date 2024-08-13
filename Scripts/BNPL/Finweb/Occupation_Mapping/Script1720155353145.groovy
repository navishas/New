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

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@12345')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

//WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I3833/Downloads/Latest Occupation Code Mapping test cases.xlsx','Sheet1',
    true) //Here ExcelFactory is a class and getExcelDatawithDefaultSheet is a static method and Object is class and excelData is objectname
		//change the path when its run in another local system

try {


for (int row = 1; row <= excelData.getRowNumbers(); row++) // row 0 in excel is is header //for loop incrementation
	{
	
	String firstName = excelData.getValue('Fir_Nam', row)//getting the firstName row from excel
	
	String lastName = excelData.getValue('Las_Nam', row)//getting the lastName row from excel
	
	String nicId = excelData.getValue('nat_id', row)//getting the nationalId row from excel
	
	//String town = excelData.getValue("dis_desc", row)
	
	String mobileNo = excelData.getValue('Mob_No', row)//getting the mobile numbers row from excel
    
	String occType = excelData.getValue('Occupation_Type', row)//getting the Occupation Type row from excel
	
	String businessType = excelData.getValue('Business_Type', row)//getting the Business Type row from excel

    String empType = excelData.getValue('Employer_Type', row)//getting the Employer Type row from excel

    String indType = excelData.getValue('Industry_Type', row)//getting the Industry Type row from excel

    String secType = excelData.getValue('Sector_Type', row)//getting the sector Type row from excel

    String jobType = excelData.getValue('Job_Type', row)//getting the Job Type row from excel

    String jobTitles = excelData.getValue('Job_Titles', row)//getting the Job Titles row from excel

    try {
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'), 20)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'))
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Register_BNPL'))
		
		WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Get Details From_firstName'),
			firstName) 
		
		WebUI.delay(4)
		
		WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Last_Name'),
			lastName)
		
		WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_Gender'), 5)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Male'))
		
		WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Mobile_Number'), mobileNo)
		
		WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_DOB'), 5)
		
		WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Date_Of_Birth'), "11 Jul 1982")
		
		WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_Marital Status'))
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Married'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Identifier_Selection'),0)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/Select_Identifier_Selection'))
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/Select_NIC'))
		
		WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_NIC'), nicId)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create Lead'))
		
		WebUI.delay(8, FailureHandling.OPTIONAL)
		
		//WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_NAVISHA SUKURDEEP (RAMSOKUL)'), FailureHandling.OPTIONAL)
		
		/*/WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Search'))
		
		WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))/*/
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'),
			5, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'))
		
		WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'),
			5, FailureHandling.OPTIONAL)
		
		/*/WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))
		
		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))
		
		WebUI.click(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))
		
		WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Copy Address From_mat-input-37'),
			'asdfasdf')
		
		WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 0)
		
		WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'),town)
				
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
		
		String district = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_District_mat-select-value-17'))
		String country = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Country_mat-select-value-19'))
	
		System.out.println("District selected: " + district)
	
		System.out.println("Country selected: " + country)
	
		WebUI.delay(1, FailureHandling.OPTIONAL)
		
		WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Drag_Drop'), 0)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Save2'))/*/
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'))
		
		WebUI.delay(10)
		
		WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Skip_Task_button'))
	
				       
		WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            10, FailureHandling.OPTIONAL)
		
		WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Scroll_to_emp'), 5)

        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            FailureHandling.OPTIONAL)

        WebUI.delay(2)

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span")) //using List method options are saved in the WebElement name options

		System.out.println("Number of options found: " + options.size()) // getting the size of the list
		
		for (WebElement option : options) //adding WebElement and object name and in for loop
			{
			
			String optionText = option.getText().trim() // trim is used to eliminate spaces in the get text
			System.out.println("Option text: " + optionText)
		}
		
		
        boolean optionFound = false;

        for (WebElement option : options) {
			
			String optionText = option.getText().trim()
			System.out.println("Option text: " + optionText)
			
            if (optionText.contains(occType)) //using if condition getting the excel value and click when its matched with the list of options
				{
                
				option.click() //from a list of option one option is matched with the excel value and the value is clicked

                optionFound = true;

                System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
				
				executeSalaried(driver, occType, businessType, empType, indType, secType, jobType, jobTitles)    //existing code excution are added in a seperate method excuteSalaried
																												//call this method when need to execute the existing code
                break
            }
        }
			//this is for excel value and list of option is not matched
		
			if(!optionFound) 
				{
				
				WebUI.refresh(FailureHandling.OPTIONAL)
				
			//driver.findElement(By.xpath("//span[text()='Employed Contractual']")).click()
			
			//driver.findElement(By.xpath("//mat-option/span[text()='Employed Full Time']")).click()
			
			
			WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'),
				5, FailureHandling.OPTIONAL)
			
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Radio_button_No'))
			
			WebUI.delay(3)
			
			WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Scroll_to_emp'), 5)
			
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))
			
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
				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
				WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Dividend_textbox'), "10000")
				WebUI.delay(2)
				WebUI.scrollToPosition(1633, 821)
				WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Salary_Income'), 10, FailureHandling.OPTIONAL)
				WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Salary_Income'), "10000", FailureHandling.OPTIONAL)
				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Unemployed_Pensioner'))
				WebUI.delay(2)
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_scroll_to_deductions'),
					5)
				WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'), 10, FailureHandling.OPTIONAL)
				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_button_Pensioner'))
				WebUI.delay(3)
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
							5)
				WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
					5, FailureHandling.OPTIONAL)

				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

				WebUI.delay(10, FailureHandling.OPTIONAL)
				WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'), 20)
				WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Activity_Complete'))
				
//				WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'),
//					5, FailureHandling.OPTIONAL)
//		
//				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'))
				
//	Due to Error in the application, We are unable to proceed with button activity complete, so we are using skip task button to proceed furthur.	
					
				WebUI.delay(5, FailureHandling.OPTIONAL)
				
				WebUI.waitForElementClickable(findTestObject('LOS/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'),
					5, FailureHandling.OPTIONAL)
		
				WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'))
				
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
//				WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
//				
//				WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/button_Initiate_Scorecard'))
				
				WebUI.refresh()
				
				WebUI.delay(10, FailureHandling.OPTIONAL)
			
				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Loan App Scorecard'))

				WebUI.delay(4, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
					30)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Dividend'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
					30)
				
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_other'),
					30)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_business'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)

				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_count'),
					30)

				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
					30)
				
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIB_Income'),
					30)
				WebUI.delay(1, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_maritalStatusGender'),
					30)
				
				WebUI.delay(2, FailureHandling.OPTIONAL)
				
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
					30)
				
				WebUI.delay(2, FailureHandling.OPTIONAL)

				String occupationCode = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
					FailureHandling.STOP_ON_FAILURE)

				System.out.println('The Occupation Code is: ' + occupationCode)
				
				WebUI.delay(3)
				
				WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
							
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

//calling excuteSalaried as a method and excuting all existing code

private void executeSalaried(WebDriver driver, String occType, String businessType, String empType, String indType, String secType, String jobType, String jobTitles) 

{
	
	if(occType.equals("Employed Contractual") || occType.equals("Employed Full Time") || occType.equals("Employed Part Time"))
		
		{	
			//Select Business Type
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))
			
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
	
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Employer_Select'), FailureHandling.OPTIONAL)
	
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
	
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)
	
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
	
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))
	
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
			
			WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Years_in_Occupation'),'7')
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))
	
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
			
			WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))
	
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
			
				WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 0)
				
				WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'),
					5, FailureHandling.OPTIONAL)
			
				 WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
	
						WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Rs_mat-input-6_Basic_Inc'),
							'12000')
						
						WebUI.delay(3)
						
						WebUI.scrollToPosition(1602, 900)
						
						WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'),
							5, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))
								
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/scroll_Expense_Details'), 0)
	
						WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'),
							5)
	
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))
	
	
						WebUI.delay(2, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
							0)
	
						WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
							5, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'))
	
						WebUI.delay(10, FailureHandling.OPTIONAL)
	
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))
	
						//WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'),
						//	5, FailureHandling.OPTIONAL)
						
						//	Due to Error in the application, We are unable to proceed with button activity complete, so we are using skip task button to proceed furthur.
						
						WebUI.delay(7, FailureHandling.OPTIONAL)
						
						WebUI.waitForElementClickable(findTestObject('LOS/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'),
							5, FailureHandling.OPTIONAL)
				
						WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'))
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						//WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
						
						//WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/button_Initiate_Scorecard'))
						
						
						WebUI.refresh()
						
						WebUI.delay(10, FailureHandling.OPTIONAL)
					
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Loan App Scorecard'))
						
						WebUI.delay(4, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
							30)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Dividend'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
							30)
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_other'),
							30)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_business'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_count'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
							30)
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIB_Income'),
							30)
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_maritalStatusGender'),
							30)
						
						WebUI.delay(2, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
							30)
	
						String occupationCode = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
							FailureHandling.STOP_ON_FAILURE)
	
						System.out.println('The Occupation Code is: ' + occupationCode)
						
						WebUI.delay(3)
						
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
				}
				
				if(occType.equals("Self employed No Permit") || occType.equals("Self employed With Permit"))
					
					{
						WebUI.delay(2)
				
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business_Type_Select'))
						
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
				
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)
				
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
				
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Sector_Arrow_Select'))
				
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
						
						WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Years_in_Occupation'),'7')
						
						WebUI.delay(2)
				
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Type_Select'))
				
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
						
						WebUI.scrollToElement(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_scroll_to_Job_Titles'), 5)
						
						WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'), 10)
						
						WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Job_Titles_Select'))
				
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
						
							WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/scroll_Emp_Details'), 0)
							
							WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'),
								5, FailureHandling.OPTIONAL)
						
							 WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
				
									WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Salary_Income'),
										'12000')
									
									WebUI.delay(3)
									
									WebUI.scrollToPosition(1602, 900)
									
									WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'),
										5, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))
											
									
									WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/input_scroll_To_Deductions'), 5)
				
									WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'),
										5)
				
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))
				
									WebUI.delay(2, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'),
										0)
				
									WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'),
										5, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save'))
				
									WebUI.delay(10, FailureHandling.OPTIONAL)
				
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))
				
//									WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'),
//										5, FailureHandling.OPTIONAL)
//							
//									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_PEP'))
									
//	Due to Error in the application, We are unable to proceed with button activity complete, so we are using skip task button to proceed furthur.
									
									
									WebUI.delay(1, FailureHandling.OPTIONAL)
									
									WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/button_Skip Task_PEP_Declaration'))
									
									WebUI.delay(1, FailureHandling.OPTIONAL)									
									
									//WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/button_Initiate_Scorecard'),5)
									
									WebUI.refresh()
									
									WebUI.delay(5, FailureHandling.OPTIONAL)
									
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Loan App Scorecard'))
				
									WebUI.delay(4, FailureHandling.OPTIONAL)
				
									WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIBArrears'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_CustomerType'),
							30)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Dividend'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_basicincome'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_intercept'),
							30)
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_other'),
							30)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_industryAvg'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_fixedAlowance'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_business'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
	
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_count'),
							30)
	
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Rental'),
							30)
						
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_MCIB_Income'),
							30)
						WebUI.delay(1, FailureHandling.OPTIONAL)
						
						WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_maritalStatusGender'),
							30)
						
						WebUI.delay(2, FailureHandling.OPTIONAL)
	
						String occupationCode = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_OccupationCod'),
							FailureHandling.STOP_ON_FAILURE)
	
						System.out.println('The Occupation Code is: ' + occupationCode)
									
									WebUI.delay(3)
									
									WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Back_Button'))
							}
								
				
}

	