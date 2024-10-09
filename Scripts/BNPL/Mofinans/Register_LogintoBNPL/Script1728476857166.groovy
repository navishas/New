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

import my.custom.keywords.CustomNumPad //Importing CustomNumPad class from Custom keywords package

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Register'), 3)

//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 2)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 3)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - NIC Number'), 'P0104853002066', 
    5)

Mobile.tap(findTestObject('Registration/android.widget.TextView - Continue(2)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 
    10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 0)

//For Loop has been Implemented for continuous Iteration, It will enter the digit value 2 until it reaches the field limit value 6 
for (int i = 0; i < 6; i++) {
    Mobile.setText(findTestObject("Registration/android.widget.ImageView($i)"), '2', 0)
}

Mobile.tap(findTestObject('Registration/android.widget.Button - Continue (1)'), 0)

WebUI.delay(3, FailureHandling.OPTIONAL)

CustomNumPad.enterMpin('134751')

Mobile.delay(3)

CustomNumPad.enterMpin('134751')

WebUI.delay(3)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 3, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Not Now'), 3, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Not Now'), 0)

Mobile.delay(10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.view.ViewGroup'), 3)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.view.ViewGroup'), 0)

Mobile.delay(8)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)


Mobile.waitForElementPresent(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.Button - android.widget.Button - Accept Continue_1'), 5)

Mobile.delay(200);

//Complete the DKYC Process
//Approve the ID Verification in LOS



