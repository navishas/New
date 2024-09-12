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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-merchant-uat.m2pfintech.com/login')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SignUp/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SignUp/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_Full Name_name'), Full_Name)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_(An OTP will be shared to validate)_email'), 
    Email_Id)

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_(An OTP will be shared to validate)_P_e128db'), 
    Mobile_Number)

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_(An OTP will be shared to validate)_P_c0654a'))

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SignUp/button_Proceed'))

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_rejeeth01gmail.com_r5'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__r6'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__r7'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__r8'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_Enter the OTP sent to your mobile number_r9'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__ra'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__rb'), '8')

WebUI.setText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input__rc'), '8')

WebUI.click(findTestObject('Object Repository/Merchant Dashboard/SignUp/button_Verify'))

WebUI.setEncryptedText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_Create Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Merchant Dashboard/SignUp/input_Confirm Password_password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Merchant Dashboard/SignUp/button_Create Account'))

WebUI.delay(4)

