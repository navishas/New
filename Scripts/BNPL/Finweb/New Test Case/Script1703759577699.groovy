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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/leads/2258')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/div_Additional AddressAddress Type'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/input_Address Type_mat-input-9'), 
    'asdfasdf')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/fieldset_Address Line One Address Line TwoO_411587'))

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/input_Ownership Type_mat-input-11'), 
    'port')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_PORT LOUIS SOUTH'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/button_Save'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/button_Save'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/button_Save'))

