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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory


WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fcustomers')

WebUI.maximizeWindow()

//Login using valid credentials
WebUI.waitForElementPresent(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Username'), 
    10)

WebUI.setText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Username'), 'rejeeth.r')

WebUI.setText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Password'), 'Admin@123')

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/button_SignIn'))

WebUI.delay(7)

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('D:/OneDrive - Indium Software India Private Limited/CimFin/Automation Excel files/LOS/LoanApplicationExistingCustomer.xlsx','Sheet1',
	true)

for (int row = 1; row <= excelData.getRowNumbers(); row++) // row 0 in excel is is header //for loop incrementation
	{
	
	String Identifier = excelData.getValue('Identifier', row)	
		
	//String Client_Name = excelData.getValue('Client_Name', row)
	
	String Product_Name = excelData.getValue('Product_Name', row)
	
	String Office = excelData.getValue('Office', row)
	
	String Principal_Amount = excelData.getValue('Principal_Amount', row)
	
	String NominalInterestRate = excelData.getValue('NominalInterestRate', row)
	
	String Payment_Type = excelData.getValue('Payment_Type', row)
	
//Click on CustomerMenu and enter customer name

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_CustomerMenu'))

WebUI.delay(2)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_Filter'))

WebUI.delay(2)

//WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ClientName'))

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_Identifier'))

WebUI.delay(2)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Name'))

WebUI.setText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Name'), Identifier)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ApplyButton'))

WebUI.delay(3)

//click on customer profile

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/tablefirstrow'))

WebUI.delay(5)

//click on Loan Accounts tab

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_LoanAccountsMenu'))

WebUI.delay(5)

//click on Add New Loan Button

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_AddnewloanBtn'))

WebUI.delay(3)

//String ProductName = findTestData('Data Files/LOS/LoanApplicationExistingCustomer/LoanApplicationExistingCust').getValue('Product_Name', 1)
WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/Product_DD'))
TestObject ProdValue = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[text()=' " + Product_Name + " ']")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(ProdValue, 10)
WebUI.waitForElementClickable(ProdValue, 10)
WebUI.click(ProdValue)

WebUI.delay(3)

//String Office = findTestData('Data Files/LOS/LoanApplicationExistingCustomer/LoanApplicationExistingCust').getValue('Office', 1)
WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/Office_DD'))
TestObject OfficeValue = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[text()=' " + Office + " ']")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(OfficeValue, 10)
WebUI.waitForElementClickable(OfficeValue, 10)
WebUI.click(OfficeValue)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Principal'))

WebUI.clearText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Principal'))

WebUI.setText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_Principal'), Principal_Amount)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_NominalInterestRate'))

WebUI.clearText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_NominalInterestRate'))

WebUI.setText(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/input_NominalInterestRate'), NominalInterestRate)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/button_Submit'))

WebUI.delay(5)

//Approve the application

WebUI.waitForElementPresent(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ApproveBTN'),
	5)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ApproveBTN'))

WebUI.waitForElementPresent(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ApproveLoanSubmitBTN'),
	5)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ApproveLoanSubmitBTN'))


//confirm submission

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_ConfirmBTN'))

//Disburse Application

WebUI.waitForElementPresent(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_DisburseBTN'),
	5)

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_DisburseBTN'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/PaymentTypeDD'),
	30)

//String PaymentType = findTestData('Data Files/LOS/LoanApplicationExistingCustomer/LoanApplicationExistingCust').getValue('Payment_Type', 1)
WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/PaymentTypeDD'))
TestObject PaymentTypeValue = new TestObject().addProperty('xpath', ConditionType.EQUALS,
	"//span[text()='" + Payment_Type + "']")
// Wait for the option to be visible and clickable
WebUI.waitForElementVisible(PaymentTypeValue, 10)
WebUI.waitForElementClickable(PaymentTypeValue, 10)
WebUI.click(PaymentTypeValue)

WebUI.delay(6)

WebUI.waitForElementClickable(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/DisburseSubmitBTN'),
	30)
WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/DisburseSubmitBTN'))

WebUI.delay(3)

WebUI.back()

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('CFA_LOS/LoanApplication_ExistingCustomer/span_LoanAccountsMenu'))

WebUI.delay(2)

WebUI.back()

	}	

