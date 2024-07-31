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

//Mobile.tap(findTestObject('Object Repository/Loan_Application/android.widget.RelativeLayout'), 0)
Mobile.tapAtPosition(321, 619, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Loan_Application/android.widget.Button - Apply for New Loan'), 
    4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Loan_Application/android.widget.Button - Apply for New Loan'), 0)

Mobile.scrollToText('Purpose of loan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Loan_Application/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Loan_Application/android.widget.CheckedTextView - Home renovations'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Proceed_Apply'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Confirm_Address_Popup'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.ImageView_0'), 0, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_0'), '1', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_1'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_2'), '3', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_3'), '4', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_4'), '5', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_5'), '6', 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_OTP'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Ok_OTP_popup'), 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_0'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_1'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_2'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_3'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_4'), '2', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.ImageView_5'), '2', 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_OTP'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Proceed_Emp_Details'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Proceed_Emp_Details'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Confirm_Popup_Emp_details'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Upload__Bank_Doc'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Upload__Bank_Doc'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView -Select_Upload PDF'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.ImageButton-_Menu_Ham_Icon'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView -Select_Downloads'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView-dummy (1).pdf'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Upload_Salary_Slip'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Upload_Salary_Slip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView - Upload PDF_Salary'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView - Salary_dummy (1).pdf'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Proceed_Upload_Doc'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Proceed_Upload_Doc'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.CheckBox_1'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.CheckBox_1'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Proceed_Terms_Cond'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.EditText - 105000'), 4, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Loan_Application/android.widget.EditText - 105000'), '', 0)

Mobile.setText(findTestObject('Loan_Application/android.widget.EditText-Loan_Amt'), '10000', 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_Loan'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Continue_Breakdown'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_Breakdown'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button - Continue_Select_Bank'), 6, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_Select_Bank'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Proceed_Popup'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Upload_Home_Doc'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView - Upload PDF_Home_Doc'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.TextView - dummy (1).pdf_Home_Doc'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Continue_Home_Doc'), 0, FailureHandling.OPTIONAL)

Mobile.delay(3, FailureHandling.OPTIONAL)

Mobile.scrollToText('MauBank')

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Confirm_ConfirmApp'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.ImageView-CopyAppno'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.ImageView-CopyAppno'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Done_LoanApp'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Loan_Application/android.widget.RelativeLayout'), 4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Loan_Application/android.widget.RelativeLayout'), 0)

Mobile.delay(4, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(552, 328)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Cancel Application (1)'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Spinner_Select_Reason_Canc'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.CheckedTextView - I changed my mindwill consider later'), 0)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button - Confirm_CancelApp_Popup'), 0)

Mobile.waitForElementPresent(findTestObject('Loan_Application/android.widget.Button -Success_Done_Cancel'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Loan_Application/android.widget.Button -Success_Done_Cancel'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

