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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
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

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@123')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003080')

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(3, FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Edit_Emp_Details'))

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/Occupation_Mapping.xlsx', 'Sheet1', 
    true)

//change the path when its run in another local system
boolean defaultOptionClicked = false

for (int row = 1; row <= excelData.getRowNumbers(); row++) {
	
    for (String columnName : excelData.getColumnNames()) {
        String columnValue = excelData.getValue(columnName, row)

        try {
            WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                FailureHandling.OPTIONAL)

            WebUI.delay(3)

            List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

            boolean optionFound = false

            for (WebElement option : options) {
                if (option.getText().contains(columnValue)) {
                    option.click()
                    optionFound = true

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    System.out.println(('Success: Occupation \'' + columnValue) + '\' is selected')

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Job Type'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

                    WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Rs_mat-input-6_Basic_Inc'), 
                        '12000')

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_income_Details'))

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'), 
                        5)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Next_Exp_Details'))

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/mat-label_Upload new document_Emp_Details'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Supported formats .png, .jpg, .jpeg, .pdf (Max. 5 MB)'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/p_Select from uploaded documents_Emp_Details'), 
                        0)

                    WebUI.delay(2, FailureHandling.OPTIONAL)

                    WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Drag And Drop Files Here_Empy_Details'), 
                        0)

                    WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'), 
                        5, FailureHandling.OPTIONAL)

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Save'))

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Activity Complete_Emp_Details'))

                    WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Skip Task (1)'))

                    WebUI.getText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_SEN_Occ_Code'))

                    break
                }
            } //List<WebElement> option2 = driver.findElements(By.xpath(""))
        }
        catch (StaleElementReferenceException e) {
            System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())

            continue
        } 
        catch (NoSuchElementException e) {
            System.out.println('NoSuchElementException occurred: ' + e.getMessage())

            continue
        } 
    }
}

