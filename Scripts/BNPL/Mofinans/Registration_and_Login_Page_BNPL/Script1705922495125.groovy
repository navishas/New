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
import java.util.Map
import java.util.HashMap

private static final Map<String, Integer> keypadCache = new HashMap<>()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Register'), 3)

WebUI.delay(7)

//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 2)
//
//Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 2)

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

// Define the global keypad cache
private static final Map<String, Integer> keypadCache = new HashMap<>();

/**
 * Method to enter the MPIN using custom numeric keypad.
 */
public void enterMpin(String pin) {
	clickOnCustomViewKeyPad(findTestObject('Rough/Mobile_reg/Keypad_obj'), pin)
}

/**
 * Method to click on the custom numeric keypad based on the MPIN digits.
 */
public static void clickOnCustomViewKeyPad(TestObject testObject, String pin) {
	MobileElement mobileElementCustomKeyPad = Mobile.getElement(testObject)
	
	// Cache keypad dimensions and positions
	cacheKeypadDimensionsAndPositions(mobileElementCustomKeyPad)
	
	char[] pinCharArray = pin.toCharArray()
	
	for (char pinChar : pinCharArray) {
		int numXAxis, numYAxis
		
		if (pinChar == '0') {
			numXAxis = keypadCache.get("keypadX") + keypadCache.get("keyWidth") + keypadCache.get("keyWidth") / 2
			numYAxis = keypadCache.get("keypadY") + (3 * keypadCache.get("keyHeight")) + keypadCache.get("keyHeight") / 2
		} else {
			numXAxis = keypadCache.get("keypadX") + (keypadCache.get("keyWidth") * ((pinChar - '1') % 3)) + keypadCache.get("keyWidth") / 2
			numYAxis = keypadCache.get("keypadY") + (keypadCache.get("keyHeight") * ((pinChar - '1') / 3)) + keypadCache.get("keyHeight") / 2
		}

		Mobile.tapAtPosition(numXAxis, numYAxis)
		println "Clicked number ${pinChar} at X: ${numXAxis}, Y: ${numYAxis}"
		
		// Adding delay to mimic real user interaction
		Mobile.delay(0.1)
	}
}

/**
 * Cache the keypad dimensions and positions based on the mobile element.
 */
public static void cacheKeypadDimensionsAndPositions(MobileElement webElement) {
	int keypadX = webElement.getLocation().getX()
	int keypadY = webElement.getLocation().getY()
	int keyWidth = webElement.getSize().getWidth() / 3
	int keyHeight = webElement.getSize().getHeight() / 4
	
	keypadCache.put("keypadX", keypadX)
	keypadCache.put("keypadY", keypadY)
	keypadCache.put("keyWidth", keyWidth)
	keypadCache.put("keyHeight", keyHeight)
}

/**
 * Resets the cached keypad dimensions and positions.
 */
public static void resetKeypadCache() {
	if (!keypadCache.isEmpty()) {
		keypadCache.clear()
	}
}


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
enterMpin("235678")

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

WebUI.delay(20, FailureHandling.OPTIONAL)

