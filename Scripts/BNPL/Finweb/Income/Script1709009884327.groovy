import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.channels.SelectableChannel as SelectableChannel
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.IOException as IOException

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cim-uat.finflux.io/sign-in?redirectURL=%2Fleads')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Version uat-24.01.01-01 b8eec48_username'), 
    'navishas')

WebUI.setText(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/input_Username_password'), 'Admin@12345')

WebUI.click(findTestObject('Object Repository/LOS/Page_Finweb - Brancho/button_Sign in'))

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'), 
    5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Reports_mat-button-wrapper'))

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/div_Loan Application'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('LOS/Search/Page_Finweb - Brancho/input_BNPLCC_mat-input-19'), '000000000003130')

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Search'))

WebUI.click(findTestObject('LOS/Search/Page_Finweb - Brancho/span_Navigate To Loan Application'))

WebUI.delay(4, FailureHandling.OPTIONAL)

//WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Edit_Emp_Details'))
WebDriver driver = DriverFactory.getWebDriver()

String excelFilePath = 'C:/Users/I1675/Downloads/Income_BNPL.xlsx'

try {

FileInputStream fis = new FileInputStream(excelFilePath)

Workbook workbook = new XSSFWorkbook(fis)

for (int sheetIndex = 0; sheetIndex < workbook.getNumberOfSheets(); sheetIndex++) {
    Sheet sheet = workbook.getSheetAt(sheetIndex)

    for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
        Row row = sheet.getRow(rowIndex)

        if (row == null) {
            continue
        }
		
		String occType = row.getCell(0).getStringCellValue()
		Cell basicIncomeCell = row.getCell(1)
        Cell fixedAllowanceCell = row.getCell(2)
        Cell variableAllowanceCell = row.getCell(5)
		
		System.out.println("Row " + (rowIndex + 1) + ": occType=" + occType +
			", basicIncomeCell=" + basicIncomeCell +
			", fixedAllowanceCell=" + fixedAllowanceCell +
			", variableAllowanceCell=" + variableAllowanceCell)
		
		if(basicIncomeCell == null || fixedAllowanceCell == null || variableAllowanceCell == null) {
			
			System.out.println("Error: Null cell found in row " + (rowIndex + 1))
			continue;
			
		}
        
        double basicIncome = basicIncomeCell.getNumericCellValue()

        double fixedAlowance = fixedAllowanceCell.getNumericCellValue()

        double variableAlowance = variableAllowanceCell.getNumericCellValue()

        try {
            WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                FailureHandling.OPTIONAL)

            WebUI.delay(3)

            List<WebElement> options = driver.findElements(By.xpath('/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option/span'))

            boolean optionFound = false

            for (WebElement option : options) {
                if (option.getText().contains(occType)) {
                    option.click()

                    optionFound = true

                    System.out.println(('Success: Occupation \'' + occType) + '\' is selected')

                    WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))

                    WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Basic_Salary'), 
                        String.valueOf(basicIncome))

                    System.out.println(('Success: Basic Income \'' + basicIncome) + '\'')

                    WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Fixed_alowance'), 
                        String.valueOf(fixedAlowance))

                    System.out.println(('Success: Fixed Alowance \'' + fixedAlowance) + '\'')

                    WebUI.setText(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/textbox_Variable_Alowance'), 
                        String.valueOf(variableAlowance))

                    System.out.println(('Success: Variable Alowance \'' + variableAlowance) + '\'')

                    WebUI.delay(3)

                    WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/Back_Button_next to save'))

                    WebUI.waitForElementClickable(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/div_No_mat-select-arrow_Emp_Type'), 
                        5, FailureHandling.OPTIONAL)

                    break
                }
				
				/*/if(option.getText().contains("Self employed")) {
					option.click()
					optionFound = true
					
					System.out.println(('Success: Occupation \'' + occType) + '\' is selected')
					
				    WebUI.click(findTestObject('LOS/Workflow_Stage/Page_Finweb - Brancho/button_Next_Employm_Detail'))
					
				}/*/
			
            }
        }
        catch (StaleElementReferenceException e) {
            System.out.println('StaleElementReferenceException occurred: ' + e.getMessage())

            continue
        } 
        catch (NoSuchElementException e) {
            System.out.println('NoSuchElementException occurred: ' + e.getMessage())

            continue
        } 
    }
}
}catch (IOException e) {
    e.printStackTrace();
}

