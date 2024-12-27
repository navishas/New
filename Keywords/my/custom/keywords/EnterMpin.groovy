package my.custom.keywords

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import org.openqa.selenium.Point

class EnterMpin {

	// Store the coordinates of numbers 0-9 in a Map
	static Map<String, Point> numberCoordinates = new HashMap<>()

	// Initialize the coordinates for each digit
	static {
		numberCoordinates.put("0", new Point(349, 1416))  // Coordinates for '0'
		numberCoordinates.put("1", new Point(141, 912))  // Coordinates for '1'
		numberCoordinates.put("2", new Point(349, 912))  // Coordinates for '2'
		numberCoordinates.put("3", new Point(557, 912))  // Coordinates for '3'
		numberCoordinates.put("4", new Point(141, 1083))  // Coordinates for '4'
		numberCoordinates.put("5", new Point(349, 1083))  // Coordinates for '5'
		numberCoordinates.put("6", new Point(557, 1080))  // Coordinates for '6'
		numberCoordinates.put("7", new Point(138, 1248))  // Coordinates for '7'
		numberCoordinates.put("8", new Point(346, 1248))  // Coordinates for '8'
		numberCoordinates.put("9", new Point(557, 1251))  // Coordinates for '9'
	}

	// Method to enter the MPIN (6-digit number) by tapping on corresponding coordinates
	def static enterMpin(String mpin) {
		// Loop through each digit in the MPIN string
		for (int i = 0; i < mpin.length(); i++) {
			String digit = mpin.charAt(i).toString()  // Get each digit as a string
			Point coordinates = numberCoordinates.get(digit)  // Get the coordinates for the digit

			if (coordinates != null) {
				Mobile.tapAtPosition(coordinates.x, coordinates.y)  // Tap on the coordinates
			} else {
				println("Invalid digit: " + digit)
			}
		}
	}
}
