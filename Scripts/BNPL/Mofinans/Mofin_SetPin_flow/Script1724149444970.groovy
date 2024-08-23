import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import java.time.Duration


Mobile.startApplication('D:\\OneDrive - Indium Software India Private Limited\\CimFin\\Automation\\MoFinans_v1.0.6.32_12Aug24Android.apk', 
    false)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.RelativeLayout'), 0)

WebUI.delay(10, FailureHandling.OPTIONAL)

Mobile.scrollToText('Let’s Get Started')

Mobile.tap(findTestObject('Object Repository/Start Page/android.widget.Button - Lets Get Started'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button - Accept_Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Start Page/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button - Next_1'), 0)

Mobile.tap(findTestObject('Start Page/android.widget.Button-Continue(1)'), 0)

Mobile.delay(4, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - NIC Number'), 'D031297330133F', 
    0)

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

WebUI.delay(3, FailureHandling.OPTIONAL)


//String mPIN = '234765'
//
////Loop through each digit and enter it
//for (int i = 0; i < mPIN.length(); i++) {
//    // Find the test object representing the button with the current digit
//    TestObject digitButton = findTestObject('Object Repository/Rough/Mobile_reg/android.view.View', [('digit') : mPIN.charAt(
//                i).toString()])
//
//    // Tap on the digit button
//    Mobile.tap(digitButton,0)
//}
//
//WebUI.delay(5)
//
//String ReEnterPIN = '234765'
//
// //Loop through each digit and enter it
//for (int i = 0; i < ReEnterPIN.length(); i++) {
//	// Find the test object representing the button with the current digit
//	TestObject digitButton = findTestObject('Object Repository/Rough/Mobile_reg/android.view.View', [('digit') : ReEnterPIN.charAt(
//				i).toString()])
//	
//	// Tap on the digit button
//	Mobile.tap(digitButton,0)
//}
//	   
WebUI.delay(15)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Do it Later'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.Button - Not Now'), 0)

Mobile.tap(findTestObject('Object Repository/Rough/Mobile_reg/android.widget.FrameLayout'), 0)

Mobile.closeApplication()

