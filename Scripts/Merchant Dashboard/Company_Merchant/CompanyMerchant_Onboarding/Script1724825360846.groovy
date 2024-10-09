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

WebUI.navigateToUrl('https://cim-merchant-uat.m2pfintech.com/home')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Email Address  Mobile Number_email'), 
    Mobile_Number)

WebUI.setEncryptedText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Login'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Enter the OTP sent to your mobile number_r5'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__r6'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__r7'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__r8'), 
    '8')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Verify'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_MR'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.delay(4)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    Registered_corporate_Name)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Global Business Company (GBC)'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__gst'), BRN_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__pan'), VAT_No)

WebUI.setText(findTestObject('null'), '06 Jul 2022')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Mauritius'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    Registered_Address)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_MR'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), First_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__last_name'), Last_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__phone_number'), 
    Phone_Number)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('null'), 
    Address_Line_1)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Save'), 
    2)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Next Steps'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_BANK ONE'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__acc_no'), Account_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/input__reEnter_acc_no'), 
    ReEnter_Account_No)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    Account_Holder_Name)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('null'), 
    'Business Doc')

WebUI.scrollToElement(findTestObject('null'), 
    3)

WebUI.uploadFile(findTestObject('null'), 
    path)

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_Proof of Address of UBO(Dated less tha_19df6b'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Company/Page_Merchant Dashboard/span_CWA - UBO'))

WebUI.setText(findTestObject('null'), 
    'KYC Doc')

WebUI.scrollToElement(findTestObject('null'), 
    3)

WebUI.uploadFile(findTestObject('null'), 
    path)

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

