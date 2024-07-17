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

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Merchant Type_rc_select_0'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Sole Trader'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/a_Submit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Primary Contact_mat-select-arrow ng-tns-c90-3'), 
    10)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Primary Contact_mat-select-arrow ng-tns-c90-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Merchant Representative_mat-select-arro_1c7c35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_MR'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Title_name'), 
    Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__email'), 
    Email)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Phone Number_Primary_Contact'), 
    10)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__phone_number'), 
    Phone_Number)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-arrow ng-tns-c90-10'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-arrow ng-tns-c90-13'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-trigger ng-tns-c90-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-13'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Mauritius - Copy'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Primary_Contact'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Business Details_business_name'), 
    10, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Business Details_business_name'), 
    Name_Of_Person)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Locality'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Individual'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__gst'), 
    BRN)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_VAT Registration Number_gst_address_line_1'), 
    VAT_RegistrationNo)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__Locality'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-23'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Details'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Business Contact Details_mat-select-value-25'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Owner_Business_Contact_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_title_dropdown'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_MR_Title_Business_Contact_Details'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Title_name'), 
    Business_FirstName)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__last_name'), 
    Business_LastName)

WebUI.setText(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_phoneNumber'), 
    Business_PhoneNumber)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Nationality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Email'), Email_2)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Email_residential_address_line_1'), 
    Address_Line_2)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_District - Copy'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Business_Contact_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Contact_details'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Settlement Bank Details_mat-select-value-39'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Settlement Bank Details_mat-select-value-39'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__acc_no'), 
    Account_Number)

WebUI.setText(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__reEnter_acc_no'), 
    ReEnter_AccountNo)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__acc_holder_name'), 
    AccountHolder_Name)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Branch_mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_MUR'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.delay(3)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-3'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Documents Sole Trader'), 
    5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Documents Sole Trader_ID Number'), 
    Document_Name)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Drag And Drop Files Here'), 
    5)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Upload File'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Business_Document'))

WebUI.delay(3)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Business_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add New Document_KYC'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-trigger n_1df9e8'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Identity Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Documents - KYC - Sole Trader_mat-selec_8dbf92'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_National Identity Card'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Documents - KYC - Sole Trader-Sub Type__173058'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_National ID - Recto'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Document_Name_KYC_Document'), 
    5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Documents - KYC - Sole Trader-Sub Typ_3d47b4'), 
    Document_Name1)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Upload File_KYC_Documents'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_KYC_Document'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_KYC_Documents'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add New Document_Reviewer_Documents'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add New Document_Reviewer_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/mat-option_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Documents - Additional_ID Number'), 
    Document_Name2)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Documents_Reviewer_Document'), 
    5)

WebUI.uploadFile(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Upload File_Reviewer_Document'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Reviewer_Document'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit For Review'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/label_Manage Payment Method'), 
    5)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_payment_Methods'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add Payment Method'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Select Payment Method_checkboxes-tags-demo'), 
    'Buy')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/li_Buy Now Pay Later'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Select Payment Method_Issuer'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_All_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Issuer_dropdown'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Issuer_dropdown - Copy'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Min Amt_min'), 
    '50')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Max Amt_max'), 
    '10000')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Payment_Modes'))

WebUI.delay(10)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Product_Config'))

WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_MDR'), 
    10, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_MDR'), 
    5)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Fee Details'), 
    5)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_No fee has been added yet'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add Fee'))

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Payment Method_Add_Fee'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Payment Method_Add_Fee'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/li_Buy Now Pay Later'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Network_Add_New_Fee'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/li_All'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Add_Fee_Issuer'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/li_Buy Now Pay Later'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_All_PrivateSwitchBase-input css-1m9pwf3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Fee_Details_Fee_Type'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/li_Flat'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Fee Value_feeValue'), 
    Fee_Value)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Commission'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Subcription'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Edit'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Settlement_Cycle'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_SMS_Notification'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Edit'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Report_Settings'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit For Review_Reviewer_Documents'))

WebUI.delay(10)

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Accept Application_Reviewer_Documents'))

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Screening Details_mat-select-value-19'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Screening Details_mat-select-value-19 (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Owner_Screen_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Representative Type_mat-select-value-21'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_MR_Title'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Title_first_name'), 
    Name_4)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__identifier_number'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input__identifier_number'), 
    NIC_BRN)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-23 (1)'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Mauritius'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Mauritius_Screen_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Nationality_mat-select-value-25'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Adverse Media'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_World Check Report_mat-select-value-27'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Adverse Media'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Supreme Court Remarks_mat-select-value-29'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Adverse Media'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Caution List_mat-select-trigger ng-tns-c90-98'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_No MatchNo Records'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/span_Additional Comments'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_PEP_mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_No MatchNo Records'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Google Check_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_No MatchNo Records'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Internal Hit_add_comments'), 
    'dsfsd')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-37'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/input_Documents - Additional_ID Number (1)'), 
    Document_Name3)

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Documents'), 0)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save__Verifier_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Merchant Categorization_mat-select-trig_fadfae'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Standard'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-41'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_763 - Agricultural Cooperatives'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Merchant Category Code_mat-select-value-43'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_Clothing'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Next Steps_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Assessment Checklist_mat-select-value-45'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-47'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div__mat-select-value-49'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Merchant Screening Completed_mat-select_62d5f8'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Due Diligence Done_mat-select-value-55'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/div_Site Visit Completed_mat-select-value-59'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Save_Screening_Details'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit For Approval'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Submit For Approval'))

WebUI.click(findTestObject('Operational_Dashboard/Create_SoleTrade_Merchant/Page_Operations Dashboard/button_Approve'))

