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

WebUI.waitForElementClickable(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'), 
    10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_KYC'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))

WebUI.click(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Copy Address From_mat-input-37'), 
    'asdfasdf')

WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 0)

WebUI.waitForElementVisible(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), 
    5, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), 'port')

WebUI.click(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_PORT LOUIS SOUTH'))

WebUI.waitForElementClickable(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/button_Save'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/button_Save'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Activity Complete_Address_Details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Skip_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BNPL/Finweb/Employment_Details_Income_Details'), [:], FailureHandling.STOP_ON_FAILURE)

