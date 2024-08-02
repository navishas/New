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

Mobile.tap(findTestObject('Object Repository/Registration/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Start Registration'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button - Continue'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - NIC Number'), 'M270500410198C', 
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

WebUI.delay(4, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(495, 957, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1271, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(79, 1113, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(79, 801, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(495, 1115, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1113, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(495, 957, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1271, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(79, 1113, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(79, 801, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(495, 1115, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1113, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Registration/android.widget.Button - Do it Later'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Registration/android.widget.Button - Do it Later'), 0)

WebUI.delay(8, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(100, 1283, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Registration/android.widget.ImageView-Home_icon'), 0)
WebUI.delay(5, FailureHandling.OPTIONAL)

