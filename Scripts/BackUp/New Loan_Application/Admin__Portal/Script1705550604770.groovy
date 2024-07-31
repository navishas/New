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

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in')

WebUI.setText(findTestObject('Object Repository/Admin_Portal/Page_CIM  Login/input_UserName'), 'navishas')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_Portal/Page_CIM  Login/input_Password'), '7Dxoto1EjKfoc3Lmys/f5Q==')

WebUI.click(findTestObject('Object Repository/Admin_Portal/Page_CIM  Login/button_Sign In'))

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Admin_Portal/Page_CIM/p_Loan Application'), 5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Admin_Portal/Page_CIM/p_Loan Application'))

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Payment List/p_MoFinans Applications'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Admin_Portal/Page_CIM  MoFinans Applications List/a_Ganesh Thete_eye1563'))

WebUI.waitForElementVisible(findTestObject('Admin_Portal/Page_CIM  Applicants Details/label_Marital Status'), 3, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Admin_Portal/Page_CIM  Applicants Details/label_Marital Status'), 3)

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Admin_Portal/Page_CIM  Applicants Details/a_Application Details'), 3)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Applicants Details/a_Bank Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Applicants Details/a_Loan Details'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Applicants Details/a_Documents'))

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Applicants Details/a_View  Verify'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.scrollToPosition(906, 818)

WebUI.selectOptionByValue(findTestObject('Admin_Portal/Page_CIM  Applicants Details/select_--Select--Verification In ProgressAp_924fbf_1'), 
    '2', true)

WebUI.setText(findTestObject('Admin_Portal/Page_CIM  Applicants Details/textarea_Remark_docRemarkId_1'), 'k')

WebUI.click(findTestObject('Object Repository/Admin_Portal/Page_CIM  Applicants Details/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/Admin_Portal/Page_CIM  Applicants Details/a_View  Verify_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin_Portal/Page_CIM  Applicants Details/select_--Select--Verification In ProgressAp_924fbf_2'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Admin_Portal/Page_CIM  Applicants Details/textarea_Remark_docRemarkId_2'), 
    'k')

WebUI.click(findTestObject('Admin_Portal/Page_CIM  Applicants Details/button_Submit_2'))

