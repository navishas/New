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
CustomNumPad.enterMpin('168324')

Mobile.delay(10)

//click on Continue Button in the Banner
Mobile.waitForElementPresent(findTestObject('Split_Pay/MCIBBannerContinueButton'), 5)

Mobile.tap(findTestObject('Split_Pay/MCIBBannerContinueButton'), 3)

Mobile.delay(3)

Mobile.waitForElementPresent(findTestObject('Split_Pay/ApplicationDoneBtn'), 3)

Mobile.tap(findTestObject('Split_Pay/ApplicationDoneBtn'), 3)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Split_Pay/BannerContinueBtnLimit'), 3)

Mobile.tap(findTestObject('Split_Pay/BannerContinueBtnLimit'), 3)

Mobile.delay(8)

//Limit generation
Mobile.waitForElementPresent(findTestObject('Split_Pay/Limit_Accept'), 3)

Mobile.tap(findTestObject('Split_Pay/Limit_Accept'), 3)

//Use this If you want to run the script In case of Post approving the limit.

//Mobile.waitForElementPresent(findTestObject('Split_Pay/Limit_Continue'), 3)
//
//Mobile.tap(findTestObject('Split_Pay/Limit_Continue'), 3)

Mobile.delay(10)

//Bank Account Linking
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Bank_Account'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Bank_Account'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_Confirm_Bank_Account'), 5)

//Docu sign Need to be Completed Manually

// Wait until the Continue button becomes visible

def ContinueBtn = findTestObject('Split_Pay/android.widget.Button - Continue_Request_Submitted_Limit')

Mobile.verifyElementVisible(ContinueBtn, 300)

// Once visible, tap the button

Mobile.delay(150)

//Submitted Limit
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Request_Submitted_Limit'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Request_Submitted_Limit'), 5)

//Select QR
Mobile.delay(6)

Mobile.waitForElementPresent(findTestObject('Split_Pay/QRcode-Icon'), 3)

Mobile.tap(findTestObject('Split_Pay/QRcode-Icon'), 0)

Mobile.delay(10)

//Scan the QR code Manually
//Select Image From Mobile Gallary
//Mobile.waitForElementPresent(findTestObject('Split_Pay/Mobile_Gallary'), 3)
//
//Mobile.tap(findTestObject('Split_Pay/Mobile_Gallary'), 0)
//
//Mobile.delay(5)
//
//Mobile.waitForElementPresent(findTestObject('Split_Pay/QRImage'), 3)
//	
//Mobile.tap(findTestObject('Split_Pay/QRImage'), 0)
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.EditText_MoFinans_Quick_Pay'), 10)

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText_MoFinans_Quick_Pay'), '600', 10)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Split_Pay/android.widget.EditText - Add Payment Description_QuickPay'), 'test QR Pay', 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.TextView - Proceed Securely_QuickPay'), 5)

Mobile.delay(5)

//Payment Plan
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 5)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 8)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Payment_Plan'), 3)

//Transaction
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 5)

Mobile.tap(findTestObject('Split_Pay/SaveToGallary'), 5)

Mobile.tap(findTestObject('Split_Pay/DailogBox-OK'), 5)

Mobile.delay(10)

//Repayment Scenario
Mobile.waitForElementPresent(findTestObject('Split_Pay/Dashboard_PayNowBtn'), 3)

Mobile.tap(findTestObject('Split_Pay/Dashboard_PayNowBtn'), 3)

Mobile.delay(5)

Mobile.tap(findTestObject('Split_Pay/Repayment_Agreement_Checkbox'), 3)

Mobile.waitForElementPresent(findTestObject('Split_Pay/Pay_Btn1'), 5)

Mobile.tap(findTestObject('Split_Pay/Pay_Btn1'), 0)

Mobile.waitForElementPresent(findTestObject('Split_Pay/Pay_Btn2'), 5)

Mobile.tap(findTestObject('Split_Pay/Pay_Btn2'), 0)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue'), 0)

CustomNumPad.enterMpin('741652')

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Download_Transaction_completed'), 5)

Mobile.tap(findTestObject('Split_Pay/SaveToGallary'), 5)

Mobile.tap(findTestObject('Split_Pay/DailogBox-OK'), 5)

Mobile.delay(3)

Mobile.closeApplication()

