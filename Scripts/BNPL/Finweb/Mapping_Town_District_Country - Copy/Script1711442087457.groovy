import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.Delayed as Delayed
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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver //it will install the selenium Webdriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory //it will install for driverFactory


WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@1234')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/District_Town_Data_1.xlsx', 'Sheet1', 
    true)

for(int row = 1; row <= excelData.getRowNumbers(); row++)
//for(int row =1; 1 <= 1(298); 2) it will start the loop	
//for(int row = 299; 299 <= 299(298);	299) //it will stop the loop as out of boundary
	 {
	
		String town = excelData.getValue('town_name', row) 
		
	//	String town	= excelData.getValue('town_name',1) //G.R.N.W
		
		String natId = excelData.getValue('nat_id', row)
		
		String occCode = excelData.getValue('dis_desc', row)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Add New Lead'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Register for BNPL'))
		
		WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Get Details From_firstName'),
			'QATeVster')
		
		WebUI.setText(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), natId)
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_Gender'), 0)
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Male'))
		
		WebUI.setText(findTestObject('null'), '51980259')
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Page_Finweb - Brancho/span_DOB'), 0)
		
		WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Email_mat-input-8'), '11 Jul 1982')
		
		WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_Marital Status'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Married'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Email_mat-input-8'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/div_Marital Status_mat-select-arrow ng-tns-c88-28'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_NIC'))
		
		WebUI.setText(findTestObject('Finweb_Windows/Page_Finweb - Brancho/input_Identifier_Selection'), 'R1106824600386')
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/span_Create Lead'))
		
		WebUI.delay(8, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Finweb_Windows/Page_Finweb - Brancho/div_NAVISHA SUKURDEEP (RAMSOKUL)'), FailureHandling.OPTIONAL)
		
		/*/WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))
		
		WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))/*/
		
		WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'),
			5, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))
		
		WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))
		
		WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))
		
		WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Copy Address From_mat-input-37'),
			'asdfasdf')
		
		WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 0)
		
		WebUI.waitForElementVisible(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'),
			5, FailureHandling.OPTIONAL)
		
		WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'),town)
		
		WebUI.delay(2, FailureHandling.OPTIONAL)
		
		List<WebElement> options = driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/mat-option/span"))
	
		boolean optionFound = false
		
	    for(WebElement option : options) 
			{
			
				if(option.getText().contains(town)) //town=port louis north
					//if(portlouis Centre, portlouisnorth,.contains(port louis north)
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
		
	/*/WebUI.clearText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'))
	
	WebUI.delay(2, FailureHandling.OPTIONAL)
	
	WebUI.delay(1, FailureHandling.OPTIONAL)/*/
}

