import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Customers'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Customer'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Individual'))

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Basic Information_mat-input-60'), 
    'test')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Last Name_mat-input-63'), 'qa')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Date Of Birth_mat-select-value-93'), 
    '1/24/2006')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Male (1)'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Gender_mat-select-value-95'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Married (1)'))

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_MobileNumber'), '51209473')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Identifier Selection_mat-input-68'), 
    'R1106824600386')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Would you like to add advance details_m_15add7'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Okay'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead (1)'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Register for BNPL'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create Lead (1)'))

