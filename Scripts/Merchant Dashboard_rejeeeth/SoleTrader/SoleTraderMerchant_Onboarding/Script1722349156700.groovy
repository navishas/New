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

WebUI.navigateToUrl('https://cim-merchant-uat.m2pfintech.com/login')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Email Address  Mobile Number_email'), 
    Phone_no)

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

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Complete Application'))

WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/Merchant Type DD'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Sole Trader'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/a_Submit'))
WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_-_mat-focus-indicator absolute right_240426'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Primary Contact_mat-select-trigger ng-t_f74992'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Merchant Representative_mat-select-trig_45d609'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_MR'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div__mat-select-arrow ng-tns-c90-21'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div__mat-select-value-7'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Sub - Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Nationality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Update'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Update'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Next Steps'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Business Details_business_name'), 
    Person_Name)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Outlet Business Type'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Individual'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__gst'), 
    BRN_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__pan'), 
    VAT_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_VAT Registration Number_gst_address_line_1'), 
    Reg_address)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Sub-Locality'))

WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN 2'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Country'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'), 
    3)
WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Update'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Next Steps'))
WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Merchant Representative'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Title'))

WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_MR'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_First Name'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Title_name'), 
    First_Name)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Last Name'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__last_name'), 
    Last_Name)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__phone_number'), 
    Phone_no)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Nationality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_BusinessEmail'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_BusinessEmail'), Email_Business)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Address Line 1'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Email_residential_address_line_1'), 
    Business_Address_Line_1)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Sub - Locality'))

WebUI.click(findTestObject('Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_CHINA TOWN 2'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Bank Name'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_BCP BANK'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Account Number'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__acc_no'), 
    Account_Number)

WebUI.setEncryptedText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__reEnter_acc_no'), 
    ReEnter_Account_Number)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Account Holders Name'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input__acc_holder_name'), 
    Account_Holders_Name)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Settlement Currency'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Documents Sole Trader'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Vat Certification'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Document Name'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Documents Sole Trader_ID Number'), 
    BR_Document_Name)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Drag And Drop Files Here'), 
    0)

WebUI.uploadFile(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Upload File'), 
    path)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Documents - KYC - Sole Trader'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Proof of Address of Owner (Dated less _970dc6'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Documents - KYC - Sole Trader-Sub Type'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/span_Bank Statement'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Document Name'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/input_Documents - KYC - Sole Trader-Sub Typ_9534a7'), 
    KYC_Document_Name)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/div_Drag And Drop Files Here'), 
    0)

WebUI.uploadFile(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Upload File'), 
    path)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SoleTrader Login/Page_Merchant Dashboard/button_Submit Application'))

