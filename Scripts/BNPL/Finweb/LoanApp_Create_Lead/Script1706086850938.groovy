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

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@1234')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Register for BNPL'))

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Get Details From_firstName'), 
    'anno')

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Last_Name'), 'tester')

WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_Gender'), 0)

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Male'))

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Mobile_Number'), '51980219')

WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_DOB'), 0)

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_DOB'), '11 Jul 1982')

WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_Marital Status'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Married'))

WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/input_Identifier_Selection'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_NIC'))

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_NIC'), 'R0709944203629')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create Lead'))

WebUI.delay(8, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_NAVISHA SUKURDEEP (RAMSOKUL)'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('BNPL/Finweb/Workflow_Stage'), [:], FailureHandling.STOP_ON_FAILURE)

