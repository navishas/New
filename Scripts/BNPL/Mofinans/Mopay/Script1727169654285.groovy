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
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.Point as Point
import static com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory.getDriver
import io.appium.java_client.touch.TapOptions as TapOptions
import io.appium.java_client.AppiumDriver as AppiumDriver
import my.custom.keywords.CustomNumPad as CustomNumPad

Mobile.startExistingApplication('mu.cimfinance.mofinans')

Mobile.delay(7)

//Click on tap to Login Button to Proceed futhur registration
Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/TaptoLoginButton'), 3, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Split_Pay/TaptoLoginButton'), 0)

//Implementing the enterMpin Method
CustomNumPad.enterMpin('134751')

Mobile.delay(5)

//click on Continue Button in the Banner

Mobile.waitForElementPresent(findTestObject('Split_Pay/BannerContinueButton'), 5)

Mobile.tap(findTestObject('Split_Pay/BannerContinueButton'), 5)

//Limit generation
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Welcome_Limit'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Welcome_Limit'), 5)

//Bank Account Linking
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Bank_Account'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Bank_Account'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Confirm_Bank_Account'), 5)

//Submitted Limit
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Request_Submitted_Limit'), 100)

Mobile.delay(6)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Request_Submitted_Limit'), 5)

//Select QR
Mobile.delay(6)

Mobile.tapAtPosition(356, 1261)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.EditText_MoFinans_Quick_Pay'), 15)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText_MoFinans_Quick_Pay'), '600', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - Add Payment Description_QuickPay'), 'test QR Pay', 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.TextView - Proceed Securely_QuickPay'), 0)

//Payment Plan
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 15)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 15)

//Enter mipin validate

CustomNumPad.enterMpin('134161')

//Transaction
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 15)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 15)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Done_Transaction_completed'), 15)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_Unemployed'), 5)

//Success
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 5)

Mobile.delay(70)

Mobile.tapAtPosition(142, 481, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 5)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Done_Verification_Success'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Done_Verification_Success'), 5)



