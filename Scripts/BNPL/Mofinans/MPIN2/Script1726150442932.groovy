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

import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import static com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory.getDriver
import io.appium.java_client.touch.TapOptions
import io.appium.java_client.AppiumDriver

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Register'), 3)

//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 2)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 3)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - NIC Number'), 'P0104853002066', 5)

Mobile.tap(findTestObject('Registration/android.widget.TextView - Continue(2)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Yes, Its Correct'), 0)

Mobile.setText(findTestObject('Registration/android.widget.ImageView(0)'), '2', 0)
Mobile.setText(findTestObject('Registration/android.widget.ImageView(1)'), '2', 0)
Mobile.setText(findTestObject('Registration/android.widget.ImageView(2)'), '2', 0)
Mobile.setText(findTestObject('Registration/android.widget.ImageView(3)'), '2', 0)
Mobile.setText(findTestObject('Registration/android.widget.ImageView(4)'), '2', 0)
Mobile.setText(findTestObject('Registration/android.widget.ImageView(5)'), '2', 0)

Mobile.tap(findTestObject('Registration/android.widget.Button - Continue (1)'), 0)

WebUI.delay(4, FailureHandling.OPTIONAL)

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.annotation.Keyword

class KeypadUtils {
    
    // Assume keypadCache is a map holding keypad dimensions and positions
     static Map<String, Integer> keypadCache = new HashMap<>()

    // Define the mobile element for the custom keypad
     static mobileElementCustomKeyPad

    
    static void clickOnCustomViewKeyPad(WebElement webElement, String argsSetmPIN) {
        char[] pinCharArray = argsSetmPIN.toCharArray()

        for (char pin : pinCharArray) {
            int numXAxis, numYAxis
            if (pin == '0') {
                numXAxis = keypadCache["keypadX"] + keypadCache["keyWidth"] + keypadCache["keyWidth"] / 2
                numYAxis = keypadCache["keypadY"] + (3 * keypadCache["keyHeight"]) + keypadCache["keyHeight"] / 2
            } else {
                numXAxis = keypadCache["keypadX"] + (keypadCache["keyWidth"] * ((pin - '1') % 3)) + keypadCache["keyWidth"] / 2
                numYAxis = keypadCache["keypadY"] + (keypadCache["keyHeight"] * ((pin - '1') / 3)) + keypadCache["keyHeight"] / 2
            }

            Mobile.tapAtPosition(numXAxis, numYAxis)
            println "Clicked number ${pin} at X: ${numXAxis} Y: ${numYAxis}"
            Thread.sleep(100)
        }
    }

    
    static void enterMpin(String pin) {
        if (mobileElementCustomKeyPad != null) {
            clickOnCustomViewKeyPad(mobileElementCustomKeyPad, pin)
        } else {
            println "Error: mobileElementCustomKeyPad is not initialized."
        }
    }

    // Method to set the mobileElementCustomKeyPad
    
    static void setCustomKeyPadElement(TestObject testObject) {
        mobileElementCustomKeyPad = findTestObject('Object Repository/Registration/CustomKeyPad')
    }

	public static void resetKeypadCache() {
		if (!keypadCache.isEmpty()){
			keypadCache.clear();
		}
	}
}

KeypadUtils.enterMpin("234678")

WebUI.delay(20)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

WebUI.delay(20, FailureHandling.OPTIONAL)
