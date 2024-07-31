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

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.TextView - Manage Bank Account'), 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.ImageView-Delete'), 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Yes_1'), 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Ok_2'), 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Register new Bank'), 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.EditText -    Search'), 'Bank One', 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.ImageView'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Bank One')

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.ImageView-Bank1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.EditText - Mobile No. Linked with Bank'), '52554696', 
    0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.EditText - Bank Account No'), '01042519884', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.EditText - Confirm Bank Account No'), '01042519884', 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - ConfirmButton'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Ok'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_0'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_1'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_2'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_3'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_4'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_5'), '2', 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Continue_1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Ok_OTP'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Resend OTP'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_0'), '1', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_1'), '2', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_2'), '3', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_3'), '4', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_4'), '5', 0)

Mobile.setText(findTestObject('Manage_Bank_Account/android.widget.ImageView_5'), '6', 0)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Continue_1'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Manage_Bank_Account/android.widget.Button - Not Now_2_1'), 0, FailureHandling.STOP_ON_FAILURE)

