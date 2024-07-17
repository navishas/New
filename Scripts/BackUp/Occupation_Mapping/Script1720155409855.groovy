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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@123')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('LOS/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003080')

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(4, FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Edit_Emp_Details'))

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping.xlsx', 'Sheet1', 
    true)
//change the path when its run in another local system

boolean defaultOptionClicked = false;

for (int row = 1; row <= excelData.getRowNumbers(); row++) {
	
    String occType = excelData.getValue('Occupation_Type', row)

    try {
		
		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
            FailureHandling.OPTIONAL)

        WebUI.delay(3)

        List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

        boolean optionFound = false

        for (WebElement option : options) {
            if (option.getText().contains(occType)) {
                option.click()
                optionFound = true
                System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
                break;
            }
        }
        
        if (!optionFound && !defaultOptionClicked) {
			
            driver.findElement(By.xpath('//mat-option/span[text()=\'Employed Full Time\']')).click()
			
			defaultOptionClicked = true
			
			WebUI.delay(2)
			
			driver.findElement(By.xpath('//body/app-root[1]/layout[1]/empty-layout[1]/div[1]/div[1]/app-view-workflow[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-dynamic-form-component[1]/mat-stepper[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/span[1]/span[1]')).click() 
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'))
		
		List<WebElement> options2 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))
		
					for (WebElement currentOption : options2) {
						if (currentOption.getText().contains(occType)) {
							currentOption.click()
							System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
							WebUI.delay(2)
							
						}
					}
					
					if(!optionFound) 
					{
						driver.findElement(By.xpath('//body/app-root[1]/layout[1]/empty-layout[1]/div[1]/div[1]/app-view-workflow[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-dynamic-form-component[1]/mat-stepper[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/mat-radio-group[1]/mat-radio-button[1]/label[1]/span[1]/span[1]')).click()
						continue;
						}	
        }
		
    }
    catch (StaleElementReferenceException e) {
        System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())
        continue;
    } 
	catch (NoSuchElementException e) {
		System.out.println("NoSuchElementException occurred: " + e.getMessage());
		continue;
	}
}