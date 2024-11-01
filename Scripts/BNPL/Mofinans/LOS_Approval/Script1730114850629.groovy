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

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@12345')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.findWebElement(findTestObject('Object Repository/LOS/Approvals/Filter'))

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Filter'))

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Filter_identifier'))

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Input_identifier'))

WebUI.setText(findTestObject('Object Repository/LOS/Approvals/Input_identifier'), 'D031297330133F')

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Filter_ApplyBTN'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/td_firstrow'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Span_KYCVerification'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/View_Auditor_PortalBTN'))

WebUI.delay(7, FailureHandling.OPTIONAL)

WebUI.switchToWindowTitle('CIM')

WebUI.scrollToElement(findTestObject('Object Repository/LOS/Approvals/tb_Face Match between Selfie and Image'), 5)

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Edit_Approval'))

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Approve_radiobtn'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Approve_textarea1'))

WebUI.setText(findTestObject('Object Repository/LOS/Approvals/Approve_textarea1'), 'Approved')

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Update_Btn'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Approve_textarea2'))

WebUI.setText(findTestObject('Object Repository/LOS/Approvals/Approve_textarea2'), 'Approved')

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Approve_Btn'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/SubmitReport_Btn'))

WebUI.switchToWindowTitle('Finweb - Brancho')

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Span_PEPDeclaration'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/LOS/Approvals/SkipTask_Btn'))

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Span_KYCVerification'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/LOS/Approvals/Span_ApplicationReview'))

WebUI.click(findTestObject('Object Repository/LOS/Approvals/ActivityComplete_Btn'))

WebUI.delay(5, FailureHandling.OPTIONAL)

//WebUI.setText(findTestObject('Object Repository/LOS/Approvals/UsageLimit_field'), '25000')
//
//WebUI.delay(2, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Object Repository/LOS/Approvals/NavigateRt_Arrow1'))
//
//WebUI.delay(2, FailureHandling.OPTIONAL)
//
//WebUI.scrollToElement(findTestObject('Object Repository/LOS/Approvals/NavigateRt_Arrow2'), 5)
//
//WebUI.click(findTestObject('Object Repository/LOS/Approvals/NavigateRt_Arrow2'))
//
//WebUI.delay(2, FailureHandling.OPTIONAL)
//
//WebUI.scrollToElement(findTestObject('Object Repository/LOS/Approvals/NavigateRt_Arrow3'), 5)
//
//WebUI.click(findTestObject('Object Repository/LOS/Approvals/NavigateRt_Arrow3'))
//
//WebUI.delay(2, FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Object Repository/LOS/Approvals/Save_Btn'))
//
//WebUI.click(findTestObject('Object Repository/LOS/Approvals/ActivityComplete_Btn'))