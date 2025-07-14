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
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cimcfa-uat-connect.m2pfintech.dev/sign-in')

WebUI.waitForElementVisible(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Username _'), 10)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Username _'), 
    'Rejeeth')

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Password _'), 
    'Admin@654321')

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/button_Sign in'))

WebUI.delay(5)

//Initiating Add new Application Flow

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Add New Application'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-3'))

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_CIM LOS'), 5)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_CIM LOS'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Create'))

WebUI.delay(5)

//Create Lead details page

//WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Task has been created successfully for Appl'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-5'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_NIC'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-7'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Mauritian Resident'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_NIC Number'), 
    NIC_Number)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(4)

//Customer data page will be prefilled and navigated to PreEligibility Calculator

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Pre Eligibility Calculator Page

WebUI.waitForElementVisible(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/mat_icon_EditPreEligibilty'), 5)

WebUI.waitForElementClickable(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/mat_icon_EditPreEligibilty'), 5)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/mat_icon_EditPreEligibilty'))

WebUI.delay(3)

//Select CIM Product from the Dropdown

String CIMProduct = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('CIM_Product', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_CIM Product'))

TestObject CIMProductvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + CIMProduct) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(CIMProductvalue, 10)

WebUI.waitForElementClickable(CIMProductvalue, 10)

WebUI.click(CIMProductvalue)

WebUI.delay(2)

TestObject blankArea = findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/Blank_preEligibility')
WebUI.click(blankArea)

//Select CIM Product from the Sourcing Channel from the Dropdown

WebUI.waitForElementVisible(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-23'), 5)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-23'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/Search_SourcingChannel'),Sourcing_Channel)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/Sourcing_DD_2ndOption'))

WebUI.delay(2)

//Select CIM Product from the Counter Name from the Dropdown

WebUI.click(blankArea)

String CounterName = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Counter_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_CounterName'))

TestObject CounterNameValue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + CounterName) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(CounterNameValue, 0)

WebUI.waitForElementVisible(CounterNameValue, 10)

WebUI.waitForElementClickable(CounterNameValue, 10)

WebUI.click(CounterNameValue)

WebUI.delay(2)

WebUI.click(blankArea)
//Enter Sales Amount

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Total Sales Amount'), 
    Sales_Amount)

WebUI.click(blankArea)
//Select CIM Product from the Counter Name from the Tenure

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-27'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/Search_SourcingChannel'),Tenure_Months)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/Sourcing_DD_2ndOption'))

WebUI.delay(2)

WebUI.click(blankArea)

//Select CIM Product from the Counter Name from the Merchantname

String MerchantName = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Merchant_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-31'))

TestObject MerchantNamevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + MerchantName) +
	'\')]')

// Wait for the option to be visible and clickable

WebUI.scrollToElement(MerchantNamevalue, 0)

WebUI.waitForElementVisible(MerchantNamevalue, 10)

WebUI.waitForElementClickable(MerchantNamevalue, 10)

WebUI.click(MerchantNamevalue)

WebUI.delay(2)

WebUI.click(blankArea)

//Select CIM Product from the Counter Name from the MerchantCode

String PromoCode = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Promo_Code', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-33'))

TestObject PromoCodevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + PromoCode) +
	'\')]')

// Wait for the option to be visible and clickable

WebUI.waitForElementVisible(PromoCodevalue, 10)

WebUI.waitForElementClickable(PromoCodevalue, 10)

WebUI.click(PromoCodevalue)

WebUI.delay(2)

WebUI.click(blankArea)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Deposit Amount'), 2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Deposit Amount'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Deposit Amount'), 
    Deposit_Amount)

WebUI.click(blankArea)

WebUI.delay(2)

//Select Insurance from the Insurance

String Insurance = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Insurance', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-29'))

WebUI.delay(2)

TestObject Insurancevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + Insurance) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(Insurancevalue, 10)

WebUI.waitForElementClickable(Insurancevalue, 10)

WebUI.click(Insurancevalue)

WebUI.delay(2)

WebUI.click(blankArea)

WebUI.scrollToElement(findTestObject(('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update')), 2)

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Basic Details Page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/path_path'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/mat-select_TitleDD'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Mr'))

WebUI.click(blankArea)

WebUI.click(blankArea)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_First Name'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_First Name'),First_Name)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Last Name'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Last Name'), Last_Name)

WebUI.click(blankArea)

//Selecting Value from Marital Status

WebUI.scrollToElement(findTestObject(('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-37')), 2)

String MaritalStatus = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Marital_Status', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-37'))

TestObject MartialStatusvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + MaritalStatus) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(MartialStatusvalue, 10)

WebUI.waitForElementClickable(MartialStatusvalue, 10)

WebUI.click(MartialStatusvalue)

WebUI.delay(2)

WebUI.click(blankArea)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Primary Mobile Number'), 
    Mobile_Number)

WebUI.delay(2)

WebUI.click(blankArea)

WebUI.scrollToElement(findTestObject('CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_Client or Customer Type'), 2)

WebUI.click(findTestObject('CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_Client or Customer Type'))

WebUI.click(findTestObject('CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_CustomerIndividual'))

WebUI.delay(2)

WebUI.click(blankArea)

String EmployementType = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Employment_Type', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-53'))

TestObject EmployementTypevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + EmployementType) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(EmployementTypevalue, 10)

WebUI.waitForElementClickable(EmployementTypevalue, 10)

WebUI.click(EmployementTypevalue)

WebUI.delay(2)
	
WebUI.click(blankArea)

String PEP = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('PEP', 1 )

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_PEP'), 2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_PEP'))

TestObject PEPvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + PEP) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(PEPvalue, 2)

WebUI.waitForElementVisible(PEPvalue, 10)

WebUI.waitForElementClickable(PEPvalue, 10)

WebUI.click(PEPvalue)

WebUI.delay(2)

WebUI.click(blankArea)

WebUI.scrollToElement(findTestObject(('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update')), 3)

WebUI.waitForElementVisible(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update'), 10)

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Click on Proceed Button in DKYC Page
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Click on Address Details page and fill the details


WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Address Line 1_1'), 
    'CAMP DE MASQUE')

String DistrictName = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('District_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect//div_mat-select-value-67'))

TestObject DistrictNamevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + DistrictName) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(DistrictNamevalue, 2)

WebUI.waitForElementVisible(DistrictNamevalue, 10)

WebUI.waitForElementClickable(DistrictNamevalue, 10)

WebUI.click(DistrictNamevalue)

WebUI.click(blankArea)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-69'), 2)

String AreaName = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Area_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-69'))

TestObject AreaNamevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + AreaName) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(AreaNamevalue, 0)

WebUI.waitForElementVisible(AreaNamevalue, 10)

WebUI.waitForElementClickable(AreaNamevalue, 10)

WebUI.click(AreaNamevalue)

WebUI.click(blankArea)

String PostalCode = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Postal_Code', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-71'))

TestObject PostalCodevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + PostalCode) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(PostalCodevalue, 10)

WebUI.waitForElementClickable(PostalCodevalue, 10)

WebUI.click(PostalCodevalue)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-73'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Mauritius'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-75'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Own'))

String OwnershipType = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Ownership_Type', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-75'))

TestObject OwnershipTypevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + OwnershipType) +
	'\')]')

// Wait for the option to be visible and clickable

WebUI.waitForElementVisible(OwnershipTypevalue, 2)

WebUI.waitForElementClickable(OwnershipTypevalue, 2)

WebUI.enhancedClick(OwnershipTypevalue)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Years of Stay'), 2)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Years of Stay'), 
    Years_of_stay)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-77'),2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-77'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_text_Yes'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(3)

//---------------------------------------------------------------------------------------------------------------------------------------------

//Loan Details Page

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Add New Document'), 2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-79'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Quotation Document'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Document Name'), 
    'Quotation Document')

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Front Image Input'), 2)

WebUI.uploadFile(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Front Image Input'), 
    'D:/OneDrive - Indium Software India Private Limited/CimFin/LEASE_AGREEMENT.PDF')

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save_1'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(3)

//---------------------------------------------------------------------------------------------------------------------------------------

//Product Details Page

String ProductCategory = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Product_Category', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-81'))

TestObject ProductCategoryvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + ProductCategory) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(ProductCategoryvalue, 10)

WebUI.waitForElementClickable(ProductCategoryvalue, 10)

WebUI.click(ProductCategoryvalue)

WebUI.delay(3)

WebUI.click(blankArea)

String ProductSubCategory = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Product_SubCategory', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-83'))

TestObject ProductSubCategoryvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + ProductSubCategory) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(ProductSubCategoryvalue, 10)

WebUI.waitForElementClickable(ProductSubCategoryvalue, 10)

WebUI.click(ProductSubCategoryvalue)

WebUI.click(blankArea)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Unit Price'), 
    Unit_Price)

WebUI.click(blankArea)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Product Description'), 
    Product_Description)

WebUI.click(blankArea)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Quantity'), 
    Quantity)

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Upload Employment Details page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Add New Document'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-93'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Bank Statement'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Document Name'), 
    'Bank Statement')

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Upload File'), 2)

WebUI.uploadFile(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Front Image Input'), 
    'D:/OneDrive - Indium Software India Private Limited/CimFin/LEASE_AGREEMENT.PDF')

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Add New Document_1'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-95'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Income Statement (Salary Slips)'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Document Name'), 
    'SalarySlip')

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Upload File'), 2)

WebUI.uploadFile(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/input_Front Image Input'), 
    'D:/OneDrive - Indium Software India Private Limited/CimFin/LEASE_AGREEMENT.PDF')

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Save_1'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//Employment Details Page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/svg_svg'))

//BusinessType

String BusinessType = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Business_Type', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-125'))

TestObject BusinessTypevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + BusinessType) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(BusinessTypevalue, 10)

WebUI.waitForElementClickable(BusinessTypevalue, 10)

WebUI.click(BusinessTypevalue)


//Employer Name

String EmployerName = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Employer_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-127'))

TestObject EmployerNamevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + EmployerName) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(EmployerNamevalue, 2)

WebUI.waitForElementVisible(EmployerNamevalue, 10)

WebUI.waitForElementClickable(EmployerNamevalue, 10)

WebUI.click(EmployerNamevalue)


//Industry

String Industry = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Industry_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-129'))

TestObject Industryvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + Industry) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(Industryvalue, 2)

WebUI.waitForElementVisible(Industryvalue, 10)

WebUI.waitForElementClickable(Industryvalue, 10)

WebUI.click(Industryvalue)



//Sector

String Sector = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Sector_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-131'))

TestObject Sectorvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + Sector) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(Sectorvalue, 2)

WebUI.waitForElementVisible(Sectorvalue, 10)

WebUI.waitForElementClickable(Sectorvalue, 10)

WebUI.click(Sectorvalue)


//Nature_of_Business

String NatureOfBusiness = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Nature_of_Business', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-133'))

TestObject NatureOfBusinessvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + NatureOfBusiness) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(NatureOfBusinessvalue, 2)

WebUI.waitForElementVisible(NatureOfBusinessvalue, 10)

WebUI.waitForElementClickable(NatureOfBusinessvalue, 10)

WebUI.click(NatureOfBusinessvalue)


//Job_Type

String JobType = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Job_Type', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-135'))

TestObject JobTypevalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + JobType) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(JobTypevalue, 2)

WebUI.waitForElementVisible(JobTypevalue, 2)

WebUI.waitForElementClickable(JobTypevalue, 2)

WebUI.click(JobTypevalue)

WebUI.delay(2)

//Occupation

String Occupation = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Occupation_Value', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-137'))

TestObject Occupationvalue = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + Occupation) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.scrollToElement(JobTypevalue, 2)

WebUI.waitForElementVisible(Occupationvalue, 10)

WebUI.waitForElementClickable(Occupationvalue, 10)

WebUI.click(Occupationvalue)

WebUI.delay(2)


WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Job Title'), 
    Job_Title)


WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Total Work Experience (Months)_'), 
    Total_Work_Experience)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Office Address Line 1'), 2)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Office Address Line 1'), 
    Address_Line1)

WebUI.delay(2)

String DistrictName2 = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('District_Name', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect//div_mat-select-value-141'))

TestObject DistrictNamevalue2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + DistrictName2) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(DistrictNamevalue2, 10)

WebUI.waitForElementClickable(DistrictNamevalue2, 10)

WebUI.click(DistrictNamevalue2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-143'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_MAURITIUS (1)'))

WebUI.delay(2)

String PostalCode2 = findTestData('Data Files/CFA_LOS/Add_New_Application/Add_New_Application').getValue('Postal_Code', 1 )

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/div_mat-select-value-145'))

TestObject PostalCode2value = new TestObject().addProperty('xpath', ConditionType.EQUALS, ('//span[contains(text(),\'' + PostalCode2) +
	'\')]')

// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(PostalCode2value, 10)

WebUI.waitForElementClickable(PostalCode2value, 10)

WebUI.click(PostalCode2value)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Basic Salary or Income'), 2)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Basic Salary or Income'), 
    Basic_Salary)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Fixed Allowances'), 
    Fixed_Allowance)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_AverageCommission'),
	Average_Commission)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Variable_Allowance'),
	Variable_Allowance)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Number Of Pay slips Provided'), 
    No_of_Payslips)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_Deductions'),
	Deductions)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_OtherIncome'),
	Other_Income)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_MutualAidDeducted'),
	MutualAidDeducted)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/textarea_HouseholdCost'),
	Household_Cost)

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//Consent Collection Status Page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(10)

//ScroreCard Page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

//Sales Approval S1 / P1

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/svg_svg'))

WebUI.enhancedClick(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Update'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(2)

//Final Agreement Details

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Proceed'))


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Bank Details Page

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/svg_svg'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Case Manager - Connect/div_mat-select-value-9'),2)

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/div_mat-select-value-9'))

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_ABC Banking'))

WebUI.setText(findTestObject('Object Repository/Page_Case Manager - Connect/textarea_Bank Account Number'), '98464534253')

WebUI.setText(findTestObject('Object Repository/Page_Case Manager - Connect/textarea_Branch Code'), 'ABC98765')

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/div_mat-select-value-11'))

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Savings'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Case Manager - Connect/span_Update'), 2)

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Update'))

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(2)

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Disbursment Details Page

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(2)

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Loan Booking Details Details Page

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(2)

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Agreement Activation Page

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_AgreementStatus'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/Add_New_Application/Page_Case Manager - Connect/span_Active'))

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Update'))

WebUI.click(findTestObject('Object Repository/Page_Case Manager - Connect/span_Proceed'))

WebUI.delay(2)




