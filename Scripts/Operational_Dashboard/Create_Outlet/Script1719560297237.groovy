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

WebUI.maximizeWindow()

//Login using valid credentials
WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Email Address_email'), 
    10)

WebUI.setText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Email Address_email'), 'pratik.jain@cim.mu')

WebUI.setText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Password_password'), 'Test@1234')

WebUI.click(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/button_Login'))

WebUI.delay(10)

//Onboarding a new mechant
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Create_Single_Merchant'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Select_MerchantType'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'))

WebUI.delay(3)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 
    Parent_ID)

WebUI.sendKeys(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/a_Submit'))

WebUI.delay(7)

//Primary Contact details page
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_Title'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Name'), Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__email'), 
    Email)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__phone_number'), 
    30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__phone_number'), 
    PhoneNumber)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__CountryCode'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__address_line'), 
    Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Locality'), 
    30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Primary_Contact_Details'), 
    30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Primary_Contact_Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps'))

//Outlet Details
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Outlet Details_mat-select-value-15'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Face To Face'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__business_name'), 
    Outlet_Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__doing_business_as'), 
    Nature_Of_Business)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__gst_address_line_1'), 
    Address_Line1)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__District'), 
    30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__goods_and_services_description'), 
    Description_Goods_Services)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Min Transaction Value'), 
    30)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Min Transaction Value'), 
    5)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_GLPosting'), 
    30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_GLPosting'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_GL_Others'))

WebUI.clickOffset(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Outlet'), 0, 
    0)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Outlet'), 
    30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Outlet_Details'))

//Settlement Bank Details
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_Settlement_Type'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_SettlementTypeBank'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Settlement Bank Details_selection'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Settlement Bank Details_selection'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_no'), 
    Account_Number)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__reEnter_acc_no'), 
    ReEnter_AccountNo)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_holder_name'), 
    30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input__acc_holder_name'), 
    AccountHolder_Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Branch'), 
    'Aut Test')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_SettlementCurrencyDD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Settlement_Bank_Details'), 
    30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

//Bussiness Document Upload
WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add Document DD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents Outlet_ID Number'), 
    Document_Name)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_Business_Doc'), 
    5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_Business_Doc'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Business_Document_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Business_Document'))

WebUI.delay(4)

//KYC Document Upload
WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-31'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Documents - KYC - Outlet_mat-select-value-33'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Documents - KYC - Outlet_mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Bank Statement - Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - KYC - Outlet - Sub Type_I_e7d96f'), 
    Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_KYC_Doc'), 
    5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_KYC_Doc'), 
    Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_KYC_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_KYC_Document'))

WebUI.delay(4)

//Reviewer Document 
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'), 
    5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - Additional_ID Number'), 
    Document_Name2)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_Reviewer_Doc'), 
    5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_Reviewer_Doc'), 
    Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Reviewer_Doc'))

//Configurations
//Payment Modes page
WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_PaymentModeTab'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_SaveConfig'))

WebUI.delay(5)

//Product Config
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Payment_Transaction'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Payment_Transaction'))

WebUI.delay(5)

//commission
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_CommissionSave'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_CommissionSave'))

WebUI.delay(5)

//subscription
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_CommissionSave'), 
    5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_CommissionSave'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'))
//WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Transaction Setting'), 
//    5, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Payment_ant-switch'))
//
//WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Payment'), 5, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_DynamicQR'))
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_PaymentLinkQR'))
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Payment_Static_QR'))
//
//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Payment_Transaction'))
//
//WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Refund'), 
//    30, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Refund'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.OPTIONAL)
//
//WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_FeeDetails'), 10, 
//    FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_AddFee_Refund'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_PaymentMethod'), 'Buy')
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/li_Buy Now Pay Later'))
//
//WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Network_Select'), 'All')
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/li_All'))
//
//WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Issuer_Select'), 'bnpl')
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/li_BNPL'))
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/li_All_Issuer'))
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_issuer_Close_Dropdown'))
//
//WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Fee_Type'), 'Flat')
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/li_Flat'))
//
//WebUI.setText(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Fee_Value'), '100000')
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit_Payment'))
//WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Subscription'), 
//    30, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Subscription'))
//Settlement cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Edit'))

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Settlement_Cycle'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Settlement_Cycle'))

WebUI.delay(10)

//Invoice Cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Edit_InvoiceCycle'))

WebUI.delay(8)

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_InvoiceCycle'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_InvoiceCycle'))
WebUI.delay(5)

//SMS Notification
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_SMS_Notification'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_SMS_Notification'))

WebUI.delay(5)

//Reports
WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Edit_Report_Settings'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_EmailTransactions'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_EmailRefunds'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_EmailDisputes'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_EmailSettlements'), 'oorvashee.dasruth@cim.mu')

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Report_Settings'))

WebUI.delay(3)

//Submit for review
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'), 
    30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Review'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Accept Application'))

//Verifier Document
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Select_Additional_Documents_Verifier_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_VAT Certificate_Verifier_Doc'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Document_Name_Verifier_Doc'), 
    5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - Additional_ID Number_1'), 
    Document_Name3)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Upload File_Verifier_Doc'), 
    Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Verifier_Doc'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Verifier_Doc'))

//Merchant Categorization
WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Risk_Category'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Risk_Category'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Standard'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_MerchantCategoryCode'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/Span_Electrical Contractor'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_CIM_Category'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/option_ElectricalandElectronics'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Merchant_Categorization'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps_Merchant_Categorization'))

//Assessment Checklist
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Assessment Checklist_mat-select-value-45'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div__mat-select-value-47'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_YES_KYC_Doc_Verification_Completed'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Assessment_Checklist'), 
    30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save_Assessment_Checklist'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Submit For Approval'))

//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Approve'))

WebUI.delay(3)


//Pending Approval section
WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Search_Pending_Approval'), 
    30, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Search_Pending_Approval'), 
    Outlet_Name)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Search_Pending_Approval'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_MerchantID'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Approve'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Approve'))

