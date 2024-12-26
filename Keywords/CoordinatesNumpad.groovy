package my.custom.keywords

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import org.openqa.selenium.Point

class EnterValidMpin {

    // Store the coordinates of numbers 0-9 in a Map
    static Map<String, Point> numberCoordinates = new HashMap<>()

    // Initialize the coordinates for each digit
    static {
        numberCoordinates.put("0", new Point(100, 200))  // Coordinates for '0'
        numberCoordinates.put("1", new Point(150, 200))  // Coordinates for '1'
        numberCoordinates.put("2", new Point(200, 200))  // Coordinates for '2'
        numberCoordinates.put("3", new Point(250, 200))  // Coordinates for '3'
        numberCoordinates.put("4", new Point(100, 250))  // Coordinates for '4'
        numberCoordinates.put("5", new Point(150, 250))  // Coordinates for '5'
        numberCoordinates.put("6", new Point(200, 250))  // Coordinates for '6'
        numberCoordinates.put("7", new Point(250, 250))  // Coordinates for '7'
        numberCoordinates.put("8", new Point(100, 300))  // Coordinates for '8'
        numberCoordinates.put("9", new Point(150, 300))  // Coordinates for '9'
    }

    // Method to enter the MPIN (6-digit number) by tapping on corresponding coordinates@Keyword
    def static entervalidMpin(String mpin) {
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
