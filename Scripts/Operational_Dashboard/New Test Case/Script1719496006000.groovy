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

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document (1)'))

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/h2_Add New Identifier'), 5)

WebUI.waitForElementPresent(findTestObject('Page_Operations Dashboard/div_Upload File'), 10)

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Upload File'), 5)

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-31'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Proof of Address of Place of Business'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Documents - KYC - Outlet_mat-select-value-33'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_Bank Statement - Business'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - KYC - Outlet - Sub Type_I_e7d96f'), 
    'kyc')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 10)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy (1).pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Next Steps (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Add New Document (1)'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/div_Add New Identifier_mat-select-value-35'))

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/span_VAT Certificate'))

WebUI.setText(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/input_Documents - Additional_ID Number'), 
    'vat')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 5)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy (1).pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save (1)'))

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
    'vat')

WebUI.scrollToElement(findTestObject('Page_Operations Dashboard/div_Drag And Drop Files Here'), 5)

WebUI.uploadFile(findTestObject('Page_Operations Dashboard/button_Upload File'), 'C:\\Users\\I1675\\Downloads\\dummy (1).pdf')

WebUI.click(findTestObject('Object Repository/Operational_Dashboard/Create_Outlet/Page_Operations Dashboard/button_Save (1)'))

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

