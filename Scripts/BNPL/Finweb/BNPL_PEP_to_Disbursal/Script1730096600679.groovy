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

//Pep Declaration
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Activity_Completed_PEP'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Activity_Completed_PEP'), FailureHandling.STOP_ON_FAILURE)
//LoanApp ScoreCard
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Activity_Complete_LoanAppScoreCard'), 
    FailureHandling.STOP_ON_FAILURE)
//Application Review
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Activity_Complete_Application_Review'), 
    FailureHandling.STOP_ON_FAILURE)
//Limit Generation
WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Usage_Limit'), '1500')

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_in_Limit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_next_Billing_Details_Limit'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/LimitGeneration_BillingDetails_Next'), 
    10)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/LimitGeneration_BillingDetails_Next'))

WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/LimitGeneration_DueDetails_Next'),
	10)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/LimitGeneration_DueDetails_Next'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/LimitGeneration_AddCharge_Save'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_LimitGeneration_ActivityComplete'))

//Bank details
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_addbankDetails'))

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Bank_Name'), "MauBank")

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Mobileno_linked_Bank'), "50392840")

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Bank_Account_no'), "")

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Confirm_Bank_Account'), "")

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save_AddDetails_Bank_Details'))

WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_BankAcc_ActivityComplete'), 20)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_BankAcc_ActivityComplete'))

//Sanction letter Upload 
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_add_new_Document'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Select_DocumentCategory'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Select_DocumentCategory'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Select_Document_Category_Option'))

WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Document_Name'), 'Sanction Letter')

WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Drag_Drop'), 20)

WebUI.uploadFile(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Drag_Drop/Upload_file_Sanction_Letter'), 'C:/Users/I1675/Downloads/dummy.pdf')

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Save_Sanction_Letter_Upload'))

Thread.sleep(3000);

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_SanctionLetter_ActivityComplete'))

WebUI.refresh()

Thread.sleep(5000);

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_ApplicationReview_ActivityComplete'))

Thread.sleep(5000);

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Post_Disbursal_Limit_ActivityComplete'))

Thread.sleep(5000);

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Lead_Preview_ActivityComplete'))

/*
 * WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/
 * Page_Finweb - Brancho/button_Approve_Limit_Approval'), 20)
 * 
 * WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb -
 * Brancho/button_Approve_Limit_Approval'))
 * 
 * Thread.sleep(3000);
 * 
 * WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb -
 * Brancho/button_LimitApproval_ActivityComplete'))
 */


//Next tab applicants

WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Applicants_tab'), 20)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Applicants_tab'))
Thread.sleep(3000);

//Pendencies
WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Pendencies_tab'), 20)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Pendencies_tab'))
Thread.sleep(3000);

//Document List
WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Document_List_tab'), 20)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Document_List_tab'))
Thread.sleep(3000);

//Notes
WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Notes_tab'), 20)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Notes_tab'))
Thread.sleep(3000);

//Action Logs
WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Action_Logs_tab'), 20)
WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Action_Logs_tab'))
Thread.sleep(3000);

