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

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/input_Username_password'), 'Admin@123')

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000002833')

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('Finweb_Windows/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.waitForElementClickable(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))

WebUI.click(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))

WebUI.click(findTestObject('Object Repository/Finweb_Windows/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Copy Address From_mat-input-37'), 
    'asdfasdf')

WebUI.scrollToElement(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 0)

WebUI.waitForElementVisible(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), 
    5, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_0)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_1)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_2)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_3)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_4)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_5)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_6)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_7)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_8)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_9)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_10)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_11)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_12)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
        Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_13)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_14)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_15)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_16)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_17)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_18)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_19)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_20)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_21)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_22)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_23)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_24)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_25)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_26)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_27)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_28)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_29)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_30)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_31)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_32)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_33)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_34)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_35)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_36)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_37)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_38)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_39)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_40)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_41)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_42)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_43)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_44)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_45)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_46)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_47)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_48)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_49)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_50)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_51)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_52)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_53)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_54)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_55)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_56)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_57)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_58)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_59)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_60)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_61)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_62)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_63)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_64)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_65)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_66)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_67)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_68)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_69)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_70)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_71)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_72)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_73)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_74)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_75)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_76)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_77)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_78)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_79)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_80)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_81)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_82)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_83)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_84)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_85)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_86)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_87)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_88)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_89)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_90)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_91)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_92)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_93)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_94)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_95)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_96)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_97)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_98)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_99)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_100)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_101)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_102)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_103)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_104)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_105)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_106)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_107)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_108)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_109)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_110)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_111)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_112)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_113)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_114)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_115)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_116)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_117)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_118)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_119)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_120)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_121)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_122)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_123)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_124)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_125)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_126)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_127)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_128)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_129)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_130)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_131)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_132)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_133)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_134)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_135)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_136)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_137)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_138)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_139)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_140)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_141)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_142)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_143)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_144)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_145)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_146)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_147)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_148)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_149)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_150)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_151)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_152)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_153)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_154)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_155)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_156)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_157)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_158)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_159)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_160)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))
/*/
WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_161)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_162)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_163)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_164)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_165)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_166)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_167)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_168)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_169)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_170)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_171)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_172)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_173)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_174)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_175)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_176)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_177)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_178)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_179)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_180)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_181)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_182)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_183)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_184)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_185)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_186)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_187)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_188)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_189)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_190)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_191)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_192)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_193)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_194)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_195)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_196)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_197)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_198)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_199)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_200)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_201)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_202)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_203)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_204)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_205)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_206)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_207)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_208)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_209)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_210)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_211)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_212)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_213)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_214)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_215)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_216)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_217)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_218)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_219)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_220)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_221)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_222)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_223)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_224)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_225)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_226)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_227)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_228)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_229)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_230)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_231)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_232)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_233)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_234)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_235)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_236)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_237)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_238)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_239)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_240)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_241)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_242)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_243)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_244)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_245)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_246)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_247)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_248)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_249)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_250)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_251)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_252)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_253)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_254)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_255)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_256)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_257)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_258)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_259)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_260)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_261)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_262)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_263)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_264)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_265)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_266)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_267)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_268)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_269)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_270)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_271)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_272)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_273)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_274)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_275)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_276)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_277)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_278)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_279)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_280)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_281)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_282)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_283)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_284)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_285)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_286)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_287)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_288)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_289)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_290)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_291)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_292)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_293)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_294)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), Keys.chord(
		Keys.RETURN))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Finweb_Windows/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), variable_295)

WebUI.delay(2, FailureHandling.OPTIONAL)

/*/