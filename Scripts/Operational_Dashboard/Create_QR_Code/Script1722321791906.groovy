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
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.switchToWindowTitle('Operations Dashboard')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/span_Payment Tools'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/button_Manage QR'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/button_Create QR'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/div_Select Merchant Id'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/input_Select Merchant Id_ant-select-search__field'), 
    Outlet_Name)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/li_Bakers choice - 0Be9FC19Ul'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_QR/Page_Operations Dashboard/label_Purpose'), 10)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_QR/Page_Operations Dashboard/p_Additional Details (Optional)'), 
    10)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/input_Mobile Number_PhoneInputInput'), 
    Phone_Number)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/button_Create'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/button_Yes, Proceed'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/button_Yes, Proceed'))

String qrCode = WebUI.getText(findTestObject('Object Repository/Operational_Dashboard/Create_QR/Page_Operations Dashboard/div_3DH2nXbBjt'))

String merchantName = WebUI.getText(findTestObject('Operational_Dashboard/Create_QR/Page_Operations Dashboard/div_getMerchantName'))

String greenColor = '[32m'

String resetColor = '[0m'

System.out.println((('QR Code Created Successfully: ' + greenColor) + qrCode) + resetColor)

System.out.println((('Merchant Name: ' + greenColor) + merchantName) + resetColor)

