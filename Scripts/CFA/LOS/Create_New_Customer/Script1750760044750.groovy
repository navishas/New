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

WebUI.navigateToUrl('https://cimcfa-uat-connect.m2pfintech.dev/sign-in?redirectURL=%2Ftasks')

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/input_Username _'), 
    'Rejeeth')

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/input_Password _'))

WebUI.setEncryptedText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/input_Password _'), 
    'u3wSrS9uiOS36YahD6x9iw==')

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/button_Sign in'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_Customers'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_Create New Customer'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/button_Individual'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/div_mat-select-value-7'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_250'))

WebUI.delay(15)

//WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/input_Date of Birth'), 
//    '29/07/1995')
WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Mobile Number'), 
    Mobile_Number)

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/div_mat-select-value-9'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_NORMAL'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/div_cdk-overlay-backdrop cdk-overlay-transparent'))

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_Next'))

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_First Name'), 
    First_Name)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Last Name'), 
    Last_Name)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Title'), 
    Title)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Gender'), 
    Gender)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Marital Status'), 
    Marital_Status)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Email'), 
    Email_ID)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_ID Type'), 
    ID_Type)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_National ID'), 
    NIC)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Customer Serial Number'), 
    Customer_SerialNo)

WebUI.setText(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/textarea_Submitted Date'), 
    Submitted Date)

WebUI.click(findTestObject('Object Repository/CFA_LOS/LOS_Add_New_Customer/Page_Case Manager - Connect/span_Save'))

