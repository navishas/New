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
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


import io.appium.java_client.AppiumDriver
import io.appium.java_client.MultiTouchAction as MultiTouchAction


Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Register'), 3)

WebUI.delay(7)

//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 2)
//
Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 2)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - NIC Number'), 'P0104853002066', 
    5)

Mobile.tap(findTestObject('Registration/android.widget.TextView - Continue(2)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 
    10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(0)'), '2', 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(1)'), '2', 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(2)'), '2', 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(3)'), '2', 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(4)'), '2', 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(5)'), '2', 0)

Mobile.tap(findTestObject('Registration/android.widget.Button - Continue (1)'), 0)

WebUI.delay(4, FailureHandling.OPTIONAL)

//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//MultiTouchAction multiTouch = new MultiTouchAction(driver)
//TouchAction action1 = new TouchAction(driver)
//
//int locationX = Mobile.getElementLeftPosition(findTestObject('Object Repository/Registration/androidx.appcompat.widget.LinearLayoutCompat - KeyboardID'), 10)
//int locationY = Mobile.getElementTopPosition(findTestObject('Object Repository/Registration/androidx.appcompat.widget.LinearLayoutCompat - KeyboardID'), 10)
//int eleWidth = Mobile.getElementWidth(findTestObject('Object Repository/Registration/androidx.appcompat.widget.LinearLayoutCompat - KeyboardID'), 10)
//int eleHeight = Mobile.getElementHeight(findTestObject('Object Repository/Registration/androidx.appcompat.widget.LinearLayoutCompat - KeyboardID'), 10)
//int startX = locationX + (eleWidth * 0.25)
//int startY = locationY + (eleHeight * 0.66)
//			
//action1.tap(PointOption.point(310, 920))
//action1.perform()

Mobile.tapAtPosition(517, 1360, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(505, 1618, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(517, 1360, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(517, 1360, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(505, 1618, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(517, 1360, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(521, 1839, FailureHandling.STOP_ON_FAILURE)

//
//Mobile.tapAtPosition(79, 1113, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(79, 801, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(495, 1115, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(288, 1113, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(495, 957, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(288, 1271, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(79, 1113, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(79, 801, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(495, 1115, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tapAtPosition(288, 1113, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

WebUI.delay(20, FailureHandling.OPTIONAL)

