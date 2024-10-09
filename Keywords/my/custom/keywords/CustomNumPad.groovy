package my.custom.keywords

import com.kms.katalon.core.testobject.TestObject
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption
import io.appium.java_client.AppiumDriver
import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import static com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory.getDriver
import io.appium.java_client.touch.TapOptions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class CustomNumPad {

	static final Map<String, Integer> keypadCache = new HashMap<>()

	static void resetKeypadCache() {
		if (!keypadCache.isEmpty()) {
			keypadCache.clear()
		}
	}

	static void enterMpin(String pin) {
		TestObject keypadTestObject = findTestObject('Object Repository/Registration/androidx.appcompat.widget.LinearLayoutCompat')
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

			tapAtPoint(numXAxis, numYAxis)
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
		Dimension dimension = new Dimension(720, 673) // Dimensions calculated from the bounds [0,837][720,1510]
		Point location = new Point(0, 837) // Location calculated from the bounds [0,837][720,1510]

		int keypadX = location.getX()
		int keypadY = location.getY()
		int keyWidth = dimension.getWidth() / 3
		int keyHeight = dimension.getHeight() / 4

		keypadCache.put("keypadX", keypadX)
		keypadCache.put("keypadY", keypadY)
		keypadCache.put("keyWidth", keyWidth)
		keypadCache.put("keyHeight", keyHeight)
	}
}
