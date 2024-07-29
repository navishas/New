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

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Select_Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 
    Sole_Trader)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Select_Parent_Merchant'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/a_Submit'))

WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Merchant_Representative'), 
    30, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Merchant_Representative'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Title_name'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Name'), Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__email'), 
    Email)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__phone_number'), 
    PhoneNumber)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__CountryCode'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Primary_Contact_Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet Details_mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Face To Face'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__business_name'), 
    Outlet_Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__doing_business_as'), 
    Nature_Of_Business)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__gst_address_line_1'), 
    Address_Line1)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-17'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-19'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-21'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__goods_and_services_description'), 
    Description_Goods_Services)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Min Transaction Value'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Outlet_Details'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Settlement Bank Details_selection'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Settlement Bank Details_selection'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_no'), 
    Account_Number)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__reEnter_acc_no'), 
    ReEnter_AccountNo)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_holder_name'), 
    AccountHolder_Name)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Branch_mat-select-value-27'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_MUR'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'), 
    30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-29'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents Outlet_ID Number'), 
    Document_Name)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_Business_Doc'), 
    10, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_Business_Doc'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Business_Document_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Business_Document'))

WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document_01'), 
    10)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document_01'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-31'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Documents - KYC - Outlet_mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Bank Statement - Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - KYC - Outlet - Sub Type_I_e7d96f'), 
    Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_KYC_Doc'), 
    10, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_KYC_Doc'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_KYC_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_KYC_Document'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document (1)'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - Additional_ID Number'), 
    Document_Name2)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_Reviewer_Doc'), 
    5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_Reviewer_Doc'), 
    Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Reviewer_Doc'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Transaction Setting'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Payment_ant-switch'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Fee Setting'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Edit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Edit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Accept Application'))

WebUI.waitForElementVisible(findTestObject('Page_Operations Dashboard/button_Add New Document'), 10)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document (1)'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/h2_Add New Identifier'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-37'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - Additional_ID Number_1'), 
    Document_Name3)

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 5)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_KYC_Doc'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Merchant Categorization_mat-select-value-39'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Standard'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Assessment Checklist_mat-select-value-45'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-47'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Approval'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_EsHmFC1wHC'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Approve'))

