import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.Delayed as Delayed
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@12345')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Add New Lead'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Register for BNPL'))

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Get Details From_firstName'), 'lucy')

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Last_Name'), 'shazam')

WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_Gender'), 0)

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/div_Last Name_mat-select-arrow ng-tns-c88-21'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Male'))

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_Mobile_Number'), '54280292')

WebUI.scrollToElement(findTestObject('LOS/Page_Finweb - Brancho/span_DOB'), 10)

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_DOB'), '11 Jul 1982')

WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/div_Marital Status'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Married'))

WebUI.click(findTestObject('LOS/Page_Finweb - Brancho/input_Identifier_Selection'))

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_NIC'))

WebUI.setText(findTestObject('LOS/Page_Finweb - Brancho/input_NIC'), 'R0709944282430')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/span_Create Lead'))

WebUI.delay(8, FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_KYC'), 30, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Activity_Complete_KYC'))

WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'), 30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Add New Address'))

WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Business AddressAddress Type'))

WebUI.click(findTestObject('Object Repository/LOS/Workflow_Stage/Address_Details/Page_Finweb - Brancho/span_Residential Address'))

WebUI.scrollToElement(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/span_Town'), 10)

WebDriver driver = DriverFactory.getWebDriver()

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:/Users/I1675/Downloads/District_Town_Data_1.xlsx', 'Sheet1', 
    true //Here ExcelFactory is a class and getExcelDatawithDefaultSheet is a static method and Object is class and excelData is objectname
    )

//change the path when its run in another local system
for (int row = 1; row <= excelData.getRowNumbers(); row++ // for loop syntax for incrementation
) {
    String town = excelData.getValue('town_name', row //getting the townName row from excel
        )

    WebUI.waitForElementVisible(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), 
        5, FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'), town)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/mat-option/span") //using List method options are saved in the WebElement name
        )

    boolean optionFound = false

    for (WebElement option : options //adding WebElement and object name and in for loop
    ) {
        if (option.getText().contains(town)) //using if condition getting the excel value and click when its matched with the list of options
        {
            option.click( //from a list of option one option is matched with the excel value and the value is clicked)    
                )

            optionFound = true

            System.out.println(('Success: Occupation \'' + town) + '\' is selected')

            break
        }
    }
    
    //this is for excel value and list of option is not matched
    if (!(optionFound)) {
        System.out.println(('Error: Town \'' + town) + '\' is not present in the dropdown')
    }
    
    String district = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_District_mat-select-value-17'))

    String country = WebUI.getText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_Country_mat-select-value-19'))

    System.out.println('District selected: ' + district)

    System.out.println('Country selected: ' + country)

    WebUI.delay(1, FailureHandling.OPTIONAL /*/WebUI.clearText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/input_Ownership Type_mat-input-3'))
	
	WebUI.delay(2, FailureHandling.OPTIONAL)
	
	WebUI.delay(1, FailureHandling.OPTIONAL)/*/ )
}

