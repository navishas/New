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

WebUI.setText(findTestObject('LOS/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003113')

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(4, FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Edit_Emp_Details'))
WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping.xlsx', 'Sheet1', true)

//change the path when it's run on another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++) {
    String occType = excelData.getValue('Occupation_Type', row)
    String empType = excelData.getValue('Employer_Type', row)
    String indType = excelData.getValue('Industry_Type', row)

    try {
        // Click on Employer Type dropdown
        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), FailureHandling.OPTIONAL)
        WebUI.delay(3)

        // Find options in the dropdown
        List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))
		
        // Search for the desired option
        boolean empFound = false
        for (WebElement option : options) {
            if (option.getText().contains(empType)) {
                // Scroll to the option
                JavascriptExecutor js = (JavascriptExecutor) driver
                js.executeScript("arguments[0].scrollIntoView(true);", option)
				
                // Click the option
                option.click()
                empFound = true
                System.out.println(('Success: Occupation \'' + empType) + '\' is selected')
                break
            }
        }

        // If the option is not found, print an error message
        if (!empFound) {
            System.out.println("Error: Occupation '" + empType + "' not found in Employer Type dropdown")
        }

        // Similar steps for Industry Type dropdown
        WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Industry_select'), FailureHandling.OPTIONAL)
        WebUI.delay(3)
        List<WebElement> options2 = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))
		
        boolean indFound = false
        for (WebElement option2 : options2) {
            if (option2.getText().contains(indType)) {
                JavascriptExecutor js = (JavascriptExecutor) driver
                js.executeScript("arguments[0].scrollIntoView(true);", option2)
				
                option2.click()
                indFound = true
                System.out.println(('Success: Occupation \'' + indType) + '\' is selected')
                break
            }
        }

        if (!indFound) {
            System.out.println("Error: Occupation '" + indType + "' not found in Industry Type dropdown")
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
}
