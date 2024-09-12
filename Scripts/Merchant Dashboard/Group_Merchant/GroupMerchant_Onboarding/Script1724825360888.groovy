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

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Email Address  Mobile Number_email'), 
    Mobile_Number)

WebUI.setEncryptedText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Login'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Enter the OTP sent to your mobile number_r5'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__r6'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__r7'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__r8'), '8')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Verify'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Complete Application'))

WebUI.click(findTestObject('Merchant Dashboard/Group/Page_Merchant Dashboard/input_Merchant_Type_DD'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Group'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/a_Submit'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_-_mat-focus-indicator absolute right_240426'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Merchant Representative'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_MR'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Country Code'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_BLACK RIVER'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_CHAMAREL'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Sub - Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_PITON'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Nationality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Update'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Update'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Next Steps'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Business Details_business_name'), 
    Bussiness_Name)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Business Type'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Global Business Company (GBC)'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__gst'), BRN_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__pan'), VAT_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_VAT Registration Number_date_of_incor_a53c41'), 
    '10 Jul 2021')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Country Of Incorporation'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Country Of Incorporation_business_add_86f60b'), 
    Registered_Address)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div__mat-select-arrow ng-tns-c90-54'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_BLACK RIVER'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_CHAMAREL'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Sub - Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_PITON'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Merchant Representative'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Title'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_MR'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Title_name'), First_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__last_name'), Last_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__phone_number'), 
    Phone_Number)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Nationality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__email'), Email)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Email_residential_address_line_1'), 
    Address_Line_1)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_BLACK RIVER'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_CHAMAREL'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Sub - Locality'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_PITON'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Bank Name'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__acc_no'), Account_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__reEnter_acc_no'), 
    Account_No)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__acc_holder_name'), 
    Account_Holder_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input__ifsc'), Branch)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Settlement Currency'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Add New Identifier_mat-select-arrow ng-_fe449a'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Documents -Business_ID Number'), 
    'BRC')

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Drag And Drop Files Here'), 
    2)

WebUI.uploadFile(findTestObject('Merchant Dashboard/Group/Page_Merchant Dashboard/button_Upload File'), path)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save_1'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Document - KYC - Business'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_Proof of Address of Place of Business _396ffd'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Document - KYC - Business - Sub Type'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/span_CWA - Place Of Business'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/input_Document - KYC - Business - Sub Type__5f10c4'), 
    'CWA')

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/div_Drag And Drop Files Here'), 
    2)

WebUI.uploadFile(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Upload File'), 
    path)

WebUI.scrollToElement(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save_1'), 
    3)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/Group/Page_Merchant Dashboard/button_Submit Application'))

