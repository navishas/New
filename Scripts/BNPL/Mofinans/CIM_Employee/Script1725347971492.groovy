import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.ElementOption as ElementOption
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import java.util.List as List
import io.appium.java_client.touch.TapOptions as TapOptions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.Keys as Keys
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import org.openqa.selenium.interactions.touch.TouchActions as TouchActions
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.MobileDriver as MobileDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.AppiumDriver as AppiumDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.view.ViewGroup'), 3)

//Mobile.tapAtPosition(142, 481, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.Button - Proceed'), 0)

Mobile.tap(findTestObject('Object Repository/Split_Pay/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_2'), 0)

Mobile.tap(findTestObject('Split_Pay/android.widget.CheckBox_3'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Accept  Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Proceed (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Agree'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Get Started'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Continue'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Continue (1)'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.TextView - Click here to Captureupload'), 0)

