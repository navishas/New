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

//Mobile.tap(findTestObject('Object Repository/Split_Pay/MopayAgreementPopup'), 3)
//
//Mobile.pressBack()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Split_Pay/ApplyNowButton'), 3)

// Define locators for mobile
def quickLinkLocator = findTestObject('Object Repository/Split_Pay/QuickLinkUpdate')
def closeButtonLocator = findTestObject('Object Repository/Split_Pay/QuicklinksClosebtn')
def continueButtonLocator = findTestObject('Object Repository/Split_Pay/ContinueWhereYouLeftButton')
def viewGroupLocator = findTestObject('Object Repository/Split_Pay/ApplyNowButton')

// Set a maximum number of attempts to close the quick link
int maxAttempts = 2
int attempt = 0

while (attempt < maxAttempts) {
    // Check if the quick link is displayed
    if (Mobile.waitForElementPresent(quickLinkLocator, 5)) {
        // If displayed, click on the close button
        Mobile.tap(closeButtonLocator, 3)
        // Optional: wait for a moment to allow the UI to update
        Mobile.delay(5)
        Mobile.tap(viewGroupLocator, 3)
    } else {
        // If not displayed, break the loop and click on the continue button
        Mobile.tap(continueButtonLocator, 3)
        break
    }
    attempt++
}

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)


//Pep Declaration
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.RadioButton_PEP_Not_Applicable'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.RadioButton_PEP_Not_Applicable'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Proceed_PEP'), 5)

//Confirm Application
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Confirm_Confirm_Application'), 5)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Confirm_Confirm_Application'), 5)

//Success
Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Continue_Inprogress'), 5)

Mobile.waitForElementPresent(findTestObject('Split_Pay/android.widget.Button - Done_Verification_Success'), 10)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - Done_Verification_Success'), 5)

Mobile.delay(30)

//Approve the application in LOS and Move to Limit Generation Page

Mobile.closeApplication()