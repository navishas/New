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

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_New Merchant'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Create_Single_Merchant'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Select_MerchantType'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Group'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/a_Submit'))

WebUI.delay(10)

//Primary Contact details page
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Primary Contact Details ( Outlet )_mat-_f8dc78'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_Title'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Name'), Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__email'),
	Email)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__phone_number'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__phone_number'),
	PhoneNumber)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__CountryCode'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_230'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__address_line'),
	Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_PORT LOUIS'))

//String districtValue = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding').getValue("District", 1)
//
//// XPath to find the dropdown option dynamically based on the district name
//String xpath = "//li[text()='" + districtValue + "']"
//
//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__District'))
//
//WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/District_DD', [('districtName') : districtValue]))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Mauritius'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Primary_Contact_Details'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Primary_Contact_Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps'))

//Bussiness Details

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__business_name'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__business_name'),
	Group_Name)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_BusinessType'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_PrivateLtdCompny'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__BusinessRegistrationNumber'),
	BRN)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_VAT'),
	VAT)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_DateofIncorporation'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_DateofIncorporation'),
	Date_of_incorporation)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_CountryofIncorporation'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_RegisteredAddress'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_RegisteredAddress'),
	Address_Line)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_GLPosting'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_GL_Others'))

WebUI.clickOffset(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps'), 0,
	0)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_BusinessDetails'),
	30)
WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_BusinessDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps'))

//Bussiness Contact Details

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_MerchantRepresentative'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_Title'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Firstname'),'QAT')

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Lastname'),'Test')

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__phone_number'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__phone_number'),
	PhoneNumber)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Mauritius'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input__email'),
	Email)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_ResidentialAddressLine'),
	Address_Line)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__District'),
	30)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__District'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_PORT LOUIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Sub_Locality'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_CASSIS 1'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_BusinessDetails'),
	30)
WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_BusinessDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps'))

//Settlement Bank Details
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_Settlement_Type'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group//Page_Operations Dashboard/Span_SettlementTypeBank'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/div_Settlement Bank Details_selection'),
	30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/div_Settlement Bank Details_selection'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/span_ABC BANKING CORPORATION'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/input__acc_no'),
	Account_Number)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/input__reEnter_acc_no'),
	ReEnter_AccountNo)

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/input__acc_holder_name'),
	30)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/input__acc_holder_name'),
	AccountHolder_Name)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/input_Branch'),
	Branch)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/div_SettlementCurrencyDD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group//Page_Operations Dashboard/span_MUR'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group//Page_Operations Dashboard/button_Save_Settlement_Bank_Details'),
	30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group//Page_Operations Dashboard/button_Save_Settlement_Bank_Details'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group//Page_Operations Dashboard/button_Next Steps_Settlement_Bank_Details'))

//Bussiness Document Upload
WebUI.waitForElementPresent(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Add Document DD'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Business Registration Card'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Documents Outlet_ID Number'),
	Document_Name)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Document_Name_Business_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Upload File_Business_Doc'),
	Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Business_Document_Outlet'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps_Business_Document'))

WebUI.delay(7)

//KYC Document Upload
WebUI.waitForElementPresent(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-31'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Documents - KYC - Business Subtype'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Documents - KYC - Business Subtype'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Bank Statement - Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Documents - KYC - Outlet - Sub Type_I_e7d96f'),
	Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Document_Name_KYC_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Upload File_KYC_Doc'),
	Path)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_KYC_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps_KYC_Document'))

WebUI.delay(7)

//Reviewer Document
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Documents - Additional_ID Number'),
	Document_Name1)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Document_Name_Reviewer_Doc'),
	5, FailureHandling.OPTIONAL)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Upload File_Reviewer_Doc'),
	Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Reviewer_Doc'))


//Configurations 

//Payment Modes page
WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_PaymentModeTab'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add_Payment_Method'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add_Payment_Method'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Select_Payment_Method'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_BuyNowPayLater'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Select_Payment_Method'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Issuer'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Issuer'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/issuer_CFA'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Issuer'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_MinAmount'),
	5, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_MinAmount'), '500')

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_MaxAmount'),'1000000')

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_submit'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_submit'))

WebUI.delay(5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_SaveConfig'))

WebUI.delay(5)

//Product Config

WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Payment_Transaction'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Payment_Transaction'))

WebUI.delay(5)

//commission

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/MDRtax_Toggle'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/MDRtax_Toggle'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_AddFee'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_AddFee'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_PaymentMethod'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD-BNPL'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_Network'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/NetworkAll'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_Issuer'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Issuer_CFA_Commissions'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_Issuer'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_FeeType'),
	5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_FeeType'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/FeeType_Percentage'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_FeeValue'),MDR_Fee)

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_FeeMinimum'),'1')

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_FeeMaximum'),'1000000')

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_submit'))

WebUI.delay(5)

//subscription
WebUI.waitForElementClickable(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_CommissionSave'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_CommissionSave'))

WebUI.delay(5)

//Settlement cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Edit'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_SettlementCycle'),
	5, FailureHandling.OPTIONAL)

// Assuming 'CycleValue' is the value getting from Excel via Data Binding

String CycleValue = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding').getValue('Settlement_Cycle', 1)  // Example for first row
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_SettlementCycle'))
TestObject dynamicOption = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//li[text()='" + CycleValue + "']")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(dynamicOption, 10)
WebUI.waitForElementClickable(dynamicOption, 10)
// Click on the dynamically located option based on 'CycleValue'
WebUI.click(dynamicOption)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/label_Frequency'),
	5, FailureHandling.OPTIONAL)

String radioOption = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding').getValue('Frequency',1) 

if (radioOption == 'Once') {
	WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/RadioBtn_DailyOnce'))
} else if (radioOption == 'Multiple') {
	WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/RadioBtn_DailyMultiple'))
}

// Check if the "No of Settlement Cycle(s)" text box is editable
boolean isEditable = WebUI.getAttribute(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_No_of_SettlementCycle'), 'disabled') == null

// If the field is editable, fill it with value 
if (isEditable) {
		WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_No_of_SettlementCycle'))
	WebUI.sendKeys(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_No_of_SettlementCycle'),
		Keys.chord(Keys.BACK_SPACE))
	WebUI.delay(3)
	WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_No_of_SettlementCycle'), No_of_Cycles)
	println("Text box is editable. Filled with value")
} else {
	println("Text box is not editable. No action taken.")
}

//def testData = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding')  // Provide the correct path to your data file
//
//String settlementCycle = testData.getValue('Settlement_Cycle', 1)  // Column name is case-sensitive, make sure it matches
//String frequency = testData.getValue('Frequency', 1)
//
//// Based on Settlement Cycle and Frequency, enable/disable the appropriate dropdowns and set values
//if (settlementCycle == 'Monthly' && frequency == 'Once') {
//	// Enable delay months, delay days, and delay hours for Monthly - Once
//	String DelayMonths = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding').getValue('Delay_Months', 1)  // Example for first row
//	WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Delay_Months'))
//	TestObject DelaymonthOption = new TestObject().addProperty('xpath', ConditionType.EQUALS,
//		"//li[text()='" + DelayMonths + "']")
//	WebUI.waitForElementVisible(DelaymonthOption, 5)
//	WebUI.waitForElementClickable(DelaymonthOption, 5)
//	WebUI.click(DelaymonthOption)
//	WebUI.delay(3)
//	
//	WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Delay_Days'))	
//	WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Delay_Days'),'2')
//
//	String Dayconfig = findTestData('Data Files/Operational_Dashboard/Group_Merchant/Group_Onboarding').getValue('Day_Config', 1)  // Example for first row
//	WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/DD_Days'))
//	TestObject DayConfigOption = new TestObject().addProperty('xpath', ConditionType.EQUALS,
//		"//li[text()='" + Dayconfig + "']")
//	WebUI.waitForElementVisible(DayConfigOption, 10)
//	WebUI.waitForElementClickable(DayConfigOption, 10)
//	WebUI.click(DayConfigOption)
//	WebUI.delay(2)
//	
//} else if (settlementCycle == 'weekly' && frequency == 'once') {
//	// Enable delay weeks, delay months, and delay days for Weekly - Once
//    WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Delay_Days'))
//    WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Delay_Days'),'2')
//} else {
//	// If no valid combination is selected, disable all delay dropdowns
//	WebUI.setText(findTestObject('Object Repository/Dropdown_DelayWeeks'), false)
//	
//}
//	
WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Settlement_Cycle'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Settlement_Cycle'))

WebUI.delay(7)

//Invoice Cycle
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Edit_InvoiceCycle'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_InvoiceCycle'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_InvoiceCycle'))

WebUI.delay(5)

//SMS Notification
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_SMS_Notification'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_SMS_Notification'))

WebUI.delay(5)

//Reports
WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Edit_Report_Settings'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_EmailTransactions'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_EmailRefunds'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_EmailDisputes'), 'oorvashee.dasruth@cim.mu')

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_EmailSettlements'), 'oorvashee.dasruth@cim.mu')

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Report_Settings'))

WebUI.delay(5)

//Submit for review
WebUI.scrollToElement(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Submit For Review'),
	30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Submit For Review'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Submit For Review'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Accept Application'))


WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Report_Settings'))

WebUI.delay(5)

//Screening Details

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_MerchantRepresentative'),
	5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_MerchantRepresentative'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Owner'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Merchant Representative_mat-select-value-3'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_Title'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/Name_ScrenningDetails'),'QAT')

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_NIC'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_NIC'),'R1025678990')

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Nationality'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__Nationality'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Mauritius'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_WorldCheckDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_CourtDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_CautionListDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_PEPDD'),
	5)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_PEPDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_GoogleDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_InternalHitDD'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/Span_NoMatchRecords'))

WebUI.setText(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_AddComments'),'NA')

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_SaveScreeningDetails'),
	5)
WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_SaveScreeningDetails'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps'))


//Verifier Document
WebUI.waitForElementVisible(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'),
	10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Add New Document_Verifier_Documents'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Select_Additional_Documents_Verifier_Doc'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_VAT Certificate_Verifier_Doc'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_Document_Name_Verifier_Doc'),
	5)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Documents - Additional_ID Number_1'),
	Document_Name1)

WebUI.uploadFile(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Upload File_Verifier_Doc'),
	Path)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Verifier_Doc'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Next Steps_Verifier_Doc'))

//Assessment Checklist
WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_Assessment Checklist_mat-select-value-45'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_YES'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/div__mat-select-value-47'))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/span_YES_KYC_Doc_Verification_Completed'))

WebUI.scrollToElement(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Assessment_Checklist'),
	30)

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Save_Assessment_Checklist'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Submit For Approval'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Approve'))

//Pending Approval section
WebUI.waitForElementVisible(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Search_Pending_Approval'),
	30, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Search_Pending_Approval'),
	Group_Name)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/input_Search_Pending_Approval'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Operational_Dashboard/Create_Group/Page_Operations Dashboard/div_MerchantID'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Approve'),
	30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Group/Page_Operations Dashboard/button_Approve'))
