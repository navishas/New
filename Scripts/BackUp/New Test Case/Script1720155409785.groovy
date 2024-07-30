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
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-operations-uat.m2pfintech.com/signin')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_email'), 
    'pratik.jain@m2pfintech.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.sendKeys(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_2'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_JkjEi7aHgy'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Submit For Review'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/rect'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_No'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/rect'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Yes'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_4kdOHwXpNh'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/div_mat-select-trigger ng-tns-c90-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_AFRASIA BANK LTD'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputacc_no'), 
    '8989899')

WebUI.setEncryptedText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputreEnter_acc_no'), 
    '9FiCf6Urdp8=')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputacc_holder_name'), 
    'jayram')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/divmat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_MUR'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/divmat-select-value-5'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ID Number'), 
    'uiui')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Upload File'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Save_1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/divmat-select-value-7'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ID Number_1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/divmat-select-value-9'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_CWA - Place Of Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ID Number_1'), 
    'jkjlkjl')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Upload File'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/divmat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ID Number_1_2'), 
    'vv')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/span_Upload File'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Submit For Review'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_ant-switch'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Refund'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Add Fee'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputcheckboxes-tags-demo'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/li_Buy Now Pay Later'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputcheckboxes-tags-demo'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/li_All'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/inputcheckboxes-tags-demo'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/li_Flat'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/input_feeValue'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Submit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Edit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/New Folder/Page_Operations Dashboard/button_Save_1'))

