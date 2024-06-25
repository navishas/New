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

WebUI.navigateToUrl('https://cim-operations-uat.m2pfintech.com/signin')

WebUI.setText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Email Address_email'), 'pratik.jain@m2pfintech.com')

WebUI.setEncryptedText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Password_password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/button_Login'))

WebUI.callTestCase(findTestCase('Operational_Dashboard/Create_SoleTrader_Merchant'), [:], FailureHandling.STOP_ON_FAILURE)
