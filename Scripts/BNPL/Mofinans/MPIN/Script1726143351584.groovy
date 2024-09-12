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

WebUI.delay(9)

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

class CustomNumPad {

    static final Map<String, Integer> keypadCache = new HashMap<>()

    static void enterMpin(String pin) {
        TestObject keypadTestObject = findTestObject('Object Repository/Rough/Mobile_reg/Keypad_obj')
        cacheKeypadDimensionsAndPositions(keypadTestObject)

        pin.toCharArray().each { char pinChar ->
            int numXAxis, numYAxis
            int pinValue = Character.getNumericValue(pinChar) // Convert char to its integer value

            if (pinValue == 0) {
                numXAxis = keypadCache.get("keypadX") + keypadCache.get("keyWidth") + keypadCache.get("keyWidth") / 2
                numYAxis = keypadCache.get("keypadY") + (3 * keypadCache.get("keyHeight")) + keypadCache.get("keyHeight") / 2
            } else {
                numXAxis = keypadCache.get("keypadX") + (keypadCache.get("keyWidth") * ((pinValue - 1) % 3)) + keypadCache.get("keyWidth") / 2
                numYAxis = keypadCache.get("keypadY") + (keypadCache.get("keyHeight") * ((pinValue - 1) / 3)) + keypadCache.get("keyHeight") / 2
            }

            CustomNumPad.tapAtPoint(numXAxis, numYAxis)
            println "Clicked number $pinChar at X: $numXAxis Y: $numYAxis"
            Thread.sleep(100) // Small delay to ensure proper keypress simulation
        }
    }

    static void tapAtPoint(int x, int y) {
        AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) getDriver()
        TouchAction action = new TouchAction(driver)
        action.tap(TapOptions.tapOptions().withPosition(PointOption.point(x, y))).perform()
        println "Tapped at X: $x, Y: $y"
    }

    static void cacheKeypadDimensionsAndPositions(TestObject keypadTestObject) {
        // Example to cache the dimensions of the keypad
        Dimension dimension = new Dimension(720, 624) // Dimensions calculated from the bounds [0,734][720,1358]
        Point location = new Point(0, 734) // Location calculated from the bounds [0,734][720,1358]

        int keypadX = location.getX()
        int keypadY = location.getY()
        int keyWidth = dimension.getWidth() / 3
        int keyHeight = dimension.getHeight() / 4

        keypadCache.put("keypadX", keypadX)
        keypadCache.put("keypadY", keypadY)
        keypadCache.put("keyWidth", keyWidth)
        keypadCache.put("keyHeight", keyHeight)
    }

    static void resetKeypadCache() {
        if (!keypadCache.isEmpty()) {
            keypadCache.clear()
        }
    }
}

CustomNumPad.enterMpin("234678")

WebUI.delay(20)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

WebUI.delay(20, FailureHandling.OPTIONAL)
