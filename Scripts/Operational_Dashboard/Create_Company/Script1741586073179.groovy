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
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-operations-uat.m2pfintech.com/signin')

WebUI.maximizeWindow()

//Login using valid credentials
WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Email Address_email'),
	10)

WebUI.setText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Email Address_email'), 'rejeeth.r@indiumsoft.com')

WebUI.setText(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/input_Password_password'), 'Test@12345')

WebUI.click(findTestObject('Operational_Dashboard/Login/Page_Operations Dashboard/button_Login'))

WebUI.delay(20)

//Onboarding a new mechant

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Create_Single_Merchant'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Select_MerchantType'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Company'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'))

WebUI.delay(3)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 
    Parent_ID)

WebUI.sendKeys(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Parent Merchant ID_rc_select_1'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/a_Submit'))

WebUI.delay(10)

//Primary Contact details page

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Primary Contact Details Representative'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Primary Contact Details Representative'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_Title'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Name'), Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__email'),
	Email)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__phone_number'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__phone_number'),
	PhoneNumber)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__CountryCode'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__address_line'),
	Address_Line)


String DistrictValue = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('District', 1)  // Example for first row
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__District'))
TestObject DistValue1 = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + DistrictValue + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(DistValue1, 10)
WebUI.waitForElementClickable(DistValue1, 10)
WebUI.click(DistValue1)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'),
	30)

String LocalityValue = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('Locality', 1)
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Locality'))
TestObject LocaValue1 = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + LocalityValue + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(LocaValue1, 10)
WebUI.waitForElementClickable(LocaValue1, 10)
WebUI.click(LocaValue1)

String SubLocalityValue = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('Sub_Locality', 1)
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Sub_Locality'))
TestObject SubLocaValue1 = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + SubLocalityValue + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(SubLocaValue1, 10)
WebUI.waitForElementClickable(SubLocaValue1, 10)
WebUI.click(SubLocaValue1)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Primary_Contact_Details'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Primary_Contact_Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps'))

//Bussiness Details

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__business_name'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__business_name'),
	Company_Name)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_BusinessType'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_PrivateLtdCompny'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__BusinessRegistrationNumber'),
	BRN)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_VAT'),
	VAT)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_DateofIncorporation'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_DateofIncorporation'),
	Date_of_incorporation)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_CountryofIncorporation'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_RegisteredAddress'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_RegisteredAddress'),
	Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__District'))
WebUI.waitForElementVisible(DistValue1, 10)
WebUI.waitForElementClickable(DistValue1, 10)
// Click on the dynamically located option based on 'District Value'
WebUI.click(DistValue1)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Locality'),
	30)
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Locality'))
WebUI.waitForElementVisible(LocaValue1, 10)
WebUI.waitForElementClickable(LocaValue1, 10)
// Click on the dynamically located option based on 'Locality Value'
WebUI.click(LocaValue1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Sub_Locality'))
WebUI.waitForElementVisible(SubLocaValue1, 10)
WebUI.waitForElementClickable(SubLocaValue1, 10)
// Click on the dynamically located option based on 'Sublocality Value'
WebUI.click(SubLocaValue1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_GLPosting'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_GL_Others'))

WebUI.clickOffset(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps'), 0,
	0)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_BusinessDetails'),
	30)
WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_BusinessDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps'))

//Bussiness Contact Details

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_MerchantRepresentative'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_Title'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Firstname'),'QAT')

WebUI.setText(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Lastname'),'Test')

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__phone_number'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__phone_number'),
	PhoneNumber)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input__email'),
	Email)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_ResidentialAddressLine'),
	Address_Line)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__District'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__District'))
WebUI.waitForElementVisible(DistValue1, 10)
WebUI.waitForElementClickable(DistValue1, 10)
// Click on the dynamically located option based on 'District Value'
WebUI.click(DistValue1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Locality'))
WebUI.waitForElementVisible(LocaValue1, 10)
WebUI.waitForElementClickable(LocaValue1, 10)
// Click on the dynamically located option based on 'Locality Value'
WebUI.click(LocaValue1)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Sub_Locality'))
WebUI.waitForElementVisible(SubLocaValue1, 10)
WebUI.waitForElementClickable(SubLocaValue1, 10)
// Click on the dynamically located option based on 'Sublocality Value'
WebUI.click(SubLocaValue1)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_BusinessDetails'),
	30)
WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_BusinessDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps'))

//Settlement Bank Details
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_Settlement_Type'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company//Page_Operations Dashboard/Span_SettlementTypeBank'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/div_Settlement Bank Details_selection'),
	30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/div_Settlement Bank Details_selection'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/input__acc_no'),
	Account_Number)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/input__reEnter_acc_no'),
	ReEnter_AccountNo)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/input__acc_holder_name'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/input__acc_holder_name'),
	AccountHolder_Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/input_Branch'),
	Branch)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/div_SettlementCurrencyDD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company//Page_Operations Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company//Page_Operations Dashboard/button_Save_Settlement_Bank_Details'),
	30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company//Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company//Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

//Bussiness Document Upload
WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Add Document DD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Documents Outlet_ID Number'),
	Document_Name)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Document_Name_Business_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Upload File_Business_Doc'),
	Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Business_Document_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps_Business_Document'))

WebUI.delay(7)

//KYC Document Upload
WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-31'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Documents - KYC - Business Subtype'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Documents - KYC - Business Subtype'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Bank Statement - Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Documents - KYC - Outlet - Sub Type_I_e7d96f'),
	Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Document_Name_KYC_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Upload File_KYC_Doc'),
	Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_KYC_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps_KYC_Document'))

WebUI.delay(7)

//Reviewer Document
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Documents - Additional_ID Number'),
	Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Document_Name_Reviewer_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Upload File_Reviewer_Doc'),
	Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Reviewer_Doc'))

//Configurations
//Payment Modes page
WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_PaymentModeTab'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_SaveConfig'))

WebUI.delay(5)

//Product Config
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Payment_Transaction'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Payment_Transaction'))

WebUI.delay(5)

//commission
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_CommissionSave'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_CommissionSave'))

WebUI.delay(5)

//subscription
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_CommissionSave'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_CommissionSave'))

WebUI.delay(5)

//Settlement cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Edit'))

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Settlement_Cycle'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Settlement_Cycle'))

WebUI.delay(10)

//Invoice Cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Edit_InvoiceCycle'))

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_InvoiceCycle'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_InvoiceCycle'))

WebUI.delay(5)

//SMS Notification
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_SMS_Notification'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_SMS_Notification'))

WebUI.delay(5)

//Reports
WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Edit_Report_Settings'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_EmailTransactions'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_EmailRefunds'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_EmailDisputes'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_EmailSettlements'), 'oorvashee.dasruth@cim.mu')

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Report_Settings'))

WebUI.delay(5)

//Submit for review
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Submit For Review'),
	30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Submit For Review'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Submit For Review'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Accept Application'))

WebUI.delay(5)

//Screening Details

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_MerchantRepresentative'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_MerchantRepresentative'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_Title'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/Name_ScrenningDetails'),'QAT')

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_NIC'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_NIC'),'R1025678990')

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Nationality'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_WorldCheckDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_CourtDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_CautionListDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_PEPDD'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_PEPDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_GoogleDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_InternalHitDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_AddComments'),'NA')

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_SaveScreeningDetails'),
	5)
WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_SaveScreeningDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps'))


//Verifier Document
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Select_Additional_Documents_Verifier_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_VAT Certificate_Verifier_Doc'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_Document_Name_Verifier_Doc'),
	5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Documents - Additional_ID Number_1'),
	Document_Name1)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Upload File_Verifier_Doc'),
	Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Verifier_Doc'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps_Verifier_Doc'))

//Merchant Categorization
WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Risk_Category'),
	30, FailureHandling.OPTIONAL)

String RiskCategory = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('Risk_Category', 1)  // Example for first row
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Risk_Category'))
TestObject Risk = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + RiskCategory + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(Risk, 10)
WebUI.waitForElementClickable(Risk, 10)
WebUI.click(Risk)

String MerchantCategory = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('Merchant_Category', 1)  // Example for first row
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_MerchantCategoryCode'))
TestObject Category2 = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + MerchantCategory + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(Category2, 10)
WebUI.waitForElementClickable(Category2, 10)
WebUI.click(Category2)

String CIMCategory = findTestData('Data Files/Operational_Dashboard/Company_Merchant/Company_Onboarding').getValue('CIM_Category', 1)  // Example for first row
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_CIM_Category'))
TestObject Category3 = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[contains(text(),'" + CIMCategory + "')]")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(Category3, 10)
WebUI.waitForElementClickable(Category3, 10)
WebUI.click(Category3)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Merchant_Categorization'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Next Steps_Merchant_Categorization'))

//Assessment Checklist
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_Assessment Checklist_mat-select-value-45'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/div__mat-select-value-47'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/span_YES_KYC_Doc_Verification_Completed'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Assessment_Checklist'),
	30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Save_Assessment_Checklist'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Submit For Approval'))

//Pending Approval section
WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Search_Pending_Approval'),
	30, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Search_Pending_Approval'),
	Company_Name)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/input_Search_Pending_Approval'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Operational_Dashboard/Create_Company/Page_Operations Dashboard/div_MerchantID'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Approve'),
	30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Company/Page_Operations Dashboard/button_Approve'))

WebUI.delay(5)

